package io.dazraf

import io.dazraf.ledger.proto.EmptyProtos
import io.dazraf.ledger.proto.LedgerServiceGrpc.LedgerServiceVertxImplBase
import io.dazraf.ledger.proto.ServiceLedger.Amount
import io.dazraf.ledger.proto.ServiceLedger.LedgerNotification
import io.vertx.core.Vertx
import io.vertx.grpc.GrpcWriteStream
import java.math.BigDecimal
import java.math.BigInteger

class LedgerServiceImpl(val vertx: Vertx) : LedgerServiceVertxImplBase() {
  override fun ledgerNotifications(request: EmptyProtos.Empty?, response: GrpcWriteStream<LedgerNotification>) {
    val periodicId = vertx.setPeriodic(1) {
      response.write(LedgerNotificationKt("account-1", "account-2", BigDecimal("100.99")).toNotification())
    }
    response.exceptionHandler {
      vertx.cancelTimer(periodicId)
    }
  }
}

fun BigDecimal.toAmount(): Amount {
  return Amount.newBuilder()
      .setNegative(this < BigDecimal.ZERO)
      .setPounds(this.abs().toLong())
      .setPence(this.remainder(java.math.BigDecimal.ONE).movePointRight(this.scale()).abs().toInt())
      .build()
}

fun Amount.toBigDecimal(): BigDecimal {
  val bd = BigDecimal(BigInteger.valueOf((this.pounds * 100L) + this.pence), 2)
  if (this.negative) {
    return bd.negate()
  } else {
    return bd
  }
}

data class LedgerNotificationKt (val from: String, val to: String, val amount: BigDecimal) {
  fun toNotification() : LedgerNotification {
    return LedgerNotification.newBuilder()
        .setAmount(amount.toAmount())
        .setFromAccountId(from)
        .setToAccountId(to)
        .build()
  }
}

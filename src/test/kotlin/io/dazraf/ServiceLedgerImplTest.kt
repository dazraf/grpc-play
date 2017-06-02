package io.dazraf

import org.junit.Test
import java.math.BigDecimal
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ServiceLedgerImplTest {
  @Test
  fun testAmountConversion() {
    val bd = BigDecimal("-100.99")
    val a = bd.toAmount()
    assertTrue(a.negative)
    assertEquals(100, a.pounds)
    assertEquals(99, a.pence)
    val bd2 = a.toBigDecimal()
    assertEquals(bd, bd2)
  }
}
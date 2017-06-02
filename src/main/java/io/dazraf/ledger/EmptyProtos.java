// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: empty.proto

package io.dazraf.ledger;

public final class EmptyProtos {
  private EmptyProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EmptyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:io.dazraf.ledger.Empty)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * An empty message that you can re-use to avoid defining duplicated empty
   * messages in your project. A typical example is to use it as argument or the
   * return value of a service API. For instance:
   *   service Foo {
   *     rpc Bar (grpc.testing.Empty) returns (grpc.testing.Empty) { };
   *   };
   * </pre>
   *
   * Protobuf type {@code io.dazraf.ledger.Empty}
   */
  public  static final class Empty extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:io.dazraf.ledger.Empty)
      EmptyOrBuilder {
    // Use Empty.newBuilder() to construct.
    private Empty(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Empty() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Empty(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.dazraf.ledger.EmptyProtos.internal_static_io_dazraf_ledger_Empty_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.dazraf.ledger.EmptyProtos.internal_static_io_dazraf_ledger_Empty_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.dazraf.ledger.EmptyProtos.Empty.class, io.dazraf.ledger.EmptyProtos.Empty.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof io.dazraf.ledger.EmptyProtos.Empty)) {
        return super.equals(obj);
      }
      io.dazraf.ledger.EmptyProtos.Empty other = (io.dazraf.ledger.EmptyProtos.Empty) obj;

      boolean result = true;
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.dazraf.ledger.EmptyProtos.Empty parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.dazraf.ledger.EmptyProtos.Empty parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.dazraf.ledger.EmptyProtos.Empty parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.dazraf.ledger.EmptyProtos.Empty parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.dazraf.ledger.EmptyProtos.Empty parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.dazraf.ledger.EmptyProtos.Empty parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.dazraf.ledger.EmptyProtos.Empty parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.dazraf.ledger.EmptyProtos.Empty parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.dazraf.ledger.EmptyProtos.Empty parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.dazraf.ledger.EmptyProtos.Empty parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(io.dazraf.ledger.EmptyProtos.Empty prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * An empty message that you can re-use to avoid defining duplicated empty
     * messages in your project. A typical example is to use it as argument or the
     * return value of a service API. For instance:
     *   service Foo {
     *     rpc Bar (grpc.testing.Empty) returns (grpc.testing.Empty) { };
     *   };
     * </pre>
     *
     * Protobuf type {@code io.dazraf.ledger.Empty}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:io.dazraf.ledger.Empty)
        io.dazraf.ledger.EmptyProtos.EmptyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.dazraf.ledger.EmptyProtos.internal_static_io_dazraf_ledger_Empty_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.dazraf.ledger.EmptyProtos.internal_static_io_dazraf_ledger_Empty_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.dazraf.ledger.EmptyProtos.Empty.class, io.dazraf.ledger.EmptyProtos.Empty.Builder.class);
      }

      // Construct using io.dazraf.ledger.EmptyProtos.Empty.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.dazraf.ledger.EmptyProtos.internal_static_io_dazraf_ledger_Empty_descriptor;
      }

      public io.dazraf.ledger.EmptyProtos.Empty getDefaultInstanceForType() {
        return io.dazraf.ledger.EmptyProtos.Empty.getDefaultInstance();
      }

      public io.dazraf.ledger.EmptyProtos.Empty build() {
        io.dazraf.ledger.EmptyProtos.Empty result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.dazraf.ledger.EmptyProtos.Empty buildPartial() {
        io.dazraf.ledger.EmptyProtos.Empty result = new io.dazraf.ledger.EmptyProtos.Empty(this);
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.dazraf.ledger.EmptyProtos.Empty) {
          return mergeFrom((io.dazraf.ledger.EmptyProtos.Empty)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.dazraf.ledger.EmptyProtos.Empty other) {
        if (other == io.dazraf.ledger.EmptyProtos.Empty.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.dazraf.ledger.EmptyProtos.Empty parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.dazraf.ledger.EmptyProtos.Empty) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:io.dazraf.ledger.Empty)
    }

    // @@protoc_insertion_point(class_scope:io.dazraf.ledger.Empty)
    private static final io.dazraf.ledger.EmptyProtos.Empty DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.dazraf.ledger.EmptyProtos.Empty();
    }

    public static io.dazraf.ledger.EmptyProtos.Empty getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Empty>
        PARSER = new com.google.protobuf.AbstractParser<Empty>() {
      public Empty parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Empty(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Empty> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Empty> getParserForType() {
      return PARSER;
    }

    public io.dazraf.ledger.EmptyProtos.Empty getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_dazraf_ledger_Empty_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_dazraf_ledger_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013empty.proto\022\020io.dazraf.ledger\"\007\n\005Empty" +
      "B\rB\013EmptyProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_io_dazraf_ledger_Empty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_dazraf_ledger_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_dazraf_ledger_Empty_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
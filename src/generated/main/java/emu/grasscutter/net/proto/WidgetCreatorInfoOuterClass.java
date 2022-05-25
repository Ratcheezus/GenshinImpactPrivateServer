// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetCreatorInfo.proto

package emu.grasscutter.net.proto;

public final class WidgetCreatorInfoOuterClass {
  private WidgetCreatorInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WidgetCreatorInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WidgetCreatorInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.WidgetCreatorOpType op_type = 1;</code>
     * @return The enum numeric value on the wire for opType.
     */
    int getOpTypeValue();
    /**
     * <code>.WidgetCreatorOpType op_type = 1;</code>
     * @return The opType.
     */
    emu.grasscutter.net.proto.WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType getOpType();

    /**
     * <code>uint32 entity_id = 2;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.WidgetCreateLocationInfo location_info = 3;</code>
     * @return Whether the locationInfo field is set.
     */
    boolean hasLocationInfo();
    /**
     * <code>.WidgetCreateLocationInfo location_info = 3;</code>
     * @return The locationInfo.
     */
    emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo getLocationInfo();
    /**
     * <code>.WidgetCreateLocationInfo location_info = 3;</code>
     */
    emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder getLocationInfoOrBuilder();
  }
  /**
   * Protobuf type {@code WidgetCreatorInfo}
   */
  public static final class WidgetCreatorInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WidgetCreatorInfo)
      WidgetCreatorInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WidgetCreatorInfo.newBuilder() to construct.
    private WidgetCreatorInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WidgetCreatorInfo() {
      opType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WidgetCreatorInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WidgetCreatorInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {
              int rawValue = input.readEnum();

              opType_ = rawValue;
              break;
            }
            case 16: {

              entityId_ = input.readUInt32();
              break;
            }
            case 26: {
              emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder subBuilder = null;
              if (locationInfo_ != null) {
                subBuilder = locationInfo_.toBuilder();
              }
              locationInfo_ = input.readMessage(emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(locationInfo_);
                locationInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
      return emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.internal_static_WidgetCreatorInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.internal_static_WidgetCreatorInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo.class, emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo.Builder.class);
    }

    public static final int OP_TYPE_FIELD_NUMBER = 1;
    private int opType_;
    /**
     * <code>.WidgetCreatorOpType op_type = 1;</code>
     * @return The enum numeric value on the wire for opType.
     */
    @java.lang.Override public int getOpTypeValue() {
      return opType_;
    }
    /**
     * <code>.WidgetCreatorOpType op_type = 1;</code>
     * @return The opType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType getOpType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType result = emu.grasscutter.net.proto.WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType.valueOf(opType_);
      return result == null ? emu.grasscutter.net.proto.WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType.UNRECOGNIZED : result;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 2;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 2;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int LOCATION_INFO_FIELD_NUMBER = 3;
    private emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo locationInfo_;
    /**
     * <code>.WidgetCreateLocationInfo location_info = 3;</code>
     * @return Whether the locationInfo field is set.
     */
    @java.lang.Override
    public boolean hasLocationInfo() {
      return locationInfo_ != null;
    }
    /**
     * <code>.WidgetCreateLocationInfo location_info = 3;</code>
     * @return The locationInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo getLocationInfo() {
      return locationInfo_ == null ? emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.getDefaultInstance() : locationInfo_;
    }
    /**
     * <code>.WidgetCreateLocationInfo location_info = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder getLocationInfoOrBuilder() {
      return getLocationInfo();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (opType_ != emu.grasscutter.net.proto.WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType.WIDGET_CREATOR_TYPE_NONE.getNumber()) {
        output.writeEnum(1, opType_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(2, entityId_);
      }
      if (locationInfo_ != null) {
        output.writeMessage(3, getLocationInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (opType_ != emu.grasscutter.net.proto.WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType.WIDGET_CREATOR_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, opType_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, entityId_);
      }
      if (locationInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getLocationInfo());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo other = (emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo) obj;

      if (opType_ != other.opType_) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasLocationInfo() != other.hasLocationInfo()) return false;
      if (hasLocationInfo()) {
        if (!getLocationInfo()
            .equals(other.getLocationInfo())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + OP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + opType_;
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (hasLocationInfo()) {
        hash = (37 * hash) + LOCATION_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getLocationInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code WidgetCreatorInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WidgetCreatorInfo)
        emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.internal_static_WidgetCreatorInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.internal_static_WidgetCreatorInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo.class, emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        opType_ = 0;

        entityId_ = 0;

        if (locationInfoBuilder_ == null) {
          locationInfo_ = null;
        } else {
          locationInfo_ = null;
          locationInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.internal_static_WidgetCreatorInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo build() {
        emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo buildPartial() {
        emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo result = new emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo(this);
        result.opType_ = opType_;
        result.entityId_ = entityId_;
        if (locationInfoBuilder_ == null) {
          result.locationInfo_ = locationInfo_;
        } else {
          result.locationInfo_ = locationInfoBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo) {
          return mergeFrom((emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo other) {
        if (other == emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo.getDefaultInstance()) return this;
        if (other.opType_ != 0) {
          setOpTypeValue(other.getOpTypeValue());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasLocationInfo()) {
          mergeLocationInfo(other.getLocationInfo());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int opType_ = 0;
      /**
       * <code>.WidgetCreatorOpType op_type = 1;</code>
       * @return The enum numeric value on the wire for opType.
       */
      @java.lang.Override public int getOpTypeValue() {
        return opType_;
      }
      /**
       * <code>.WidgetCreatorOpType op_type = 1;</code>
       * @param value The enum numeric value on the wire for opType to set.
       * @return This builder for chaining.
       */
      public Builder setOpTypeValue(int value) {
        
        opType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.WidgetCreatorOpType op_type = 1;</code>
       * @return The opType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType getOpType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType result = emu.grasscutter.net.proto.WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType.valueOf(opType_);
        return result == null ? emu.grasscutter.net.proto.WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType.UNRECOGNIZED : result;
      }
      /**
       * <code>.WidgetCreatorOpType op_type = 1;</code>
       * @param value The opType to set.
       * @return This builder for chaining.
       */
      public Builder setOpType(emu.grasscutter.net.proto.WidgetCreatorOpTypeOuterClass.WidgetCreatorOpType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        opType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.WidgetCreatorOpType op_type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpType() {
        
        opType_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 2;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 2;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo locationInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo, emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder, emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder> locationInfoBuilder_;
      /**
       * <code>.WidgetCreateLocationInfo location_info = 3;</code>
       * @return Whether the locationInfo field is set.
       */
      public boolean hasLocationInfo() {
        return locationInfoBuilder_ != null || locationInfo_ != null;
      }
      /**
       * <code>.WidgetCreateLocationInfo location_info = 3;</code>
       * @return The locationInfo.
       */
      public emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo getLocationInfo() {
        if (locationInfoBuilder_ == null) {
          return locationInfo_ == null ? emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.getDefaultInstance() : locationInfo_;
        } else {
          return locationInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.WidgetCreateLocationInfo location_info = 3;</code>
       */
      public Builder setLocationInfo(emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo value) {
        if (locationInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          locationInfo_ = value;
          onChanged();
        } else {
          locationInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.WidgetCreateLocationInfo location_info = 3;</code>
       */
      public Builder setLocationInfo(
          emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder builderForValue) {
        if (locationInfoBuilder_ == null) {
          locationInfo_ = builderForValue.build();
          onChanged();
        } else {
          locationInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.WidgetCreateLocationInfo location_info = 3;</code>
       */
      public Builder mergeLocationInfo(emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo value) {
        if (locationInfoBuilder_ == null) {
          if (locationInfo_ != null) {
            locationInfo_ =
              emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.newBuilder(locationInfo_).mergeFrom(value).buildPartial();
          } else {
            locationInfo_ = value;
          }
          onChanged();
        } else {
          locationInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.WidgetCreateLocationInfo location_info = 3;</code>
       */
      public Builder clearLocationInfo() {
        if (locationInfoBuilder_ == null) {
          locationInfo_ = null;
          onChanged();
        } else {
          locationInfo_ = null;
          locationInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.WidgetCreateLocationInfo location_info = 3;</code>
       */
      public emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder getLocationInfoBuilder() {
        
        onChanged();
        return getLocationInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.WidgetCreateLocationInfo location_info = 3;</code>
       */
      public emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder getLocationInfoOrBuilder() {
        if (locationInfoBuilder_ != null) {
          return locationInfoBuilder_.getMessageOrBuilder();
        } else {
          return locationInfo_ == null ?
              emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.getDefaultInstance() : locationInfo_;
        }
      }
      /**
       * <code>.WidgetCreateLocationInfo location_info = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo, emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder, emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder> 
          getLocationInfoFieldBuilder() {
        if (locationInfoBuilder_ == null) {
          locationInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo, emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfo.Builder, emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.WidgetCreateLocationInfoOrBuilder>(
                  getLocationInfo(),
                  getParentForChildren(),
                  isClean());
          locationInfo_ = null;
        }
        return locationInfoBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:WidgetCreatorInfo)
    }

    // @@protoc_insertion_point(class_scope:WidgetCreatorInfo)
    private static final emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo();
    }

    public static emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WidgetCreatorInfo>
        PARSER = new com.google.protobuf.AbstractParser<WidgetCreatorInfo>() {
      @java.lang.Override
      public WidgetCreatorInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WidgetCreatorInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WidgetCreatorInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WidgetCreatorInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WidgetCreatorInfoOuterClass.WidgetCreatorInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WidgetCreatorInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WidgetCreatorInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027WidgetCreatorInfo.proto\032\031WidgetCreator" +
      "OpType.proto\032\036WidgetCreateLocationInfo.p" +
      "roto\"\177\n\021WidgetCreatorInfo\022%\n\007op_type\030\001 \001" +
      "(\0162\024.WidgetCreatorOpType\022\021\n\tentity_id\030\002 " +
      "\001(\r\0220\n\rlocation_info\030\003 \001(\0132\031.WidgetCreat" +
      "eLocationInfoB\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.WidgetCreatorOpTypeOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.getDescriptor(),
        });
    internal_static_WidgetCreatorInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WidgetCreatorInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WidgetCreatorInfo_descriptor,
        new java.lang.String[] { "OpType", "EntityId", "LocationInfo", });
    emu.grasscutter.net.proto.WidgetCreatorOpTypeOuterClass.getDescriptor();
    emu.grasscutter.net.proto.WidgetCreateLocationInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

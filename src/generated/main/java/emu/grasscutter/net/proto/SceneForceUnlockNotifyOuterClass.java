// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneForceUnlockNotify.proto

package emu.grasscutter.net.proto;

public final class SceneForceUnlockNotifyOuterClass {
  private SceneForceUnlockNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneForceUnlockNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneForceUnlockNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 force_id_list = 1;</code>
     * @return A list containing the forceIdList.
     */
    java.util.List<java.lang.Integer> getForceIdListList();
    /**
     * <code>repeated uint32 force_id_list = 1;</code>
     * @return The count of forceIdList.
     */
    int getForceIdListCount();
    /**
     * <code>repeated uint32 force_id_list = 1;</code>
     * @param index The index of the element to return.
     * @return The forceIdList at the given index.
     */
    int getForceIdList(int index);

    /**
     * <code>bool is_add = 2;</code>
     * @return The isAdd.
     */
    boolean getIsAdd();
  }
  /**
   * Protobuf type {@code SceneForceUnlockNotify}
   */
  public static final class SceneForceUnlockNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneForceUnlockNotify)
      SceneForceUnlockNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneForceUnlockNotify.newBuilder() to construct.
    private SceneForceUnlockNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneForceUnlockNotify() {
      forceIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneForceUnlockNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneForceUnlockNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                forceIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              forceIdList_.addInt(input.readUInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                forceIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                forceIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 16: {

              isAdd_ = input.readBool();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          forceIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.internal_static_SceneForceUnlockNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.internal_static_SceneForceUnlockNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify.class, emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code SceneForceUnlockNotify.CmdId}
     */
    public enum CmdId
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>ENET_IS_RELIABLE = 1;</code>
       */
      ENET_IS_RELIABLE(2, 1),
      /**
       * <code>CMD_ID = 292;</code>
       */
      CMD_ID(3, 292),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>ENET_CHANNEL_ID = 0;</code>
       */
      public static final CmdId ENET_CHANNEL_ID = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>ENET_CHANNEL_ID = 0;</code>
       */
      public static final int ENET_CHANNEL_ID_VALUE = 0;
      /**
       * <code>ENET_IS_RELIABLE = 1;</code>
       */
      public static final int ENET_IS_RELIABLE_VALUE = 1;
      /**
       * <code>CMD_ID = 292;</code>
       */
      public static final int CMD_ID_VALUE = 292;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static CmdId valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static CmdId forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1: return ENET_IS_RELIABLE;
          case 292: return CMD_ID;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<CmdId>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          CmdId> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CmdId>() {
              public CmdId findValueByNumber(int number) {
                return CmdId.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final CmdId[] VALUES = getStaticValuesArray();
      private static CmdId[] getStaticValuesArray() {
        return new CmdId[] {
          NONE, ENET_CHANNEL_ID, ENET_IS_RELIABLE, CMD_ID, 
        };
      }
      public static CmdId valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private CmdId(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:SceneForceUnlockNotify.CmdId)
    }

    public static final int FORCE_ID_LIST_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList forceIdList_;
    /**
     * <code>repeated uint32 force_id_list = 1;</code>
     * @return A list containing the forceIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getForceIdListList() {
      return forceIdList_;
    }
    /**
     * <code>repeated uint32 force_id_list = 1;</code>
     * @return The count of forceIdList.
     */
    public int getForceIdListCount() {
      return forceIdList_.size();
    }
    /**
     * <code>repeated uint32 force_id_list = 1;</code>
     * @param index The index of the element to return.
     * @return The forceIdList at the given index.
     */
    public int getForceIdList(int index) {
      return forceIdList_.getInt(index);
    }
    private int forceIdListMemoizedSerializedSize = -1;

    public static final int IS_ADD_FIELD_NUMBER = 2;
    private boolean isAdd_;
    /**
     * <code>bool is_add = 2;</code>
     * @return The isAdd.
     */
    @java.lang.Override
    public boolean getIsAdd() {
      return isAdd_;
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
      getSerializedSize();
      if (getForceIdListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(forceIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < forceIdList_.size(); i++) {
        output.writeUInt32NoTag(forceIdList_.getInt(i));
      }
      if (isAdd_ != false) {
        output.writeBool(2, isAdd_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < forceIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(forceIdList_.getInt(i));
        }
        size += dataSize;
        if (!getForceIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        forceIdListMemoizedSerializedSize = dataSize;
      }
      if (isAdd_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isAdd_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify other = (emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify) obj;

      if (!getForceIdListList()
          .equals(other.getForceIdListList())) return false;
      if (getIsAdd()
          != other.getIsAdd()) return false;
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
      if (getForceIdListCount() > 0) {
        hash = (37 * hash) + FORCE_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getForceIdListList().hashCode();
      }
      hash = (37 * hash) + IS_ADD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAdd());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify prototype) {
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
     * Protobuf type {@code SceneForceUnlockNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneForceUnlockNotify)
        emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.internal_static_SceneForceUnlockNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.internal_static_SceneForceUnlockNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify.class, emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify.newBuilder()
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
        forceIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        isAdd_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.internal_static_SceneForceUnlockNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify build() {
        emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify buildPartial() {
        emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify result = new emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          forceIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.forceIdList_ = forceIdList_;
        result.isAdd_ = isAdd_;
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
        if (other instanceof emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify) {
          return mergeFrom((emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify other) {
        if (other == emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify.getDefaultInstance()) return this;
        if (!other.forceIdList_.isEmpty()) {
          if (forceIdList_.isEmpty()) {
            forceIdList_ = other.forceIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureForceIdListIsMutable();
            forceIdList_.addAll(other.forceIdList_);
          }
          onChanged();
        }
        if (other.getIsAdd() != false) {
          setIsAdd(other.getIsAdd());
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
        emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList forceIdList_ = emptyIntList();
      private void ensureForceIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          forceIdList_ = mutableCopy(forceIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 force_id_list = 1;</code>
       * @return A list containing the forceIdList.
       */
      public java.util.List<java.lang.Integer>
          getForceIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(forceIdList_) : forceIdList_;
      }
      /**
       * <code>repeated uint32 force_id_list = 1;</code>
       * @return The count of forceIdList.
       */
      public int getForceIdListCount() {
        return forceIdList_.size();
      }
      /**
       * <code>repeated uint32 force_id_list = 1;</code>
       * @param index The index of the element to return.
       * @return The forceIdList at the given index.
       */
      public int getForceIdList(int index) {
        return forceIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 force_id_list = 1;</code>
       * @param index The index to set the value at.
       * @param value The forceIdList to set.
       * @return This builder for chaining.
       */
      public Builder setForceIdList(
          int index, int value) {
        ensureForceIdListIsMutable();
        forceIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 force_id_list = 1;</code>
       * @param value The forceIdList to add.
       * @return This builder for chaining.
       */
      public Builder addForceIdList(int value) {
        ensureForceIdListIsMutable();
        forceIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 force_id_list = 1;</code>
       * @param values The forceIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllForceIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureForceIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, forceIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 force_id_list = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearForceIdList() {
        forceIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private boolean isAdd_ ;
      /**
       * <code>bool is_add = 2;</code>
       * @return The isAdd.
       */
      @java.lang.Override
      public boolean getIsAdd() {
        return isAdd_;
      }
      /**
       * <code>bool is_add = 2;</code>
       * @param value The isAdd to set.
       * @return This builder for chaining.
       */
      public Builder setIsAdd(boolean value) {
        
        isAdd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_add = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAdd() {
        
        isAdd_ = false;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:SceneForceUnlockNotify)
    }

    // @@protoc_insertion_point(class_scope:SceneForceUnlockNotify)
    private static final emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify();
    }

    public static emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneForceUnlockNotify>
        PARSER = new com.google.protobuf.AbstractParser<SceneForceUnlockNotify>() {
      @java.lang.Override
      public SceneForceUnlockNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneForceUnlockNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneForceUnlockNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneForceUnlockNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SceneForceUnlockNotifyOuterClass.SceneForceUnlockNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneForceUnlockNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneForceUnlockNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SceneForceUnlockNotify.proto\"\216\001\n\026Scene" +
      "ForceUnlockNotify\022\025\n\rforce_id_list\030\001 \003(\r" +
      "\022\016\n\006is_add\030\002 \001(\010\"M\n\005CmdId\022\010\n\004NONE\020\000\022\023\n\017E" +
      "NET_CHANNEL_ID\020\000\022\024\n\020ENET_IS_RELIABLE\020\001\022\013" +
      "\n\006CMD_ID\020\244\002\032\002\020\001B\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneForceUnlockNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneForceUnlockNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneForceUnlockNotify_descriptor,
        new java.lang.String[] { "ForceIdList", "IsAdd", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

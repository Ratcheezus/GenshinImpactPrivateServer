// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerEnterLevelRsp.proto

package emu.grasscutter.net.proto;

public final class TowerEnterLevelRspOuterClass {
  private TowerEnterLevelRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TowerEnterLevelRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerEnterLevelRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 floor_id = 2;</code>
     * @return The floorId.
     */
    int getFloorId();

    /**
     * <code>uint32 level_index = 3;</code>
     * @return The levelIndex.
     */
    int getLevelIndex();

    /**
     * <code>repeated uint32 tower_buff_id_list = 4;</code>
     * @return A list containing the towerBuffIdList.
     */
    java.util.List<java.lang.Integer> getTowerBuffIdListList();
    /**
     * <code>repeated uint32 tower_buff_id_list = 4;</code>
     * @return The count of towerBuffIdList.
     */
    int getTowerBuffIdListCount();
    /**
     * <code>repeated uint32 tower_buff_id_list = 4;</code>
     * @param index The index of the element to return.
     * @return The towerBuffIdList at the given index.
     */
    int getTowerBuffIdList(int index);
  }
  /**
   * Protobuf type {@code TowerEnterLevelRsp}
   */
  public static final class TowerEnterLevelRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TowerEnterLevelRsp)
      TowerEnterLevelRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TowerEnterLevelRsp.newBuilder() to construct.
    private TowerEnterLevelRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerEnterLevelRsp() {
      towerBuffIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TowerEnterLevelRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TowerEnterLevelRsp(
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

              retcode_ = input.readInt32();
              break;
            }
            case 16: {

              floorId_ = input.readUInt32();
              break;
            }
            case 24: {

              levelIndex_ = input.readUInt32();
              break;
            }
            case 32: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                towerBuffIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              towerBuffIdList_.addInt(input.readUInt32());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                towerBuffIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                towerBuffIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
          towerBuffIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.internal_static_TowerEnterLevelRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.internal_static_TowerEnterLevelRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp.class, emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code TowerEnterLevelRsp.CmdId}
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
       * <code>CMD_ID = 2426;</code>
       */
      CMD_ID(3, 2426),
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
       * <code>CMD_ID = 2426;</code>
       */
      public static final int CMD_ID_VALUE = 2426;


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
          case 2426: return CMD_ID;
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
        return emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp.getDescriptor().getEnumTypes().get(0);
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

      // @@protoc_insertion_point(enum_scope:TowerEnterLevelRsp.CmdId)
    }

    public static final int RETCODE_FIELD_NUMBER = 1;
    private int retcode_;
    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int FLOOR_ID_FIELD_NUMBER = 2;
    private int floorId_;
    /**
     * <code>uint32 floor_id = 2;</code>
     * @return The floorId.
     */
    @java.lang.Override
    public int getFloorId() {
      return floorId_;
    }

    public static final int LEVEL_INDEX_FIELD_NUMBER = 3;
    private int levelIndex_;
    /**
     * <code>uint32 level_index = 3;</code>
     * @return The levelIndex.
     */
    @java.lang.Override
    public int getLevelIndex() {
      return levelIndex_;
    }

    public static final int TOWER_BUFF_ID_LIST_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.IntList towerBuffIdList_;
    /**
     * <code>repeated uint32 tower_buff_id_list = 4;</code>
     * @return A list containing the towerBuffIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getTowerBuffIdListList() {
      return towerBuffIdList_;
    }
    /**
     * <code>repeated uint32 tower_buff_id_list = 4;</code>
     * @return The count of towerBuffIdList.
     */
    public int getTowerBuffIdListCount() {
      return towerBuffIdList_.size();
    }
    /**
     * <code>repeated uint32 tower_buff_id_list = 4;</code>
     * @param index The index of the element to return.
     * @return The towerBuffIdList at the given index.
     */
    public int getTowerBuffIdList(int index) {
      return towerBuffIdList_.getInt(index);
    }
    private int towerBuffIdListMemoizedSerializedSize = -1;

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
      if (retcode_ != 0) {
        output.writeInt32(1, retcode_);
      }
      if (floorId_ != 0) {
        output.writeUInt32(2, floorId_);
      }
      if (levelIndex_ != 0) {
        output.writeUInt32(3, levelIndex_);
      }
      if (getTowerBuffIdListList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(towerBuffIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < towerBuffIdList_.size(); i++) {
        output.writeUInt32NoTag(towerBuffIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, retcode_);
      }
      if (floorId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, floorId_);
      }
      if (levelIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, levelIndex_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < towerBuffIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(towerBuffIdList_.getInt(i));
        }
        size += dataSize;
        if (!getTowerBuffIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        towerBuffIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp other = (emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getFloorId()
          != other.getFloorId()) return false;
      if (getLevelIndex()
          != other.getLevelIndex()) return false;
      if (!getTowerBuffIdListList()
          .equals(other.getTowerBuffIdListList())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + FLOOR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFloorId();
      hash = (37 * hash) + LEVEL_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getLevelIndex();
      if (getTowerBuffIdListCount() > 0) {
        hash = (37 * hash) + TOWER_BUFF_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTowerBuffIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp prototype) {
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
     * Protobuf type {@code TowerEnterLevelRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerEnterLevelRsp)
        emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.internal_static_TowerEnterLevelRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.internal_static_TowerEnterLevelRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp.class, emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp.newBuilder()
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
        retcode_ = 0;

        floorId_ = 0;

        levelIndex_ = 0;

        towerBuffIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.internal_static_TowerEnterLevelRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp build() {
        emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp buildPartial() {
        emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp result = new emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        result.floorId_ = floorId_;
        result.levelIndex_ = levelIndex_;
        if (((bitField0_ & 0x00000001) != 0)) {
          towerBuffIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.towerBuffIdList_ = towerBuffIdList_;
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
        if (other instanceof emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp) {
          return mergeFrom((emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp other) {
        if (other == emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getFloorId() != 0) {
          setFloorId(other.getFloorId());
        }
        if (other.getLevelIndex() != 0) {
          setLevelIndex(other.getLevelIndex());
        }
        if (!other.towerBuffIdList_.isEmpty()) {
          if (towerBuffIdList_.isEmpty()) {
            towerBuffIdList_ = other.towerBuffIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTowerBuffIdListIsMutable();
            towerBuffIdList_.addAll(other.towerBuffIdList_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 1;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int floorId_ ;
      /**
       * <code>uint32 floor_id = 2;</code>
       * @return The floorId.
       */
      @java.lang.Override
      public int getFloorId() {
        return floorId_;
      }
      /**
       * <code>uint32 floor_id = 2;</code>
       * @param value The floorId to set.
       * @return This builder for chaining.
       */
      public Builder setFloorId(int value) {
        
        floorId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 floor_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFloorId() {
        
        floorId_ = 0;
        onChanged();
        return this;
      }

      private int levelIndex_ ;
      /**
       * <code>uint32 level_index = 3;</code>
       * @return The levelIndex.
       */
      @java.lang.Override
      public int getLevelIndex() {
        return levelIndex_;
      }
      /**
       * <code>uint32 level_index = 3;</code>
       * @param value The levelIndex to set.
       * @return This builder for chaining.
       */
      public Builder setLevelIndex(int value) {
        
        levelIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_index = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelIndex() {
        
        levelIndex_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList towerBuffIdList_ = emptyIntList();
      private void ensureTowerBuffIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          towerBuffIdList_ = mutableCopy(towerBuffIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 tower_buff_id_list = 4;</code>
       * @return A list containing the towerBuffIdList.
       */
      public java.util.List<java.lang.Integer>
          getTowerBuffIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(towerBuffIdList_) : towerBuffIdList_;
      }
      /**
       * <code>repeated uint32 tower_buff_id_list = 4;</code>
       * @return The count of towerBuffIdList.
       */
      public int getTowerBuffIdListCount() {
        return towerBuffIdList_.size();
      }
      /**
       * <code>repeated uint32 tower_buff_id_list = 4;</code>
       * @param index The index of the element to return.
       * @return The towerBuffIdList at the given index.
       */
      public int getTowerBuffIdList(int index) {
        return towerBuffIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 tower_buff_id_list = 4;</code>
       * @param index The index to set the value at.
       * @param value The towerBuffIdList to set.
       * @return This builder for chaining.
       */
      public Builder setTowerBuffIdList(
          int index, int value) {
        ensureTowerBuffIdListIsMutable();
        towerBuffIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 tower_buff_id_list = 4;</code>
       * @param value The towerBuffIdList to add.
       * @return This builder for chaining.
       */
      public Builder addTowerBuffIdList(int value) {
        ensureTowerBuffIdListIsMutable();
        towerBuffIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 tower_buff_id_list = 4;</code>
       * @param values The towerBuffIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllTowerBuffIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureTowerBuffIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, towerBuffIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 tower_buff_id_list = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTowerBuffIdList() {
        towerBuffIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:TowerEnterLevelRsp)
    }

    // @@protoc_insertion_point(class_scope:TowerEnterLevelRsp)
    private static final emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp();
    }

    public static emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TowerEnterLevelRsp>
        PARSER = new com.google.protobuf.AbstractParser<TowerEnterLevelRsp>() {
      @java.lang.Override
      public TowerEnterLevelRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TowerEnterLevelRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TowerEnterLevelRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerEnterLevelRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TowerEnterLevelRspOuterClass.TowerEnterLevelRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerEnterLevelRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TowerEnterLevelRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030TowerEnterLevelRsp.proto\"\267\001\n\022TowerEnte" +
      "rLevelRsp\022\017\n\007retcode\030\001 \001(\005\022\020\n\010floor_id\030\002" +
      " \001(\r\022\023\n\013level_index\030\003 \001(\r\022\032\n\022tower_buff_" +
      "id_list\030\004 \003(\r\"M\n\005CmdId\022\010\n\004NONE\020\000\022\023\n\017ENET" +
      "_CHANNEL_ID\020\000\022\024\n\020ENET_IS_RELIABLE\020\001\022\013\n\006C" +
      "MD_ID\020\372\022\032\002\020\001B\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TowerEnterLevelRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerEnterLevelRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerEnterLevelRsp_descriptor,
        new java.lang.String[] { "Retcode", "FloorId", "LevelIndex", "TowerBuffIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

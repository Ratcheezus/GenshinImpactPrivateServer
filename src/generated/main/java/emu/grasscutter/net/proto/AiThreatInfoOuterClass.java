// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AiThreatInfo.proto

package emu.grasscutter.net.proto;

public final class AiThreatInfoOuterClass {
  private AiThreatInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AiThreatInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AiThreatInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; ai_threat_map = 1;</code>
     */
    int getAiThreatMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; ai_threat_map = 1;</code>
     */
    boolean containsAiThreatMap(
        int key);
    /**
     * Use {@link #getAiThreatMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getAiThreatMap();
    /**
     * <code>map&lt;uint32, uint32&gt; ai_threat_map = 1;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getAiThreatMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; ai_threat_map = 1;</code>
     */

    int getAiThreatMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; ai_threat_map = 1;</code>
     */

    int getAiThreatMapOrThrow(
        int key);
  }
  /**
   * Protobuf type {@code AiThreatInfo}
   */
  public static final class AiThreatInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AiThreatInfo)
      AiThreatInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AiThreatInfo.newBuilder() to construct.
    private AiThreatInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AiThreatInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AiThreatInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AiThreatInfo(
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                aiThreatMap_ = com.google.protobuf.MapField.newMapField(
                    AiThreatMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              aiThreatMap__ = input.readMessage(
                  AiThreatMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              aiThreatMap_.getMutableMap().put(
                  aiThreatMap__.getKey(), aiThreatMap__.getValue());
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
      return emu.grasscutter.net.proto.AiThreatInfoOuterClass.internal_static_AiThreatInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetAiThreatMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AiThreatInfoOuterClass.internal_static_AiThreatInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo.class, emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo.Builder.class);
    }

    public static final int AI_THREAT_MAP_FIELD_NUMBER = 1;
    private static final class AiThreatMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.AiThreatInfoOuterClass.internal_static_AiThreatInfo_AiThreatMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> aiThreatMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetAiThreatMap() {
      if (aiThreatMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AiThreatMapDefaultEntryHolder.defaultEntry);
      }
      return aiThreatMap_;
    }

    public int getAiThreatMapCount() {
      return internalGetAiThreatMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; ai_threat_map = 1;</code>
     */

    @java.lang.Override
    public boolean containsAiThreatMap(
        int key) {
      
      return internalGetAiThreatMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAiThreatMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getAiThreatMap() {
      return getAiThreatMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; ai_threat_map = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getAiThreatMapMap() {
      return internalGetAiThreatMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; ai_threat_map = 1;</code>
     */
    @java.lang.Override

    public int getAiThreatMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetAiThreatMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; ai_threat_map = 1;</code>
     */
    @java.lang.Override

    public int getAiThreatMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetAiThreatMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetAiThreatMap(),
          AiThreatMapDefaultEntryHolder.defaultEntry,
          1);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetAiThreatMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        aiThreatMap__ = AiThreatMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(1, aiThreatMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo other = (emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo) obj;

      if (!internalGetAiThreatMap().equals(
          other.internalGetAiThreatMap())) return false;
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
      if (!internalGetAiThreatMap().getMap().isEmpty()) {
        hash = (37 * hash) + AI_THREAT_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetAiThreatMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo prototype) {
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
     * Protobuf type {@code AiThreatInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AiThreatInfo)
        emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AiThreatInfoOuterClass.internal_static_AiThreatInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 1:
            return internalGetAiThreatMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 1:
            return internalGetMutableAiThreatMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AiThreatInfoOuterClass.internal_static_AiThreatInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo.class, emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo.newBuilder()
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
        internalGetMutableAiThreatMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AiThreatInfoOuterClass.internal_static_AiThreatInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo build() {
        emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo buildPartial() {
        emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo result = new emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo(this);
        int from_bitField0_ = bitField0_;
        result.aiThreatMap_ = internalGetAiThreatMap();
        result.aiThreatMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo) {
          return mergeFrom((emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo other) {
        if (other == emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo.getDefaultInstance()) return this;
        internalGetMutableAiThreatMap().mergeFrom(
            other.internalGetAiThreatMap());
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
        emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> aiThreatMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetAiThreatMap() {
        if (aiThreatMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              AiThreatMapDefaultEntryHolder.defaultEntry);
        }
        return aiThreatMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableAiThreatMap() {
        onChanged();;
        if (aiThreatMap_ == null) {
          aiThreatMap_ = com.google.protobuf.MapField.newMapField(
              AiThreatMapDefaultEntryHolder.defaultEntry);
        }
        if (!aiThreatMap_.isMutable()) {
          aiThreatMap_ = aiThreatMap_.copy();
        }
        return aiThreatMap_;
      }

      public int getAiThreatMapCount() {
        return internalGetAiThreatMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; ai_threat_map = 1;</code>
       */

      @java.lang.Override
      public boolean containsAiThreatMap(
          int key) {
        
        return internalGetAiThreatMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getAiThreatMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getAiThreatMap() {
        return getAiThreatMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; ai_threat_map = 1;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getAiThreatMapMap() {
        return internalGetAiThreatMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; ai_threat_map = 1;</code>
       */
      @java.lang.Override

      public int getAiThreatMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetAiThreatMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; ai_threat_map = 1;</code>
       */
      @java.lang.Override

      public int getAiThreatMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetAiThreatMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearAiThreatMap() {
        internalGetMutableAiThreatMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; ai_threat_map = 1;</code>
       */

      public Builder removeAiThreatMap(
          int key) {
        
        internalGetMutableAiThreatMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableAiThreatMap() {
        return internalGetMutableAiThreatMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; ai_threat_map = 1;</code>
       */
      public Builder putAiThreatMap(
          int key,
          int value) {
        
        
        internalGetMutableAiThreatMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; ai_threat_map = 1;</code>
       */

      public Builder putAllAiThreatMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableAiThreatMap().getMutableMap()
            .putAll(values);
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


      // @@protoc_insertion_point(builder_scope:AiThreatInfo)
    }

    // @@protoc_insertion_point(class_scope:AiThreatInfo)
    private static final emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo();
    }

    public static emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AiThreatInfo>
        PARSER = new com.google.protobuf.AbstractParser<AiThreatInfo>() {
      @java.lang.Override
      public AiThreatInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AiThreatInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AiThreatInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AiThreatInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AiThreatInfoOuterClass.AiThreatInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AiThreatInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AiThreatInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AiThreatInfo_AiThreatMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AiThreatInfo_AiThreatMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022AiThreatInfo.proto\"y\n\014AiThreatInfo\0225\n\r" +
      "ai_threat_map\030\001 \003(\0132\036.AiThreatInfo.AiThr" +
      "eatMapEntry\0322\n\020AiThreatMapEntry\022\013\n\003key\030\001" +
      " \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AiThreatInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AiThreatInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AiThreatInfo_descriptor,
        new java.lang.String[] { "AiThreatMap", });
    internal_static_AiThreatInfo_AiThreatMapEntry_descriptor =
      internal_static_AiThreatInfo_descriptor.getNestedTypes().get(0);
    internal_static_AiThreatInfo_AiThreatMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AiThreatInfo_AiThreatMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

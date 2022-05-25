// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MapMarkFromType.proto

package emu.grasscutter.net.proto;

public final class MapMarkFromTypeOuterClass {
  private MapMarkFromTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code MapMarkFromType}
   */
  public enum MapMarkFromType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NOE = 0;</code>
     */
    NOE(0),
    /**
     * <code>MONSTER = 1;</code>
     */
    MONSTER(1),
    /**
     * <code>QUEST = 2;</code>
     */
    QUEST(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>NOE = 0;</code>
     */
    public static final int NOE_VALUE = 0;
    /**
     * <code>MONSTER = 1;</code>
     */
    public static final int MONSTER_VALUE = 1;
    /**
     * <code>QUEST = 2;</code>
     */
    public static final int QUEST_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
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
    public static MapMarkFromType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MapMarkFromType forNumber(int value) {
      switch (value) {
        case 0: return NOE;
        case 1: return MONSTER;
        case 2: return QUEST;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MapMarkFromType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MapMarkFromType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MapMarkFromType>() {
            public MapMarkFromType findValueByNumber(int number) {
              return MapMarkFromType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MapMarkFromTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final MapMarkFromType[] VALUES = values();

    public static MapMarkFromType valueOf(
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

    private final int value;

    private MapMarkFromType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MapMarkFromType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025MapMarkFromType.proto*2\n\017MapMarkFromTy" +
      "pe\022\007\n\003NOE\020\000\022\013\n\007MONSTER\020\001\022\t\n\005QUEST\020\002B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

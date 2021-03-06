// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ResinCostType.proto

package emu.grasscutter.net.proto;

public final class ResinCostTypeOuterClass {
  private ResinCostTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ResinCostType}
   */
  public enum ResinCostType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CostNone = 0;</code>
     */
    CostNone(0),
    /**
     * <code>CostNormal = 1;</code>
     */
    CostNormal(1),
    /**
     * <code>CostCondense = 2;</code>
     */
    CostCondense(2),
    /**
     * <code>CostReunionPrivilege = 3;</code>
     */
    CostReunionPrivilege(3),
    /**
     * <code>CostOpActivity = 4;</code>
     */
    CostOpActivity(4),
    /**
     * <code>CostMaterial = 5;</code>
     */
    CostMaterial(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CostNone = 0;</code>
     */
    public static final int CostNone_VALUE = 0;
    /**
     * <code>CostNormal = 1;</code>
     */
    public static final int CostNormal_VALUE = 1;
    /**
     * <code>CostCondense = 2;</code>
     */
    public static final int CostCondense_VALUE = 2;
    /**
     * <code>CostReunionPrivilege = 3;</code>
     */
    public static final int CostReunionPrivilege_VALUE = 3;
    /**
     * <code>CostOpActivity = 4;</code>
     */
    public static final int CostOpActivity_VALUE = 4;
    /**
     * <code>CostMaterial = 5;</code>
     */
    public static final int CostMaterial_VALUE = 5;


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
    public static ResinCostType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ResinCostType forNumber(int value) {
      switch (value) {
        case 0: return CostNone;
        case 1: return CostNormal;
        case 2: return CostCondense;
        case 3: return CostReunionPrivilege;
        case 4: return CostOpActivity;
        case 5: return CostMaterial;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ResinCostType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ResinCostType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ResinCostType>() {
            public ResinCostType findValueByNumber(int number) {
              return ResinCostType.forNumber(number);
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
      return emu.grasscutter.net.proto.ResinCostTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ResinCostType[] VALUES = values();

    public static ResinCostType valueOf(
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

    private ResinCostType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ResinCostType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023ResinCostType.proto*\177\n\rResinCostType\022\014" +
      "\n\010CostNone\020\000\022\016\n\nCostNormal\020\001\022\020\n\014CostCond" +
      "ense\020\002\022\030\n\024CostReunionPrivilege\020\003\022\022\n\016Cost" +
      "OpActivity\020\004\022\020\n\014CostMaterial\020\005B\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

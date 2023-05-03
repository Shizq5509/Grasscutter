// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MailCollectState.proto

package emu.grasscutter.net.proto;

public final class MailCollectStateOuterClass {
    private MailCollectStateOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }
    /**
     *
     *
     * <pre>
     * Name: COONHFJFEHG
     * </pre>
     *
     * Protobuf enum {@code MailCollectState}
     */
    public enum MailCollectState implements com.google.protobuf.ProtocolMessageEnum {
        /** <code>MAIL_COLLECT_STATE_COLLECTIBLE_UNKNOWN = 0;</code> */
        MAIL_COLLECT_STATE_COLLECTIBLE_UNKNOWN(0),
        /** <code>MAIL_COLLECT_STATE_NOT_COLLECTIBLE = 1;</code> */
        MAIL_COLLECT_STATE_NOT_COLLECTIBLE(1),
        /** <code>MAIL_COLLECT_STATE_COLLECTIBLE_UNCOLLECTED = 2;</code> */
        MAIL_COLLECT_STATE_COLLECTIBLE_UNCOLLECTED(2),
        /** <code>MAIL_COLLECT_STATE_COLLECTIBLE_COLLECTED = 3;</code> */
        MAIL_COLLECT_STATE_COLLECTIBLE_COLLECTED(3),
        UNRECOGNIZED(-1),
        ;

        /** <code>MAIL_COLLECT_STATE_COLLECTIBLE_UNKNOWN = 0;</code> */
        public static final int MAIL_COLLECT_STATE_COLLECTIBLE_UNKNOWN_VALUE = 0;
        /** <code>MAIL_COLLECT_STATE_NOT_COLLECTIBLE = 1;</code> */
        public static final int MAIL_COLLECT_STATE_NOT_COLLECTIBLE_VALUE = 1;
        /** <code>MAIL_COLLECT_STATE_COLLECTIBLE_UNCOLLECTED = 2;</code> */
        public static final int MAIL_COLLECT_STATE_COLLECTIBLE_UNCOLLECTED_VALUE = 2;
        /** <code>MAIL_COLLECT_STATE_COLLECTIBLE_COLLECTED = 3;</code> */
        public static final int MAIL_COLLECT_STATE_COLLECTIBLE_COLLECTED_VALUE = 3;

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
        public static MailCollectState valueOf(int value) {
            return forNumber(value);
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         */
        public static MailCollectState forNumber(int value) {
            switch (value) {
                case 0:
                    return MAIL_COLLECT_STATE_COLLECTIBLE_UNKNOWN;
                case 1:
                    return MAIL_COLLECT_STATE_NOT_COLLECTIBLE;
                case 2:
                    return MAIL_COLLECT_STATE_COLLECTIBLE_UNCOLLECTED;
                case 3:
                    return MAIL_COLLECT_STATE_COLLECTIBLE_COLLECTED;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<MailCollectState> internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<MailCollectState>
                internalValueMap =
                        new com.google.protobuf.Internal.EnumLiteMap<MailCollectState>() {
                            public MailCollectState findValueByNumber(int number) {
                                return MailCollectState.forNumber(number);
                            }
                        };

        public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalStateException(
                        "Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
            return emu.grasscutter.net.proto.MailCollectStateOuterClass.getDescriptor()
                    .getEnumTypes()
                    .get(0);
        }

        private static final MailCollectState[] VALUES = values();

        public static MailCollectState valueOf(
                com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        private final int value;

        private MailCollectState(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:MailCollectState)
    }

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\026MailCollectState.proto*\304\001\n\020MailCollect"
                    + "State\022*\n&MAIL_COLLECT_STATE_COLLECTIBLE_"
                    + "UNKNOWN\020\000\022&\n\"MAIL_COLLECT_STATE_NOT_COLL"
                    + "ECTIBLE\020\001\022.\n*MAIL_COLLECT_STATE_COLLECTI"
                    + "BLE_UNCOLLECTED\020\002\022,\n(MAIL_COLLECT_STATE_"
                    + "COLLECTIBLE_COLLECTED\020\003B!\n\031emu.grasscutt"
                    + "er.net.protoZ\004/genb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    }

    // @@protoc_insertion_point(outer_class_scope)
}

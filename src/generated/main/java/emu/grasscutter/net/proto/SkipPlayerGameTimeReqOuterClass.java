// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SkipPlayerGameTimeReq.proto

package emu.grasscutter.net.proto;

public final class SkipPlayerGameTimeReqOuterClass {
    private SkipPlayerGameTimeReqOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface SkipPlayerGameTimeReqOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:SkipPlayerGameTimeReq)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>bool is_force_set = 6;</code>
         *
         * @return The isForceSet.
         */
        boolean getIsForceSet();

        /**
         * <code>uint32 game_time = 5;</code>
         *
         * @return The gameTime.
         */
        int getGameTime();

        /**
         * <code>uint32 client_game_time = 14;</code>
         *
         * @return The clientGameTime.
         */
        int getClientGameTime();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 123
     * Name: GHMNCNNHLAI
     * </pre>
     *
     * Protobuf type {@code SkipPlayerGameTimeReq}
     */
    public static final class SkipPlayerGameTimeReq extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:SkipPlayerGameTimeReq)
            SkipPlayerGameTimeReqOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use SkipPlayerGameTimeReq.newBuilder() to construct.
        private SkipPlayerGameTimeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private SkipPlayerGameTimeReq() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new SkipPlayerGameTimeReq();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private SkipPlayerGameTimeReq(
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
                        case 40:
                            {
                                gameTime_ = input.readUInt32();
                                break;
                            }
                        case 48:
                            {
                                isForceSet_ = input.readBool();
                                break;
                            }
                        case 112:
                            {
                                clientGameTime_ = input.readUInt32();
                                break;
                            }
                        default:
                            {
                                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass
                    .internal_static_SkipPlayerGameTimeReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass
                    .internal_static_SkipPlayerGameTimeReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq.class,
                            emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                                    .Builder.class);
        }

        public static final int IS_FORCE_SET_FIELD_NUMBER = 6;
        private boolean isForceSet_;
        /**
         * <code>bool is_force_set = 6;</code>
         *
         * @return The isForceSet.
         */
        @java.lang.Override
        public boolean getIsForceSet() {
            return isForceSet_;
        }

        public static final int GAME_TIME_FIELD_NUMBER = 5;
        private int gameTime_;
        /**
         * <code>uint32 game_time = 5;</code>
         *
         * @return The gameTime.
         */
        @java.lang.Override
        public int getGameTime() {
            return gameTime_;
        }

        public static final int CLIENT_GAME_TIME_FIELD_NUMBER = 14;
        private int clientGameTime_;
        /**
         * <code>uint32 client_game_time = 14;</code>
         *
         * @return The clientGameTime.
         */
        @java.lang.Override
        public int getClientGameTime() {
            return clientGameTime_;
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
        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (gameTime_ != 0) {
                output.writeUInt32(5, gameTime_);
            }
            if (isForceSet_ != false) {
                output.writeBool(6, isForceSet_);
            }
            if (clientGameTime_ != 0) {
                output.writeUInt32(14, clientGameTime_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (gameTime_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(5, gameTime_);
            }
            if (isForceSet_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(6, isForceSet_);
            }
            if (clientGameTime_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(14, clientGameTime_);
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
            if (!(obj
                    instanceof
                    emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq other =
                    (emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq) obj;

            if (getIsForceSet() != other.getIsForceSet()) return false;
            if (getGameTime() != other.getGameTime()) return false;
            if (getClientGameTime() != other.getClientGameTime()) return false;
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
            hash = (37 * hash) + IS_FORCE_SET_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsForceSet());
            hash = (37 * hash) + GAME_TIME_FIELD_NUMBER;
            hash = (53 * hash) + getGameTime();
            hash = (37 * hash) + CLIENT_GAME_TIME_FIELD_NUMBER;
            hash = (53 * hash) + getClientGameTime();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                parseFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(
                emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         *
         *
         * <pre>
         * CmdId: 123
         * Name: GHMNCNNHLAI
         * </pre>
         *
         * Protobuf type {@code SkipPlayerGameTimeReq}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:SkipPlayerGameTimeReq)
                emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass
                        .internal_static_SkipPlayerGameTimeReq_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass
                        .internal_static_SkipPlayerGameTimeReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                                        .class,
                                emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                isForceSet_ = false;

                gameTime_ = 0;

                clientGameTime_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass
                        .internal_static_SkipPlayerGameTimeReq_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                    build() {
                emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                    buildPartial() {
                emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq result =
                        new emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq(
                                this);
                result.isForceSet_ = isForceSet_;
                result.gameTime_ = gameTime_;
                result.clientGameTime_ = clientGameTime_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index,
                    java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other
                        instanceof
                        emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq other) {
                if (other
                        == emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                                .getDefaultInstance()) return this;
                if (other.getIsForceSet() != false) {
                    setIsForceSet(other.getIsForceSet());
                }
                if (other.getGameTime() != 0) {
                    setGameTime(other.getGameTime());
                }
                if (other.getClientGameTime() != 0) {
                    setClientGameTime(other.getClientGameTime());
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
                emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private boolean isForceSet_;
            /**
             * <code>bool is_force_set = 6;</code>
             *
             * @return The isForceSet.
             */
            @java.lang.Override
            public boolean getIsForceSet() {
                return isForceSet_;
            }
            /**
             * <code>bool is_force_set = 6;</code>
             *
             * @param value The isForceSet to set.
             * @return This builder for chaining.
             */
            public Builder setIsForceSet(boolean value) {

                isForceSet_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_force_set = 6;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsForceSet() {

                isForceSet_ = false;
                onChanged();
                return this;
            }

            private int gameTime_;
            /**
             * <code>uint32 game_time = 5;</code>
             *
             * @return The gameTime.
             */
            @java.lang.Override
            public int getGameTime() {
                return gameTime_;
            }
            /**
             * <code>uint32 game_time = 5;</code>
             *
             * @param value The gameTime to set.
             * @return This builder for chaining.
             */
            public Builder setGameTime(int value) {

                gameTime_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 game_time = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearGameTime() {

                gameTime_ = 0;
                onChanged();
                return this;
            }

            private int clientGameTime_;
            /**
             * <code>uint32 client_game_time = 14;</code>
             *
             * @return The clientGameTime.
             */
            @java.lang.Override
            public int getClientGameTime() {
                return clientGameTime_;
            }
            /**
             * <code>uint32 client_game_time = 14;</code>
             *
             * @param value The clientGameTime to set.
             * @return This builder for chaining.
             */
            public Builder setClientGameTime(int value) {

                clientGameTime_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 client_game_time = 14;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearClientGameTime() {

                clientGameTime_ = 0;
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

            // @@protoc_insertion_point(builder_scope:SkipPlayerGameTimeReq)
        }

        // @@protoc_insertion_point(class_scope:SkipPlayerGameTimeReq)
        private static final emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass
                        .SkipPlayerGameTimeReq
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq();
        }

        public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<SkipPlayerGameTimeReq> PARSER =
                new com.google.protobuf.AbstractParser<SkipPlayerGameTimeReq>() {
                    @java.lang.Override
                    public SkipPlayerGameTimeReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new SkipPlayerGameTimeReq(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<SkipPlayerGameTimeReq> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<SkipPlayerGameTimeReq> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_SkipPlayerGameTimeReq_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_SkipPlayerGameTimeReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\033SkipPlayerGameTimeReq.proto\"Z\n\025SkipPla"
                    + "yerGameTimeReq\022\024\n\014is_force_set\030\006 \001(\010\022\021\n\t"
                    + "game_time\030\005 \001(\r\022\030\n\020client_game_time\030\016 \001("
                    + "\rB!\n\031emu.grasscutter.net.protoZ\004/genb\006pr"
                    + "oto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_SkipPlayerGameTimeReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SkipPlayerGameTimeReq_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_SkipPlayerGameTimeReq_descriptor,
                        new java.lang.String[] {
                            "IsForceSet", "GameTime", "ClientGameTime",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}

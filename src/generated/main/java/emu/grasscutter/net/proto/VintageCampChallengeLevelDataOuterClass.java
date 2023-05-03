// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageCampChallengeLevelData.proto

package emu.grasscutter.net.proto;

public final class VintageCampChallengeLevelDataOuterClass {
    private VintageCampChallengeLevelDataOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface VintageCampChallengeLevelDataOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:VintageCampChallengeLevelData)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 level_id = 2;</code>
         *
         * @return The levelId.
         */
        int getLevelId();

        /**
         * <code>uint32 stage_id = 7;</code>
         *
         * @return The stageId.
         */
        int getStageId();

        /**
         * <code>bool is_finish = 9;</code>
         *
         * @return The isFinish.
         */
        boolean getIsFinish();

        /**
         * <code>bool is_open = 15;</code>
         *
         * @return The isOpen.
         */
        boolean getIsOpen();
    }
    /**
     *
     *
     * <pre>
     * Name: OMEEHDGICHO
     * </pre>
     *
     * Protobuf type {@code VintageCampChallengeLevelData}
     */
    public static final class VintageCampChallengeLevelData
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:VintageCampChallengeLevelData)
            VintageCampChallengeLevelDataOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use VintageCampChallengeLevelData.newBuilder() to construct.
        private VintageCampChallengeLevelData(
                com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private VintageCampChallengeLevelData() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new VintageCampChallengeLevelData();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private VintageCampChallengeLevelData(
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
                        case 16:
                            {
                                levelId_ = input.readUInt32();
                                break;
                            }
                        case 56:
                            {
                                stageId_ = input.readUInt32();
                                break;
                            }
                        case 72:
                            {
                                isFinish_ = input.readBool();
                                break;
                            }
                        case 120:
                            {
                                isOpen_ = input.readBool();
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
            return emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                    .internal_static_VintageCampChallengeLevelData_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                    .internal_static_VintageCampChallengeLevelData_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                                    .VintageCampChallengeLevelData.class,
                            emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                                    .VintageCampChallengeLevelData.Builder.class);
        }

        public static final int LEVEL_ID_FIELD_NUMBER = 2;
        private int levelId_;
        /**
         * <code>uint32 level_id = 2;</code>
         *
         * @return The levelId.
         */
        @java.lang.Override
        public int getLevelId() {
            return levelId_;
        }

        public static final int STAGE_ID_FIELD_NUMBER = 7;
        private int stageId_;
        /**
         * <code>uint32 stage_id = 7;</code>
         *
         * @return The stageId.
         */
        @java.lang.Override
        public int getStageId() {
            return stageId_;
        }

        public static final int IS_FINISH_FIELD_NUMBER = 9;
        private boolean isFinish_;
        /**
         * <code>bool is_finish = 9;</code>
         *
         * @return The isFinish.
         */
        @java.lang.Override
        public boolean getIsFinish() {
            return isFinish_;
        }

        public static final int IS_OPEN_FIELD_NUMBER = 15;
        private boolean isOpen_;
        /**
         * <code>bool is_open = 15;</code>
         *
         * @return The isOpen.
         */
        @java.lang.Override
        public boolean getIsOpen() {
            return isOpen_;
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
            if (levelId_ != 0) {
                output.writeUInt32(2, levelId_);
            }
            if (stageId_ != 0) {
                output.writeUInt32(7, stageId_);
            }
            if (isFinish_ != false) {
                output.writeBool(9, isFinish_);
            }
            if (isOpen_ != false) {
                output.writeBool(15, isOpen_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (levelId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(2, levelId_);
            }
            if (stageId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(7, stageId_);
            }
            if (isFinish_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(9, isFinish_);
            }
            if (isOpen_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(15, isOpen_);
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
                    emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                            .VintageCampChallengeLevelData)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                            .VintageCampChallengeLevelData
                    other =
                            (emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                                            .VintageCampChallengeLevelData)
                                    obj;

            if (getLevelId() != other.getLevelId()) return false;
            if (getStageId() != other.getStageId()) return false;
            if (getIsFinish() != other.getIsFinish()) return false;
            if (getIsOpen() != other.getIsOpen()) return false;
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
            hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
            hash = (53 * hash) + getLevelId();
            hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
            hash = (53 * hash) + getStageId();
            hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsFinish());
            hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsOpen());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                        .VintageCampChallengeLevelData
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                        .VintageCampChallengeLevelData
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                        .VintageCampChallengeLevelData
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                        .VintageCampChallengeLevelData
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                        .VintageCampChallengeLevelData
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                        .VintageCampChallengeLevelData
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                        .VintageCampChallengeLevelData
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                        .VintageCampChallengeLevelData
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                        .VintageCampChallengeLevelData
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                        .VintageCampChallengeLevelData
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                        .VintageCampChallengeLevelData
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                        .VintageCampChallengeLevelData
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
                emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                                .VintageCampChallengeLevelData
                        prototype) {
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
         * Name: OMEEHDGICHO
         * </pre>
         *
         * Protobuf type {@code VintageCampChallengeLevelData}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:VintageCampChallengeLevelData)
                emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                        .VintageCampChallengeLevelDataOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                        .internal_static_VintageCampChallengeLevelData_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                        .internal_static_VintageCampChallengeLevelData_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                                        .VintageCampChallengeLevelData.class,
                                emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                                        .VintageCampChallengeLevelData.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass.VintageCampChallengeLevelData.newBuilder()
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
                levelId_ = 0;

                stageId_ = 0;

                isFinish_ = false;

                isOpen_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                        .internal_static_VintageCampChallengeLevelData_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                            .VintageCampChallengeLevelData
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                        .VintageCampChallengeLevelData.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                            .VintageCampChallengeLevelData
                    build() {
                emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                                .VintageCampChallengeLevelData
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                            .VintageCampChallengeLevelData
                    buildPartial() {
                emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                                .VintageCampChallengeLevelData
                        result =
                                new emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                                        .VintageCampChallengeLevelData(this);
                result.levelId_ = levelId_;
                result.stageId_ = stageId_;
                result.isFinish_ = isFinish_;
                result.isOpen_ = isOpen_;
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
                        emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                                .VintageCampChallengeLevelData) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                                            .VintageCampChallengeLevelData)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                                    .VintageCampChallengeLevelData
                            other) {
                if (other
                        == emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                                .VintageCampChallengeLevelData.getDefaultInstance()) return this;
                if (other.getLevelId() != 0) {
                    setLevelId(other.getLevelId());
                }
                if (other.getStageId() != 0) {
                    setStageId(other.getStageId());
                }
                if (other.getIsFinish() != false) {
                    setIsFinish(other.getIsFinish());
                }
                if (other.getIsOpen() != false) {
                    setIsOpen(other.getIsOpen());
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
                emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                                .VintageCampChallengeLevelData
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                                            .VintageCampChallengeLevelData)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int levelId_;
            /**
             * <code>uint32 level_id = 2;</code>
             *
             * @return The levelId.
             */
            @java.lang.Override
            public int getLevelId() {
                return levelId_;
            }
            /**
             * <code>uint32 level_id = 2;</code>
             *
             * @param value The levelId to set.
             * @return This builder for chaining.
             */
            public Builder setLevelId(int value) {

                levelId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 level_id = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearLevelId() {

                levelId_ = 0;
                onChanged();
                return this;
            }

            private int stageId_;
            /**
             * <code>uint32 stage_id = 7;</code>
             *
             * @return The stageId.
             */
            @java.lang.Override
            public int getStageId() {
                return stageId_;
            }
            /**
             * <code>uint32 stage_id = 7;</code>
             *
             * @param value The stageId to set.
             * @return This builder for chaining.
             */
            public Builder setStageId(int value) {

                stageId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 stage_id = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearStageId() {

                stageId_ = 0;
                onChanged();
                return this;
            }

            private boolean isFinish_;
            /**
             * <code>bool is_finish = 9;</code>
             *
             * @return The isFinish.
             */
            @java.lang.Override
            public boolean getIsFinish() {
                return isFinish_;
            }
            /**
             * <code>bool is_finish = 9;</code>
             *
             * @param value The isFinish to set.
             * @return This builder for chaining.
             */
            public Builder setIsFinish(boolean value) {

                isFinish_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_finish = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsFinish() {

                isFinish_ = false;
                onChanged();
                return this;
            }

            private boolean isOpen_;
            /**
             * <code>bool is_open = 15;</code>
             *
             * @return The isOpen.
             */
            @java.lang.Override
            public boolean getIsOpen() {
                return isOpen_;
            }
            /**
             * <code>bool is_open = 15;</code>
             *
             * @param value The isOpen to set.
             * @return This builder for chaining.
             */
            public Builder setIsOpen(boolean value) {

                isOpen_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_open = 15;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsOpen() {

                isOpen_ = false;
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

            // @@protoc_insertion_point(builder_scope:VintageCampChallengeLevelData)
        }

        // @@protoc_insertion_point(class_scope:VintageCampChallengeLevelData)
        private static final emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                        .VintageCampChallengeLevelData
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                            .VintageCampChallengeLevelData();
        }

        public static emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                        .VintageCampChallengeLevelData
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<VintageCampChallengeLevelData> PARSER =
                new com.google.protobuf.AbstractParser<VintageCampChallengeLevelData>() {
                    @java.lang.Override
                    public VintageCampChallengeLevelData parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new VintageCampChallengeLevelData(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<VintageCampChallengeLevelData> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<VintageCampChallengeLevelData> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.VintageCampChallengeLevelDataOuterClass
                        .VintageCampChallengeLevelData
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_VintageCampChallengeLevelData_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_VintageCampChallengeLevelData_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n#VintageCampChallengeLevelData.proto\"g\n"
                    + "\035VintageCampChallengeLevelData\022\020\n\010level_"
                    + "id\030\002 \001(\r\022\020\n\010stage_id\030\007 \001(\r\022\021\n\tis_finish\030"
                    + "\t \001(\010\022\017\n\007is_open\030\017 \001(\010B!\n\031emu.grasscutte"
                    + "r.net.protoZ\004/genb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_VintageCampChallengeLevelData_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_VintageCampChallengeLevelData_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_VintageCampChallengeLevelData_descriptor,
                        new java.lang.String[] {
                            "LevelId", "StageId", "IsFinish", "IsOpen",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}

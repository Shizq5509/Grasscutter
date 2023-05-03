// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageHuntingStageData.proto

package emu.grasscutter.net.proto;

public final class VintageHuntingStageDataOuterClass {
    private VintageHuntingStageDataOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface VintageHuntingStageDataOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:VintageHuntingStageData)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 stage_id = 4;</code>
         *
         * @return The stageId.
         */
        int getStageId();

        /**
         * <code>uint32 open_time = 8;</code>
         *
         * @return The openTime.
         */
        int getOpenTime();

        /**
         * <code>bool is_open = 15;</code>
         *
         * @return The isOpen.
         */
        boolean getIsOpen();

        /**
         * <code>uint32 record_value = 7;</code>
         *
         * @return The recordValue.
         */
        int getRecordValue();

        /**
         * <code>bool is_finish = 5;</code>
         *
         * @return The isFinish.
         */
        boolean getIsFinish();
    }
    /**
     *
     *
     * <pre>
     * Name: MKDIJONGAPJ
     * </pre>
     *
     * Protobuf type {@code VintageHuntingStageData}
     */
    public static final class VintageHuntingStageData extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:VintageHuntingStageData)
            VintageHuntingStageDataOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use VintageHuntingStageData.newBuilder() to construct.
        private VintageHuntingStageData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private VintageHuntingStageData() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new VintageHuntingStageData();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private VintageHuntingStageData(
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
                        case 32:
                            {
                                stageId_ = input.readUInt32();
                                break;
                            }
                        case 40:
                            {
                                isFinish_ = input.readBool();
                                break;
                            }
                        case 56:
                            {
                                recordValue_ = input.readUInt32();
                                break;
                            }
                        case 64:
                            {
                                openTime_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass
                    .internal_static_VintageHuntingStageData_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass
                    .internal_static_VintageHuntingStageData_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData
                                    .class,
                            emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData
                                    .Builder.class);
        }

        public static final int STAGE_ID_FIELD_NUMBER = 4;
        private int stageId_;
        /**
         * <code>uint32 stage_id = 4;</code>
         *
         * @return The stageId.
         */
        @java.lang.Override
        public int getStageId() {
            return stageId_;
        }

        public static final int OPEN_TIME_FIELD_NUMBER = 8;
        private int openTime_;
        /**
         * <code>uint32 open_time = 8;</code>
         *
         * @return The openTime.
         */
        @java.lang.Override
        public int getOpenTime() {
            return openTime_;
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

        public static final int RECORD_VALUE_FIELD_NUMBER = 7;
        private int recordValue_;
        /**
         * <code>uint32 record_value = 7;</code>
         *
         * @return The recordValue.
         */
        @java.lang.Override
        public int getRecordValue() {
            return recordValue_;
        }

        public static final int IS_FINISH_FIELD_NUMBER = 5;
        private boolean isFinish_;
        /**
         * <code>bool is_finish = 5;</code>
         *
         * @return The isFinish.
         */
        @java.lang.Override
        public boolean getIsFinish() {
            return isFinish_;
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
            if (stageId_ != 0) {
                output.writeUInt32(4, stageId_);
            }
            if (isFinish_ != false) {
                output.writeBool(5, isFinish_);
            }
            if (recordValue_ != 0) {
                output.writeUInt32(7, recordValue_);
            }
            if (openTime_ != 0) {
                output.writeUInt32(8, openTime_);
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
            if (stageId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(4, stageId_);
            }
            if (isFinish_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(5, isFinish_);
            }
            if (recordValue_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(7, recordValue_);
            }
            if (openTime_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(8, openTime_);
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
                    emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData other =
                    (emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData) obj;

            if (getStageId() != other.getStageId()) return false;
            if (getOpenTime() != other.getOpenTime()) return false;
            if (getIsOpen() != other.getIsOpen()) return false;
            if (getRecordValue() != other.getRecordValue()) return false;
            if (getIsFinish() != other.getIsFinish()) return false;
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
            hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
            hash = (53 * hash) + getStageId();
            hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
            hash = (53 * hash) + getOpenTime();
            hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsOpen());
            hash = (37 * hash) + RECORD_VALUE_FIELD_NUMBER;
            hash = (53 * hash) + getRecordValue();
            hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsFinish());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass
                        .VintageHuntingStageData
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass
                        .VintageHuntingStageData
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass
                        .VintageHuntingStageData
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass
                        .VintageHuntingStageData
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass
                        .VintageHuntingStageData
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass
                        .VintageHuntingStageData
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass
                        .VintageHuntingStageData
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass
                        .VintageHuntingStageData
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass
                        .VintageHuntingStageData
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass
                        .VintageHuntingStageData
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass
                        .VintageHuntingStageData
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass
                        .VintageHuntingStageData
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
                emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData
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
         * Name: MKDIJONGAPJ
         * </pre>
         *
         * Protobuf type {@code VintageHuntingStageData}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:VintageHuntingStageData)
                emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass
                        .VintageHuntingStageDataOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass
                        .internal_static_VintageHuntingStageData_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass
                        .internal_static_VintageHuntingStageData_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData
                                        .class,
                                emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData.newBuilder()
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
                stageId_ = 0;

                openTime_ = 0;

                isOpen_ = false;

                recordValue_ = 0;

                isFinish_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass
                        .internal_static_VintageHuntingStageData_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData
                    build() {
                emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData
                    buildPartial() {
                emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData result =
                        new emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData(
                                this);
                result.stageId_ = stageId_;
                result.openTime_ = openTime_;
                result.isOpen_ = isOpen_;
                result.recordValue_ = recordValue_;
                result.isFinish_ = isFinish_;
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
                        emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData
                            other) {
                if (other
                        == emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData
                                .getDefaultInstance()) return this;
                if (other.getStageId() != 0) {
                    setStageId(other.getStageId());
                }
                if (other.getOpenTime() != 0) {
                    setOpenTime(other.getOpenTime());
                }
                if (other.getIsOpen() != false) {
                    setIsOpen(other.getIsOpen());
                }
                if (other.getRecordValue() != 0) {
                    setRecordValue(other.getRecordValue());
                }
                if (other.getIsFinish() != false) {
                    setIsFinish(other.getIsFinish());
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
                emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int stageId_;
            /**
             * <code>uint32 stage_id = 4;</code>
             *
             * @return The stageId.
             */
            @java.lang.Override
            public int getStageId() {
                return stageId_;
            }
            /**
             * <code>uint32 stage_id = 4;</code>
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
             * <code>uint32 stage_id = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearStageId() {

                stageId_ = 0;
                onChanged();
                return this;
            }

            private int openTime_;
            /**
             * <code>uint32 open_time = 8;</code>
             *
             * @return The openTime.
             */
            @java.lang.Override
            public int getOpenTime() {
                return openTime_;
            }
            /**
             * <code>uint32 open_time = 8;</code>
             *
             * @param value The openTime to set.
             * @return This builder for chaining.
             */
            public Builder setOpenTime(int value) {

                openTime_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 open_time = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearOpenTime() {

                openTime_ = 0;
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

            private int recordValue_;
            /**
             * <code>uint32 record_value = 7;</code>
             *
             * @return The recordValue.
             */
            @java.lang.Override
            public int getRecordValue() {
                return recordValue_;
            }
            /**
             * <code>uint32 record_value = 7;</code>
             *
             * @param value The recordValue to set.
             * @return This builder for chaining.
             */
            public Builder setRecordValue(int value) {

                recordValue_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 record_value = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearRecordValue() {

                recordValue_ = 0;
                onChanged();
                return this;
            }

            private boolean isFinish_;
            /**
             * <code>bool is_finish = 5;</code>
             *
             * @return The isFinish.
             */
            @java.lang.Override
            public boolean getIsFinish() {
                return isFinish_;
            }
            /**
             * <code>bool is_finish = 5;</code>
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
             * <code>bool is_finish = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsFinish() {

                isFinish_ = false;
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

            // @@protoc_insertion_point(builder_scope:VintageHuntingStageData)
        }

        // @@protoc_insertion_point(class_scope:VintageHuntingStageData)
        private static final emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass
                        .VintageHuntingStageData
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData();
        }

        public static emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass
                        .VintageHuntingStageData
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<VintageHuntingStageData> PARSER =
                new com.google.protobuf.AbstractParser<VintageHuntingStageData>() {
                    @java.lang.Override
                    public VintageHuntingStageData parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new VintageHuntingStageData(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<VintageHuntingStageData> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<VintageHuntingStageData> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.VintageHuntingStageDataOuterClass.VintageHuntingStageData
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_VintageHuntingStageData_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_VintageHuntingStageData_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\035VintageHuntingStageData.proto\"x\n\027Vinta"
                    + "geHuntingStageData\022\020\n\010stage_id\030\004 \001(\r\022\021\n\t"
                    + "open_time\030\010 \001(\r\022\017\n\007is_open\030\017 \001(\010\022\024\n\014reco"
                    + "rd_value\030\007 \001(\r\022\021\n\tis_finish\030\005 \001(\010B!\n\031emu"
                    + ".grasscutter.net.protoZ\004/genb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_VintageHuntingStageData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_VintageHuntingStageData_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_VintageHuntingStageData_descriptor,
                        new java.lang.String[] {
                            "StageId", "OpenTime", "IsOpen", "RecordValue", "IsFinish",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}

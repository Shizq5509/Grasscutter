// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CookRecipeDataNotify.proto

package emu.grasscutter.net.proto;

public final class CookRecipeDataNotifyOuterClass {
    private CookRecipeDataNotifyOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface CookRecipeDataNotifyOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:CookRecipeDataNotify)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.CookRecipeData recipe_data = 12;</code>
         *
         * @return Whether the recipeData field is set.
         */
        boolean hasRecipeData();
        /**
         * <code>.CookRecipeData recipe_data = 12;</code>
         *
         * @return The recipeData.
         */
        emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData getRecipeData();
        /** <code>.CookRecipeData recipe_data = 12;</code> */
        emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder
                getRecipeDataOrBuilder();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 170
     * Name: PEAPDEAMHHM
     * </pre>
     *
     * Protobuf type {@code CookRecipeDataNotify}
     */
    public static final class CookRecipeDataNotify extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:CookRecipeDataNotify)
            CookRecipeDataNotifyOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use CookRecipeDataNotify.newBuilder() to construct.
        private CookRecipeDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private CookRecipeDataNotify() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new CookRecipeDataNotify();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CookRecipeDataNotify(
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
                        case 98:
                            {
                                emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData.Builder
                                        subBuilder = null;
                                if (recipeData_ != null) {
                                    subBuilder = recipeData_.toBuilder();
                                }
                                recipeData_ =
                                        input.readMessage(
                                                emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData.parser(),
                                                extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(recipeData_);
                                    recipeData_ = subBuilder.buildPartial();
                                }

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
            return emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass
                    .internal_static_CookRecipeDataNotify_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass
                    .internal_static_CookRecipeDataNotify_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify.class,
                            emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify.Builder
                                    .class);
        }

        public static final int RECIPE_DATA_FIELD_NUMBER = 12;
        private emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData recipeData_;
        /**
         * <code>.CookRecipeData recipe_data = 12;</code>
         *
         * @return Whether the recipeData field is set.
         */
        @java.lang.Override
        public boolean hasRecipeData() {
            return recipeData_ != null;
        }
        /**
         * <code>.CookRecipeData recipe_data = 12;</code>
         *
         * @return The recipeData.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData getRecipeData() {
            return recipeData_ == null
                    ? emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData.getDefaultInstance()
                    : recipeData_;
        }
        /** <code>.CookRecipeData recipe_data = 12;</code> */
        @java.lang.Override
        public emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder
                getRecipeDataOrBuilder() {
            return getRecipeData();
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
            if (recipeData_ != null) {
                output.writeMessage(12, getRecipeData());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (recipeData_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(12, getRecipeData());
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
                    emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify other =
                    (emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify) obj;

            if (hasRecipeData() != other.hasRecipeData()) return false;
            if (hasRecipeData()) {
                if (!getRecipeData().equals(other.getRecipeData())) return false;
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
            if (hasRecipeData()) {
                hash = (37 * hash) + RECIPE_DATA_FIELD_NUMBER;
                hash = (53 * hash) + getRecipeData().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify
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
                emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify prototype) {
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
         * CmdId: 170
         * Name: PEAPDEAMHHM
         * </pre>
         *
         * Protobuf type {@code CookRecipeDataNotify}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:CookRecipeDataNotify)
                emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotifyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass
                        .internal_static_CookRecipeDataNotify_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass
                        .internal_static_CookRecipeDataNotify_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify.class,
                                emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify.newBuilder()
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
                if (recipeDataBuilder_ == null) {
                    recipeData_ = null;
                } else {
                    recipeData_ = null;
                    recipeDataBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass
                        .internal_static_CookRecipeDataNotify_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify build() {
                emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify
                    buildPartial() {
                emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify result =
                        new emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify(this);
                if (recipeDataBuilder_ == null) {
                    result.recipeData_ = recipeData_;
                } else {
                    result.recipeData_ = recipeDataBuilder_.build();
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
                        emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify other) {
                if (other
                        == emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify
                                .getDefaultInstance()) return this;
                if (other.hasRecipeData()) {
                    mergeRecipeData(other.getRecipeData());
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
                emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData recipeData_;
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData,
                            emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData.Builder,
                            emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder>
                    recipeDataBuilder_;
            /**
             * <code>.CookRecipeData recipe_data = 12;</code>
             *
             * @return Whether the recipeData field is set.
             */
            public boolean hasRecipeData() {
                return recipeDataBuilder_ != null || recipeData_ != null;
            }
            /**
             * <code>.CookRecipeData recipe_data = 12;</code>
             *
             * @return The recipeData.
             */
            public emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData getRecipeData() {
                if (recipeDataBuilder_ == null) {
                    return recipeData_ == null
                            ? emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData
                                    .getDefaultInstance()
                            : recipeData_;
                } else {
                    return recipeDataBuilder_.getMessage();
                }
            }
            /** <code>.CookRecipeData recipe_data = 12;</code> */
            public Builder setRecipeData(
                    emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData value) {
                if (recipeDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    recipeData_ = value;
                    onChanged();
                } else {
                    recipeDataBuilder_.setMessage(value);
                }

                return this;
            }
            /** <code>.CookRecipeData recipe_data = 12;</code> */
            public Builder setRecipeData(
                    emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData.Builder
                            builderForValue) {
                if (recipeDataBuilder_ == null) {
                    recipeData_ = builderForValue.build();
                    onChanged();
                } else {
                    recipeDataBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /** <code>.CookRecipeData recipe_data = 12;</code> */
            public Builder mergeRecipeData(
                    emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData value) {
                if (recipeDataBuilder_ == null) {
                    if (recipeData_ != null) {
                        recipeData_ =
                                emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData.newBuilder(
                                                recipeData_)
                                        .mergeFrom(value)
                                        .buildPartial();
                    } else {
                        recipeData_ = value;
                    }
                    onChanged();
                } else {
                    recipeDataBuilder_.mergeFrom(value);
                }

                return this;
            }
            /** <code>.CookRecipeData recipe_data = 12;</code> */
            public Builder clearRecipeData() {
                if (recipeDataBuilder_ == null) {
                    recipeData_ = null;
                    onChanged();
                } else {
                    recipeData_ = null;
                    recipeDataBuilder_ = null;
                }

                return this;
            }
            /** <code>.CookRecipeData recipe_data = 12;</code> */
            public emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData.Builder
                    getRecipeDataBuilder() {

                onChanged();
                return getRecipeDataFieldBuilder().getBuilder();
            }
            /** <code>.CookRecipeData recipe_data = 12;</code> */
            public emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder
                    getRecipeDataOrBuilder() {
                if (recipeDataBuilder_ != null) {
                    return recipeDataBuilder_.getMessageOrBuilder();
                } else {
                    return recipeData_ == null
                            ? emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData
                                    .getDefaultInstance()
                            : recipeData_;
                }
            }
            /** <code>.CookRecipeData recipe_data = 12;</code> */
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData,
                            emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData.Builder,
                            emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder>
                    getRecipeDataFieldBuilder() {
                if (recipeDataBuilder_ == null) {
                    recipeDataBuilder_ =
                            new com.google.protobuf.SingleFieldBuilderV3<
                                    emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData,
                                    emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData.Builder,
                                    emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder>(
                                    getRecipeData(), getParentForChildren(), isClean());
                    recipeData_ = null;
                }
                return recipeDataBuilder_;
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

            // @@protoc_insertion_point(builder_scope:CookRecipeDataNotify)
        }

        // @@protoc_insertion_point(class_scope:CookRecipeDataNotify)
        private static final emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass
                        .CookRecipeDataNotify
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify();
        }

        public static emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<CookRecipeDataNotify> PARSER =
                new com.google.protobuf.AbstractParser<CookRecipeDataNotify>() {
                    @java.lang.Override
                    public CookRecipeDataNotify parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CookRecipeDataNotify(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<CookRecipeDataNotify> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<CookRecipeDataNotify> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.CookRecipeDataNotifyOuterClass.CookRecipeDataNotify
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_CookRecipeDataNotify_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_CookRecipeDataNotify_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\032CookRecipeDataNotify.proto\032\024CookRecipe"
                    + "Data.proto\"<\n\024CookRecipeDataNotify\022$\n\013re"
                    + "cipe_data\030\014 \001(\0132\017.CookRecipeDataB!\n\031emu."
                    + "grasscutter.net.protoZ\004/genb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.CookRecipeDataOuterClass.getDescriptor(),
                        });
        internal_static_CookRecipeDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CookRecipeDataNotify_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_CookRecipeDataNotify_descriptor,
                        new java.lang.String[] {
                            "RecipeData",
                        });
        emu.grasscutter.net.proto.CookRecipeDataOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}

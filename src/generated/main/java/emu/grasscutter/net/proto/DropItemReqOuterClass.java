// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DropItemReq.proto

package emu.grasscutter.net.proto;

public final class DropItemReqOuterClass {
    private DropItemReqOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface DropItemReqOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:DropItemReq)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.Vector pos = 14;</code>
         *
         * @return Whether the pos field is set.
         */
        boolean hasPos();
        /**
         * <code>.Vector pos = 14;</code>
         *
         * @return The pos.
         */
        emu.grasscutter.net.proto.VectorOuterClass.Vector getPos();
        /** <code>.Vector pos = 14;</code> */
        emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();

        /**
         * <code>uint64 guid = 13;</code>
         *
         * @return The guid.
         */
        long getGuid();

        /**
         * <code>uint32 count = 5;</code>
         *
         * @return The count.
         */
        int getCount();

        /**
         * <code>.StoreType store_type = 9;</code>
         *
         * @return The enum numeric value on the wire for storeType.
         */
        int getStoreTypeValue();
        /**
         * <code>.StoreType store_type = 9;</code>
         *
         * @return The storeType.
         */
        emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType getStoreType();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 663
     * Name: PCBLPPLABOH
     * </pre>
     *
     * Protobuf type {@code DropItemReq}
     */
    public static final class DropItemReq extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:DropItemReq)
            DropItemReqOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use DropItemReq.newBuilder() to construct.
        private DropItemReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private DropItemReq() {
            storeType_ = 0;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new DropItemReq();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private DropItemReq(
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
                                count_ = input.readUInt32();
                                break;
                            }
                        case 72:
                            {
                                int rawValue = input.readEnum();

                                storeType_ = rawValue;
                                break;
                            }
                        case 104:
                            {
                                guid_ = input.readUInt64();
                                break;
                            }
                        case 114:
                            {
                                emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
                                if (pos_ != null) {
                                    subBuilder = pos_.toBuilder();
                                }
                                pos_ =
                                        input.readMessage(
                                                emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(),
                                                extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(pos_);
                                    pos_ = subBuilder.buildPartial();
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
            return emu.grasscutter.net.proto.DropItemReqOuterClass.internal_static_DropItemReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.DropItemReqOuterClass
                    .internal_static_DropItemReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq.class,
                            emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq.Builder.class);
        }

        public static final int POS_FIELD_NUMBER = 14;
        private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
        /**
         * <code>.Vector pos = 14;</code>
         *
         * @return Whether the pos field is set.
         */
        @java.lang.Override
        public boolean hasPos() {
            return pos_ != null;
        }
        /**
         * <code>.Vector pos = 14;</code>
         *
         * @return The pos.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
            return pos_ == null
                    ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()
                    : pos_;
        }
        /** <code>.Vector pos = 14;</code> */
        @java.lang.Override
        public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
            return getPos();
        }

        public static final int GUID_FIELD_NUMBER = 13;
        private long guid_;
        /**
         * <code>uint64 guid = 13;</code>
         *
         * @return The guid.
         */
        @java.lang.Override
        public long getGuid() {
            return guid_;
        }

        public static final int COUNT_FIELD_NUMBER = 5;
        private int count_;
        /**
         * <code>uint32 count = 5;</code>
         *
         * @return The count.
         */
        @java.lang.Override
        public int getCount() {
            return count_;
        }

        public static final int STORE_TYPE_FIELD_NUMBER = 9;
        private int storeType_;
        /**
         * <code>.StoreType store_type = 9;</code>
         *
         * @return The enum numeric value on the wire for storeType.
         */
        @java.lang.Override
        public int getStoreTypeValue() {
            return storeType_;
        }
        /**
         * <code>.StoreType store_type = 9;</code>
         *
         * @return The storeType.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType getStoreType() {
            @SuppressWarnings("deprecation")
            emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType result =
                    emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.valueOf(storeType_);
            return result == null
                    ? emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.UNRECOGNIZED
                    : result;
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
            if (count_ != 0) {
                output.writeUInt32(5, count_);
            }
            if (storeType_
                    != emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.STORE_TYPE_NONE.getNumber()) {
                output.writeEnum(9, storeType_);
            }
            if (guid_ != 0L) {
                output.writeUInt64(13, guid_);
            }
            if (pos_ != null) {
                output.writeMessage(14, getPos());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (count_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(5, count_);
            }
            if (storeType_
                    != emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.STORE_TYPE_NONE.getNumber()) {
                size += com.google.protobuf.CodedOutputStream.computeEnumSize(9, storeType_);
            }
            if (guid_ != 0L) {
                size += com.google.protobuf.CodedOutputStream.computeUInt64Size(13, guid_);
            }
            if (pos_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(14, getPos());
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
            if (!(obj instanceof emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq other =
                    (emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq) obj;

            if (hasPos() != other.hasPos()) return false;
            if (hasPos()) {
                if (!getPos().equals(other.getPos())) return false;
            }
            if (getGuid() != other.getGuid()) return false;
            if (getCount() != other.getCount()) return false;
            if (storeType_ != other.storeType_) return false;
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
            if (hasPos()) {
                hash = (37 * hash) + POS_FIELD_NUMBER;
                hash = (53 * hash) + getPos().hashCode();
            }
            hash = (37 * hash) + GUID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getGuid());
            hash = (37 * hash) + COUNT_FIELD_NUMBER;
            hash = (53 * hash) + getCount();
            hash = (37 * hash) + STORE_TYPE_FIELD_NUMBER;
            hash = (53 * hash) + storeType_;
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq parseFrom(
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
                emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq prototype) {
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
         * CmdId: 663
         * Name: PCBLPPLABOH
         * </pre>
         *
         * Protobuf type {@code DropItemReq}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:DropItemReq)
                emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.DropItemReqOuterClass
                        .internal_static_DropItemReq_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.DropItemReqOuterClass
                        .internal_static_DropItemReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq.class,
                                emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq.newBuilder()
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
                if (posBuilder_ == null) {
                    pos_ = null;
                } else {
                    pos_ = null;
                    posBuilder_ = null;
                }
                guid_ = 0L;

                count_ = 0;

                storeType_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.DropItemReqOuterClass
                        .internal_static_DropItemReq_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq build() {
                emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq buildPartial() {
                emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq result =
                        new emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq(this);
                if (posBuilder_ == null) {
                    result.pos_ = pos_;
                } else {
                    result.pos_ = posBuilder_.build();
                }
                result.guid_ = guid_;
                result.count_ = count_;
                result.storeType_ = storeType_;
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
                if (other instanceof emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq) {
                    return mergeFrom((emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq other) {
                if (other
                        == emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq.getDefaultInstance())
                    return this;
                if (other.hasPos()) {
                    mergePos(other.getPos());
                }
                if (other.getGuid() != 0L) {
                    setGuid(other.getGuid());
                }
                if (other.getCount() != 0) {
                    setCount(other.getCount());
                }
                if (other.storeType_ != 0) {
                    setStoreTypeValue(other.getStoreTypeValue());
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
                emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private emu.grasscutter.net.proto.VectorOuterClass.Vector pos_;
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.VectorOuterClass.Vector,
                            emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder,
                            emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>
                    posBuilder_;
            /**
             * <code>.Vector pos = 14;</code>
             *
             * @return Whether the pos field is set.
             */
            public boolean hasPos() {
                return posBuilder_ != null || pos_ != null;
            }
            /**
             * <code>.Vector pos = 14;</code>
             *
             * @return The pos.
             */
            public emu.grasscutter.net.proto.VectorOuterClass.Vector getPos() {
                if (posBuilder_ == null) {
                    return pos_ == null
                            ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()
                            : pos_;
                } else {
                    return posBuilder_.getMessage();
                }
            }
            /** <code>.Vector pos = 14;</code> */
            public Builder setPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
                if (posBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    pos_ = value;
                    onChanged();
                } else {
                    posBuilder_.setMessage(value);
                }

                return this;
            }
            /** <code>.Vector pos = 14;</code> */
            public Builder setPos(
                    emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
                if (posBuilder_ == null) {
                    pos_ = builderForValue.build();
                    onChanged();
                } else {
                    posBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /** <code>.Vector pos = 14;</code> */
            public Builder mergePos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
                if (posBuilder_ == null) {
                    if (pos_ != null) {
                        pos_ =
                                emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(pos_)
                                        .mergeFrom(value)
                                        .buildPartial();
                    } else {
                        pos_ = value;
                    }
                    onChanged();
                } else {
                    posBuilder_.mergeFrom(value);
                }

                return this;
            }
            /** <code>.Vector pos = 14;</code> */
            public Builder clearPos() {
                if (posBuilder_ == null) {
                    pos_ = null;
                    onChanged();
                } else {
                    pos_ = null;
                    posBuilder_ = null;
                }

                return this;
            }
            /** <code>.Vector pos = 14;</code> */
            public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getPosBuilder() {

                onChanged();
                return getPosFieldBuilder().getBuilder();
            }
            /** <code>.Vector pos = 14;</code> */
            public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
                if (posBuilder_ != null) {
                    return posBuilder_.getMessageOrBuilder();
                } else {
                    return pos_ == null
                            ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()
                            : pos_;
                }
            }
            /** <code>.Vector pos = 14;</code> */
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.VectorOuterClass.Vector,
                            emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder,
                            emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>
                    getPosFieldBuilder() {
                if (posBuilder_ == null) {
                    posBuilder_ =
                            new com.google.protobuf.SingleFieldBuilderV3<
                                    emu.grasscutter.net.proto.VectorOuterClass.Vector,
                                    emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder,
                                    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                                    getPos(), getParentForChildren(), isClean());
                    pos_ = null;
                }
                return posBuilder_;
            }

            private long guid_;
            /**
             * <code>uint64 guid = 13;</code>
             *
             * @return The guid.
             */
            @java.lang.Override
            public long getGuid() {
                return guid_;
            }
            /**
             * <code>uint64 guid = 13;</code>
             *
             * @param value The guid to set.
             * @return This builder for chaining.
             */
            public Builder setGuid(long value) {

                guid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint64 guid = 13;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearGuid() {

                guid_ = 0L;
                onChanged();
                return this;
            }

            private int count_;
            /**
             * <code>uint32 count = 5;</code>
             *
             * @return The count.
             */
            @java.lang.Override
            public int getCount() {
                return count_;
            }
            /**
             * <code>uint32 count = 5;</code>
             *
             * @param value The count to set.
             * @return This builder for chaining.
             */
            public Builder setCount(int value) {

                count_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 count = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCount() {

                count_ = 0;
                onChanged();
                return this;
            }

            private int storeType_ = 0;
            /**
             * <code>.StoreType store_type = 9;</code>
             *
             * @return The enum numeric value on the wire for storeType.
             */
            @java.lang.Override
            public int getStoreTypeValue() {
                return storeType_;
            }
            /**
             * <code>.StoreType store_type = 9;</code>
             *
             * @param value The enum numeric value on the wire for storeType to set.
             * @return This builder for chaining.
             */
            public Builder setStoreTypeValue(int value) {

                storeType_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>.StoreType store_type = 9;</code>
             *
             * @return The storeType.
             */
            @java.lang.Override
            public emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType getStoreType() {
                @SuppressWarnings("deprecation")
                emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType result =
                        emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.valueOf(storeType_);
                return result == null
                        ? emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType.UNRECOGNIZED
                        : result;
            }
            /**
             * <code>.StoreType store_type = 9;</code>
             *
             * @param value The storeType to set.
             * @return This builder for chaining.
             */
            public Builder setStoreType(emu.grasscutter.net.proto.StoreTypeOuterClass.StoreType value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                storeType_ = value.getNumber();
                onChanged();
                return this;
            }
            /**
             * <code>.StoreType store_type = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearStoreType() {

                storeType_ = 0;
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

            // @@protoc_insertion_point(builder_scope:DropItemReq)
        }

        // @@protoc_insertion_point(class_scope:DropItemReq)
        private static final emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq();
        }

        public static emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<DropItemReq> PARSER =
                new com.google.protobuf.AbstractParser<DropItemReq>() {
                    @java.lang.Override
                    public DropItemReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new DropItemReq(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<DropItemReq> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<DropItemReq> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.DropItemReqOuterClass.DropItemReq getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_DropItemReq_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_DropItemReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021DropItemReq.proto\032\017StoreType.proto\032\014Ve"
                    + "ctor.proto\"`\n\013DropItemReq\022\024\n\003pos\030\016 \001(\0132\007"
                    + ".Vector\022\014\n\004guid\030\r \001(\004\022\r\n\005count\030\005 \001(\r\022\036\n\n"
                    + "store_type\030\t \001(\0162\n.StoreTypeB!\n\031emu.gras"
                    + "scutter.net.protoZ\004/genb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.StoreTypeOuterClass.getDescriptor(),
                            emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
                        });
        internal_static_DropItemReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_DropItemReq_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_DropItemReq_descriptor,
                        new java.lang.String[] {
                            "Pos", "Guid", "Count", "StoreType",
                        });
        emu.grasscutter.net.proto.StoreTypeOuterClass.getDescriptor();
        emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}

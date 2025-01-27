// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: db_data_2025-01.proto
// Protobuf Java Version: 4.29.3

package io.pinecone.proto;

/**
 * <pre>
 * The request for the `Delete` operation.
 * </pre>
 *
 * Protobuf type {@code DeleteRequest}
 */
public final class DeleteRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:DeleteRequest)
    DeleteRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      DeleteRequest.class.getName());
  }
  // Use DeleteRequest.newBuilder() to construct.
  private DeleteRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DeleteRequest() {
    ids_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    namespace_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.pinecone.proto.DbData202501.internal_static_DeleteRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.pinecone.proto.DbData202501.internal_static_DeleteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.pinecone.proto.DeleteRequest.class, io.pinecone.proto.DeleteRequest.Builder.class);
  }

  private int bitField0_;
  public static final int IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList ids_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Vectors to delete.
   * </pre>
   *
   * <code>repeated string ids = 1 [json_name = "ids"];</code>
   * @return A list containing the ids.
   */
  public com.google.protobuf.ProtocolStringList
      getIdsList() {
    return ids_;
  }
  /**
   * <pre>
   * Vectors to delete.
   * </pre>
   *
   * <code>repeated string ids = 1 [json_name = "ids"];</code>
   * @return The count of ids.
   */
  public int getIdsCount() {
    return ids_.size();
  }
  /**
   * <pre>
   * Vectors to delete.
   * </pre>
   *
   * <code>repeated string ids = 1 [json_name = "ids"];</code>
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  public java.lang.String getIds(int index) {
    return ids_.get(index);
  }
  /**
   * <pre>
   * Vectors to delete.
   * </pre>
   *
   * <code>repeated string ids = 1 [json_name = "ids"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the ids at the given index.
   */
  public com.google.protobuf.ByteString
      getIdsBytes(int index) {
    return ids_.getByteString(index);
  }

  public static final int DELETE_ALL_FIELD_NUMBER = 2;
  private boolean deleteAll_ = false;
  /**
   * <pre>
   * This indicates that all vectors in the index namespace should be deleted.
   * </pre>
   *
   * <code>bool delete_all = 2 [json_name = "deleteAll"];</code>
   * @return The deleteAll.
   */
  @java.lang.Override
  public boolean getDeleteAll() {
    return deleteAll_;
  }

  public static final int NAMESPACE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object namespace_ = "";
  /**
   * <pre>
   * The namespace to delete vectors from, if applicable.
   * </pre>
   *
   * <code>string namespace = 3 [json_name = "namespace"];</code>
   * @return The namespace.
   */
  @java.lang.Override
  public java.lang.String getNamespace() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      namespace_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The namespace to delete vectors from, if applicable.
   * </pre>
   *
   * <code>string namespace = 3 [json_name = "namespace"];</code>
   * @return The bytes for namespace.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNamespaceBytes() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      namespace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILTER_FIELD_NUMBER = 4;
  private com.google.protobuf.Struct filter_;
  /**
   * <pre>
   * If specified, the metadata filter here will be used to select the vectors to delete. This is mutually exclusive
   * with specifying ids to delete in the ids param or using `delete_all=True`.
   * For guidance and examples, see [Understanding metadata](https://docs.pinecone.io/guides/data/understanding-metadata).
   * Serverless indexes do not support delete by metadata. Instead, you can use the `list` operation to fetch the vector IDs based on their common ID prefix and then delete the records by ID.
   * </pre>
   *
   * <code>.google.protobuf.Struct filter = 4 [json_name = "filter"];</code>
   * @return Whether the filter field is set.
   */
  @java.lang.Override
  public boolean hasFilter() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * If specified, the metadata filter here will be used to select the vectors to delete. This is mutually exclusive
   * with specifying ids to delete in the ids param or using `delete_all=True`.
   * For guidance and examples, see [Understanding metadata](https://docs.pinecone.io/guides/data/understanding-metadata).
   * Serverless indexes do not support delete by metadata. Instead, you can use the `list` operation to fetch the vector IDs based on their common ID prefix and then delete the records by ID.
   * </pre>
   *
   * <code>.google.protobuf.Struct filter = 4 [json_name = "filter"];</code>
   * @return The filter.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getFilter() {
    return filter_ == null ? com.google.protobuf.Struct.getDefaultInstance() : filter_;
  }
  /**
   * <pre>
   * If specified, the metadata filter here will be used to select the vectors to delete. This is mutually exclusive
   * with specifying ids to delete in the ids param or using `delete_all=True`.
   * For guidance and examples, see [Understanding metadata](https://docs.pinecone.io/guides/data/understanding-metadata).
   * Serverless indexes do not support delete by metadata. Instead, you can use the `list` operation to fetch the vector IDs based on their common ID prefix and then delete the records by ID.
   * </pre>
   *
   * <code>.google.protobuf.Struct filter = 4 [json_name = "filter"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getFilterOrBuilder() {
    return filter_ == null ? com.google.protobuf.Struct.getDefaultInstance() : filter_;
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
    for (int i = 0; i < ids_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, ids_.getRaw(i));
    }
    if (deleteAll_ != false) {
      output.writeBool(2, deleteAll_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(namespace_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, namespace_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(4, getFilter());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < ids_.size(); i++) {
        dataSize += computeStringSizeNoTag(ids_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getIdsList().size();
    }
    if (deleteAll_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, deleteAll_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(namespace_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, namespace_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getFilter());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.pinecone.proto.DeleteRequest)) {
      return super.equals(obj);
    }
    io.pinecone.proto.DeleteRequest other = (io.pinecone.proto.DeleteRequest) obj;

    if (!getIdsList()
        .equals(other.getIdsList())) return false;
    if (getDeleteAll()
        != other.getDeleteAll()) return false;
    if (!getNamespace()
        .equals(other.getNamespace())) return false;
    if (hasFilter() != other.hasFilter()) return false;
    if (hasFilter()) {
      if (!getFilter()
          .equals(other.getFilter())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getIdsCount() > 0) {
      hash = (37 * hash) + IDS_FIELD_NUMBER;
      hash = (53 * hash) + getIdsList().hashCode();
    }
    hash = (37 * hash) + DELETE_ALL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDeleteAll());
    hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
    hash = (53 * hash) + getNamespace().hashCode();
    if (hasFilter()) {
      hash = (37 * hash) + FILTER_FIELD_NUMBER;
      hash = (53 * hash) + getFilter().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.pinecone.proto.DeleteRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.pinecone.proto.DeleteRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.pinecone.proto.DeleteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.pinecone.proto.DeleteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.pinecone.proto.DeleteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.pinecone.proto.DeleteRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.pinecone.proto.DeleteRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static io.pinecone.proto.DeleteRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.pinecone.proto.DeleteRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.pinecone.proto.DeleteRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.pinecone.proto.DeleteRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static io.pinecone.proto.DeleteRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.pinecone.proto.DeleteRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The request for the `Delete` operation.
   * </pre>
   *
   * Protobuf type {@code DeleteRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:DeleteRequest)
      io.pinecone.proto.DeleteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.pinecone.proto.DbData202501.internal_static_DeleteRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.pinecone.proto.DbData202501.internal_static_DeleteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.pinecone.proto.DeleteRequest.class, io.pinecone.proto.DeleteRequest.Builder.class);
    }

    // Construct using io.pinecone.proto.DeleteRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getFilterFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      ids_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      deleteAll_ = false;
      namespace_ = "";
      filter_ = null;
      if (filterBuilder_ != null) {
        filterBuilder_.dispose();
        filterBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.pinecone.proto.DbData202501.internal_static_DeleteRequest_descriptor;
    }

    @java.lang.Override
    public io.pinecone.proto.DeleteRequest getDefaultInstanceForType() {
      return io.pinecone.proto.DeleteRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.pinecone.proto.DeleteRequest build() {
      io.pinecone.proto.DeleteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.pinecone.proto.DeleteRequest buildPartial() {
      io.pinecone.proto.DeleteRequest result = new io.pinecone.proto.DeleteRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.pinecone.proto.DeleteRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        ids_.makeImmutable();
        result.ids_ = ids_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.deleteAll_ = deleteAll_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.namespace_ = namespace_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.filter_ = filterBuilder_ == null
            ? filter_
            : filterBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.pinecone.proto.DeleteRequest) {
        return mergeFrom((io.pinecone.proto.DeleteRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.pinecone.proto.DeleteRequest other) {
      if (other == io.pinecone.proto.DeleteRequest.getDefaultInstance()) return this;
      if (!other.ids_.isEmpty()) {
        if (ids_.isEmpty()) {
          ids_ = other.ids_;
          bitField0_ |= 0x00000001;
        } else {
          ensureIdsIsMutable();
          ids_.addAll(other.ids_);
        }
        onChanged();
      }
      if (other.getDeleteAll() != false) {
        setDeleteAll(other.getDeleteAll());
      }
      if (!other.getNamespace().isEmpty()) {
        namespace_ = other.namespace_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasFilter()) {
        mergeFilter(other.getFilter());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureIdsIsMutable();
              ids_.add(s);
              break;
            } // case 10
            case 16: {
              deleteAll_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              namespace_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getFilterFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringArrayList ids_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureIdsIsMutable() {
      if (!ids_.isModifiable()) {
        ids_ = new com.google.protobuf.LazyStringArrayList(ids_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * Vectors to delete.
     * </pre>
     *
     * <code>repeated string ids = 1 [json_name = "ids"];</code>
     * @return A list containing the ids.
     */
    public com.google.protobuf.ProtocolStringList
        getIdsList() {
      ids_.makeImmutable();
      return ids_;
    }
    /**
     * <pre>
     * Vectors to delete.
     * </pre>
     *
     * <code>repeated string ids = 1 [json_name = "ids"];</code>
     * @return The count of ids.
     */
    public int getIdsCount() {
      return ids_.size();
    }
    /**
     * <pre>
     * Vectors to delete.
     * </pre>
     *
     * <code>repeated string ids = 1 [json_name = "ids"];</code>
     * @param index The index of the element to return.
     * @return The ids at the given index.
     */
    public java.lang.String getIds(int index) {
      return ids_.get(index);
    }
    /**
     * <pre>
     * Vectors to delete.
     * </pre>
     *
     * <code>repeated string ids = 1 [json_name = "ids"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the ids at the given index.
     */
    public com.google.protobuf.ByteString
        getIdsBytes(int index) {
      return ids_.getByteString(index);
    }
    /**
     * <pre>
     * Vectors to delete.
     * </pre>
     *
     * <code>repeated string ids = 1 [json_name = "ids"];</code>
     * @param index The index to set the value at.
     * @param value The ids to set.
     * @return This builder for chaining.
     */
    public Builder setIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureIdsIsMutable();
      ids_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Vectors to delete.
     * </pre>
     *
     * <code>repeated string ids = 1 [json_name = "ids"];</code>
     * @param value The ids to add.
     * @return This builder for chaining.
     */
    public Builder addIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureIdsIsMutable();
      ids_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Vectors to delete.
     * </pre>
     *
     * <code>repeated string ids = 1 [json_name = "ids"];</code>
     * @param values The ids to add.
     * @return This builder for chaining.
     */
    public Builder addAllIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ids_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Vectors to delete.
     * </pre>
     *
     * <code>repeated string ids = 1 [json_name = "ids"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIds() {
      ids_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Vectors to delete.
     * </pre>
     *
     * <code>repeated string ids = 1 [json_name = "ids"];</code>
     * @param value The bytes of the ids to add.
     * @return This builder for chaining.
     */
    public Builder addIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureIdsIsMutable();
      ids_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean deleteAll_ ;
    /**
     * <pre>
     * This indicates that all vectors in the index namespace should be deleted.
     * </pre>
     *
     * <code>bool delete_all = 2 [json_name = "deleteAll"];</code>
     * @return The deleteAll.
     */
    @java.lang.Override
    public boolean getDeleteAll() {
      return deleteAll_;
    }
    /**
     * <pre>
     * This indicates that all vectors in the index namespace should be deleted.
     * </pre>
     *
     * <code>bool delete_all = 2 [json_name = "deleteAll"];</code>
     * @param value The deleteAll to set.
     * @return This builder for chaining.
     */
    public Builder setDeleteAll(boolean value) {

      deleteAll_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This indicates that all vectors in the index namespace should be deleted.
     * </pre>
     *
     * <code>bool delete_all = 2 [json_name = "deleteAll"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDeleteAll() {
      bitField0_ = (bitField0_ & ~0x00000002);
      deleteAll_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object namespace_ = "";
    /**
     * <pre>
     * The namespace to delete vectors from, if applicable.
     * </pre>
     *
     * <code>string namespace = 3 [json_name = "namespace"];</code>
     * @return The namespace.
     */
    public java.lang.String getNamespace() {
      java.lang.Object ref = namespace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        namespace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The namespace to delete vectors from, if applicable.
     * </pre>
     *
     * <code>string namespace = 3 [json_name = "namespace"];</code>
     * @return The bytes for namespace.
     */
    public com.google.protobuf.ByteString
        getNamespaceBytes() {
      java.lang.Object ref = namespace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        namespace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The namespace to delete vectors from, if applicable.
     * </pre>
     *
     * <code>string namespace = 3 [json_name = "namespace"];</code>
     * @param value The namespace to set.
     * @return This builder for chaining.
     */
    public Builder setNamespace(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      namespace_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The namespace to delete vectors from, if applicable.
     * </pre>
     *
     * <code>string namespace = 3 [json_name = "namespace"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNamespace() {
      namespace_ = getDefaultInstance().getNamespace();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The namespace to delete vectors from, if applicable.
     * </pre>
     *
     * <code>string namespace = 3 [json_name = "namespace"];</code>
     * @param value The bytes for namespace to set.
     * @return This builder for chaining.
     */
    public Builder setNamespaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      namespace_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.google.protobuf.Struct filter_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> filterBuilder_;
    /**
     * <pre>
     * If specified, the metadata filter here will be used to select the vectors to delete. This is mutually exclusive
     * with specifying ids to delete in the ids param or using `delete_all=True`.
     * For guidance and examples, see [Understanding metadata](https://docs.pinecone.io/guides/data/understanding-metadata).
     * Serverless indexes do not support delete by metadata. Instead, you can use the `list` operation to fetch the vector IDs based on their common ID prefix and then delete the records by ID.
     * </pre>
     *
     * <code>.google.protobuf.Struct filter = 4 [json_name = "filter"];</code>
     * @return Whether the filter field is set.
     */
    public boolean hasFilter() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * If specified, the metadata filter here will be used to select the vectors to delete. This is mutually exclusive
     * with specifying ids to delete in the ids param or using `delete_all=True`.
     * For guidance and examples, see [Understanding metadata](https://docs.pinecone.io/guides/data/understanding-metadata).
     * Serverless indexes do not support delete by metadata. Instead, you can use the `list` operation to fetch the vector IDs based on their common ID prefix and then delete the records by ID.
     * </pre>
     *
     * <code>.google.protobuf.Struct filter = 4 [json_name = "filter"];</code>
     * @return The filter.
     */
    public com.google.protobuf.Struct getFilter() {
      if (filterBuilder_ == null) {
        return filter_ == null ? com.google.protobuf.Struct.getDefaultInstance() : filter_;
      } else {
        return filterBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * If specified, the metadata filter here will be used to select the vectors to delete. This is mutually exclusive
     * with specifying ids to delete in the ids param or using `delete_all=True`.
     * For guidance and examples, see [Understanding metadata](https://docs.pinecone.io/guides/data/understanding-metadata).
     * Serverless indexes do not support delete by metadata. Instead, you can use the `list` operation to fetch the vector IDs based on their common ID prefix and then delete the records by ID.
     * </pre>
     *
     * <code>.google.protobuf.Struct filter = 4 [json_name = "filter"];</code>
     */
    public Builder setFilter(com.google.protobuf.Struct value) {
      if (filterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        filter_ = value;
      } else {
        filterBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If specified, the metadata filter here will be used to select the vectors to delete. This is mutually exclusive
     * with specifying ids to delete in the ids param or using `delete_all=True`.
     * For guidance and examples, see [Understanding metadata](https://docs.pinecone.io/guides/data/understanding-metadata).
     * Serverless indexes do not support delete by metadata. Instead, you can use the `list` operation to fetch the vector IDs based on their common ID prefix and then delete the records by ID.
     * </pre>
     *
     * <code>.google.protobuf.Struct filter = 4 [json_name = "filter"];</code>
     */
    public Builder setFilter(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (filterBuilder_ == null) {
        filter_ = builderForValue.build();
      } else {
        filterBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If specified, the metadata filter here will be used to select the vectors to delete. This is mutually exclusive
     * with specifying ids to delete in the ids param or using `delete_all=True`.
     * For guidance and examples, see [Understanding metadata](https://docs.pinecone.io/guides/data/understanding-metadata).
     * Serverless indexes do not support delete by metadata. Instead, you can use the `list` operation to fetch the vector IDs based on their common ID prefix and then delete the records by ID.
     * </pre>
     *
     * <code>.google.protobuf.Struct filter = 4 [json_name = "filter"];</code>
     */
    public Builder mergeFilter(com.google.protobuf.Struct value) {
      if (filterBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          filter_ != null &&
          filter_ != com.google.protobuf.Struct.getDefaultInstance()) {
          getFilterBuilder().mergeFrom(value);
        } else {
          filter_ = value;
        }
      } else {
        filterBuilder_.mergeFrom(value);
      }
      if (filter_ != null) {
        bitField0_ |= 0x00000008;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * If specified, the metadata filter here will be used to select the vectors to delete. This is mutually exclusive
     * with specifying ids to delete in the ids param or using `delete_all=True`.
     * For guidance and examples, see [Understanding metadata](https://docs.pinecone.io/guides/data/understanding-metadata).
     * Serverless indexes do not support delete by metadata. Instead, you can use the `list` operation to fetch the vector IDs based on their common ID prefix and then delete the records by ID.
     * </pre>
     *
     * <code>.google.protobuf.Struct filter = 4 [json_name = "filter"];</code>
     */
    public Builder clearFilter() {
      bitField0_ = (bitField0_ & ~0x00000008);
      filter_ = null;
      if (filterBuilder_ != null) {
        filterBuilder_.dispose();
        filterBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If specified, the metadata filter here will be used to select the vectors to delete. This is mutually exclusive
     * with specifying ids to delete in the ids param or using `delete_all=True`.
     * For guidance and examples, see [Understanding metadata](https://docs.pinecone.io/guides/data/understanding-metadata).
     * Serverless indexes do not support delete by metadata. Instead, you can use the `list` operation to fetch the vector IDs based on their common ID prefix and then delete the records by ID.
     * </pre>
     *
     * <code>.google.protobuf.Struct filter = 4 [json_name = "filter"];</code>
     */
    public com.google.protobuf.Struct.Builder getFilterBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getFilterFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * If specified, the metadata filter here will be used to select the vectors to delete. This is mutually exclusive
     * with specifying ids to delete in the ids param or using `delete_all=True`.
     * For guidance and examples, see [Understanding metadata](https://docs.pinecone.io/guides/data/understanding-metadata).
     * Serverless indexes do not support delete by metadata. Instead, you can use the `list` operation to fetch the vector IDs based on their common ID prefix and then delete the records by ID.
     * </pre>
     *
     * <code>.google.protobuf.Struct filter = 4 [json_name = "filter"];</code>
     */
    public com.google.protobuf.StructOrBuilder getFilterOrBuilder() {
      if (filterBuilder_ != null) {
        return filterBuilder_.getMessageOrBuilder();
      } else {
        return filter_ == null ?
            com.google.protobuf.Struct.getDefaultInstance() : filter_;
      }
    }
    /**
     * <pre>
     * If specified, the metadata filter here will be used to select the vectors to delete. This is mutually exclusive
     * with specifying ids to delete in the ids param or using `delete_all=True`.
     * For guidance and examples, see [Understanding metadata](https://docs.pinecone.io/guides/data/understanding-metadata).
     * Serverless indexes do not support delete by metadata. Instead, you can use the `list` operation to fetch the vector IDs based on their common ID prefix and then delete the records by ID.
     * </pre>
     *
     * <code>.google.protobuf.Struct filter = 4 [json_name = "filter"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getFilterFieldBuilder() {
      if (filterBuilder_ == null) {
        filterBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getFilter(),
                getParentForChildren(),
                isClean());
        filter_ = null;
      }
      return filterBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:DeleteRequest)
  }

  // @@protoc_insertion_point(class_scope:DeleteRequest)
  private static final io.pinecone.proto.DeleteRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.pinecone.proto.DeleteRequest();
  }

  public static io.pinecone.proto.DeleteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteRequest>() {
    @java.lang.Override
    public DeleteRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<DeleteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.pinecone.proto.DeleteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


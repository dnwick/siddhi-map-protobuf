// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sample.proto

package org.wso2.grpc.test;

/**
 * Protobuf type {@code Request}
 */
public  final class Request extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Request)
    RequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Request.newBuilder() to construct.
  private Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Request() {
    stringValue_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Request(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
            String s = input.readStringRequireUtf8();

            stringValue_ = s;
            break;
          }
          case 16: {

            intValue_ = input.readInt32();
            break;
          }
          case 24: {

            longValue_ = input.readInt64();
            break;
          }
          case 32: {

            booleanValue_ = input.readBool();
            break;
          }
          case 45: {

            floatValue_ = input.readFloat();
            break;
          }
          case 49: {

            doubleValue_ = input.readDouble();
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
    return org.wso2.grpc.test.Sample.internal_static_Request_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.wso2.grpc.test.Sample.internal_static_Request_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.wso2.grpc.test.Request.class, org.wso2.grpc.test.Request.Builder.class);
  }

  public static final int STRINGVALUE_FIELD_NUMBER = 1;
  private volatile Object stringValue_;
  /**
   * <code>string stringValue = 1;</code>
   */
  public String getStringValue() {
    Object ref = stringValue_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      stringValue_ = s;
      return s;
    }
  }
  /**
   * <code>string stringValue = 1;</code>
   */
  public com.google.protobuf.ByteString
      getStringValueBytes() {
    Object ref = stringValue_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      stringValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INTVALUE_FIELD_NUMBER = 2;
  private int intValue_;
  /**
   * <code>int32 intValue = 2;</code>
   */
  public int getIntValue() {
    return intValue_;
  }

  public static final int LONGVALUE_FIELD_NUMBER = 3;
  private long longValue_;
  /**
   * <code>int64 longValue = 3;</code>
   */
  public long getLongValue() {
    return longValue_;
  }

  public static final int BOOLEANVALUE_FIELD_NUMBER = 4;
  private boolean booleanValue_;
  /**
   * <code>bool booleanValue = 4;</code>
   */
  public boolean getBooleanValue() {
    return booleanValue_;
  }

  public static final int FLOATVALUE_FIELD_NUMBER = 5;
  private float floatValue_;
  /**
   * <code>float floatValue = 5;</code>
   */
  public float getFloatValue() {
    return floatValue_;
  }

  public static final int DOUBLEVALUE_FIELD_NUMBER = 6;
  private double doubleValue_;
  /**
   * <code>double doubleValue = 6;</code>
   */
  public double getDoubleValue() {
    return doubleValue_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getStringValueBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, stringValue_);
    }
    if (intValue_ != 0) {
      output.writeInt32(2, intValue_);
    }
    if (longValue_ != 0L) {
      output.writeInt64(3, longValue_);
    }
    if (booleanValue_ != false) {
      output.writeBool(4, booleanValue_);
    }
    if (floatValue_ != 0F) {
      output.writeFloat(5, floatValue_);
    }
    if (doubleValue_ != 0D) {
      output.writeDouble(6, doubleValue_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getStringValueBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, stringValue_);
    }
    if (intValue_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, intValue_);
    }
    if (longValue_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, longValue_);
    }
    if (booleanValue_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, booleanValue_);
    }
    if (floatValue_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, floatValue_);
    }
    if (doubleValue_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, doubleValue_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.wso2.grpc.test.Request)) {
      return super.equals(obj);
    }
    org.wso2.grpc.test.Request other = (org.wso2.grpc.test.Request) obj;

    if (!getStringValue()
        .equals(other.getStringValue())) return false;
    if (getIntValue()
        != other.getIntValue()) return false;
    if (getLongValue()
        != other.getLongValue()) return false;
    if (getBooleanValue()
        != other.getBooleanValue()) return false;
    if (Float.floatToIntBits(getFloatValue())
        != Float.floatToIntBits(
            other.getFloatValue())) return false;
    if (Double.doubleToLongBits(getDoubleValue())
        != Double.doubleToLongBits(
            other.getDoubleValue())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STRINGVALUE_FIELD_NUMBER;
    hash = (53 * hash) + getStringValue().hashCode();
    hash = (37 * hash) + INTVALUE_FIELD_NUMBER;
    hash = (53 * hash) + getIntValue();
    hash = (37 * hash) + LONGVALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLongValue());
    hash = (37 * hash) + BOOLEANVALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBooleanValue());
    hash = (37 * hash) + FLOATVALUE_FIELD_NUMBER;
    hash = (53 * hash) + Float.floatToIntBits(
        getFloatValue());
    hash = (37 * hash) + DOUBLEVALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        Double.doubleToLongBits(getDoubleValue()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.wso2.grpc.test.Request parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.grpc.test.Request parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.grpc.test.Request parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.grpc.test.Request parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.grpc.test.Request parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.grpc.test.Request parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.grpc.test.Request parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.wso2.grpc.test.Request parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.wso2.grpc.test.Request parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.wso2.grpc.test.Request parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.wso2.grpc.test.Request parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.wso2.grpc.test.Request parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.wso2.grpc.test.Request prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Request}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Request)
      org.wso2.grpc.test.RequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.wso2.grpc.test.Sample.internal_static_Request_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.wso2.grpc.test.Sample.internal_static_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.wso2.grpc.test.Request.class, org.wso2.grpc.test.Request.Builder.class);
    }

    // Construct using org.wso2.grpc.test.Request.newBuilder()
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
    @Override
    public Builder clear() {
      super.clear();
      stringValue_ = "";

      intValue_ = 0;

      longValue_ = 0L;

      booleanValue_ = false;

      floatValue_ = 0F;

      doubleValue_ = 0D;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.wso2.grpc.test.Sample.internal_static_Request_descriptor;
    }

    @Override
    public org.wso2.grpc.test.Request getDefaultInstanceForType() {
      return getDefaultInstance();
    }

    @Override
    public org.wso2.grpc.test.Request build() {
      org.wso2.grpc.test.Request result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public org.wso2.grpc.test.Request buildPartial() {
      org.wso2.grpc.test.Request result = new org.wso2.grpc.test.Request(this);
      result.stringValue_ = stringValue_;
      result.intValue_ = intValue_;
      result.longValue_ = longValue_;
      result.booleanValue_ = booleanValue_;
      result.floatValue_ = floatValue_;
      result.doubleValue_ = doubleValue_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.wso2.grpc.test.Request) {
        return mergeFrom((org.wso2.grpc.test.Request)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.wso2.grpc.test.Request other) {
      if (other == getDefaultInstance()) return this;
      if (!other.getStringValue().isEmpty()) {
        stringValue_ = other.stringValue_;
        onChanged();
      }
      if (other.getIntValue() != 0) {
        setIntValue(other.getIntValue());
      }
      if (other.getLongValue() != 0L) {
        setLongValue(other.getLongValue());
      }
      if (other.getBooleanValue() != false) {
        setBooleanValue(other.getBooleanValue());
      }
      if (other.getFloatValue() != 0F) {
        setFloatValue(other.getFloatValue());
      }
      if (other.getDoubleValue() != 0D) {
        setDoubleValue(other.getDoubleValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.wso2.grpc.test.Request parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.wso2.grpc.test.Request) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object stringValue_ = "";
    /**
     * <code>string stringValue = 1;</code>
     */
    public String getStringValue() {
      Object ref = stringValue_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        stringValue_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string stringValue = 1;</code>
     */
    public com.google.protobuf.ByteString
        getStringValueBytes() {
      Object ref = stringValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        stringValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string stringValue = 1;</code>
     */
    public Builder setStringValue(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      stringValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string stringValue = 1;</code>
     */
    public Builder clearStringValue() {

      stringValue_ = getDefaultInstance().getStringValue();
      onChanged();
      return this;
    }
    /**
     * <code>string stringValue = 1;</code>
     */
    public Builder setStringValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      stringValue_ = value;
      onChanged();
      return this;
    }

    private int intValue_ ;
    /**
     * <code>int32 intValue = 2;</code>
     */
    public int getIntValue() {
      return intValue_;
    }
    /**
     * <code>int32 intValue = 2;</code>
     */
    public Builder setIntValue(int value) {

      intValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 intValue = 2;</code>
     */
    public Builder clearIntValue() {

      intValue_ = 0;
      onChanged();
      return this;
    }

    private long longValue_ ;
    /**
     * <code>int64 longValue = 3;</code>
     */
    public long getLongValue() {
      return longValue_;
    }
    /**
     * <code>int64 longValue = 3;</code>
     */
    public Builder setLongValue(long value) {

      longValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 longValue = 3;</code>
     */
    public Builder clearLongValue() {

      longValue_ = 0L;
      onChanged();
      return this;
    }

    private boolean booleanValue_ ;
    /**
     * <code>bool booleanValue = 4;</code>
     */
    public boolean getBooleanValue() {
      return booleanValue_;
    }
    /**
     * <code>bool booleanValue = 4;</code>
     */
    public Builder setBooleanValue(boolean value) {

      booleanValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool booleanValue = 4;</code>
     */
    public Builder clearBooleanValue() {

      booleanValue_ = false;
      onChanged();
      return this;
    }

    private float floatValue_ ;
    /**
     * <code>float floatValue = 5;</code>
     */
    public float getFloatValue() {
      return floatValue_;
    }
    /**
     * <code>float floatValue = 5;</code>
     */
    public Builder setFloatValue(float value) {

      floatValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float floatValue = 5;</code>
     */
    public Builder clearFloatValue() {

      floatValue_ = 0F;
      onChanged();
      return this;
    }

    private double doubleValue_ ;
    /**
     * <code>double doubleValue = 6;</code>
     */
    public double getDoubleValue() {
      return doubleValue_;
    }
    /**
     * <code>double doubleValue = 6;</code>
     */
    public Builder setDoubleValue(double value) {

      doubleValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double doubleValue = 6;</code>
     */
    public Builder clearDoubleValue() {

      doubleValue_ = 0D;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Request)
  }

  // @@protoc_insertion_point(class_scope:Request)
  private static final org.wso2.grpc.test.Request DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.wso2.grpc.test.Request();
  }

  public static org.wso2.grpc.test.Request getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Request>
      PARSER = new com.google.protobuf.AbstractParser<Request>() {
    @Override
    public Request parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Request(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Request> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Request> getParserForType() {
    return PARSER;
  }

  @Override
  public org.wso2.grpc.test.Request getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


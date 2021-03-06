/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class GetConfigReq implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("GetConfigReq");
  private static final TField ITEM_FIELD_DESC = new TField("item", TType.STRUCT, (short)1);

  public ConfigItem item;
  public static final int ITEM = 1;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(ITEM, new FieldMetaData("item", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, ConfigItem.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(GetConfigReq.class, metaDataMap);
  }

  public GetConfigReq() {
  }

  public GetConfigReq(
    ConfigItem item)
  {
    this();
    this.item = item;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetConfigReq(GetConfigReq other) {
    if (other.isSetItem()) {
      this.item = TBaseHelper.deepCopy(other.item);
    }
  }

  public GetConfigReq deepCopy() {
    return new GetConfigReq(this);
  }

  @Deprecated
  public GetConfigReq clone() {
    return new GetConfigReq(this);
  }

  public ConfigItem  getItem() {
    return this.item;
  }

  public GetConfigReq setItem(ConfigItem item) {
    this.item = item;
    return this;
  }

  public void unsetItem() {
    this.item = null;
  }

  // Returns true if field item is set (has been assigned a value) and false otherwise
  public boolean isSetItem() {
    return this.item != null;
  }

  public void setItemIsSet(boolean value) {
    if (!value) {
      this.item = null;
    }
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case ITEM:
      if (value == null) {
        unsetItem();
      } else {
        setItem((ConfigItem)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case ITEM:
      return getItem();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case ITEM:
      return isSetItem();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetConfigReq)
      return this.equals((GetConfigReq)that);
    return false;
  }

  public boolean equals(GetConfigReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_item = true && this.isSetItem();
    boolean that_present_item = true && that.isSetItem();
    if (this_present_item || that_present_item) {
      if (!(this_present_item && that_present_item))
        return false;
      if (!TBaseHelper.equalsNobinary(this.item, that.item))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_item = true && (isSetItem());
    builder.append(present_item);
    if (present_item)
      builder.append(item);

    return builder.toHashCode();
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case ITEM:
          if (field.type == TType.STRUCT) {
            this.item = new ConfigItem();
            this.item.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.item != null) {
      oprot.writeFieldBegin(ITEM_FIELD_DESC);
      this.item.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("GetConfigReq");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("item");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getItem() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getItem(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}


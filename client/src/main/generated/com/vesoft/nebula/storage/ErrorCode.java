/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;


import java.lang.reflect.*;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import com.facebook.thrift.IntRangeSet;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({ "unused" })
public class ErrorCode {
  public static final int SUCCEEDED = 0;
  public static final int E_DISCONNECTED = -1;
  public static final int E_FAILED_TO_CONNECT = -2;
  public static final int E_RPC_FAILURE = -3;
  public static final int E_LEADER_CHANGED = -11;
  public static final int E_KEY_HAS_EXISTS = -12;
  public static final int E_SPACE_NOT_FOUND = -13;
  public static final int E_PART_NOT_FOUND = -14;
  public static final int E_KEY_NOT_FOUND = -15;
  public static final int E_CONSENSUS_ERROR = -16;
  public static final int E_EDGE_PROP_NOT_FOUND = -21;
  public static final int E_TAG_PROP_NOT_FOUND = -22;
  public static final int E_IMPROPER_DATA_TYPE = -23;
  public static final int E_EDGE_NOT_FOUND = -24;
  public static final int E_TAG_NOT_FOUND = -25;
  public static final int E_INDEX_NOT_FOUND = -26;
  public static final int E_INVALID_FILTER = -31;
  public static final int E_INVALID_UPDATER = -32;
  public static final int E_INVALID_STORE = -33;
  public static final int E_INVALID_PEER = -34;
  public static final int E_RETRY_EXHAUSTED = -35;
  public static final int E_TRANSFER_LEADER_FAILED = -36;
  public static final int E_LOAD_META_FAILED = -41;
  public static final int E_FAILED_TO_CHECKPOINT = -50;
  public static final int E_CHECKPOINT_BLOCKED = -51;
  public static final int E_FILTER_OUT = -60;
  public static final int E_PARTIAL_RESULT = -99;
  public static final int E_UNKNOWN = -100;

  public static final IntRangeSet VALID_VALUES;
  public static final Map<Integer, String> VALUES_TO_NAMES = new HashMap<Integer, String>();

  static {
    try {
      Class<?> klass = ErrorCode.class;
      for (Field f : klass.getDeclaredFields()) {
        if (f.getType() == Integer.TYPE) {
          VALUES_TO_NAMES.put(f.getInt(null), f.getName());
        }
      }
    } catch (ReflectiveOperationException e) {
      throw new AssertionError(e);
    }

    int[] values = new int[VALUES_TO_NAMES.size()];
    int i = 0;
    for (Integer v : VALUES_TO_NAMES.keySet()) {
      values[i++] = v;
    }

    VALID_VALUES = new IntRangeSet(values);
  }
}

/*
 * Xero Payroll AU API
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollau;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Gets or Sets SuperannuationCalculationType */
public enum SuperannuationCalculationType {

  /** FIXEDAMOUNT */
  FIXEDAMOUNT("FIXEDAMOUNT"),

  /** PERCENTAGEOFEARNINGS */
  PERCENTAGEOFEARNINGS("PERCENTAGEOFEARNINGS"),

  /** STATUTORY */
  STATUTORY("STATUTORY");

  private String value;

  SuperannuationCalculationType(String value) {
    this.value = value;
  }

  /** @return String value */
  @JsonValue
  public String getValue() {
    return value;
  }

  /**
   * toString
   *
   * @return String value
   */
  @Override
  public String toString() {
    return String.valueOf(value);
  }

  /**
   * fromValue
   *
   * @param value String
   */
  @JsonCreator
  public static SuperannuationCalculationType fromValue(String value) {
    for (SuperannuationCalculationType b : SuperannuationCalculationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
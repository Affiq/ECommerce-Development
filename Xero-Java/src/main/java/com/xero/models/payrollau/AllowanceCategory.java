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

/** Gets or Sets AllowanceCategory */
public enum AllowanceCategory {

  /** NONDEDUCTIBLE */
  NONDEDUCTIBLE("NONDEDUCTIBLE"),

  /** UNIFORM */
  UNIFORM("UNIFORM"),

  /** PRIVATEVEHICLE */
  PRIVATEVEHICLE("PRIVATEVEHICLE"),

  /** HOMEOFFICE */
  HOMEOFFICE("HOMEOFFICE"),

  /** TRANSPORT */
  TRANSPORT("TRANSPORT"),

  /** GENERAL */
  GENERAL("GENERAL"),

  /** OTHER */
  OTHER("OTHER");

  private String value;

  AllowanceCategory(String value) {
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
  public static AllowanceCategory fromValue(String value) {
    for (AllowanceCategory b : AllowanceCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

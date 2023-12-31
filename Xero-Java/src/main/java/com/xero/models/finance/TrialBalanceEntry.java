/*
 * Xero Finance API
 * The Finance API is a collection of endpoints which customers can use in the course of a loan application, which may assist lenders to gain the confidence they need to provide capital.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** TrialBalanceEntry */
public class TrialBalanceEntry {
  StringUtil util = new StringUtil();

  @JsonProperty("value")
  private Double value;

  @JsonProperty("entryType")
  private String entryType;
  /**
   * Net movement or net balance in the account
   *
   * @param value Double
   * @return TrialBalanceEntry
   */
  public TrialBalanceEntry value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * Net movement or net balance in the account
   *
   * @return value
   */
  @ApiModelProperty(value = "Net movement or net balance in the account")
  /**
   * Net movement or net balance in the account
   *
   * @return value Double
   */
  public Double getValue() {
    return value;
  }

  /**
   * Net movement or net balance in the account
   *
   * @param value Double
   */
  public void setValue(Double value) {
    this.value = value;
  }

  /**
   * Sign (Debit/Credit) of the movement of balance in the account
   *
   * @param entryType String
   * @return TrialBalanceEntry
   */
  public TrialBalanceEntry entryType(String entryType) {
    this.entryType = entryType;
    return this;
  }

  /**
   * Sign (Debit/Credit) of the movement of balance in the account
   *
   * @return entryType
   */
  @ApiModelProperty(value = "Sign (Debit/Credit) of the movement of balance in the account")
  /**
   * Sign (Debit/Credit) of the movement of balance in the account
   *
   * @return entryType String
   */
  public String getEntryType() {
    return entryType;
  }

  /**
   * Sign (Debit/Credit) of the movement of balance in the account
   *
   * @param entryType String
   */
  public void setEntryType(String entryType) {
    this.entryType = entryType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrialBalanceEntry trialBalanceEntry = (TrialBalanceEntry) o;
    return Objects.equals(this.value, trialBalanceEntry.value)
        && Objects.equals(this.entryType, trialBalanceEntry.entryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, entryType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialBalanceEntry {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

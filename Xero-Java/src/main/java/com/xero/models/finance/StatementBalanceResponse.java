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

/** StatementBalanceResponse */
public class StatementBalanceResponse {
  StringUtil util = new StringUtil();

  @JsonProperty("value")
  private Double value;

  @JsonProperty("type")
  private String type;
  /**
   * Total closing balance of the account. This includes both reconciled and unreconciled bank
   * statement lines. The closing balance will always be represented as a positive number, with it’s
   * debit/credit status defined in the statementBalanceDebitCredit field.
   *
   * @param value Double
   * @return StatementBalanceResponse
   */
  public StatementBalanceResponse value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * Total closing balance of the account. This includes both reconciled and unreconciled bank
   * statement lines. The closing balance will always be represented as a positive number, with it’s
   * debit/credit status defined in the statementBalanceDebitCredit field.
   *
   * @return value
   */
  @ApiModelProperty(
      value =
          "Total closing balance of the account. This includes both reconciled and unreconciled"
              + " bank statement lines. The closing balance will always be represented as a"
              + " positive number, with it’s debit/credit status defined in the"
              + " statementBalanceDebitCredit field.")
  /**
   * Total closing balance of the account. This includes both reconciled and unreconciled bank
   * statement lines. The closing balance will always be represented as a positive number, with it’s
   * debit/credit status defined in the statementBalanceDebitCredit field.
   *
   * @return value Double
   */
  public Double getValue() {
    return value;
  }

  /**
   * Total closing balance of the account. This includes both reconciled and unreconciled bank
   * statement lines. The closing balance will always be represented as a positive number, with it’s
   * debit/credit status defined in the statementBalanceDebitCredit field.
   *
   * @param value Double
   */
  public void setValue(Double value) {
    this.value = value;
  }

  /**
   * The DEBIT or CREDIT status of the account. Cash accounts in credit have a negative balance.
   *
   * @param type String
   * @return StatementBalanceResponse
   */
  public StatementBalanceResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The DEBIT or CREDIT status of the account. Cash accounts in credit have a negative balance.
   *
   * @return type
   */
  @ApiModelProperty(
      value =
          "The DEBIT or CREDIT status of the account. Cash accounts in credit have a negative"
              + " balance.")
  /**
   * The DEBIT or CREDIT status of the account. Cash accounts in credit have a negative balance.
   *
   * @return type String
   */
  public String getType() {
    return type;
  }

  /**
   * The DEBIT or CREDIT status of the account. Cash accounts in credit have a negative balance.
   *
   * @param type String
   */
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatementBalanceResponse statementBalanceResponse = (StatementBalanceResponse) o;
    return Objects.equals(this.value, statementBalanceResponse.value)
        && Objects.equals(this.type, statementBalanceResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatementBalanceResponse {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

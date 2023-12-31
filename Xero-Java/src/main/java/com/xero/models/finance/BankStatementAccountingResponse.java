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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/** BankStatementAccountingResponse */
public class BankStatementAccountingResponse {
  StringUtil util = new StringUtil();

  @JsonProperty("bankAccountId")
  private UUID bankAccountId;

  @JsonProperty("bankAccountName")
  private String bankAccountName;

  @JsonProperty("bankAccountCurrencyCode")
  private String bankAccountCurrencyCode;

  @JsonProperty("statements")
  private List<StatementResponse> statements = new ArrayList<StatementResponse>();
  /**
   * Xero Identifier of bank account
   *
   * @param bankAccountId UUID
   * @return BankStatementAccountingResponse
   */
  public BankStatementAccountingResponse bankAccountId(UUID bankAccountId) {
    this.bankAccountId = bankAccountId;
    return this;
  }

  /**
   * Xero Identifier of bank account
   *
   * @return bankAccountId
   */
  @ApiModelProperty(value = "Xero Identifier of bank account")
  /**
   * Xero Identifier of bank account
   *
   * @return bankAccountId UUID
   */
  public UUID getBankAccountId() {
    return bankAccountId;
  }

  /**
   * Xero Identifier of bank account
   *
   * @param bankAccountId UUID
   */
  public void setBankAccountId(UUID bankAccountId) {
    this.bankAccountId = bankAccountId;
  }

  /**
   * Name of bank account
   *
   * @param bankAccountName String
   * @return BankStatementAccountingResponse
   */
  public BankStatementAccountingResponse bankAccountName(String bankAccountName) {
    this.bankAccountName = bankAccountName;
    return this;
  }

  /**
   * Name of bank account
   *
   * @return bankAccountName
   */
  @ApiModelProperty(value = "Name of bank account")
  /**
   * Name of bank account
   *
   * @return bankAccountName String
   */
  public String getBankAccountName() {
    return bankAccountName;
  }

  /**
   * Name of bank account
   *
   * @param bankAccountName String
   */
  public void setBankAccountName(String bankAccountName) {
    this.bankAccountName = bankAccountName;
  }

  /**
   * Currency code of the bank account
   *
   * @param bankAccountCurrencyCode String
   * @return BankStatementAccountingResponse
   */
  public BankStatementAccountingResponse bankAccountCurrencyCode(String bankAccountCurrencyCode) {
    this.bankAccountCurrencyCode = bankAccountCurrencyCode;
    return this;
  }

  /**
   * Currency code of the bank account
   *
   * @return bankAccountCurrencyCode
   */
  @ApiModelProperty(value = "Currency code of the bank account")
  /**
   * Currency code of the bank account
   *
   * @return bankAccountCurrencyCode String
   */
  public String getBankAccountCurrencyCode() {
    return bankAccountCurrencyCode;
  }

  /**
   * Currency code of the bank account
   *
   * @param bankAccountCurrencyCode String
   */
  public void setBankAccountCurrencyCode(String bankAccountCurrencyCode) {
    this.bankAccountCurrencyCode = bankAccountCurrencyCode;
  }

  /**
   * List of bank statements and linked accounting data for the requested period
   *
   * @param statements List&lt;StatementResponse&gt;
   * @return BankStatementAccountingResponse
   */
  public BankStatementAccountingResponse statements(List<StatementResponse> statements) {
    this.statements = statements;
    return this;
  }

  /**
   * List of bank statements and linked accounting data for the requested period
   *
   * @param statementsItem StatementResponse
   * @return BankStatementAccountingResponse
   */
  public BankStatementAccountingResponse addStatementsItem(StatementResponse statementsItem) {
    if (this.statements == null) {
      this.statements = new ArrayList<StatementResponse>();
    }
    this.statements.add(statementsItem);
    return this;
  }

  /**
   * List of bank statements and linked accounting data for the requested period
   *
   * @return statements
   */
  @ApiModelProperty(
      value = "List of bank statements and linked accounting data for the requested period")
  /**
   * List of bank statements and linked accounting data for the requested period
   *
   * @return statements List<StatementResponse>
   */
  public List<StatementResponse> getStatements() {
    return statements;
  }

  /**
   * List of bank statements and linked accounting data for the requested period
   *
   * @param statements List&lt;StatementResponse&gt;
   */
  public void setStatements(List<StatementResponse> statements) {
    this.statements = statements;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankStatementAccountingResponse bankStatementAccountingResponse =
        (BankStatementAccountingResponse) o;
    return Objects.equals(this.bankAccountId, bankStatementAccountingResponse.bankAccountId)
        && Objects.equals(this.bankAccountName, bankStatementAccountingResponse.bankAccountName)
        && Objects.equals(
            this.bankAccountCurrencyCode, bankStatementAccountingResponse.bankAccountCurrencyCode)
        && Objects.equals(this.statements, bankStatementAccountingResponse.statements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccountId, bankAccountName, bankAccountCurrencyCode, statements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankStatementAccountingResponse {\n");
    sb.append("    bankAccountId: ").append(toIndentedString(bankAccountId)).append("\n");
    sb.append("    bankAccountName: ").append(toIndentedString(bankAccountName)).append("\n");
    sb.append("    bankAccountCurrencyCode: ")
        .append(toIndentedString(bankAccountCurrencyCode))
        .append("\n");
    sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
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

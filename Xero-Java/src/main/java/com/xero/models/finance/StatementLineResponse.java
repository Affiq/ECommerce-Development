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
import org.threeten.bp.LocalDate;

/** StatementLineResponse */
public class StatementLineResponse {
  StringUtil util = new StringUtil();

  @JsonProperty("statementLineId")
  private UUID statementLineId;

  @JsonProperty("postedDate")
  private LocalDate postedDate;

  @JsonProperty("payee")
  private String payee;

  @JsonProperty("reference")
  private String reference;

  @JsonProperty("notes")
  private String notes;

  @JsonProperty("chequeNo")
  private String chequeNo;

  @JsonProperty("amount")
  private Double amount;

  @JsonProperty("transactionDate")
  private LocalDate transactionDate;

  @JsonProperty("type")
  private String type;

  @JsonProperty("isReconciled")
  private Boolean isReconciled;

  @JsonProperty("isDuplicate")
  private Boolean isDuplicate;

  @JsonProperty("isDeleted")
  private Boolean isDeleted;

  @JsonProperty("payments")
  private List<PaymentResponse> payments = new ArrayList<PaymentResponse>();

  @JsonProperty("bankTransactions")
  private List<BankTransactionResponse> bankTransactions = new ArrayList<BankTransactionResponse>();
  /**
   * Xero Identifier of statement line
   *
   * @param statementLineId UUID
   * @return StatementLineResponse
   */
  public StatementLineResponse statementLineId(UUID statementLineId) {
    this.statementLineId = statementLineId;
    return this;
  }

  /**
   * Xero Identifier of statement line
   *
   * @return statementLineId
   */
  @ApiModelProperty(value = "Xero Identifier of statement line")
  /**
   * Xero Identifier of statement line
   *
   * @return statementLineId UUID
   */
  public UUID getStatementLineId() {
    return statementLineId;
  }

  /**
   * Xero Identifier of statement line
   *
   * @param statementLineId UUID
   */
  public void setStatementLineId(UUID statementLineId) {
    this.statementLineId = statementLineId;
  }

  /**
   * Date of when statement line was posted
   *
   * @param postedDate LocalDate
   * @return StatementLineResponse
   */
  public StatementLineResponse postedDate(LocalDate postedDate) {
    this.postedDate = postedDate;
    return this;
  }

  /**
   * Date of when statement line was posted
   *
   * @return postedDate
   */
  @ApiModelProperty(value = "Date of when statement line was posted")
  /**
   * Date of when statement line was posted
   *
   * @return postedDate LocalDate
   */
  public LocalDate getPostedDate() {
    return postedDate;
  }

  /**
   * Date of when statement line was posted
   *
   * @param postedDate LocalDate
   */
  public void setPostedDate(LocalDate postedDate) {
    this.postedDate = postedDate;
  }

  /**
   * Payee description of statement line
   *
   * @param payee String
   * @return StatementLineResponse
   */
  public StatementLineResponse payee(String payee) {
    this.payee = payee;
    return this;
  }

  /**
   * Payee description of statement line
   *
   * @return payee
   */
  @ApiModelProperty(value = "Payee description of statement line")
  /**
   * Payee description of statement line
   *
   * @return payee String
   */
  public String getPayee() {
    return payee;
  }

  /**
   * Payee description of statement line
   *
   * @param payee String
   */
  public void setPayee(String payee) {
    this.payee = payee;
  }

  /**
   * Reference description of statement line
   *
   * @param reference String
   * @return StatementLineResponse
   */
  public StatementLineResponse reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Reference description of statement line
   *
   * @return reference
   */
  @ApiModelProperty(value = "Reference description of statement line")
  /**
   * Reference description of statement line
   *
   * @return reference String
   */
  public String getReference() {
    return reference;
  }

  /**
   * Reference description of statement line
   *
   * @param reference String
   */
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * Notes description of statement line
   *
   * @param notes String
   * @return StatementLineResponse
   */
  public StatementLineResponse notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Notes description of statement line
   *
   * @return notes
   */
  @ApiModelProperty(value = "Notes description of statement line")
  /**
   * Notes description of statement line
   *
   * @return notes String
   */
  public String getNotes() {
    return notes;
  }

  /**
   * Notes description of statement line
   *
   * @param notes String
   */
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   * Cheque number of statement line
   *
   * @param chequeNo String
   * @return StatementLineResponse
   */
  public StatementLineResponse chequeNo(String chequeNo) {
    this.chequeNo = chequeNo;
    return this;
  }

  /**
   * Cheque number of statement line
   *
   * @return chequeNo
   */
  @ApiModelProperty(value = "Cheque number of statement line")
  /**
   * Cheque number of statement line
   *
   * @return chequeNo String
   */
  public String getChequeNo() {
    return chequeNo;
  }

  /**
   * Cheque number of statement line
   *
   * @param chequeNo String
   */
  public void setChequeNo(String chequeNo) {
    this.chequeNo = chequeNo;
  }

  /**
   * Amount of statement line
   *
   * @param amount Double
   * @return StatementLineResponse
   */
  public StatementLineResponse amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount of statement line
   *
   * @return amount
   */
  @ApiModelProperty(value = "Amount of statement line")
  /**
   * Amount of statement line
   *
   * @return amount Double
   */
  public Double getAmount() {
    return amount;
  }

  /**
   * Amount of statement line
   *
   * @param amount Double
   */
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  /**
   * Transaction date of statement line
   *
   * @param transactionDate LocalDate
   * @return StatementLineResponse
   */
  public StatementLineResponse transactionDate(LocalDate transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

  /**
   * Transaction date of statement line
   *
   * @return transactionDate
   */
  @ApiModelProperty(value = "Transaction date of statement line")
  /**
   * Transaction date of statement line
   *
   * @return transactionDate LocalDate
   */
  public LocalDate getTransactionDate() {
    return transactionDate;
  }

  /**
   * Transaction date of statement line
   *
   * @param transactionDate LocalDate
   */
  public void setTransactionDate(LocalDate transactionDate) {
    this.transactionDate = transactionDate;
  }

  /**
   * Type of statement line
   *
   * @param type String
   * @return StatementLineResponse
   */
  public StatementLineResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of statement line
   *
   * @return type
   */
  @ApiModelProperty(value = "Type of statement line")
  /**
   * Type of statement line
   *
   * @return type String
   */
  public String getType() {
    return type;
  }

  /**
   * Type of statement line
   *
   * @param type String
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Boolean to show if statement line is reconciled
   *
   * @param isReconciled Boolean
   * @return StatementLineResponse
   */
  public StatementLineResponse isReconciled(Boolean isReconciled) {
    this.isReconciled = isReconciled;
    return this;
  }

  /**
   * Boolean to show if statement line is reconciled
   *
   * @return isReconciled
   */
  @ApiModelProperty(value = "Boolean to show if statement line is reconciled")
  /**
   * Boolean to show if statement line is reconciled
   *
   * @return isReconciled Boolean
   */
  public Boolean getIsReconciled() {
    return isReconciled;
  }

  /**
   * Boolean to show if statement line is reconciled
   *
   * @param isReconciled Boolean
   */
  public void setIsReconciled(Boolean isReconciled) {
    this.isReconciled = isReconciled;
  }

  /**
   * Boolean to show if statement line is duplicate
   *
   * @param isDuplicate Boolean
   * @return StatementLineResponse
   */
  public StatementLineResponse isDuplicate(Boolean isDuplicate) {
    this.isDuplicate = isDuplicate;
    return this;
  }

  /**
   * Boolean to show if statement line is duplicate
   *
   * @return isDuplicate
   */
  @ApiModelProperty(value = "Boolean to show if statement line is duplicate")
  /**
   * Boolean to show if statement line is duplicate
   *
   * @return isDuplicate Boolean
   */
  public Boolean getIsDuplicate() {
    return isDuplicate;
  }

  /**
   * Boolean to show if statement line is duplicate
   *
   * @param isDuplicate Boolean
   */
  public void setIsDuplicate(Boolean isDuplicate) {
    this.isDuplicate = isDuplicate;
  }

  /**
   * Boolean to show if statement line is deleted
   *
   * @param isDeleted Boolean
   * @return StatementLineResponse
   */
  public StatementLineResponse isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Boolean to show if statement line is deleted
   *
   * @return isDeleted
   */
  @ApiModelProperty(value = "Boolean to show if statement line is deleted")
  /**
   * Boolean to show if statement line is deleted
   *
   * @return isDeleted Boolean
   */
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  /**
   * Boolean to show if statement line is deleted
   *
   * @param isDeleted Boolean
   */
  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  /**
   * List of payments associated with reconciled statement lines
   *
   * @param payments List&lt;PaymentResponse&gt;
   * @return StatementLineResponse
   */
  public StatementLineResponse payments(List<PaymentResponse> payments) {
    this.payments = payments;
    return this;
  }

  /**
   * List of payments associated with reconciled statement lines
   *
   * @param paymentsItem PaymentResponse
   * @return StatementLineResponse
   */
  public StatementLineResponse addPaymentsItem(PaymentResponse paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<PaymentResponse>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

  /**
   * List of payments associated with reconciled statement lines
   *
   * @return payments
   */
  @ApiModelProperty(value = "List of payments associated with reconciled statement lines")
  /**
   * List of payments associated with reconciled statement lines
   *
   * @return payments List<PaymentResponse>
   */
  public List<PaymentResponse> getPayments() {
    return payments;
  }

  /**
   * List of payments associated with reconciled statement lines
   *
   * @param payments List&lt;PaymentResponse&gt;
   */
  public void setPayments(List<PaymentResponse> payments) {
    this.payments = payments;
  }

  /**
   * List of bank transactions associated with reconciled statement lines
   *
   * @param bankTransactions List&lt;BankTransactionResponse&gt;
   * @return StatementLineResponse
   */
  public StatementLineResponse bankTransactions(List<BankTransactionResponse> bankTransactions) {
    this.bankTransactions = bankTransactions;
    return this;
  }

  /**
   * List of bank transactions associated with reconciled statement lines
   *
   * @param bankTransactionsItem BankTransactionResponse
   * @return StatementLineResponse
   */
  public StatementLineResponse addBankTransactionsItem(
      BankTransactionResponse bankTransactionsItem) {
    if (this.bankTransactions == null) {
      this.bankTransactions = new ArrayList<BankTransactionResponse>();
    }
    this.bankTransactions.add(bankTransactionsItem);
    return this;
  }

  /**
   * List of bank transactions associated with reconciled statement lines
   *
   * @return bankTransactions
   */
  @ApiModelProperty(value = "List of bank transactions associated with reconciled statement lines")
  /**
   * List of bank transactions associated with reconciled statement lines
   *
   * @return bankTransactions List<BankTransactionResponse>
   */
  public List<BankTransactionResponse> getBankTransactions() {
    return bankTransactions;
  }

  /**
   * List of bank transactions associated with reconciled statement lines
   *
   * @param bankTransactions List&lt;BankTransactionResponse&gt;
   */
  public void setBankTransactions(List<BankTransactionResponse> bankTransactions) {
    this.bankTransactions = bankTransactions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatementLineResponse statementLineResponse = (StatementLineResponse) o;
    return Objects.equals(this.statementLineId, statementLineResponse.statementLineId)
        && Objects.equals(this.postedDate, statementLineResponse.postedDate)
        && Objects.equals(this.payee, statementLineResponse.payee)
        && Objects.equals(this.reference, statementLineResponse.reference)
        && Objects.equals(this.notes, statementLineResponse.notes)
        && Objects.equals(this.chequeNo, statementLineResponse.chequeNo)
        && Objects.equals(this.amount, statementLineResponse.amount)
        && Objects.equals(this.transactionDate, statementLineResponse.transactionDate)
        && Objects.equals(this.type, statementLineResponse.type)
        && Objects.equals(this.isReconciled, statementLineResponse.isReconciled)
        && Objects.equals(this.isDuplicate, statementLineResponse.isDuplicate)
        && Objects.equals(this.isDeleted, statementLineResponse.isDeleted)
        && Objects.equals(this.payments, statementLineResponse.payments)
        && Objects.equals(this.bankTransactions, statementLineResponse.bankTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        statementLineId,
        postedDate,
        payee,
        reference,
        notes,
        chequeNo,
        amount,
        transactionDate,
        type,
        isReconciled,
        isDuplicate,
        isDeleted,
        payments,
        bankTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatementLineResponse {\n");
    sb.append("    statementLineId: ").append(toIndentedString(statementLineId)).append("\n");
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    chequeNo: ").append(toIndentedString(chequeNo)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isReconciled: ").append(toIndentedString(isReconciled)).append("\n");
    sb.append("    isDuplicate: ").append(toIndentedString(isDuplicate)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    bankTransactions: ").append(toIndentedString(bankTransactions)).append("\n");
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

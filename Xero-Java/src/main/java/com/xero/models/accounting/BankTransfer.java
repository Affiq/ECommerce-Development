/*
 * Xero Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.accounting;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneId;

/** BankTransfer */
public class BankTransfer {
  StringUtil util = new StringUtil();

  @JsonProperty("FromBankAccount")
  private Account fromBankAccount;

  @JsonProperty("ToBankAccount")
  private Account toBankAccount;

  @JsonProperty("Amount")
  private Double amount;

  @JsonProperty("Date")
  private String date;

  @JsonProperty("BankTransferID")
  private UUID bankTransferID;

  @JsonProperty("CurrencyRate")
  private Double currencyRate;

  @JsonProperty("FromBankTransactionID")
  private UUID fromBankTransactionID;

  @JsonProperty("ToBankTransactionID")
  private UUID toBankTransactionID;

  @JsonProperty("FromIsReconciled")
  private Boolean fromIsReconciled = false;

  @JsonProperty("ToIsReconciled")
  private Boolean toIsReconciled = false;

  @JsonProperty("Reference")
  private String reference;

  @JsonProperty("HasAttachments")
  private Boolean hasAttachments = false;

  @JsonProperty("CreatedDateUTC")
  private String createdDateUTC;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();
  /**
   * fromBankAccount
   *
   * @param fromBankAccount Account
   * @return BankTransfer
   */
  public BankTransfer fromBankAccount(Account fromBankAccount) {
    this.fromBankAccount = fromBankAccount;
    return this;
  }

  /**
   * Get fromBankAccount
   *
   * @return fromBankAccount
   */
  @ApiModelProperty(required = true, value = "")
  /**
   * fromBankAccount
   *
   * @return fromBankAccount Account
   */
  public Account getFromBankAccount() {
    return fromBankAccount;
  }

  /**
   * fromBankAccount
   *
   * @param fromBankAccount Account
   */
  public void setFromBankAccount(Account fromBankAccount) {
    this.fromBankAccount = fromBankAccount;
  }

  /**
   * toBankAccount
   *
   * @param toBankAccount Account
   * @return BankTransfer
   */
  public BankTransfer toBankAccount(Account toBankAccount) {
    this.toBankAccount = toBankAccount;
    return this;
  }

  /**
   * Get toBankAccount
   *
   * @return toBankAccount
   */
  @ApiModelProperty(required = true, value = "")
  /**
   * toBankAccount
   *
   * @return toBankAccount Account
   */
  public Account getToBankAccount() {
    return toBankAccount;
  }

  /**
   * toBankAccount
   *
   * @param toBankAccount Account
   */
  public void setToBankAccount(Account toBankAccount) {
    this.toBankAccount = toBankAccount;
  }

  /**
   * amount of the transaction
   *
   * @param amount Double
   * @return BankTransfer
   */
  public BankTransfer amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * amount of the transaction
   *
   * @return amount
   */
  @ApiModelProperty(required = true, value = "amount of the transaction")
  /**
   * amount of the transaction
   *
   * @return amount Double
   */
  public Double getAmount() {
    return amount;
  }

  /**
   * amount of the transaction
   *
   * @param amount Double
   */
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  /**
   * The date of the Transfer YYYY-MM-DD
   *
   * @param date String
   * @return BankTransfer
   */
  public BankTransfer date(String date) {
    this.date = date;
    return this;
  }

  /**
   * The date of the Transfer YYYY-MM-DD
   *
   * @return date
   */
  @ApiModelProperty(value = "The date of the Transfer YYYY-MM-DD")
  /**
   * The date of the Transfer YYYY-MM-DD
   *
   * @return date String
   */
  public String getDate() {
    return date;
  }
  /**
   * The date of the Transfer YYYY-MM-DD
   *
   * @return LocalDate
   */
  public LocalDate getDateAsDate() {
    if (this.date != null) {
      try {
        return util.convertStringToDate(this.date);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  /**
   * The date of the Transfer YYYY-MM-DD
   *
   * @param date String
   */
  public void setDate(String date) {
    this.date = date;
  }

  /**
   * The date of the Transfer YYYY-MM-DD
   *
   * @param date LocalDateTime
   */
  public void setDate(LocalDate date) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = date.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.date = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  /**
   * The identifier of the Bank Transfer
   *
   * @return bankTransferID
   */
  @ApiModelProperty(value = "The identifier of the Bank Transfer")
  /**
   * The identifier of the Bank Transfer
   *
   * @return bankTransferID UUID
   */
  public UUID getBankTransferID() {
    return bankTransferID;
  }

  /**
   * The currency rate
   *
   * @return currencyRate
   */
  @ApiModelProperty(value = "The currency rate")
  /**
   * The currency rate
   *
   * @return currencyRate Double
   */
  public Double getCurrencyRate() {
    return currencyRate;
  }

  /**
   * The Bank Transaction ID for the source account
   *
   * @return fromBankTransactionID
   */
  @ApiModelProperty(value = "The Bank Transaction ID for the source account")
  /**
   * The Bank Transaction ID for the source account
   *
   * @return fromBankTransactionID UUID
   */
  public UUID getFromBankTransactionID() {
    return fromBankTransactionID;
  }

  /**
   * The Bank Transaction ID for the destination account
   *
   * @return toBankTransactionID
   */
  @ApiModelProperty(value = "The Bank Transaction ID for the destination account")
  /**
   * The Bank Transaction ID for the destination account
   *
   * @return toBankTransactionID UUID
   */
  public UUID getToBankTransactionID() {
    return toBankTransactionID;
  }

  /**
   * The Bank Transaction boolean to show if it is reconciled for the source account
   *
   * @param fromIsReconciled Boolean
   * @return BankTransfer
   */
  public BankTransfer fromIsReconciled(Boolean fromIsReconciled) {
    this.fromIsReconciled = fromIsReconciled;
    return this;
  }

  /**
   * The Bank Transaction boolean to show if it is reconciled for the source account
   *
   * @return fromIsReconciled
   */
  @ApiModelProperty(
      example = "false",
      value = "The Bank Transaction boolean to show if it is reconciled for the source account")
  /**
   * The Bank Transaction boolean to show if it is reconciled for the source account
   *
   * @return fromIsReconciled Boolean
   */
  public Boolean getFromIsReconciled() {
    return fromIsReconciled;
  }

  /**
   * The Bank Transaction boolean to show if it is reconciled for the source account
   *
   * @param fromIsReconciled Boolean
   */
  public void setFromIsReconciled(Boolean fromIsReconciled) {
    this.fromIsReconciled = fromIsReconciled;
  }

  /**
   * The Bank Transaction boolean to show if it is reconciled for the destination account
   *
   * @param toIsReconciled Boolean
   * @return BankTransfer
   */
  public BankTransfer toIsReconciled(Boolean toIsReconciled) {
    this.toIsReconciled = toIsReconciled;
    return this;
  }

  /**
   * The Bank Transaction boolean to show if it is reconciled for the destination account
   *
   * @return toIsReconciled
   */
  @ApiModelProperty(
      example = "false",
      value =
          "The Bank Transaction boolean to show if it is reconciled for the destination account")
  /**
   * The Bank Transaction boolean to show if it is reconciled for the destination account
   *
   * @return toIsReconciled Boolean
   */
  public Boolean getToIsReconciled() {
    return toIsReconciled;
  }

  /**
   * The Bank Transaction boolean to show if it is reconciled for the destination account
   *
   * @param toIsReconciled Boolean
   */
  public void setToIsReconciled(Boolean toIsReconciled) {
    this.toIsReconciled = toIsReconciled;
  }

  /**
   * Reference for the transactions.
   *
   * @param reference String
   * @return BankTransfer
   */
  public BankTransfer reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Reference for the transactions.
   *
   * @return reference
   */
  @ApiModelProperty(value = "Reference for the transactions.")
  /**
   * Reference for the transactions.
   *
   * @return reference String
   */
  public String getReference() {
    return reference;
  }

  /**
   * Reference for the transactions.
   *
   * @param reference String
   */
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * Boolean to indicate if a Bank Transfer has an attachment
   *
   * @return hasAttachments
   */
  @ApiModelProperty(
      example = "false",
      value = "Boolean to indicate if a Bank Transfer has an attachment")
  /**
   * Boolean to indicate if a Bank Transfer has an attachment
   *
   * @return hasAttachments Boolean
   */
  public Boolean getHasAttachments() {
    return hasAttachments;
  }

  /**
   * UTC timestamp of creation date of bank transfer
   *
   * @return createdDateUTC
   */
  @ApiModelProperty(
      example = "/Date(1573755038314)/",
      value = "UTC timestamp of creation date of bank transfer")
  /**
   * UTC timestamp of creation date of bank transfer
   *
   * @return createdDateUTC String
   */
  public String getCreatedDateUTC() {
    return createdDateUTC;
  }
  /**
   * UTC timestamp of creation date of bank transfer
   *
   * @return OffsetDateTime
   */
  public OffsetDateTime getCreatedDateUTCAsDate() {
    if (this.createdDateUTC != null) {
      try {
        return util.convertStringToOffsetDateTime(this.createdDateUTC);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  /**
   * Displays array of validation error messages from the API
   *
   * @param validationErrors List&lt;ValidationError&gt;
   * @return BankTransfer
   */
  public BankTransfer validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  /**
   * Displays array of validation error messages from the API
   *
   * @param validationErrorsItem ValidationError
   * @return BankTransfer
   */
  public BankTransfer addValidationErrorsItem(ValidationError validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<ValidationError>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

  /**
   * Displays array of validation error messages from the API
   *
   * @return validationErrors
   */
  @ApiModelProperty(value = "Displays array of validation error messages from the API")
  /**
   * Displays array of validation error messages from the API
   *
   * @return validationErrors List<ValidationError>
   */
  public List<ValidationError> getValidationErrors() {
    return validationErrors;
  }

  /**
   * Displays array of validation error messages from the API
   *
   * @param validationErrors List&lt;ValidationError&gt;
   */
  public void setValidationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransfer bankTransfer = (BankTransfer) o;
    return Objects.equals(this.fromBankAccount, bankTransfer.fromBankAccount)
        && Objects.equals(this.toBankAccount, bankTransfer.toBankAccount)
        && Objects.equals(this.amount, bankTransfer.amount)
        && Objects.equals(this.date, bankTransfer.date)
        && Objects.equals(this.bankTransferID, bankTransfer.bankTransferID)
        && Objects.equals(this.currencyRate, bankTransfer.currencyRate)
        && Objects.equals(this.fromBankTransactionID, bankTransfer.fromBankTransactionID)
        && Objects.equals(this.toBankTransactionID, bankTransfer.toBankTransactionID)
        && Objects.equals(this.fromIsReconciled, bankTransfer.fromIsReconciled)
        && Objects.equals(this.toIsReconciled, bankTransfer.toIsReconciled)
        && Objects.equals(this.reference, bankTransfer.reference)
        && Objects.equals(this.hasAttachments, bankTransfer.hasAttachments)
        && Objects.equals(this.createdDateUTC, bankTransfer.createdDateUTC)
        && Objects.equals(this.validationErrors, bankTransfer.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        fromBankAccount,
        toBankAccount,
        amount,
        date,
        bankTransferID,
        currencyRate,
        fromBankTransactionID,
        toBankTransactionID,
        fromIsReconciled,
        toIsReconciled,
        reference,
        hasAttachments,
        createdDateUTC,
        validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransfer {\n");
    sb.append("    fromBankAccount: ").append(toIndentedString(fromBankAccount)).append("\n");
    sb.append("    toBankAccount: ").append(toIndentedString(toBankAccount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    bankTransferID: ").append(toIndentedString(bankTransferID)).append("\n");
    sb.append("    currencyRate: ").append(toIndentedString(currencyRate)).append("\n");
    sb.append("    fromBankTransactionID: ")
        .append(toIndentedString(fromBankTransactionID))
        .append("\n");
    sb.append("    toBankTransactionID: ")
        .append(toIndentedString(toBankTransactionID))
        .append("\n");
    sb.append("    fromIsReconciled: ").append(toIndentedString(fromIsReconciled)).append("\n");
    sb.append("    toIsReconciled: ").append(toIndentedString(toIsReconciled)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    hasAttachments: ").append(toIndentedString(hasAttachments)).append("\n");
    sb.append("    createdDateUTC: ").append(toIndentedString(createdDateUTC)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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

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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
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

/** BankTransaction */
public class BankTransaction {
  StringUtil util = new StringUtil();
  /** See Bank Transaction Types */
  public enum TypeEnum {
    /** RECEIVE */
    RECEIVE("RECEIVE"),

    /** RECEIVE_OVERPAYMENT */
    RECEIVE_OVERPAYMENT("RECEIVE-OVERPAYMENT"),

    /** RECEIVE_PREPAYMENT */
    RECEIVE_PREPAYMENT("RECEIVE-PREPAYMENT"),

    /** SPEND */
    SPEND("SPEND"),

    /** SPEND_OVERPAYMENT */
    SPEND_OVERPAYMENT("SPEND-OVERPAYMENT"),

    /** SPEND_PREPAYMENT */
    SPEND_PREPAYMENT("SPEND-PREPAYMENT"),

    /** RECEIVE_TRANSFER */
    RECEIVE_TRANSFER("RECEIVE-TRANSFER"),

    /** SPEND_TRANSFER */
    SPEND_TRANSFER("SPEND-TRANSFER");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    /**
     * getValue
     *
     * @return String value
     */
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Type")
  private TypeEnum type;

  @JsonProperty("Contact")
  private Contact contact;

  @JsonProperty("LineItems")
  private List<LineItem> lineItems = new ArrayList<LineItem>();

  @JsonProperty("BankAccount")
  private Account bankAccount;

  @JsonProperty("IsReconciled")
  private Boolean isReconciled;

  @JsonProperty("Date")
  private String date;

  @JsonProperty("Reference")
  private String reference;

  @JsonProperty("CurrencyCode")
  private CurrencyCode currencyCode;

  @JsonProperty("CurrencyRate")
  private Double currencyRate;

  @JsonProperty("Url")
  private String url;
  /** See Bank Transaction Status Codes */
  public enum StatusEnum {
    /** AUTHORISED */
    AUTHORISED("AUTHORISED"),

    /** DELETED */
    DELETED("DELETED"),

    /** VOIDED */
    VOIDED("VOIDED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    /**
     * getValue
     *
     * @return String value
     */
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Status")
  private StatusEnum status;

  @JsonProperty("LineAmountTypes")
  private LineAmountTypes lineAmountTypes;

  @JsonProperty("SubTotal")
  private Double subTotal;

  @JsonProperty("TotalTax")
  private Double totalTax;

  @JsonProperty("Total")
  private Double total;

  @JsonProperty("BankTransactionID")
  private UUID bankTransactionID;

  @JsonProperty("PrepaymentID")
  private UUID prepaymentID;

  @JsonProperty("OverpaymentID")
  private UUID overpaymentID;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  @JsonProperty("HasAttachments")
  private Boolean hasAttachments = false;

  @JsonProperty("StatusAttributeString")
  private String statusAttributeString;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();
  /**
   * See Bank Transaction Types
   *
   * @param type TypeEnum
   * @return BankTransaction
   */
  public BankTransaction type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * See Bank Transaction Types
   *
   * @return type
   */
  @ApiModelProperty(required = true, value = "See Bank Transaction Types")
  /**
   * See Bank Transaction Types
   *
   * @return type TypeEnum
   */
  public TypeEnum getType() {
    return type;
  }

  /**
   * See Bank Transaction Types
   *
   * @param type TypeEnum
   */
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * contact
   *
   * @param contact Contact
   * @return BankTransaction
   */
  public BankTransaction contact(Contact contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   *
   * @return contact
   */
  @ApiModelProperty(value = "")
  /**
   * contact
   *
   * @return contact Contact
   */
  public Contact getContact() {
    return contact;
  }

  /**
   * contact
   *
   * @param contact Contact
   */
  public void setContact(Contact contact) {
    this.contact = contact;
  }

  /**
   * See LineItems
   *
   * @param lineItems List&lt;LineItem&gt;
   * @return BankTransaction
   */
  public BankTransaction lineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  /**
   * See LineItems
   *
   * @param lineItemsItem LineItem
   * @return BankTransaction
   */
  public BankTransaction addLineItemsItem(LineItem lineItemsItem) {
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * See LineItems
   *
   * @return lineItems
   */
  @ApiModelProperty(required = true, value = "See LineItems")
  /**
   * See LineItems
   *
   * @return lineItems List<LineItem>
   */
  public List<LineItem> getLineItems() {
    return lineItems;
  }

  /**
   * See LineItems
   *
   * @param lineItems List&lt;LineItem&gt;
   */
  public void setLineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * bankAccount
   *
   * @param bankAccount Account
   * @return BankTransaction
   */
  public BankTransaction bankAccount(Account bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

  /**
   * Get bankAccount
   *
   * @return bankAccount
   */
  @ApiModelProperty(required = true, value = "")
  /**
   * bankAccount
   *
   * @return bankAccount Account
   */
  public Account getBankAccount() {
    return bankAccount;
  }

  /**
   * bankAccount
   *
   * @param bankAccount Account
   */
  public void setBankAccount(Account bankAccount) {
    this.bankAccount = bankAccount;
  }

  /**
   * Boolean to show if transaction is reconciled
   *
   * @param isReconciled Boolean
   * @return BankTransaction
   */
  public BankTransaction isReconciled(Boolean isReconciled) {
    this.isReconciled = isReconciled;
    return this;
  }

  /**
   * Boolean to show if transaction is reconciled
   *
   * @return isReconciled
   */
  @ApiModelProperty(value = "Boolean to show if transaction is reconciled")
  /**
   * Boolean to show if transaction is reconciled
   *
   * @return isReconciled Boolean
   */
  public Boolean getIsReconciled() {
    return isReconciled;
  }

  /**
   * Boolean to show if transaction is reconciled
   *
   * @param isReconciled Boolean
   */
  public void setIsReconciled(Boolean isReconciled) {
    this.isReconciled = isReconciled;
  }

  /**
   * Date of transaction – YYYY-MM-DD
   *
   * @param date String
   * @return BankTransaction
   */
  public BankTransaction date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Date of transaction – YYYY-MM-DD
   *
   * @return date
   */
  @ApiModelProperty(value = "Date of transaction – YYYY-MM-DD")
  /**
   * Date of transaction – YYYY-MM-DD
   *
   * @return date String
   */
  public String getDate() {
    return date;
  }
  /**
   * Date of transaction – YYYY-MM-DD
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
   * Date of transaction – YYYY-MM-DD
   *
   * @param date String
   */
  public void setDate(String date) {
    this.date = date;
  }

  /**
   * Date of transaction – YYYY-MM-DD
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
   * Reference for the transaction. Only supported for SPEND and RECEIVE transactions.
   *
   * @param reference String
   * @return BankTransaction
   */
  public BankTransaction reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Reference for the transaction. Only supported for SPEND and RECEIVE transactions.
   *
   * @return reference
   */
  @ApiModelProperty(
      value = "Reference for the transaction. Only supported for SPEND and RECEIVE transactions.")
  /**
   * Reference for the transaction. Only supported for SPEND and RECEIVE transactions.
   *
   * @return reference String
   */
  public String getReference() {
    return reference;
  }

  /**
   * Reference for the transaction. Only supported for SPEND and RECEIVE transactions.
   *
   * @param reference String
   */
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * currencyCode
   *
   * @param currencyCode CurrencyCode
   * @return BankTransaction
   */
  public BankTransaction currencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   *
   * @return currencyCode
   */
  @ApiModelProperty(value = "")
  /**
   * currencyCode
   *
   * @return currencyCode CurrencyCode
   */
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  /**
   * currencyCode
   *
   * @param currencyCode CurrencyCode
   */
  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * Exchange rate to base currency when money is spent or received. e.g.0.7500 Only used for bank
   * transactions in non base currency. If this isn’t specified for non base currency accounts then
   * either the user-defined rate (preference) or the XE.com day rate will be used. Setting currency
   * is only supported on overpayments.
   *
   * @param currencyRate Double
   * @return BankTransaction
   */
  public BankTransaction currencyRate(Double currencyRate) {
    this.currencyRate = currencyRate;
    return this;
  }

  /**
   * Exchange rate to base currency when money is spent or received. e.g.0.7500 Only used for bank
   * transactions in non base currency. If this isn’t specified for non base currency accounts then
   * either the user-defined rate (preference) or the XE.com day rate will be used. Setting currency
   * is only supported on overpayments.
   *
   * @return currencyRate
   */
  @ApiModelProperty(
      value =
          "Exchange rate to base currency when money is spent or received. e.g.0.7500 Only used"
              + " for bank transactions in non base currency. If this isn’t specified for non base"
              + " currency accounts then either the user-defined rate (preference) or the XE.com"
              + " day rate will be used. Setting currency is only supported on overpayments.")
  /**
   * Exchange rate to base currency when money is spent or received. e.g.0.7500 Only used for bank
   * transactions in non base currency. If this isn’t specified for non base currency accounts then
   * either the user-defined rate (preference) or the XE.com day rate will be used. Setting currency
   * is only supported on overpayments.
   *
   * @return currencyRate Double
   */
  public Double getCurrencyRate() {
    return currencyRate;
  }

  /**
   * Exchange rate to base currency when money is spent or received. e.g.0.7500 Only used for bank
   * transactions in non base currency. If this isn’t specified for non base currency accounts then
   * either the user-defined rate (preference) or the XE.com day rate will be used. Setting currency
   * is only supported on overpayments.
   *
   * @param currencyRate Double
   */
  public void setCurrencyRate(Double currencyRate) {
    this.currencyRate = currencyRate;
  }

  /**
   * URL link to a source document – shown as “Go to App Name”
   *
   * @param url String
   * @return BankTransaction
   */
  public BankTransaction url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL link to a source document – shown as “Go to App Name”
   *
   * @return url
   */
  @ApiModelProperty(value = "URL link to a source document – shown as “Go to App Name”")
  /**
   * URL link to a source document – shown as “Go to App Name”
   *
   * @return url String
   */
  public String getUrl() {
    return url;
  }

  /**
   * URL link to a source document – shown as “Go to App Name”
   *
   * @param url String
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * See Bank Transaction Status Codes
   *
   * @param status StatusEnum
   * @return BankTransaction
   */
  public BankTransaction status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * See Bank Transaction Status Codes
   *
   * @return status
   */
  @ApiModelProperty(value = "See Bank Transaction Status Codes")
  /**
   * See Bank Transaction Status Codes
   *
   * @return status StatusEnum
   */
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * See Bank Transaction Status Codes
   *
   * @param status StatusEnum
   */
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * lineAmountTypes
   *
   * @param lineAmountTypes LineAmountTypes
   * @return BankTransaction
   */
  public BankTransaction lineAmountTypes(LineAmountTypes lineAmountTypes) {
    this.lineAmountTypes = lineAmountTypes;
    return this;
  }

  /**
   * Get lineAmountTypes
   *
   * @return lineAmountTypes
   */
  @ApiModelProperty(value = "")
  /**
   * lineAmountTypes
   *
   * @return lineAmountTypes LineAmountTypes
   */
  public LineAmountTypes getLineAmountTypes() {
    return lineAmountTypes;
  }

  /**
   * lineAmountTypes
   *
   * @param lineAmountTypes LineAmountTypes
   */
  public void setLineAmountTypes(LineAmountTypes lineAmountTypes) {
    this.lineAmountTypes = lineAmountTypes;
  }

  /**
   * Total of bank transaction excluding taxes
   *
   * @param subTotal Double
   * @return BankTransaction
   */
  public BankTransaction subTotal(Double subTotal) {
    this.subTotal = subTotal;
    return this;
  }

  /**
   * Total of bank transaction excluding taxes
   *
   * @return subTotal
   */
  @ApiModelProperty(value = "Total of bank transaction excluding taxes")
  /**
   * Total of bank transaction excluding taxes
   *
   * @return subTotal Double
   */
  public Double getSubTotal() {
    return subTotal;
  }

  /**
   * Total of bank transaction excluding taxes
   *
   * @param subTotal Double
   */
  public void setSubTotal(Double subTotal) {
    this.subTotal = subTotal;
  }

  /**
   * Total tax on bank transaction
   *
   * @param totalTax Double
   * @return BankTransaction
   */
  public BankTransaction totalTax(Double totalTax) {
    this.totalTax = totalTax;
    return this;
  }

  /**
   * Total tax on bank transaction
   *
   * @return totalTax
   */
  @ApiModelProperty(value = "Total tax on bank transaction")
  /**
   * Total tax on bank transaction
   *
   * @return totalTax Double
   */
  public Double getTotalTax() {
    return totalTax;
  }

  /**
   * Total tax on bank transaction
   *
   * @param totalTax Double
   */
  public void setTotalTax(Double totalTax) {
    this.totalTax = totalTax;
  }

  /**
   * Total of bank transaction tax inclusive
   *
   * @param total Double
   * @return BankTransaction
   */
  public BankTransaction total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * Total of bank transaction tax inclusive
   *
   * @return total
   */
  @ApiModelProperty(value = "Total of bank transaction tax inclusive")
  /**
   * Total of bank transaction tax inclusive
   *
   * @return total Double
   */
  public Double getTotal() {
    return total;
  }

  /**
   * Total of bank transaction tax inclusive
   *
   * @param total Double
   */
  public void setTotal(Double total) {
    this.total = total;
  }

  /**
   * Xero generated unique identifier for bank transaction
   *
   * @param bankTransactionID UUID
   * @return BankTransaction
   */
  public BankTransaction bankTransactionID(UUID bankTransactionID) {
    this.bankTransactionID = bankTransactionID;
    return this;
  }

  /**
   * Xero generated unique identifier for bank transaction
   *
   * @return bankTransactionID
   */
  @ApiModelProperty(
      example = "00000000-0000-0000-0000-000000000000",
      value = "Xero generated unique identifier for bank transaction")
  /**
   * Xero generated unique identifier for bank transaction
   *
   * @return bankTransactionID UUID
   */
  public UUID getBankTransactionID() {
    return bankTransactionID;
  }

  /**
   * Xero generated unique identifier for bank transaction
   *
   * @param bankTransactionID UUID
   */
  public void setBankTransactionID(UUID bankTransactionID) {
    this.bankTransactionID = bankTransactionID;
  }

  /**
   * Xero generated unique identifier for a Prepayment. This will be returned on BankTransactions
   * with a Type of SPEND-PREPAYMENT or RECEIVE-PREPAYMENT
   *
   * @return prepaymentID
   */
  @ApiModelProperty(
      example = "00000000-0000-0000-0000-000000000000",
      value =
          "Xero generated unique identifier for a Prepayment. This will be returned on"
              + " BankTransactions with a Type of SPEND-PREPAYMENT or RECEIVE-PREPAYMENT")
  /**
   * Xero generated unique identifier for a Prepayment. This will be returned on BankTransactions
   * with a Type of SPEND-PREPAYMENT or RECEIVE-PREPAYMENT
   *
   * @return prepaymentID UUID
   */
  public UUID getPrepaymentID() {
    return prepaymentID;
  }

  /**
   * Xero generated unique identifier for an Overpayment. This will be returned on BankTransactions
   * with a Type of SPEND-OVERPAYMENT or RECEIVE-OVERPAYMENT
   *
   * @return overpaymentID
   */
  @ApiModelProperty(
      example = "00000000-0000-0000-0000-000000000000",
      value =
          "Xero generated unique identifier for an Overpayment. This will be returned on"
              + " BankTransactions with a Type of SPEND-OVERPAYMENT or RECEIVE-OVERPAYMENT")
  /**
   * Xero generated unique identifier for an Overpayment. This will be returned on BankTransactions
   * with a Type of SPEND-OVERPAYMENT or RECEIVE-OVERPAYMENT
   *
   * @return overpaymentID UUID
   */
  public UUID getOverpaymentID() {
    return overpaymentID;
  }

  /**
   * Last modified date UTC format
   *
   * @return updatedDateUTC
   */
  @ApiModelProperty(example = "/Date(1573755038314)/", value = "Last modified date UTC format")
  /**
   * Last modified date UTC format
   *
   * @return updatedDateUTC String
   */
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }
  /**
   * Last modified date UTC format
   *
   * @return OffsetDateTime
   */
  public OffsetDateTime getUpdatedDateUTCAsDate() {
    if (this.updatedDateUTC != null) {
      try {
        return util.convertStringToOffsetDateTime(this.updatedDateUTC);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  /**
   * Boolean to indicate if a bank transaction has an attachment
   *
   * @return hasAttachments
   */
  @ApiModelProperty(
      example = "false",
      value = "Boolean to indicate if a bank transaction has an attachment")
  /**
   * Boolean to indicate if a bank transaction has an attachment
   *
   * @return hasAttachments Boolean
   */
  public Boolean getHasAttachments() {
    return hasAttachments;
  }

  /**
   * A string to indicate if a invoice status
   *
   * @param statusAttributeString String
   * @return BankTransaction
   */
  public BankTransaction statusAttributeString(String statusAttributeString) {
    this.statusAttributeString = statusAttributeString;
    return this;
  }

  /**
   * A string to indicate if a invoice status
   *
   * @return statusAttributeString
   */
  @ApiModelProperty(value = "A string to indicate if a invoice status")
  /**
   * A string to indicate if a invoice status
   *
   * @return statusAttributeString String
   */
  public String getStatusAttributeString() {
    return statusAttributeString;
  }

  /**
   * A string to indicate if a invoice status
   *
   * @param statusAttributeString String
   */
  public void setStatusAttributeString(String statusAttributeString) {
    this.statusAttributeString = statusAttributeString;
  }

  /**
   * Displays array of validation error messages from the API
   *
   * @param validationErrors List&lt;ValidationError&gt;
   * @return BankTransaction
   */
  public BankTransaction validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  /**
   * Displays array of validation error messages from the API
   *
   * @param validationErrorsItem ValidationError
   * @return BankTransaction
   */
  public BankTransaction addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    BankTransaction bankTransaction = (BankTransaction) o;
    return Objects.equals(this.type, bankTransaction.type)
        && Objects.equals(this.contact, bankTransaction.contact)
        && Objects.equals(this.lineItems, bankTransaction.lineItems)
        && Objects.equals(this.bankAccount, bankTransaction.bankAccount)
        && Objects.equals(this.isReconciled, bankTransaction.isReconciled)
        && Objects.equals(this.date, bankTransaction.date)
        && Objects.equals(this.reference, bankTransaction.reference)
        && Objects.equals(this.currencyCode, bankTransaction.currencyCode)
        && Objects.equals(this.currencyRate, bankTransaction.currencyRate)
        && Objects.equals(this.url, bankTransaction.url)
        && Objects.equals(this.status, bankTransaction.status)
        && Objects.equals(this.lineAmountTypes, bankTransaction.lineAmountTypes)
        && Objects.equals(this.subTotal, bankTransaction.subTotal)
        && Objects.equals(this.totalTax, bankTransaction.totalTax)
        && Objects.equals(this.total, bankTransaction.total)
        && Objects.equals(this.bankTransactionID, bankTransaction.bankTransactionID)
        && Objects.equals(this.prepaymentID, bankTransaction.prepaymentID)
        && Objects.equals(this.overpaymentID, bankTransaction.overpaymentID)
        && Objects.equals(this.updatedDateUTC, bankTransaction.updatedDateUTC)
        && Objects.equals(this.hasAttachments, bankTransaction.hasAttachments)
        && Objects.equals(this.statusAttributeString, bankTransaction.statusAttributeString)
        && Objects.equals(this.validationErrors, bankTransaction.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        type,
        contact,
        lineItems,
        bankAccount,
        isReconciled,
        date,
        reference,
        currencyCode,
        currencyRate,
        url,
        status,
        lineAmountTypes,
        subTotal,
        totalTax,
        total,
        bankTransactionID,
        prepaymentID,
        overpaymentID,
        updatedDateUTC,
        hasAttachments,
        statusAttributeString,
        validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransaction {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    isReconciled: ").append(toIndentedString(isReconciled)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currencyRate: ").append(toIndentedString(currencyRate)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lineAmountTypes: ").append(toIndentedString(lineAmountTypes)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    bankTransactionID: ").append(toIndentedString(bankTransactionID)).append("\n");
    sb.append("    prepaymentID: ").append(toIndentedString(prepaymentID)).append("\n");
    sb.append("    overpaymentID: ").append(toIndentedString(overpaymentID)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    hasAttachments: ").append(toIndentedString(hasAttachments)).append("\n");
    sb.append("    statusAttributeString: ")
        .append(toIndentedString(statusAttributeString))
        .append("\n");
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
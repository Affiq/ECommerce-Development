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
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/** AccountUsage */
public class AccountUsage {
  StringUtil util = new StringUtil();

  @JsonProperty("month")
  private String month;

  @JsonProperty("accountId")
  private UUID accountId;

  @JsonProperty("currencyCode")
  private String currencyCode;

  @JsonProperty("totalReceived")
  private Double totalReceived;

  @JsonProperty("countReceived")
  private Integer countReceived;

  @JsonProperty("totalPaid")
  private Double totalPaid;

  @JsonProperty("countPaid")
  private Integer countPaid;

  @JsonProperty("totalManualJournal")
  private Double totalManualJournal;

  @JsonProperty("countManualJournal")
  private Integer countManualJournal;

  @JsonProperty("accountName")
  private String accountName;

  @JsonProperty("reportingCode")
  private String reportingCode;

  @JsonProperty("reportingCodeName")
  private String reportingCodeName;

  @JsonProperty("reportCodeUpdatedDateUtc")
  private OffsetDateTime reportCodeUpdatedDateUtc;
  /**
   * The month this usage item contains data for
   *
   * @param month String
   * @return AccountUsage
   */
  public AccountUsage month(String month) {
    this.month = month;
    return this;
  }

  /**
   * The month this usage item contains data for
   *
   * @return month
   */
  @ApiModelProperty(value = "The month this usage item contains data for")
  /**
   * The month this usage item contains data for
   *
   * @return month String
   */
  public String getMonth() {
    return month;
  }

  /**
   * The month this usage item contains data for
   *
   * @param month String
   */
  public void setMonth(String month) {
    this.month = month;
  }

  /**
   * The account this usage item contains data for
   *
   * @param accountId UUID
   * @return AccountUsage
   */
  public AccountUsage accountId(UUID accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The account this usage item contains data for
   *
   * @return accountId
   */
  @ApiModelProperty(value = "The account this usage item contains data for")
  /**
   * The account this usage item contains data for
   *
   * @return accountId UUID
   */
  public UUID getAccountId() {
    return accountId;
  }

  /**
   * The account this usage item contains data for
   *
   * @param accountId UUID
   */
  public void setAccountId(UUID accountId) {
    this.accountId = accountId;
  }

  /**
   * The currency code this usage item contains data for
   *
   * @param currencyCode String
   * @return AccountUsage
   */
  public AccountUsage currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency code this usage item contains data for
   *
   * @return currencyCode
   */
  @ApiModelProperty(value = "The currency code this usage item contains data for")
  /**
   * The currency code this usage item contains data for
   *
   * @return currencyCode String
   */
  public String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * The currency code this usage item contains data for
   *
   * @param currencyCode String
   */
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * Total received
   *
   * @param totalReceived Double
   * @return AccountUsage
   */
  public AccountUsage totalReceived(Double totalReceived) {
    this.totalReceived = totalReceived;
    return this;
  }

  /**
   * Total received
   *
   * @return totalReceived
   */
  @ApiModelProperty(value = "Total received")
  /**
   * Total received
   *
   * @return totalReceived Double
   */
  public Double getTotalReceived() {
    return totalReceived;
  }

  /**
   * Total received
   *
   * @param totalReceived Double
   */
  public void setTotalReceived(Double totalReceived) {
    this.totalReceived = totalReceived;
  }

  /**
   * Count of received
   *
   * @param countReceived Integer
   * @return AccountUsage
   */
  public AccountUsage countReceived(Integer countReceived) {
    this.countReceived = countReceived;
    return this;
  }

  /**
   * Count of received
   *
   * @return countReceived
   */
  @ApiModelProperty(value = "Count of received")
  /**
   * Count of received
   *
   * @return countReceived Integer
   */
  public Integer getCountReceived() {
    return countReceived;
  }

  /**
   * Count of received
   *
   * @param countReceived Integer
   */
  public void setCountReceived(Integer countReceived) {
    this.countReceived = countReceived;
  }

  /**
   * Total paid
   *
   * @param totalPaid Double
   * @return AccountUsage
   */
  public AccountUsage totalPaid(Double totalPaid) {
    this.totalPaid = totalPaid;
    return this;
  }

  /**
   * Total paid
   *
   * @return totalPaid
   */
  @ApiModelProperty(value = "Total paid")
  /**
   * Total paid
   *
   * @return totalPaid Double
   */
  public Double getTotalPaid() {
    return totalPaid;
  }

  /**
   * Total paid
   *
   * @param totalPaid Double
   */
  public void setTotalPaid(Double totalPaid) {
    this.totalPaid = totalPaid;
  }

  /**
   * Count of paid
   *
   * @param countPaid Integer
   * @return AccountUsage
   */
  public AccountUsage countPaid(Integer countPaid) {
    this.countPaid = countPaid;
    return this;
  }

  /**
   * Count of paid
   *
   * @return countPaid
   */
  @ApiModelProperty(value = "Count of paid")
  /**
   * Count of paid
   *
   * @return countPaid Integer
   */
  public Integer getCountPaid() {
    return countPaid;
  }

  /**
   * Count of paid
   *
   * @param countPaid Integer
   */
  public void setCountPaid(Integer countPaid) {
    this.countPaid = countPaid;
  }

  /**
   * Total value of manual journals
   *
   * @param totalManualJournal Double
   * @return AccountUsage
   */
  public AccountUsage totalManualJournal(Double totalManualJournal) {
    this.totalManualJournal = totalManualJournal;
    return this;
  }

  /**
   * Total value of manual journals
   *
   * @return totalManualJournal
   */
  @ApiModelProperty(value = "Total value of manual journals")
  /**
   * Total value of manual journals
   *
   * @return totalManualJournal Double
   */
  public Double getTotalManualJournal() {
    return totalManualJournal;
  }

  /**
   * Total value of manual journals
   *
   * @param totalManualJournal Double
   */
  public void setTotalManualJournal(Double totalManualJournal) {
    this.totalManualJournal = totalManualJournal;
  }

  /**
   * Count of manual journals
   *
   * @param countManualJournal Integer
   * @return AccountUsage
   */
  public AccountUsage countManualJournal(Integer countManualJournal) {
    this.countManualJournal = countManualJournal;
    return this;
  }

  /**
   * Count of manual journals
   *
   * @return countManualJournal
   */
  @ApiModelProperty(value = "Count of manual journals")
  /**
   * Count of manual journals
   *
   * @return countManualJournal Integer
   */
  public Integer getCountManualJournal() {
    return countManualJournal;
  }

  /**
   * Count of manual journals
   *
   * @param countManualJournal Integer
   */
  public void setCountManualJournal(Integer countManualJournal) {
    this.countManualJournal = countManualJournal;
  }

  /**
   * The name of the account
   *
   * @param accountName String
   * @return AccountUsage
   */
  public AccountUsage accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * The name of the account
   *
   * @return accountName
   */
  @ApiModelProperty(value = "The name of the account")
  /**
   * The name of the account
   *
   * @return accountName String
   */
  public String getAccountName() {
    return accountName;
  }

  /**
   * The name of the account
   *
   * @param accountName String
   */
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  /**
   * Shown if set
   *
   * @param reportingCode String
   * @return AccountUsage
   */
  public AccountUsage reportingCode(String reportingCode) {
    this.reportingCode = reportingCode;
    return this;
  }

  /**
   * Shown if set
   *
   * @return reportingCode
   */
  @ApiModelProperty(value = "Shown if set")
  /**
   * Shown if set
   *
   * @return reportingCode String
   */
  public String getReportingCode() {
    return reportingCode;
  }

  /**
   * Shown if set
   *
   * @param reportingCode String
   */
  public void setReportingCode(String reportingCode) {
    this.reportingCode = reportingCode;
  }

  /**
   * Shown if set
   *
   * @param reportingCodeName String
   * @return AccountUsage
   */
  public AccountUsage reportingCodeName(String reportingCodeName) {
    this.reportingCodeName = reportingCodeName;
    return this;
  }

  /**
   * Shown if set
   *
   * @return reportingCodeName
   */
  @ApiModelProperty(value = "Shown if set")
  /**
   * Shown if set
   *
   * @return reportingCodeName String
   */
  public String getReportingCodeName() {
    return reportingCodeName;
  }

  /**
   * Shown if set
   *
   * @param reportingCodeName String
   */
  public void setReportingCodeName(String reportingCodeName) {
    this.reportingCodeName = reportingCodeName;
  }

  /**
   * Last modified date UTC format
   *
   * @param reportCodeUpdatedDateUtc OffsetDateTime
   * @return AccountUsage
   */
  public AccountUsage reportCodeUpdatedDateUtc(OffsetDateTime reportCodeUpdatedDateUtc) {
    this.reportCodeUpdatedDateUtc = reportCodeUpdatedDateUtc;
    return this;
  }

  /**
   * Last modified date UTC format
   *
   * @return reportCodeUpdatedDateUtc
   */
  @ApiModelProperty(value = "Last modified date UTC format")
  /**
   * Last modified date UTC format
   *
   * @return reportCodeUpdatedDateUtc OffsetDateTime
   */
  public OffsetDateTime getReportCodeUpdatedDateUtc() {
    return reportCodeUpdatedDateUtc;
  }

  /**
   * Last modified date UTC format
   *
   * @param reportCodeUpdatedDateUtc OffsetDateTime
   */
  public void setReportCodeUpdatedDateUtc(OffsetDateTime reportCodeUpdatedDateUtc) {
    this.reportCodeUpdatedDateUtc = reportCodeUpdatedDateUtc;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountUsage accountUsage = (AccountUsage) o;
    return Objects.equals(this.month, accountUsage.month)
        && Objects.equals(this.accountId, accountUsage.accountId)
        && Objects.equals(this.currencyCode, accountUsage.currencyCode)
        && Objects.equals(this.totalReceived, accountUsage.totalReceived)
        && Objects.equals(this.countReceived, accountUsage.countReceived)
        && Objects.equals(this.totalPaid, accountUsage.totalPaid)
        && Objects.equals(this.countPaid, accountUsage.countPaid)
        && Objects.equals(this.totalManualJournal, accountUsage.totalManualJournal)
        && Objects.equals(this.countManualJournal, accountUsage.countManualJournal)
        && Objects.equals(this.accountName, accountUsage.accountName)
        && Objects.equals(this.reportingCode, accountUsage.reportingCode)
        && Objects.equals(this.reportingCodeName, accountUsage.reportingCodeName)
        && Objects.equals(this.reportCodeUpdatedDateUtc, accountUsage.reportCodeUpdatedDateUtc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        month,
        accountId,
        currencyCode,
        totalReceived,
        countReceived,
        totalPaid,
        countPaid,
        totalManualJournal,
        countManualJournal,
        accountName,
        reportingCode,
        reportingCodeName,
        reportCodeUpdatedDateUtc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUsage {\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    totalReceived: ").append(toIndentedString(totalReceived)).append("\n");
    sb.append("    countReceived: ").append(toIndentedString(countReceived)).append("\n");
    sb.append("    totalPaid: ").append(toIndentedString(totalPaid)).append("\n");
    sb.append("    countPaid: ").append(toIndentedString(countPaid)).append("\n");
    sb.append("    totalManualJournal: ").append(toIndentedString(totalManualJournal)).append("\n");
    sb.append("    countManualJournal: ").append(toIndentedString(countManualJournal)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    reportingCode: ").append(toIndentedString(reportingCode)).append("\n");
    sb.append("    reportingCodeName: ").append(toIndentedString(reportingCodeName)).append("\n");
    sb.append("    reportCodeUpdatedDateUtc: ")
        .append(toIndentedString(reportCodeUpdatedDateUtc))
        .append("\n");
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
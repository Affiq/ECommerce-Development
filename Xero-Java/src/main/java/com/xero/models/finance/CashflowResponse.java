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
import org.threeten.bp.LocalDate;

/** CashflowResponse */
public class CashflowResponse {
  StringUtil util = new StringUtil();

  @JsonProperty("startDate")
  private LocalDate startDate;

  @JsonProperty("endDate")
  private LocalDate endDate;

  @JsonProperty("cashBalance")
  private CashBalance cashBalance;

  @JsonProperty("cashflowActivities")
  private List<CashflowActivity> cashflowActivities = new ArrayList<CashflowActivity>();
  /**
   * Start date of the report
   *
   * @param startDate LocalDate
   * @return CashflowResponse
   */
  public CashflowResponse startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date of the report
   *
   * @return startDate
   */
  @ApiModelProperty(value = "Start date of the report")
  /**
   * Start date of the report
   *
   * @return startDate LocalDate
   */
  public LocalDate getStartDate() {
    return startDate;
  }

  /**
   * Start date of the report
   *
   * @param startDate LocalDate
   */
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  /**
   * End date of the report
   *
   * @param endDate LocalDate
   * @return CashflowResponse
   */
  public CashflowResponse endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date of the report
   *
   * @return endDate
   */
  @ApiModelProperty(value = "End date of the report")
  /**
   * End date of the report
   *
   * @return endDate LocalDate
   */
  public LocalDate getEndDate() {
    return endDate;
  }

  /**
   * End date of the report
   *
   * @param endDate LocalDate
   */
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  /**
   * cashBalance
   *
   * @param cashBalance CashBalance
   * @return CashflowResponse
   */
  public CashflowResponse cashBalance(CashBalance cashBalance) {
    this.cashBalance = cashBalance;
    return this;
  }

  /**
   * Get cashBalance
   *
   * @return cashBalance
   */
  @ApiModelProperty(value = "")
  /**
   * cashBalance
   *
   * @return cashBalance CashBalance
   */
  public CashBalance getCashBalance() {
    return cashBalance;
  }

  /**
   * cashBalance
   *
   * @param cashBalance CashBalance
   */
  public void setCashBalance(CashBalance cashBalance) {
    this.cashBalance = cashBalance;
  }

  /**
   * Break down of cash and cash equivalents for the period
   *
   * @param cashflowActivities List&lt;CashflowActivity&gt;
   * @return CashflowResponse
   */
  public CashflowResponse cashflowActivities(List<CashflowActivity> cashflowActivities) {
    this.cashflowActivities = cashflowActivities;
    return this;
  }

  /**
   * Break down of cash and cash equivalents for the period
   *
   * @param cashflowActivitiesItem CashflowActivity
   * @return CashflowResponse
   */
  public CashflowResponse addCashflowActivitiesItem(CashflowActivity cashflowActivitiesItem) {
    if (this.cashflowActivities == null) {
      this.cashflowActivities = new ArrayList<CashflowActivity>();
    }
    this.cashflowActivities.add(cashflowActivitiesItem);
    return this;
  }

  /**
   * Break down of cash and cash equivalents for the period
   *
   * @return cashflowActivities
   */
  @ApiModelProperty(value = "Break down of cash and cash equivalents for the period")
  /**
   * Break down of cash and cash equivalents for the period
   *
   * @return cashflowActivities List<CashflowActivity>
   */
  public List<CashflowActivity> getCashflowActivities() {
    return cashflowActivities;
  }

  /**
   * Break down of cash and cash equivalents for the period
   *
   * @param cashflowActivities List&lt;CashflowActivity&gt;
   */
  public void setCashflowActivities(List<CashflowActivity> cashflowActivities) {
    this.cashflowActivities = cashflowActivities;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashflowResponse cashflowResponse = (CashflowResponse) o;
    return Objects.equals(this.startDate, cashflowResponse.startDate)
        && Objects.equals(this.endDate, cashflowResponse.endDate)
        && Objects.equals(this.cashBalance, cashflowResponse.cashBalance)
        && Objects.equals(this.cashflowActivities, cashflowResponse.cashflowActivities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, cashBalance, cashflowActivities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashflowResponse {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    cashBalance: ").append(toIndentedString(cashBalance)).append("\n");
    sb.append("    cashflowActivities: ").append(toIndentedString(cashflowActivities)).append("\n");
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

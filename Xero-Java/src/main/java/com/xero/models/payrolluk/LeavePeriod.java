/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrolluk;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import org.threeten.bp.LocalDate;

/** LeavePeriod */
public class LeavePeriod {
  StringUtil util = new StringUtil();

  @JsonProperty("periodStartDate")
  private LocalDate periodStartDate;

  @JsonProperty("periodEndDate")
  private LocalDate periodEndDate;

  @JsonProperty("numberOfUnits")
  private Double numberOfUnits;
  /** Period Status */
  public enum PeriodStatusEnum {
    /** APPROVED */
    APPROVED("Approved"),

    /** COMPLETED */
    COMPLETED("Completed");

    private String value;

    PeriodStatusEnum(String value) {
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
    public static PeriodStatusEnum fromValue(String value) {
      for (PeriodStatusEnum b : PeriodStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("periodStatus")
  private PeriodStatusEnum periodStatus;
  /**
   * The Pay Period Start Date (YYYY-MM-DD)
   *
   * @param periodStartDate LocalDate
   * @return LeavePeriod
   */
  public LeavePeriod periodStartDate(LocalDate periodStartDate) {
    this.periodStartDate = periodStartDate;
    return this;
  }

  /**
   * The Pay Period Start Date (YYYY-MM-DD)
   *
   * @return periodStartDate
   */
  @ApiModelProperty(value = "The Pay Period Start Date (YYYY-MM-DD)")
  /**
   * The Pay Period Start Date (YYYY-MM-DD)
   *
   * @return periodStartDate LocalDate
   */
  public LocalDate getPeriodStartDate() {
    return periodStartDate;
  }

  /**
   * The Pay Period Start Date (YYYY-MM-DD)
   *
   * @param periodStartDate LocalDate
   */
  public void setPeriodStartDate(LocalDate periodStartDate) {
    this.periodStartDate = periodStartDate;
  }

  /**
   * The Pay Period End Date (YYYY-MM-DD)
   *
   * @param periodEndDate LocalDate
   * @return LeavePeriod
   */
  public LeavePeriod periodEndDate(LocalDate periodEndDate) {
    this.periodEndDate = periodEndDate;
    return this;
  }

  /**
   * The Pay Period End Date (YYYY-MM-DD)
   *
   * @return periodEndDate
   */
  @ApiModelProperty(value = "The Pay Period End Date (YYYY-MM-DD)")
  /**
   * The Pay Period End Date (YYYY-MM-DD)
   *
   * @return periodEndDate LocalDate
   */
  public LocalDate getPeriodEndDate() {
    return periodEndDate;
  }

  /**
   * The Pay Period End Date (YYYY-MM-DD)
   *
   * @param periodEndDate LocalDate
   */
  public void setPeriodEndDate(LocalDate periodEndDate) {
    this.periodEndDate = periodEndDate;
  }

  /**
   * The Number of Units for the leave
   *
   * @param numberOfUnits Double
   * @return LeavePeriod
   */
  public LeavePeriod numberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
    return this;
  }

  /**
   * The Number of Units for the leave
   *
   * @return numberOfUnits
   */
  @ApiModelProperty(value = "The Number of Units for the leave")
  /**
   * The Number of Units for the leave
   *
   * @return numberOfUnits Double
   */
  public Double getNumberOfUnits() {
    return numberOfUnits;
  }

  /**
   * The Number of Units for the leave
   *
   * @param numberOfUnits Double
   */
  public void setNumberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
  }

  /**
   * Period Status
   *
   * @param periodStatus PeriodStatusEnum
   * @return LeavePeriod
   */
  public LeavePeriod periodStatus(PeriodStatusEnum periodStatus) {
    this.periodStatus = periodStatus;
    return this;
  }

  /**
   * Period Status
   *
   * @return periodStatus
   */
  @ApiModelProperty(value = "Period Status")
  /**
   * Period Status
   *
   * @return periodStatus PeriodStatusEnum
   */
  public PeriodStatusEnum getPeriodStatus() {
    return periodStatus;
  }

  /**
   * Period Status
   *
   * @param periodStatus PeriodStatusEnum
   */
  public void setPeriodStatus(PeriodStatusEnum periodStatus) {
    this.periodStatus = periodStatus;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeavePeriod leavePeriod = (LeavePeriod) o;
    return Objects.equals(this.periodStartDate, leavePeriod.periodStartDate)
        && Objects.equals(this.periodEndDate, leavePeriod.periodEndDate)
        && Objects.equals(this.numberOfUnits, leavePeriod.numberOfUnits)
        && Objects.equals(this.periodStatus, leavePeriod.periodStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodStartDate, periodEndDate, numberOfUnits, periodStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeavePeriod {\n");
    sb.append("    periodStartDate: ").append(toIndentedString(periodStartDate)).append("\n");
    sb.append("    periodEndDate: ").append(toIndentedString(periodEndDate)).append("\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
    sb.append("    periodStatus: ").append(toIndentedString(periodStatus)).append("\n");
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

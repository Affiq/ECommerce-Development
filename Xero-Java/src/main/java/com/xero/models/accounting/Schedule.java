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
import java.util.Objects;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.ZoneId;

/** Schedule */
public class Schedule {
  StringUtil util = new StringUtil();

  @JsonProperty("Period")
  private Integer period;
  /** One of the following - WEEKLY or MONTHLY */
  public enum UnitEnum {
    /** WEEKLY */
    WEEKLY("WEEKLY"),

    /** MONTHLY */
    MONTHLY("MONTHLY");

    private String value;

    UnitEnum(String value) {
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
    public static UnitEnum fromValue(String value) {
      for (UnitEnum b : UnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Unit")
  private UnitEnum unit;

  @JsonProperty("DueDate")
  private Integer dueDate;
  /** the payment terms */
  public enum DueDateTypeEnum {
    /** DAYSAFTERBILLDATE */
    DAYSAFTERBILLDATE("DAYSAFTERBILLDATE"),

    /** DAYSAFTERBILLMONTH */
    DAYSAFTERBILLMONTH("DAYSAFTERBILLMONTH"),

    /** DAYSAFTERINVOICEDATE */
    DAYSAFTERINVOICEDATE("DAYSAFTERINVOICEDATE"),

    /** DAYSAFTERINVOICEMONTH */
    DAYSAFTERINVOICEMONTH("DAYSAFTERINVOICEMONTH"),

    /** OFCURRENTMONTH */
    OFCURRENTMONTH("OFCURRENTMONTH"),

    /** OFFOLLOWINGMONTH */
    OFFOLLOWINGMONTH("OFFOLLOWINGMONTH");

    private String value;

    DueDateTypeEnum(String value) {
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
    public static DueDateTypeEnum fromValue(String value) {
      for (DueDateTypeEnum b : DueDateTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("DueDateType")
  private DueDateTypeEnum dueDateType;

  @JsonProperty("StartDate")
  private String startDate;

  @JsonProperty("NextScheduledDate")
  private String nextScheduledDate;

  @JsonProperty("EndDate")
  private String endDate;
  /**
   * Integer used with the unit e.g. 1 (every 1 week), 2 (every 2 months)
   *
   * @param period Integer
   * @return Schedule
   */
  public Schedule period(Integer period) {
    this.period = period;
    return this;
  }

  /**
   * Integer used with the unit e.g. 1 (every 1 week), 2 (every 2 months)
   *
   * @return period
   */
  @ApiModelProperty(value = "Integer used with the unit e.g. 1 (every 1 week), 2 (every 2 months)")
  /**
   * Integer used with the unit e.g. 1 (every 1 week), 2 (every 2 months)
   *
   * @return period Integer
   */
  public Integer getPeriod() {
    return period;
  }

  /**
   * Integer used with the unit e.g. 1 (every 1 week), 2 (every 2 months)
   *
   * @param period Integer
   */
  public void setPeriod(Integer period) {
    this.period = period;
  }

  /**
   * One of the following - WEEKLY or MONTHLY
   *
   * @param unit UnitEnum
   * @return Schedule
   */
  public Schedule unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

  /**
   * One of the following - WEEKLY or MONTHLY
   *
   * @return unit
   */
  @ApiModelProperty(value = "One of the following - WEEKLY or MONTHLY")
  /**
   * One of the following - WEEKLY or MONTHLY
   *
   * @return unit UnitEnum
   */
  public UnitEnum getUnit() {
    return unit;
  }

  /**
   * One of the following - WEEKLY or MONTHLY
   *
   * @param unit UnitEnum
   */
  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }

  /**
   * Integer used with due date type e.g 20 (of following month), 31 (of current month)
   *
   * @param dueDate Integer
   * @return Schedule
   */
  public Schedule dueDate(Integer dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Integer used with due date type e.g 20 (of following month), 31 (of current month)
   *
   * @return dueDate
   */
  @ApiModelProperty(
      value = "Integer used with due date type e.g 20 (of following month), 31 (of current month)")
  /**
   * Integer used with due date type e.g 20 (of following month), 31 (of current month)
   *
   * @return dueDate Integer
   */
  public Integer getDueDate() {
    return dueDate;
  }

  /**
   * Integer used with due date type e.g 20 (of following month), 31 (of current month)
   *
   * @param dueDate Integer
   */
  public void setDueDate(Integer dueDate) {
    this.dueDate = dueDate;
  }

  /**
   * the payment terms
   *
   * @param dueDateType DueDateTypeEnum
   * @return Schedule
   */
  public Schedule dueDateType(DueDateTypeEnum dueDateType) {
    this.dueDateType = dueDateType;
    return this;
  }

  /**
   * the payment terms
   *
   * @return dueDateType
   */
  @ApiModelProperty(value = "the payment terms")
  /**
   * the payment terms
   *
   * @return dueDateType DueDateTypeEnum
   */
  public DueDateTypeEnum getDueDateType() {
    return dueDateType;
  }

  /**
   * the payment terms
   *
   * @param dueDateType DueDateTypeEnum
   */
  public void setDueDateType(DueDateTypeEnum dueDateType) {
    this.dueDateType = dueDateType;
  }

  /**
   * Date the first invoice of the current version of the repeating schedule was generated (changes
   * when repeating invoice is edited)
   *
   * @param startDate String
   * @return Schedule
   */
  public Schedule startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Date the first invoice of the current version of the repeating schedule was generated (changes
   * when repeating invoice is edited)
   *
   * @return startDate
   */
  @ApiModelProperty(
      value =
          "Date the first invoice of the current version of the repeating schedule was generated"
              + " (changes when repeating invoice is edited)")
  /**
   * Date the first invoice of the current version of the repeating schedule was generated (changes
   * when repeating invoice is edited)
   *
   * @return startDate String
   */
  public String getStartDate() {
    return startDate;
  }
  /**
   * Date the first invoice of the current version of the repeating schedule was generated (changes
   * when repeating invoice is edited)
   *
   * @return LocalDate
   */
  public LocalDate getStartDateAsDate() {
    if (this.startDate != null) {
      try {
        return util.convertStringToDate(this.startDate);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  /**
   * Date the first invoice of the current version of the repeating schedule was generated (changes
   * when repeating invoice is edited)
   *
   * @param startDate String
   */
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Date the first invoice of the current version of the repeating schedule was generated (changes
   * when repeating invoice is edited)
   *
   * @param startDate LocalDateTime
   */
  public void setStartDate(LocalDate startDate) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = startDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.startDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  /**
   * The calendar date of the next invoice in the schedule to be generated
   *
   * @param nextScheduledDate String
   * @return Schedule
   */
  public Schedule nextScheduledDate(String nextScheduledDate) {
    this.nextScheduledDate = nextScheduledDate;
    return this;
  }

  /**
   * The calendar date of the next invoice in the schedule to be generated
   *
   * @return nextScheduledDate
   */
  @ApiModelProperty(value = "The calendar date of the next invoice in the schedule to be generated")
  /**
   * The calendar date of the next invoice in the schedule to be generated
   *
   * @return nextScheduledDate String
   */
  public String getNextScheduledDate() {
    return nextScheduledDate;
  }
  /**
   * The calendar date of the next invoice in the schedule to be generated
   *
   * @return LocalDate
   */
  public LocalDate getNextScheduledDateAsDate() {
    if (this.nextScheduledDate != null) {
      try {
        return util.convertStringToDate(this.nextScheduledDate);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  /**
   * The calendar date of the next invoice in the schedule to be generated
   *
   * @param nextScheduledDate String
   */
  public void setNextScheduledDate(String nextScheduledDate) {
    this.nextScheduledDate = nextScheduledDate;
  }

  /**
   * The calendar date of the next invoice in the schedule to be generated
   *
   * @param nextScheduledDate LocalDateTime
   */
  public void setNextScheduledDate(LocalDate nextScheduledDate) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = nextScheduledDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.nextScheduledDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  /**
   * Invoice end date – only returned if the template has an end date set
   *
   * @param endDate String
   * @return Schedule
   */
  public Schedule endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Invoice end date – only returned if the template has an end date set
   *
   * @return endDate
   */
  @ApiModelProperty(value = "Invoice end date – only returned if the template has an end date set")
  /**
   * Invoice end date – only returned if the template has an end date set
   *
   * @return endDate String
   */
  public String getEndDate() {
    return endDate;
  }
  /**
   * Invoice end date – only returned if the template has an end date set
   *
   * @return LocalDate
   */
  public LocalDate getEndDateAsDate() {
    if (this.endDate != null) {
      try {
        return util.convertStringToDate(this.endDate);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  /**
   * Invoice end date – only returned if the template has an end date set
   *
   * @param endDate String
   */
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * Invoice end date – only returned if the template has an end date set
   *
   * @param endDate LocalDateTime
   */
  public void setEndDate(LocalDate endDate) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = endDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.endDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedule schedule = (Schedule) o;
    return Objects.equals(this.period, schedule.period)
        && Objects.equals(this.unit, schedule.unit)
        && Objects.equals(this.dueDate, schedule.dueDate)
        && Objects.equals(this.dueDateType, schedule.dueDateType)
        && Objects.equals(this.startDate, schedule.startDate)
        && Objects.equals(this.nextScheduledDate, schedule.nextScheduledDate)
        && Objects.equals(this.endDate, schedule.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, unit, dueDate, dueDateType, startDate, nextScheduledDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    dueDateType: ").append(toIndentedString(dueDateType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    nextScheduledDate: ").append(toIndentedString(nextScheduledDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
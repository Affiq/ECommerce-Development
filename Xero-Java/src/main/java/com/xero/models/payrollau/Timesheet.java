/*
 * Xero Payroll AU API
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollau;

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

/** Timesheet */
public class Timesheet {
  StringUtil util = new StringUtil();

  @JsonProperty("EmployeeID")
  private UUID employeeID;

  @JsonProperty("StartDate")
  private String startDate;

  @JsonProperty("EndDate")
  private String endDate;

  @JsonProperty("Status")
  private TimesheetStatus status;

  @JsonProperty("Hours")
  private Double hours;

  @JsonProperty("TimesheetID")
  private UUID timesheetID;

  @JsonProperty("TimesheetLines")
  private List<TimesheetLine> timesheetLines = new ArrayList<TimesheetLine>();

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();
  /**
   * The Xero identifier for an employee
   *
   * @param employeeID UUID
   * @return Timesheet
   */
  public Timesheet employeeID(UUID employeeID) {
    this.employeeID = employeeID;
    return this;
  }

  /**
   * The Xero identifier for an employee
   *
   * @return employeeID
   */
  @ApiModelProperty(
      example = "72a0d0c2-0cf8-4f0b-ade1-33231f47b41b",
      required = true,
      value = "The Xero identifier for an employee")
  /**
   * The Xero identifier for an employee
   *
   * @return employeeID UUID
   */
  public UUID getEmployeeID() {
    return employeeID;
  }

  /**
   * The Xero identifier for an employee
   *
   * @param employeeID UUID
   */
  public void setEmployeeID(UUID employeeID) {
    this.employeeID = employeeID;
  }

  /**
   * Period start date (YYYY-MM-DD)
   *
   * @param startDate String
   * @return Timesheet
   */
  public Timesheet startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Period start date (YYYY-MM-DD)
   *
   * @return startDate
   */
  @ApiModelProperty(
      example = "/Date(322560000000+0000)/",
      required = true,
      value = "Period start date (YYYY-MM-DD)")
  /**
   * Period start date (YYYY-MM-DD)
   *
   * @return startDate String
   */
  public String getStartDate() {
    return startDate;
  }
  /**
   * Period start date (YYYY-MM-DD)
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
   * Period start date (YYYY-MM-DD)
   *
   * @param startDate String
   */
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Period start date (YYYY-MM-DD)
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
   * Period end date (YYYY-MM-DD)
   *
   * @param endDate String
   * @return Timesheet
   */
  public Timesheet endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Period end date (YYYY-MM-DD)
   *
   * @return endDate
   */
  @ApiModelProperty(
      example = "/Date(322560000000+0000)/",
      required = true,
      value = "Period end date (YYYY-MM-DD)")
  /**
   * Period end date (YYYY-MM-DD)
   *
   * @return endDate String
   */
  public String getEndDate() {
    return endDate;
  }
  /**
   * Period end date (YYYY-MM-DD)
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
   * Period end date (YYYY-MM-DD)
   *
   * @param endDate String
   */
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * Period end date (YYYY-MM-DD)
   *
   * @param endDate LocalDateTime
   */
  public void setEndDate(LocalDate endDate) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = endDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.endDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  /**
   * status
   *
   * @param status TimesheetStatus
   * @return Timesheet
   */
  public Timesheet status(TimesheetStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @ApiModelProperty(value = "")
  /**
   * status
   *
   * @return status TimesheetStatus
   */
  public TimesheetStatus getStatus() {
    return status;
  }

  /**
   * status
   *
   * @param status TimesheetStatus
   */
  public void setStatus(TimesheetStatus status) {
    this.status = status;
  }

  /**
   * Timesheet total hours
   *
   * @param hours Double
   * @return Timesheet
   */
  public Timesheet hours(Double hours) {
    this.hours = hours;
    return this;
  }

  /**
   * Timesheet total hours
   *
   * @return hours
   */
  @ApiModelProperty(example = "31.0", value = "Timesheet total hours")
  /**
   * Timesheet total hours
   *
   * @return hours Double
   */
  public Double getHours() {
    return hours;
  }

  /**
   * Timesheet total hours
   *
   * @param hours Double
   */
  public void setHours(Double hours) {
    this.hours = hours;
  }

  /**
   * The Xero identifier for a Payroll Timesheet
   *
   * @param timesheetID UUID
   * @return Timesheet
   */
  public Timesheet timesheetID(UUID timesheetID) {
    this.timesheetID = timesheetID;
    return this;
  }

  /**
   * The Xero identifier for a Payroll Timesheet
   *
   * @return timesheetID
   */
  @ApiModelProperty(
      example = "049765fc-4506-48fb-bf88-3578dec0ec47",
      value = "The Xero identifier for a Payroll Timesheet")
  /**
   * The Xero identifier for a Payroll Timesheet
   *
   * @return timesheetID UUID
   */
  public UUID getTimesheetID() {
    return timesheetID;
  }

  /**
   * The Xero identifier for a Payroll Timesheet
   *
   * @param timesheetID UUID
   */
  public void setTimesheetID(UUID timesheetID) {
    this.timesheetID = timesheetID;
  }

  /**
   * timesheetLines
   *
   * @param timesheetLines List&lt;TimesheetLine&gt;
   * @return Timesheet
   */
  public Timesheet timesheetLines(List<TimesheetLine> timesheetLines) {
    this.timesheetLines = timesheetLines;
    return this;
  }

  /**
   * timesheetLines
   *
   * @param timesheetLinesItem TimesheetLine
   * @return Timesheet
   */
  public Timesheet addTimesheetLinesItem(TimesheetLine timesheetLinesItem) {
    if (this.timesheetLines == null) {
      this.timesheetLines = new ArrayList<TimesheetLine>();
    }
    this.timesheetLines.add(timesheetLinesItem);
    return this;
  }

  /**
   * Get timesheetLines
   *
   * @return timesheetLines
   */
  @ApiModelProperty(value = "")
  /**
   * timesheetLines
   *
   * @return timesheetLines List<TimesheetLine>
   */
  public List<TimesheetLine> getTimesheetLines() {
    return timesheetLines;
  }

  /**
   * timesheetLines
   *
   * @param timesheetLines List&lt;TimesheetLine&gt;
   */
  public void setTimesheetLines(List<TimesheetLine> timesheetLines) {
    this.timesheetLines = timesheetLines;
  }

  /**
   * Last modified timestamp
   *
   * @return updatedDateUTC
   */
  @ApiModelProperty(example = "/Date(1583967733054+0000)/", value = "Last modified timestamp")
  /**
   * Last modified timestamp
   *
   * @return updatedDateUTC String
   */
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }
  /**
   * Last modified timestamp
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
   * Displays array of validation error messages from the API
   *
   * @param validationErrors List&lt;ValidationError&gt;
   * @return Timesheet
   */
  public Timesheet validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  /**
   * Displays array of validation error messages from the API
   *
   * @param validationErrorsItem ValidationError
   * @return Timesheet
   */
  public Timesheet addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    Timesheet timesheet = (Timesheet) o;
    return Objects.equals(this.employeeID, timesheet.employeeID)
        && Objects.equals(this.startDate, timesheet.startDate)
        && Objects.equals(this.endDate, timesheet.endDate)
        && Objects.equals(this.status, timesheet.status)
        && Objects.equals(this.hours, timesheet.hours)
        && Objects.equals(this.timesheetID, timesheet.timesheetID)
        && Objects.equals(this.timesheetLines, timesheet.timesheetLines)
        && Objects.equals(this.updatedDateUTC, timesheet.updatedDateUTC)
        && Objects.equals(this.validationErrors, timesheet.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        employeeID,
        startDate,
        endDate,
        status,
        hours,
        timesheetID,
        timesheetLines,
        updatedDateUTC,
        validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timesheet {\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    timesheetID: ").append(toIndentedString(timesheetID)).append("\n");
    sb.append("    timesheetLines: ").append(toIndentedString(timesheetLines)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
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

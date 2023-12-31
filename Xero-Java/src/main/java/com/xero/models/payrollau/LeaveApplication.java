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

/** LeaveApplication */
public class LeaveApplication {
  StringUtil util = new StringUtil();

  @JsonProperty("LeaveApplicationID")
  private UUID leaveApplicationID;

  @JsonProperty("EmployeeID")
  private UUID employeeID;

  @JsonProperty("LeaveTypeID")
  private UUID leaveTypeID;

  @JsonProperty("Title")
  private String title;

  @JsonProperty("StartDate")
  private String startDate;

  @JsonProperty("EndDate")
  private String endDate;

  @JsonProperty("Description")
  private String description;

  @JsonProperty("PayOutType")
  private PayOutType payOutType;

  @JsonProperty("LeavePeriods")
  private List<LeavePeriod> leavePeriods = new ArrayList<LeavePeriod>();

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();
  /**
   * The Xero identifier for Payroll Employee
   *
   * @param leaveApplicationID UUID
   * @return LeaveApplication
   */
  public LeaveApplication leaveApplicationID(UUID leaveApplicationID) {
    this.leaveApplicationID = leaveApplicationID;
    return this;
  }

  /**
   * The Xero identifier for Payroll Employee
   *
   * @return leaveApplicationID
   */
  @ApiModelProperty(
      example = "e0eb6747-7c17-4075-b804-989f8d4e5d39",
      value = "The Xero identifier for Payroll Employee")
  /**
   * The Xero identifier for Payroll Employee
   *
   * @return leaveApplicationID UUID
   */
  public UUID getLeaveApplicationID() {
    return leaveApplicationID;
  }

  /**
   * The Xero identifier for Payroll Employee
   *
   * @param leaveApplicationID UUID
   */
  public void setLeaveApplicationID(UUID leaveApplicationID) {
    this.leaveApplicationID = leaveApplicationID;
  }

  /**
   * The Xero identifier for Payroll Employee
   *
   * @param employeeID UUID
   * @return LeaveApplication
   */
  public LeaveApplication employeeID(UUID employeeID) {
    this.employeeID = employeeID;
    return this;
  }

  /**
   * The Xero identifier for Payroll Employee
   *
   * @return employeeID
   */
  @ApiModelProperty(
      example = "fb4ebd68-6568-41eb-96ab-628a0f54b4b8",
      value = "The Xero identifier for Payroll Employee")
  /**
   * The Xero identifier for Payroll Employee
   *
   * @return employeeID UUID
   */
  public UUID getEmployeeID() {
    return employeeID;
  }

  /**
   * The Xero identifier for Payroll Employee
   *
   * @param employeeID UUID
   */
  public void setEmployeeID(UUID employeeID) {
    this.employeeID = employeeID;
  }

  /**
   * The Xero identifier for Leave Type
   *
   * @param leaveTypeID UUID
   * @return LeaveApplication
   */
  public LeaveApplication leaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
    return this;
  }

  /**
   * The Xero identifier for Leave Type
   *
   * @return leaveTypeID
   */
  @ApiModelProperty(
      example = "742998cb-7584-4ecf-aa88-d694f59c50f9",
      value = "The Xero identifier for Leave Type")
  /**
   * The Xero identifier for Leave Type
   *
   * @return leaveTypeID UUID
   */
  public UUID getLeaveTypeID() {
    return leaveTypeID;
  }

  /**
   * The Xero identifier for Leave Type
   *
   * @param leaveTypeID UUID
   */
  public void setLeaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
  }

  /**
   * The title of the leave
   *
   * @param title String
   * @return LeaveApplication
   */
  public LeaveApplication title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the leave
   *
   * @return title
   */
  @ApiModelProperty(example = "Annual Leave", value = "The title of the leave")
  /**
   * The title of the leave
   *
   * @return title String
   */
  public String getTitle() {
    return title;
  }

  /**
   * The title of the leave
   *
   * @param title String
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Start date of the leave (YYYY-MM-DD)
   *
   * @param startDate String
   * @return LeaveApplication
   */
  public LeaveApplication startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date of the leave (YYYY-MM-DD)
   *
   * @return startDate
   */
  @ApiModelProperty(
      example = "/Date(322560000000+0000)/",
      value = "Start date of the leave (YYYY-MM-DD)")
  /**
   * Start date of the leave (YYYY-MM-DD)
   *
   * @return startDate String
   */
  public String getStartDate() {
    return startDate;
  }
  /**
   * Start date of the leave (YYYY-MM-DD)
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
   * Start date of the leave (YYYY-MM-DD)
   *
   * @param startDate String
   */
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Start date of the leave (YYYY-MM-DD)
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
   * End date of the leave (YYYY-MM-DD)
   *
   * @param endDate String
   * @return LeaveApplication
   */
  public LeaveApplication endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date of the leave (YYYY-MM-DD)
   *
   * @return endDate
   */
  @ApiModelProperty(
      example = "/Date(322560000000+0000)/",
      value = "End date of the leave (YYYY-MM-DD)")
  /**
   * End date of the leave (YYYY-MM-DD)
   *
   * @return endDate String
   */
  public String getEndDate() {
    return endDate;
  }
  /**
   * End date of the leave (YYYY-MM-DD)
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
   * End date of the leave (YYYY-MM-DD)
   *
   * @param endDate String
   */
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * End date of the leave (YYYY-MM-DD)
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
   * The Description of the Leave
   *
   * @param description String
   * @return LeaveApplication
   */
  public LeaveApplication description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The Description of the Leave
   *
   * @return description
   */
  @ApiModelProperty(example = "My leave", value = "The Description of the Leave")
  /**
   * The Description of the Leave
   *
   * @return description String
   */
  public String getDescription() {
    return description;
  }

  /**
   * The Description of the Leave
   *
   * @param description String
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * payOutType
   *
   * @param payOutType PayOutType
   * @return LeaveApplication
   */
  public LeaveApplication payOutType(PayOutType payOutType) {
    this.payOutType = payOutType;
    return this;
  }

  /**
   * Get payOutType
   *
   * @return payOutType
   */
  @ApiModelProperty(value = "")
  /**
   * payOutType
   *
   * @return payOutType PayOutType
   */
  public PayOutType getPayOutType() {
    return payOutType;
  }

  /**
   * payOutType
   *
   * @param payOutType PayOutType
   */
  public void setPayOutType(PayOutType payOutType) {
    this.payOutType = payOutType;
  }

  /**
   * leavePeriods
   *
   * @param leavePeriods List&lt;LeavePeriod&gt;
   * @return LeaveApplication
   */
  public LeaveApplication leavePeriods(List<LeavePeriod> leavePeriods) {
    this.leavePeriods = leavePeriods;
    return this;
  }

  /**
   * leavePeriods
   *
   * @param leavePeriodsItem LeavePeriod
   * @return LeaveApplication
   */
  public LeaveApplication addLeavePeriodsItem(LeavePeriod leavePeriodsItem) {
    if (this.leavePeriods == null) {
      this.leavePeriods = new ArrayList<LeavePeriod>();
    }
    this.leavePeriods.add(leavePeriodsItem);
    return this;
  }

  /**
   * Get leavePeriods
   *
   * @return leavePeriods
   */
  @ApiModelProperty(value = "")
  /**
   * leavePeriods
   *
   * @return leavePeriods List<LeavePeriod>
   */
  public List<LeavePeriod> getLeavePeriods() {
    return leavePeriods;
  }

  /**
   * leavePeriods
   *
   * @param leavePeriods List&lt;LeavePeriod&gt;
   */
  public void setLeavePeriods(List<LeavePeriod> leavePeriods) {
    this.leavePeriods = leavePeriods;
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
   * @return LeaveApplication
   */
  public LeaveApplication validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  /**
   * Displays array of validation error messages from the API
   *
   * @param validationErrorsItem ValidationError
   * @return LeaveApplication
   */
  public LeaveApplication addValidationErrorsItem(ValidationError validationErrorsItem) {
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
    LeaveApplication leaveApplication = (LeaveApplication) o;
    return Objects.equals(this.leaveApplicationID, leaveApplication.leaveApplicationID)
        && Objects.equals(this.employeeID, leaveApplication.employeeID)
        && Objects.equals(this.leaveTypeID, leaveApplication.leaveTypeID)
        && Objects.equals(this.title, leaveApplication.title)
        && Objects.equals(this.startDate, leaveApplication.startDate)
        && Objects.equals(this.endDate, leaveApplication.endDate)
        && Objects.equals(this.description, leaveApplication.description)
        && Objects.equals(this.payOutType, leaveApplication.payOutType)
        && Objects.equals(this.leavePeriods, leaveApplication.leavePeriods)
        && Objects.equals(this.updatedDateUTC, leaveApplication.updatedDateUTC)
        && Objects.equals(this.validationErrors, leaveApplication.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        leaveApplicationID,
        employeeID,
        leaveTypeID,
        title,
        startDate,
        endDate,
        description,
        payOutType,
        leavePeriods,
        updatedDateUTC,
        validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveApplication {\n");
    sb.append("    leaveApplicationID: ").append(toIndentedString(leaveApplicationID)).append("\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    leaveTypeID: ").append(toIndentedString(leaveTypeID)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    payOutType: ").append(toIndentedString(payOutType)).append("\n");
    sb.append("    leavePeriods: ").append(toIndentedString(leavePeriods)).append("\n");
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

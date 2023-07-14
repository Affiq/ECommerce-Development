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
import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/** TaxDeclaration */
public class TaxDeclaration {
  StringUtil util = new StringUtil();

  @JsonProperty("EmployeeID")
  private UUID employeeID;

  @JsonProperty("EmploymentBasis")
  private EmploymentBasis employmentBasis;

  @JsonProperty("TFNExemptionType")
  private TFNExemptionType tfNExemptionType;

  @JsonProperty("TaxFileNumber")
  private String taxFileNumber;

  @JsonProperty("ABN")
  private String ABN;

  @JsonProperty("AustralianResidentForTaxPurposes")
  private Boolean australianResidentForTaxPurposes;

  @JsonProperty("ResidencyStatus")
  private ResidencyStatus residencyStatus;

  @JsonProperty("TaxScaleType")
  private TaxScaleType taxScaleType;

  @JsonProperty("WorkCondition")
  private WorkCondition workCondition;

  @JsonProperty("SeniorMaritalStatus")
  private SeniorMaritalStatus seniorMaritalStatus;

  @JsonProperty("TaxFreeThresholdClaimed")
  private Boolean taxFreeThresholdClaimed;

  @JsonProperty("TaxOffsetEstimatedAmount")
  private BigDecimal taxOffsetEstimatedAmount;

  @JsonProperty("HasHELPDebt")
  private Boolean hasHELPDebt;

  @JsonProperty("HasSFSSDebt")
  private Boolean hasSFSSDebt;

  @JsonProperty("HasTradeSupportLoanDebt")
  private Boolean hasTradeSupportLoanDebt;

  @JsonProperty("UpwardVariationTaxWithholdingAmount")
  private BigDecimal upwardVariationTaxWithholdingAmount;

  @JsonProperty("EligibleToReceiveLeaveLoading")
  private Boolean eligibleToReceiveLeaveLoading;

  @JsonProperty("ApprovedWithholdingVariationPercentage")
  private BigDecimal approvedWithholdingVariationPercentage;

  @JsonProperty("HasStudentStartupLoan")
  private Boolean hasStudentStartupLoan;

  @JsonProperty("HasLoanOrStudentDebt")
  private Boolean hasLoanOrStudentDebt;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;
  /**
   * Address line 1 for employee home address
   *
   * @param employeeID UUID
   * @return TaxDeclaration
   */
  public TaxDeclaration employeeID(UUID employeeID) {
    this.employeeID = employeeID;
    return this;
  }

  /**
   * Address line 1 for employee home address
   *
   * @return employeeID
   */
  @ApiModelProperty(value = "Address line 1 for employee home address")
  /**
   * Address line 1 for employee home address
   *
   * @return employeeID UUID
   */
  public UUID getEmployeeID() {
    return employeeID;
  }

  /**
   * Address line 1 for employee home address
   *
   * @param employeeID UUID
   */
  public void setEmployeeID(UUID employeeID) {
    this.employeeID = employeeID;
  }

  /**
   * employmentBasis
   *
   * @param employmentBasis EmploymentBasis
   * @return TaxDeclaration
   */
  public TaxDeclaration employmentBasis(EmploymentBasis employmentBasis) {
    this.employmentBasis = employmentBasis;
    return this;
  }

  /**
   * Get employmentBasis
   *
   * @return employmentBasis
   */
  @ApiModelProperty(value = "")
  /**
   * employmentBasis
   *
   * @return employmentBasis EmploymentBasis
   */
  public EmploymentBasis getEmploymentBasis() {
    return employmentBasis;
  }

  /**
   * employmentBasis
   *
   * @param employmentBasis EmploymentBasis
   */
  public void setEmploymentBasis(EmploymentBasis employmentBasis) {
    this.employmentBasis = employmentBasis;
  }

  /**
   * tfNExemptionType
   *
   * @param tfNExemptionType TFNExemptionType
   * @return TaxDeclaration
   */
  public TaxDeclaration tfNExemptionType(TFNExemptionType tfNExemptionType) {
    this.tfNExemptionType = tfNExemptionType;
    return this;
  }

  /**
   * Get tfNExemptionType
   *
   * @return tfNExemptionType
   */
  @ApiModelProperty(value = "")
  /**
   * tfNExemptionType
   *
   * @return tfNExemptionType TFNExemptionType
   */
  public TFNExemptionType getTfNExemptionType() {
    return tfNExemptionType;
  }

  /**
   * tfNExemptionType
   *
   * @param tfNExemptionType TFNExemptionType
   */
  public void setTfNExemptionType(TFNExemptionType tfNExemptionType) {
    this.tfNExemptionType = tfNExemptionType;
  }

  /**
   * The tax file number e.g 123123123.
   *
   * @param taxFileNumber String
   * @return TaxDeclaration
   */
  public TaxDeclaration taxFileNumber(String taxFileNumber) {
    this.taxFileNumber = taxFileNumber;
    return this;
  }

  /**
   * The tax file number e.g 123123123.
   *
   * @return taxFileNumber
   */
  @ApiModelProperty(example = "123123123", value = "The tax file number e.g 123123123.")
  /**
   * The tax file number e.g 123123123.
   *
   * @return taxFileNumber String
   */
  public String getTaxFileNumber() {
    return taxFileNumber;
  }

  /**
   * The tax file number e.g 123123123.
   *
   * @param taxFileNumber String
   */
  public void setTaxFileNumber(String taxFileNumber) {
    this.taxFileNumber = taxFileNumber;
  }

  /**
   * 11-digit Australian Business Number e.g 21006819692 or an empty string (\&quot;\&quot;) to
   * unset a previously set value. Only applicable, and mandatory if income type is NONEMPLOYEE.
   *
   * @param ABN String
   * @return TaxDeclaration
   */
  public TaxDeclaration ABN(String ABN) {
    this.ABN = ABN;
    return this;
  }

  /**
   * 11-digit Australian Business Number e.g 21006819692 or an empty string (\&quot;\&quot;) to
   * unset a previously set value. Only applicable, and mandatory if income type is NONEMPLOYEE.
   *
   * @return ABN
   */
  @ApiModelProperty(
      example = "21006819692",
      value =
          "11-digit Australian Business Number e.g 21006819692 or an empty string (\"\") to unset"
              + " a previously set value. Only applicable, and mandatory if income type is"
              + " NONEMPLOYEE.")
  /**
   * 11-digit Australian Business Number e.g 21006819692 or an empty string (\&quot;\&quot;) to
   * unset a previously set value. Only applicable, and mandatory if income type is NONEMPLOYEE.
   *
   * @return ABN String
   */
  public String getABN() {
    return ABN;
  }

  /**
   * 11-digit Australian Business Number e.g 21006819692 or an empty string (\&quot;\&quot;) to
   * unset a previously set value. Only applicable, and mandatory if income type is NONEMPLOYEE.
   *
   * @param ABN String
   */
  public void setABN(String ABN) {
    this.ABN = ABN;
  }

  /**
   * If the employee is Australian resident for tax purposes. e.g true or false
   *
   * @param australianResidentForTaxPurposes Boolean
   * @return TaxDeclaration
   */
  public TaxDeclaration australianResidentForTaxPurposes(Boolean australianResidentForTaxPurposes) {
    this.australianResidentForTaxPurposes = australianResidentForTaxPurposes;
    return this;
  }

  /**
   * If the employee is Australian resident for tax purposes. e.g true or false
   *
   * @return australianResidentForTaxPurposes
   */
  @ApiModelProperty(
      example = "true",
      value = "If the employee is Australian resident for tax purposes. e.g true or false")
  /**
   * If the employee is Australian resident for tax purposes. e.g true or false
   *
   * @return australianResidentForTaxPurposes Boolean
   */
  public Boolean getAustralianResidentForTaxPurposes() {
    return australianResidentForTaxPurposes;
  }

  /**
   * If the employee is Australian resident for tax purposes. e.g true or false
   *
   * @param australianResidentForTaxPurposes Boolean
   */
  public void setAustralianResidentForTaxPurposes(Boolean australianResidentForTaxPurposes) {
    this.australianResidentForTaxPurposes = australianResidentForTaxPurposes;
  }

  /**
   * residencyStatus
   *
   * @param residencyStatus ResidencyStatus
   * @return TaxDeclaration
   */
  public TaxDeclaration residencyStatus(ResidencyStatus residencyStatus) {
    this.residencyStatus = residencyStatus;
    return this;
  }

  /**
   * Get residencyStatus
   *
   * @return residencyStatus
   */
  @ApiModelProperty(value = "")
  /**
   * residencyStatus
   *
   * @return residencyStatus ResidencyStatus
   */
  public ResidencyStatus getResidencyStatus() {
    return residencyStatus;
  }

  /**
   * residencyStatus
   *
   * @param residencyStatus ResidencyStatus
   */
  public void setResidencyStatus(ResidencyStatus residencyStatus) {
    this.residencyStatus = residencyStatus;
  }

  /**
   * taxScaleType
   *
   * @param taxScaleType TaxScaleType
   * @return TaxDeclaration
   */
  public TaxDeclaration taxScaleType(TaxScaleType taxScaleType) {
    this.taxScaleType = taxScaleType;
    return this;
  }

  /**
   * Get taxScaleType
   *
   * @return taxScaleType
   */
  @ApiModelProperty(value = "")
  /**
   * taxScaleType
   *
   * @return taxScaleType TaxScaleType
   */
  public TaxScaleType getTaxScaleType() {
    return taxScaleType;
  }

  /**
   * taxScaleType
   *
   * @param taxScaleType TaxScaleType
   */
  public void setTaxScaleType(TaxScaleType taxScaleType) {
    this.taxScaleType = taxScaleType;
  }

  /**
   * workCondition
   *
   * @param workCondition WorkCondition
   * @return TaxDeclaration
   */
  public TaxDeclaration workCondition(WorkCondition workCondition) {
    this.workCondition = workCondition;
    return this;
  }

  /**
   * Get workCondition
   *
   * @return workCondition
   */
  @ApiModelProperty(value = "")
  /**
   * workCondition
   *
   * @return workCondition WorkCondition
   */
  public WorkCondition getWorkCondition() {
    return workCondition;
  }

  /**
   * workCondition
   *
   * @param workCondition WorkCondition
   */
  public void setWorkCondition(WorkCondition workCondition) {
    this.workCondition = workCondition;
  }

  /**
   * seniorMaritalStatus
   *
   * @param seniorMaritalStatus SeniorMaritalStatus
   * @return TaxDeclaration
   */
  public TaxDeclaration seniorMaritalStatus(SeniorMaritalStatus seniorMaritalStatus) {
    this.seniorMaritalStatus = seniorMaritalStatus;
    return this;
  }

  /**
   * Get seniorMaritalStatus
   *
   * @return seniorMaritalStatus
   */
  @ApiModelProperty(value = "")
  /**
   * seniorMaritalStatus
   *
   * @return seniorMaritalStatus SeniorMaritalStatus
   */
  public SeniorMaritalStatus getSeniorMaritalStatus() {
    return seniorMaritalStatus;
  }

  /**
   * seniorMaritalStatus
   *
   * @param seniorMaritalStatus SeniorMaritalStatus
   */
  public void setSeniorMaritalStatus(SeniorMaritalStatus seniorMaritalStatus) {
    this.seniorMaritalStatus = seniorMaritalStatus;
  }

  /**
   * If tax free threshold claimed. e.g true or false
   *
   * @param taxFreeThresholdClaimed Boolean
   * @return TaxDeclaration
   */
  public TaxDeclaration taxFreeThresholdClaimed(Boolean taxFreeThresholdClaimed) {
    this.taxFreeThresholdClaimed = taxFreeThresholdClaimed;
    return this;
  }

  /**
   * If tax free threshold claimed. e.g true or false
   *
   * @return taxFreeThresholdClaimed
   */
  @ApiModelProperty(example = "false", value = "If tax free threshold claimed. e.g true or false")
  /**
   * If tax free threshold claimed. e.g true or false
   *
   * @return taxFreeThresholdClaimed Boolean
   */
  public Boolean getTaxFreeThresholdClaimed() {
    return taxFreeThresholdClaimed;
  }

  /**
   * If tax free threshold claimed. e.g true or false
   *
   * @param taxFreeThresholdClaimed Boolean
   */
  public void setTaxFreeThresholdClaimed(Boolean taxFreeThresholdClaimed) {
    this.taxFreeThresholdClaimed = taxFreeThresholdClaimed;
  }

  /**
   * If has tax offset estimated then the tax offset estimated amount. e.g 100
   *
   * @param taxOffsetEstimatedAmount BigDecimal
   * @return TaxDeclaration
   */
  public TaxDeclaration taxOffsetEstimatedAmount(BigDecimal taxOffsetEstimatedAmount) {
    this.taxOffsetEstimatedAmount = taxOffsetEstimatedAmount;
    return this;
  }

  /**
   * If has tax offset estimated then the tax offset estimated amount. e.g 100
   *
   * @return taxOffsetEstimatedAmount
   */
  @ApiModelProperty(
      example = "100",
      value = "If has tax offset estimated then the tax offset estimated amount. e.g 100")
  /**
   * If has tax offset estimated then the tax offset estimated amount. e.g 100
   *
   * @return taxOffsetEstimatedAmount BigDecimal
   */
  public BigDecimal getTaxOffsetEstimatedAmount() {
    return taxOffsetEstimatedAmount;
  }

  /**
   * If has tax offset estimated then the tax offset estimated amount. e.g 100
   *
   * @param taxOffsetEstimatedAmount BigDecimal
   */
  public void setTaxOffsetEstimatedAmount(BigDecimal taxOffsetEstimatedAmount) {
    this.taxOffsetEstimatedAmount = taxOffsetEstimatedAmount;
  }

  /**
   * If employee has HECS or HELP debt. e.g true or false
   *
   * @param hasHELPDebt Boolean
   * @return TaxDeclaration
   */
  public TaxDeclaration hasHELPDebt(Boolean hasHELPDebt) {
    this.hasHELPDebt = hasHELPDebt;
    return this;
  }

  /**
   * If employee has HECS or HELP debt. e.g true or false
   *
   * @return hasHELPDebt
   */
  @ApiModelProperty(
      example = "false",
      value = "If employee has HECS or HELP debt. e.g true or false")
  /**
   * If employee has HECS or HELP debt. e.g true or false
   *
   * @return hasHELPDebt Boolean
   */
  public Boolean getHasHELPDebt() {
    return hasHELPDebt;
  }

  /**
   * If employee has HECS or HELP debt. e.g true or false
   *
   * @param hasHELPDebt Boolean
   */
  public void setHasHELPDebt(Boolean hasHELPDebt) {
    this.hasHELPDebt = hasHELPDebt;
  }

  /**
   * If employee has financial supplement debt. e.g true or false
   *
   * @param hasSFSSDebt Boolean
   * @return TaxDeclaration
   */
  public TaxDeclaration hasSFSSDebt(Boolean hasSFSSDebt) {
    this.hasSFSSDebt = hasSFSSDebt;
    return this;
  }

  /**
   * If employee has financial supplement debt. e.g true or false
   *
   * @return hasSFSSDebt
   */
  @ApiModelProperty(
      example = "false",
      value = "If employee has financial supplement debt. e.g true or false")
  /**
   * If employee has financial supplement debt. e.g true or false
   *
   * @return hasSFSSDebt Boolean
   */
  public Boolean getHasSFSSDebt() {
    return hasSFSSDebt;
  }

  /**
   * If employee has financial supplement debt. e.g true or false
   *
   * @param hasSFSSDebt Boolean
   */
  public void setHasSFSSDebt(Boolean hasSFSSDebt) {
    this.hasSFSSDebt = hasSFSSDebt;
  }

  /**
   * If employee has trade support loan. e.g true or false
   *
   * @param hasTradeSupportLoanDebt Boolean
   * @return TaxDeclaration
   */
  public TaxDeclaration hasTradeSupportLoanDebt(Boolean hasTradeSupportLoanDebt) {
    this.hasTradeSupportLoanDebt = hasTradeSupportLoanDebt;
    return this;
  }

  /**
   * If employee has trade support loan. e.g true or false
   *
   * @return hasTradeSupportLoanDebt
   */
  @ApiModelProperty(
      example = "false",
      value = "If employee has trade support loan. e.g true or false")
  /**
   * If employee has trade support loan. e.g true or false
   *
   * @return hasTradeSupportLoanDebt Boolean
   */
  public Boolean getHasTradeSupportLoanDebt() {
    return hasTradeSupportLoanDebt;
  }

  /**
   * If employee has trade support loan. e.g true or false
   *
   * @param hasTradeSupportLoanDebt Boolean
   */
  public void setHasTradeSupportLoanDebt(Boolean hasTradeSupportLoanDebt) {
    this.hasTradeSupportLoanDebt = hasTradeSupportLoanDebt;
  }

  /**
   * If the employee has requested that additional tax be withheld each pay run. e.g 50
   *
   * @param upwardVariationTaxWithholdingAmount BigDecimal
   * @return TaxDeclaration
   */
  public TaxDeclaration upwardVariationTaxWithholdingAmount(
      BigDecimal upwardVariationTaxWithholdingAmount) {
    this.upwardVariationTaxWithholdingAmount = upwardVariationTaxWithholdingAmount;
    return this;
  }

  /**
   * If the employee has requested that additional tax be withheld each pay run. e.g 50
   *
   * @return upwardVariationTaxWithholdingAmount
   */
  @ApiModelProperty(
      example = "50",
      value = "If the employee has requested that additional tax be withheld each pay run. e.g 50")
  /**
   * If the employee has requested that additional tax be withheld each pay run. e.g 50
   *
   * @return upwardVariationTaxWithholdingAmount BigDecimal
   */
  public BigDecimal getUpwardVariationTaxWithholdingAmount() {
    return upwardVariationTaxWithholdingAmount;
  }

  /**
   * If the employee has requested that additional tax be withheld each pay run. e.g 50
   *
   * @param upwardVariationTaxWithholdingAmount BigDecimal
   */
  public void setUpwardVariationTaxWithholdingAmount(
      BigDecimal upwardVariationTaxWithholdingAmount) {
    this.upwardVariationTaxWithholdingAmount = upwardVariationTaxWithholdingAmount;
  }

  /**
   * If the employee is eligible to receive an additional percentage on top of ordinary earnings
   * when they take leave (typically 17.5%). e.g true or false
   *
   * @param eligibleToReceiveLeaveLoading Boolean
   * @return TaxDeclaration
   */
  public TaxDeclaration eligibleToReceiveLeaveLoading(Boolean eligibleToReceiveLeaveLoading) {
    this.eligibleToReceiveLeaveLoading = eligibleToReceiveLeaveLoading;
    return this;
  }

  /**
   * If the employee is eligible to receive an additional percentage on top of ordinary earnings
   * when they take leave (typically 17.5%). e.g true or false
   *
   * @return eligibleToReceiveLeaveLoading
   */
  @ApiModelProperty(
      example = "false",
      value =
          "If the employee is eligible to receive an additional percentage on top of ordinary"
              + " earnings when they take leave (typically 17.5%). e.g true or false")
  /**
   * If the employee is eligible to receive an additional percentage on top of ordinary earnings
   * when they take leave (typically 17.5%). e.g true or false
   *
   * @return eligibleToReceiveLeaveLoading Boolean
   */
  public Boolean getEligibleToReceiveLeaveLoading() {
    return eligibleToReceiveLeaveLoading;
  }

  /**
   * If the employee is eligible to receive an additional percentage on top of ordinary earnings
   * when they take leave (typically 17.5%). e.g true or false
   *
   * @param eligibleToReceiveLeaveLoading Boolean
   */
  public void setEligibleToReceiveLeaveLoading(Boolean eligibleToReceiveLeaveLoading) {
    this.eligibleToReceiveLeaveLoading = eligibleToReceiveLeaveLoading;
  }

  /**
   * If the employee has approved withholding variation. e.g (0 - 100)
   *
   * @param approvedWithholdingVariationPercentage BigDecimal
   * @return TaxDeclaration
   */
  public TaxDeclaration approvedWithholdingVariationPercentage(
      BigDecimal approvedWithholdingVariationPercentage) {
    this.approvedWithholdingVariationPercentage = approvedWithholdingVariationPercentage;
    return this;
  }

  /**
   * If the employee has approved withholding variation. e.g (0 - 100)
   *
   * @return approvedWithholdingVariationPercentage
   */
  @ApiModelProperty(
      example = "75",
      value = "If the employee has approved withholding variation. e.g (0 - 100)")
  /**
   * If the employee has approved withholding variation. e.g (0 - 100)
   *
   * @return approvedWithholdingVariationPercentage BigDecimal
   */
  public BigDecimal getApprovedWithholdingVariationPercentage() {
    return approvedWithholdingVariationPercentage;
  }

  /**
   * If the employee has approved withholding variation. e.g (0 - 100)
   *
   * @param approvedWithholdingVariationPercentage BigDecimal
   */
  public void setApprovedWithholdingVariationPercentage(
      BigDecimal approvedWithholdingVariationPercentage) {
    this.approvedWithholdingVariationPercentage = approvedWithholdingVariationPercentage;
  }

  /**
   * If the employee is eligible for student startup loan rules
   *
   * @param hasStudentStartupLoan Boolean
   * @return TaxDeclaration
   */
  public TaxDeclaration hasStudentStartupLoan(Boolean hasStudentStartupLoan) {
    this.hasStudentStartupLoan = hasStudentStartupLoan;
    return this;
  }

  /**
   * If the employee is eligible for student startup loan rules
   *
   * @return hasStudentStartupLoan
   */
  @ApiModelProperty(
      example = "true",
      value = "If the employee is eligible for student startup loan rules")
  /**
   * If the employee is eligible for student startup loan rules
   *
   * @return hasStudentStartupLoan Boolean
   */
  public Boolean getHasStudentStartupLoan() {
    return hasStudentStartupLoan;
  }

  /**
   * If the employee is eligible for student startup loan rules
   *
   * @param hasStudentStartupLoan Boolean
   */
  public void setHasStudentStartupLoan(Boolean hasStudentStartupLoan) {
    this.hasStudentStartupLoan = hasStudentStartupLoan;
  }

  /**
   * If the employee has any of the following loans or debts: Higher Education Loan Program
   * (HELP/HECS), VET Student Loan (VSL), Financial Supplement (FS), Student Start-up Loan (SSL), or
   * Trade Support Loan (TSL)
   *
   * @param hasLoanOrStudentDebt Boolean
   * @return TaxDeclaration
   */
  public TaxDeclaration hasLoanOrStudentDebt(Boolean hasLoanOrStudentDebt) {
    this.hasLoanOrStudentDebt = hasLoanOrStudentDebt;
    return this;
  }

  /**
   * If the employee has any of the following loans or debts: Higher Education Loan Program
   * (HELP/HECS), VET Student Loan (VSL), Financial Supplement (FS), Student Start-up Loan (SSL), or
   * Trade Support Loan (TSL)
   *
   * @return hasLoanOrStudentDebt
   */
  @ApiModelProperty(
      example = "true",
      value =
          "If the employee has any of the following loans or debts: Higher Education Loan Program"
              + " (HELP/HECS), VET Student Loan (VSL), Financial Supplement (FS), Student Start-up"
              + " Loan (SSL), or Trade Support Loan (TSL)")
  /**
   * If the employee has any of the following loans or debts: Higher Education Loan Program
   * (HELP/HECS), VET Student Loan (VSL), Financial Supplement (FS), Student Start-up Loan (SSL), or
   * Trade Support Loan (TSL)
   *
   * @return hasLoanOrStudentDebt Boolean
   */
  public Boolean getHasLoanOrStudentDebt() {
    return hasLoanOrStudentDebt;
  }

  /**
   * If the employee has any of the following loans or debts: Higher Education Loan Program
   * (HELP/HECS), VET Student Loan (VSL), Financial Supplement (FS), Student Start-up Loan (SSL), or
   * Trade Support Loan (TSL)
   *
   * @param hasLoanOrStudentDebt Boolean
   */
  public void setHasLoanOrStudentDebt(Boolean hasLoanOrStudentDebt) {
    this.hasLoanOrStudentDebt = hasLoanOrStudentDebt;
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxDeclaration taxDeclaration = (TaxDeclaration) o;
    return Objects.equals(this.employeeID, taxDeclaration.employeeID)
        && Objects.equals(this.employmentBasis, taxDeclaration.employmentBasis)
        && Objects.equals(this.tfNExemptionType, taxDeclaration.tfNExemptionType)
        && Objects.equals(this.taxFileNumber, taxDeclaration.taxFileNumber)
        && Objects.equals(this.ABN, taxDeclaration.ABN)
        && Objects.equals(
            this.australianResidentForTaxPurposes, taxDeclaration.australianResidentForTaxPurposes)
        && Objects.equals(this.residencyStatus, taxDeclaration.residencyStatus)
        && Objects.equals(this.taxScaleType, taxDeclaration.taxScaleType)
        && Objects.equals(this.workCondition, taxDeclaration.workCondition)
        && Objects.equals(this.seniorMaritalStatus, taxDeclaration.seniorMaritalStatus)
        && Objects.equals(this.taxFreeThresholdClaimed, taxDeclaration.taxFreeThresholdClaimed)
        && Objects.equals(this.taxOffsetEstimatedAmount, taxDeclaration.taxOffsetEstimatedAmount)
        && Objects.equals(this.hasHELPDebt, taxDeclaration.hasHELPDebt)
        && Objects.equals(this.hasSFSSDebt, taxDeclaration.hasSFSSDebt)
        && Objects.equals(this.hasTradeSupportLoanDebt, taxDeclaration.hasTradeSupportLoanDebt)
        && Objects.equals(
            this.upwardVariationTaxWithholdingAmount,
            taxDeclaration.upwardVariationTaxWithholdingAmount)
        && Objects.equals(
            this.eligibleToReceiveLeaveLoading, taxDeclaration.eligibleToReceiveLeaveLoading)
        && Objects.equals(
            this.approvedWithholdingVariationPercentage,
            taxDeclaration.approvedWithholdingVariationPercentage)
        && Objects.equals(this.hasStudentStartupLoan, taxDeclaration.hasStudentStartupLoan)
        && Objects.equals(this.hasLoanOrStudentDebt, taxDeclaration.hasLoanOrStudentDebt)
        && Objects.equals(this.updatedDateUTC, taxDeclaration.updatedDateUTC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        employeeID,
        employmentBasis,
        tfNExemptionType,
        taxFileNumber,
        ABN,
        australianResidentForTaxPurposes,
        residencyStatus,
        taxScaleType,
        workCondition,
        seniorMaritalStatus,
        taxFreeThresholdClaimed,
        taxOffsetEstimatedAmount,
        hasHELPDebt,
        hasSFSSDebt,
        hasTradeSupportLoanDebt,
        upwardVariationTaxWithholdingAmount,
        eligibleToReceiveLeaveLoading,
        approvedWithholdingVariationPercentage,
        hasStudentStartupLoan,
        hasLoanOrStudentDebt,
        updatedDateUTC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxDeclaration {\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    employmentBasis: ").append(toIndentedString(employmentBasis)).append("\n");
    sb.append("    tfNExemptionType: ").append(toIndentedString(tfNExemptionType)).append("\n");
    sb.append("    taxFileNumber: ").append(toIndentedString(taxFileNumber)).append("\n");
    sb.append("    ABN: ").append(toIndentedString(ABN)).append("\n");
    sb.append("    australianResidentForTaxPurposes: ")
        .append(toIndentedString(australianResidentForTaxPurposes))
        .append("\n");
    sb.append("    residencyStatus: ").append(toIndentedString(residencyStatus)).append("\n");
    sb.append("    taxScaleType: ").append(toIndentedString(taxScaleType)).append("\n");
    sb.append("    workCondition: ").append(toIndentedString(workCondition)).append("\n");
    sb.append("    seniorMaritalStatus: ")
        .append(toIndentedString(seniorMaritalStatus))
        .append("\n");
    sb.append("    taxFreeThresholdClaimed: ")
        .append(toIndentedString(taxFreeThresholdClaimed))
        .append("\n");
    sb.append("    taxOffsetEstimatedAmount: ")
        .append(toIndentedString(taxOffsetEstimatedAmount))
        .append("\n");
    sb.append("    hasHELPDebt: ").append(toIndentedString(hasHELPDebt)).append("\n");
    sb.append("    hasSFSSDebt: ").append(toIndentedString(hasSFSSDebt)).append("\n");
    sb.append("    hasTradeSupportLoanDebt: ")
        .append(toIndentedString(hasTradeSupportLoanDebt))
        .append("\n");
    sb.append("    upwardVariationTaxWithholdingAmount: ")
        .append(toIndentedString(upwardVariationTaxWithholdingAmount))
        .append("\n");
    sb.append("    eligibleToReceiveLeaveLoading: ")
        .append(toIndentedString(eligibleToReceiveLeaveLoading))
        .append("\n");
    sb.append("    approvedWithholdingVariationPercentage: ")
        .append(toIndentedString(approvedWithholdingVariationPercentage))
        .append("\n");
    sb.append("    hasStudentStartupLoan: ")
        .append(toIndentedString(hasStudentStartupLoan))
        .append("\n");
    sb.append("    hasLoanOrStudentDebt: ")
        .append(toIndentedString(hasLoanOrStudentDebt))
        .append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
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

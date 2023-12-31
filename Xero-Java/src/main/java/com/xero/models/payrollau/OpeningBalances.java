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
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.ZoneId;

/** OpeningBalances */
public class OpeningBalances {
  StringUtil util = new StringUtil();

  @JsonProperty("OpeningBalanceDate")
  private String openingBalanceDate;

  @JsonProperty("Tax")
  private String tax;

  @JsonProperty("EarningsLines")
  private List<EarningsLine> earningsLines = new ArrayList<EarningsLine>();

  @JsonProperty("DeductionLines")
  private List<DeductionLine> deductionLines = new ArrayList<DeductionLine>();

  @JsonProperty("SuperLines")
  private List<SuperLine> superLines = new ArrayList<SuperLine>();

  @JsonProperty("ReimbursementLines")
  private List<ReimbursementLine> reimbursementLines = new ArrayList<ReimbursementLine>();

  @JsonProperty("LeaveLines")
  private List<LeaveLine> leaveLines = new ArrayList<LeaveLine>();

  @JsonProperty("PaidLeaveEarningsLines")
  private List<PaidLeaveEarningsLine> paidLeaveEarningsLines =
      new ArrayList<PaidLeaveEarningsLine>();
  /**
   * Opening Balance Date. (YYYY-MM-DD)
   *
   * @param openingBalanceDate String
   * @return OpeningBalances
   */
  public OpeningBalances openingBalanceDate(String openingBalanceDate) {
    this.openingBalanceDate = openingBalanceDate;
    return this;
  }

  /**
   * Opening Balance Date. (YYYY-MM-DD)
   *
   * @return openingBalanceDate
   */
  @ApiModelProperty(
      example = "/Date(322560000000+0000)/",
      value = "Opening Balance Date. (YYYY-MM-DD)")
  /**
   * Opening Balance Date. (YYYY-MM-DD)
   *
   * @return openingBalanceDate String
   */
  public String getOpeningBalanceDate() {
    return openingBalanceDate;
  }
  /**
   * Opening Balance Date. (YYYY-MM-DD)
   *
   * @return LocalDate
   */
  public LocalDate getOpeningBalanceDateAsDate() {
    if (this.openingBalanceDate != null) {
      try {
        return util.convertStringToDate(this.openingBalanceDate);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  /**
   * Opening Balance Date. (YYYY-MM-DD)
   *
   * @param openingBalanceDate String
   */
  public void setOpeningBalanceDate(String openingBalanceDate) {
    this.openingBalanceDate = openingBalanceDate;
  }

  /**
   * Opening Balance Date. (YYYY-MM-DD)
   *
   * @param openingBalanceDate LocalDateTime
   */
  public void setOpeningBalanceDate(LocalDate openingBalanceDate) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = openingBalanceDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.openingBalanceDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  /**
   * Opening Balance tax
   *
   * @param tax String
   * @return OpeningBalances
   */
  public OpeningBalances tax(String tax) {
    this.tax = tax;
    return this;
  }

  /**
   * Opening Balance tax
   *
   * @return tax
   */
  @ApiModelProperty(example = "4333d5cd-53a5-4c31-98e5-a8b4e5676b0b", value = "Opening Balance tax")
  /**
   * Opening Balance tax
   *
   * @return tax String
   */
  public String getTax() {
    return tax;
  }

  /**
   * Opening Balance tax
   *
   * @param tax String
   */
  public void setTax(String tax) {
    this.tax = tax;
  }

  /**
   * earningsLines
   *
   * @param earningsLines List&lt;EarningsLine&gt;
   * @return OpeningBalances
   */
  public OpeningBalances earningsLines(List<EarningsLine> earningsLines) {
    this.earningsLines = earningsLines;
    return this;
  }

  /**
   * earningsLines
   *
   * @param earningsLinesItem EarningsLine
   * @return OpeningBalances
   */
  public OpeningBalances addEarningsLinesItem(EarningsLine earningsLinesItem) {
    if (this.earningsLines == null) {
      this.earningsLines = new ArrayList<EarningsLine>();
    }
    this.earningsLines.add(earningsLinesItem);
    return this;
  }

  /**
   * Get earningsLines
   *
   * @return earningsLines
   */
  @ApiModelProperty(value = "")
  /**
   * earningsLines
   *
   * @return earningsLines List<EarningsLine>
   */
  public List<EarningsLine> getEarningsLines() {
    return earningsLines;
  }

  /**
   * earningsLines
   *
   * @param earningsLines List&lt;EarningsLine&gt;
   */
  public void setEarningsLines(List<EarningsLine> earningsLines) {
    this.earningsLines = earningsLines;
  }

  /**
   * deductionLines
   *
   * @param deductionLines List&lt;DeductionLine&gt;
   * @return OpeningBalances
   */
  public OpeningBalances deductionLines(List<DeductionLine> deductionLines) {
    this.deductionLines = deductionLines;
    return this;
  }

  /**
   * deductionLines
   *
   * @param deductionLinesItem DeductionLine
   * @return OpeningBalances
   */
  public OpeningBalances addDeductionLinesItem(DeductionLine deductionLinesItem) {
    if (this.deductionLines == null) {
      this.deductionLines = new ArrayList<DeductionLine>();
    }
    this.deductionLines.add(deductionLinesItem);
    return this;
  }

  /**
   * Get deductionLines
   *
   * @return deductionLines
   */
  @ApiModelProperty(value = "")
  /**
   * deductionLines
   *
   * @return deductionLines List<DeductionLine>
   */
  public List<DeductionLine> getDeductionLines() {
    return deductionLines;
  }

  /**
   * deductionLines
   *
   * @param deductionLines List&lt;DeductionLine&gt;
   */
  public void setDeductionLines(List<DeductionLine> deductionLines) {
    this.deductionLines = deductionLines;
  }

  /**
   * superLines
   *
   * @param superLines List&lt;SuperLine&gt;
   * @return OpeningBalances
   */
  public OpeningBalances superLines(List<SuperLine> superLines) {
    this.superLines = superLines;
    return this;
  }

  /**
   * superLines
   *
   * @param superLinesItem SuperLine
   * @return OpeningBalances
   */
  public OpeningBalances addSuperLinesItem(SuperLine superLinesItem) {
    if (this.superLines == null) {
      this.superLines = new ArrayList<SuperLine>();
    }
    this.superLines.add(superLinesItem);
    return this;
  }

  /**
   * Get superLines
   *
   * @return superLines
   */
  @ApiModelProperty(value = "")
  /**
   * superLines
   *
   * @return superLines List<SuperLine>
   */
  public List<SuperLine> getSuperLines() {
    return superLines;
  }

  /**
   * superLines
   *
   * @param superLines List&lt;SuperLine&gt;
   */
  public void setSuperLines(List<SuperLine> superLines) {
    this.superLines = superLines;
  }

  /**
   * reimbursementLines
   *
   * @param reimbursementLines List&lt;ReimbursementLine&gt;
   * @return OpeningBalances
   */
  public OpeningBalances reimbursementLines(List<ReimbursementLine> reimbursementLines) {
    this.reimbursementLines = reimbursementLines;
    return this;
  }

  /**
   * reimbursementLines
   *
   * @param reimbursementLinesItem ReimbursementLine
   * @return OpeningBalances
   */
  public OpeningBalances addReimbursementLinesItem(ReimbursementLine reimbursementLinesItem) {
    if (this.reimbursementLines == null) {
      this.reimbursementLines = new ArrayList<ReimbursementLine>();
    }
    this.reimbursementLines.add(reimbursementLinesItem);
    return this;
  }

  /**
   * Get reimbursementLines
   *
   * @return reimbursementLines
   */
  @ApiModelProperty(value = "")
  /**
   * reimbursementLines
   *
   * @return reimbursementLines List<ReimbursementLine>
   */
  public List<ReimbursementLine> getReimbursementLines() {
    return reimbursementLines;
  }

  /**
   * reimbursementLines
   *
   * @param reimbursementLines List&lt;ReimbursementLine&gt;
   */
  public void setReimbursementLines(List<ReimbursementLine> reimbursementLines) {
    this.reimbursementLines = reimbursementLines;
  }

  /**
   * leaveLines
   *
   * @param leaveLines List&lt;LeaveLine&gt;
   * @return OpeningBalances
   */
  public OpeningBalances leaveLines(List<LeaveLine> leaveLines) {
    this.leaveLines = leaveLines;
    return this;
  }

  /**
   * leaveLines
   *
   * @param leaveLinesItem LeaveLine
   * @return OpeningBalances
   */
  public OpeningBalances addLeaveLinesItem(LeaveLine leaveLinesItem) {
    if (this.leaveLines == null) {
      this.leaveLines = new ArrayList<LeaveLine>();
    }
    this.leaveLines.add(leaveLinesItem);
    return this;
  }

  /**
   * Get leaveLines
   *
   * @return leaveLines
   */
  @ApiModelProperty(value = "")
  /**
   * leaveLines
   *
   * @return leaveLines List<LeaveLine>
   */
  public List<LeaveLine> getLeaveLines() {
    return leaveLines;
  }

  /**
   * leaveLines
   *
   * @param leaveLines List&lt;LeaveLine&gt;
   */
  public void setLeaveLines(List<LeaveLine> leaveLines) {
    this.leaveLines = leaveLines;
  }

  /**
   * paidLeaveEarningsLines
   *
   * @param paidLeaveEarningsLines List&lt;PaidLeaveEarningsLine&gt;
   * @return OpeningBalances
   */
  public OpeningBalances paidLeaveEarningsLines(
      List<PaidLeaveEarningsLine> paidLeaveEarningsLines) {
    this.paidLeaveEarningsLines = paidLeaveEarningsLines;
    return this;
  }

  /**
   * paidLeaveEarningsLines
   *
   * @param paidLeaveEarningsLinesItem PaidLeaveEarningsLine
   * @return OpeningBalances
   */
  public OpeningBalances addPaidLeaveEarningsLinesItem(
      PaidLeaveEarningsLine paidLeaveEarningsLinesItem) {
    if (this.paidLeaveEarningsLines == null) {
      this.paidLeaveEarningsLines = new ArrayList<PaidLeaveEarningsLine>();
    }
    this.paidLeaveEarningsLines.add(paidLeaveEarningsLinesItem);
    return this;
  }

  /**
   * Get paidLeaveEarningsLines
   *
   * @return paidLeaveEarningsLines
   */
  @ApiModelProperty(value = "")
  /**
   * paidLeaveEarningsLines
   *
   * @return paidLeaveEarningsLines List<PaidLeaveEarningsLine>
   */
  public List<PaidLeaveEarningsLine> getPaidLeaveEarningsLines() {
    return paidLeaveEarningsLines;
  }

  /**
   * paidLeaveEarningsLines
   *
   * @param paidLeaveEarningsLines List&lt;PaidLeaveEarningsLine&gt;
   */
  public void setPaidLeaveEarningsLines(List<PaidLeaveEarningsLine> paidLeaveEarningsLines) {
    this.paidLeaveEarningsLines = paidLeaveEarningsLines;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpeningBalances openingBalances = (OpeningBalances) o;
    return Objects.equals(this.openingBalanceDate, openingBalances.openingBalanceDate)
        && Objects.equals(this.tax, openingBalances.tax)
        && Objects.equals(this.earningsLines, openingBalances.earningsLines)
        && Objects.equals(this.deductionLines, openingBalances.deductionLines)
        && Objects.equals(this.superLines, openingBalances.superLines)
        && Objects.equals(this.reimbursementLines, openingBalances.reimbursementLines)
        && Objects.equals(this.leaveLines, openingBalances.leaveLines)
        && Objects.equals(this.paidLeaveEarningsLines, openingBalances.paidLeaveEarningsLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        openingBalanceDate,
        tax,
        earningsLines,
        deductionLines,
        superLines,
        reimbursementLines,
        leaveLines,
        paidLeaveEarningsLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpeningBalances {\n");
    sb.append("    openingBalanceDate: ").append(toIndentedString(openingBalanceDate)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    earningsLines: ").append(toIndentedString(earningsLines)).append("\n");
    sb.append("    deductionLines: ").append(toIndentedString(deductionLines)).append("\n");
    sb.append("    superLines: ").append(toIndentedString(superLines)).append("\n");
    sb.append("    reimbursementLines: ").append(toIndentedString(reimbursementLines)).append("\n");
    sb.append("    leaveLines: ").append(toIndentedString(leaveLines)).append("\n");
    sb.append("    paidLeaveEarningsLines: ")
        .append(toIndentedString(paidLeaveEarningsLines))
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

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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ReportWithRows */
public class ReportWithRows {
  StringUtil util = new StringUtil();

  @JsonProperty("Reports")
  private List<ReportWithRow> reports = new ArrayList<ReportWithRow>();
  /**
   * reports
   *
   * @param reports List&lt;ReportWithRow&gt;
   * @return ReportWithRows
   */
  public ReportWithRows reports(List<ReportWithRow> reports) {
    this.reports = reports;
    return this;
  }

  /**
   * reports
   *
   * @param reportsItem ReportWithRow
   * @return ReportWithRows
   */
  public ReportWithRows addReportsItem(ReportWithRow reportsItem) {
    if (this.reports == null) {
      this.reports = new ArrayList<ReportWithRow>();
    }
    this.reports.add(reportsItem);
    return this;
  }

  /**
   * Get reports
   *
   * @return reports
   */
  @ApiModelProperty(value = "")
  /**
   * reports
   *
   * @return reports List<ReportWithRow>
   */
  public List<ReportWithRow> getReports() {
    return reports;
  }

  /**
   * reports
   *
   * @param reports List&lt;ReportWithRow&gt;
   */
  public void setReports(List<ReportWithRow> reports) {
    this.reports = reports;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportWithRows reportWithRows = (ReportWithRows) o;
    return Objects.equals(this.reports, reportWithRows.reports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportWithRows {\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
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
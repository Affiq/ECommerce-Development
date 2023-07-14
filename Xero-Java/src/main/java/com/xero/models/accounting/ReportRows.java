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

/** ReportRows */
public class ReportRows {
  StringUtil util = new StringUtil();

  @JsonProperty("RowType")
  private RowType rowType;

  @JsonProperty("Title")
  private String title;

  @JsonProperty("Cells")
  private List<ReportCell> cells = new ArrayList<ReportCell>();

  @JsonProperty("Rows")
  private List<ReportRow> rows = new ArrayList<ReportRow>();
  /**
   * rowType
   *
   * @param rowType RowType
   * @return ReportRows
   */
  public ReportRows rowType(RowType rowType) {
    this.rowType = rowType;
    return this;
  }

  /**
   * Get rowType
   *
   * @return rowType
   */
  @ApiModelProperty(value = "")
  /**
   * rowType
   *
   * @return rowType RowType
   */
  public RowType getRowType() {
    return rowType;
  }

  /**
   * rowType
   *
   * @param rowType RowType
   */
  public void setRowType(RowType rowType) {
    this.rowType = rowType;
  }

  /**
   * title
   *
   * @param title String
   * @return ReportRows
   */
  public ReportRows title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   *
   * @return title
   */
  @ApiModelProperty(value = "")
  /**
   * title
   *
   * @return title String
   */
  public String getTitle() {
    return title;
  }

  /**
   * title
   *
   * @param title String
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * cells
   *
   * @param cells List&lt;ReportCell&gt;
   * @return ReportRows
   */
  public ReportRows cells(List<ReportCell> cells) {
    this.cells = cells;
    return this;
  }

  /**
   * cells
   *
   * @param cellsItem ReportCell
   * @return ReportRows
   */
  public ReportRows addCellsItem(ReportCell cellsItem) {
    if (this.cells == null) {
      this.cells = new ArrayList<ReportCell>();
    }
    this.cells.add(cellsItem);
    return this;
  }

  /**
   * Get cells
   *
   * @return cells
   */
  @ApiModelProperty(value = "")
  /**
   * cells
   *
   * @return cells List<ReportCell>
   */
  public List<ReportCell> getCells() {
    return cells;
  }

  /**
   * cells
   *
   * @param cells List&lt;ReportCell&gt;
   */
  public void setCells(List<ReportCell> cells) {
    this.cells = cells;
  }

  /**
   * rows
   *
   * @param rows List&lt;ReportRow&gt;
   * @return ReportRows
   */
  public ReportRows rows(List<ReportRow> rows) {
    this.rows = rows;
    return this;
  }

  /**
   * rows
   *
   * @param rowsItem ReportRow
   * @return ReportRows
   */
  public ReportRows addRowsItem(ReportRow rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<ReportRow>();
    }
    this.rows.add(rowsItem);
    return this;
  }

  /**
   * Get rows
   *
   * @return rows
   */
  @ApiModelProperty(value = "")
  /**
   * rows
   *
   * @return rows List<ReportRow>
   */
  public List<ReportRow> getRows() {
    return rows;
  }

  /**
   * rows
   *
   * @param rows List&lt;ReportRow&gt;
   */
  public void setRows(List<ReportRow> rows) {
    this.rows = rows;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportRows reportRows = (ReportRows) o;
    return Objects.equals(this.rowType, reportRows.rowType)
        && Objects.equals(this.title, reportRows.title)
        && Objects.equals(this.cells, reportRows.cells)
        && Objects.equals(this.rows, reportRows.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowType, title, cells, rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRows {\n");
    sb.append("    rowType: ").append(toIndentedString(rowType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

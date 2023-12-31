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

/** CashflowActivity */
public class CashflowActivity {
  StringUtil util = new StringUtil();

  @JsonProperty("name")
  private String name;

  @JsonProperty("total")
  private Double total;

  @JsonProperty("cashflowTypes")
  private List<CashflowType> cashflowTypes = new ArrayList<CashflowType>();
  /**
   * Name of the cashflow activity type. It will be either Operating Activities, Investing
   * Activities or Financing Activities
   *
   * @param name String
   * @return CashflowActivity
   */
  public CashflowActivity name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the cashflow activity type. It will be either Operating Activities, Investing
   * Activities or Financing Activities
   *
   * @return name
   */
  @ApiModelProperty(
      value =
          "Name of the cashflow activity type. It will be either Operating Activities, Investing"
              + " Activities or Financing Activities")
  /**
   * Name of the cashflow activity type. It will be either Operating Activities, Investing
   * Activities or Financing Activities
   *
   * @return name String
   */
  public String getName() {
    return name;
  }

  /**
   * Name of the cashflow activity type. It will be either Operating Activities, Investing
   * Activities or Financing Activities
   *
   * @param name String
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Total value of the activity type
   *
   * @param total Double
   * @return CashflowActivity
   */
  public CashflowActivity total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * Total value of the activity type
   *
   * @return total
   */
  @ApiModelProperty(value = "Total value of the activity type")
  /**
   * Total value of the activity type
   *
   * @return total Double
   */
  public Double getTotal() {
    return total;
  }

  /**
   * Total value of the activity type
   *
   * @param total Double
   */
  public void setTotal(Double total) {
    this.total = total;
  }

  /**
   * cashflowTypes
   *
   * @param cashflowTypes List&lt;CashflowType&gt;
   * @return CashflowActivity
   */
  public CashflowActivity cashflowTypes(List<CashflowType> cashflowTypes) {
    this.cashflowTypes = cashflowTypes;
    return this;
  }

  /**
   * cashflowTypes
   *
   * @param cashflowTypesItem CashflowType
   * @return CashflowActivity
   */
  public CashflowActivity addCashflowTypesItem(CashflowType cashflowTypesItem) {
    if (this.cashflowTypes == null) {
      this.cashflowTypes = new ArrayList<CashflowType>();
    }
    this.cashflowTypes.add(cashflowTypesItem);
    return this;
  }

  /**
   * Get cashflowTypes
   *
   * @return cashflowTypes
   */
  @ApiModelProperty(value = "")
  /**
   * cashflowTypes
   *
   * @return cashflowTypes List<CashflowType>
   */
  public List<CashflowType> getCashflowTypes() {
    return cashflowTypes;
  }

  /**
   * cashflowTypes
   *
   * @param cashflowTypes List&lt;CashflowType&gt;
   */
  public void setCashflowTypes(List<CashflowType> cashflowTypes) {
    this.cashflowTypes = cashflowTypes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashflowActivity cashflowActivity = (CashflowActivity) o;
    return Objects.equals(this.name, cashflowActivity.name)
        && Objects.equals(this.total, cashflowActivity.total)
        && Objects.equals(this.cashflowTypes, cashflowActivity.cashflowTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, total, cashflowTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashflowActivity {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    cashflowTypes: ").append(toIndentedString(cashflowTypes)).append("\n");
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

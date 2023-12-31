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

/** PnlAccountClass */
public class PnlAccountClass {
  StringUtil util = new StringUtil();

  @JsonProperty("total")
  private Double total;

  @JsonProperty("accountTypes")
  private List<PnlAccountType> accountTypes = new ArrayList<PnlAccountType>();
  /**
   * Total revenue/expense value
   *
   * @param total Double
   * @return PnlAccountClass
   */
  public PnlAccountClass total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * Total revenue/expense value
   *
   * @return total
   */
  @ApiModelProperty(value = "Total revenue/expense value")
  /**
   * Total revenue/expense value
   *
   * @return total Double
   */
  public Double getTotal() {
    return total;
  }

  /**
   * Total revenue/expense value
   *
   * @param total Double
   */
  public void setTotal(Double total) {
    this.total = total;
  }

  /**
   * Contains trading income and other income for revenue section / operating expenses and direct
   * cost for expense section if the data is available for each section. Refer to the account type
   * element below
   *
   * @param accountTypes List&lt;PnlAccountType&gt;
   * @return PnlAccountClass
   */
  public PnlAccountClass accountTypes(List<PnlAccountType> accountTypes) {
    this.accountTypes = accountTypes;
    return this;
  }

  /**
   * Contains trading income and other income for revenue section / operating expenses and direct
   * cost for expense section if the data is available for each section. Refer to the account type
   * element below
   *
   * @param accountTypesItem PnlAccountType
   * @return PnlAccountClass
   */
  public PnlAccountClass addAccountTypesItem(PnlAccountType accountTypesItem) {
    if (this.accountTypes == null) {
      this.accountTypes = new ArrayList<PnlAccountType>();
    }
    this.accountTypes.add(accountTypesItem);
    return this;
  }

  /**
   * Contains trading income and other income for revenue section / operating expenses and direct
   * cost for expense section if the data is available for each section. Refer to the account type
   * element below
   *
   * @return accountTypes
   */
  @ApiModelProperty(
      value =
          "Contains trading income and other income for revenue section / operating expenses and"
              + " direct cost for expense section if the data is available for each section. Refer"
              + " to the account type element below")
  /**
   * Contains trading income and other income for revenue section / operating expenses and direct
   * cost for expense section if the data is available for each section. Refer to the account type
   * element below
   *
   * @return accountTypes List<PnlAccountType>
   */
  public List<PnlAccountType> getAccountTypes() {
    return accountTypes;
  }

  /**
   * Contains trading income and other income for revenue section / operating expenses and direct
   * cost for expense section if the data is available for each section. Refer to the account type
   * element below
   *
   * @param accountTypes List&lt;PnlAccountType&gt;
   */
  public void setAccountTypes(List<PnlAccountType> accountTypes) {
    this.accountTypes = accountTypes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PnlAccountClass pnlAccountClass = (PnlAccountClass) o;
    return Objects.equals(this.total, pnlAccountClass.total)
        && Objects.equals(this.accountTypes, pnlAccountClass.accountTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, accountTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PnlAccountClass {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    accountTypes: ").append(toIndentedString(accountTypes)).append("\n");
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

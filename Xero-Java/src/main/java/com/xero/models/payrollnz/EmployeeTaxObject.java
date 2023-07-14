/*
 * Xero Payroll NZ
 * This is the Xero Payroll API for orgs in the NZ region.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollnz;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** EmployeeTaxObject */
public class EmployeeTaxObject {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("problem")
  private Problem problem;

  @JsonProperty("employeeTax")
  private EmployeeTax employeeTax;
  /**
   * pagination
   *
   * @param pagination Pagination
   * @return EmployeeTaxObject
   */
  public EmployeeTaxObject pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   *
   * @return pagination
   */
  @ApiModelProperty(value = "")
  /**
   * pagination
   *
   * @return pagination Pagination
   */
  public Pagination getPagination() {
    return pagination;
  }

  /**
   * pagination
   *
   * @param pagination Pagination
   */
  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  /**
   * problem
   *
   * @param problem Problem
   * @return EmployeeTaxObject
   */
  public EmployeeTaxObject problem(Problem problem) {
    this.problem = problem;
    return this;
  }

  /**
   * Get problem
   *
   * @return problem
   */
  @ApiModelProperty(value = "")
  /**
   * problem
   *
   * @return problem Problem
   */
  public Problem getProblem() {
    return problem;
  }

  /**
   * problem
   *
   * @param problem Problem
   */
  public void setProblem(Problem problem) {
    this.problem = problem;
  }

  /**
   * employeeTax
   *
   * @param employeeTax EmployeeTax
   * @return EmployeeTaxObject
   */
  public EmployeeTaxObject employeeTax(EmployeeTax employeeTax) {
    this.employeeTax = employeeTax;
    return this;
  }

  /**
   * Get employeeTax
   *
   * @return employeeTax
   */
  @ApiModelProperty(value = "")
  /**
   * employeeTax
   *
   * @return employeeTax EmployeeTax
   */
  public EmployeeTax getEmployeeTax() {
    return employeeTax;
  }

  /**
   * employeeTax
   *
   * @param employeeTax EmployeeTax
   */
  public void setEmployeeTax(EmployeeTax employeeTax) {
    this.employeeTax = employeeTax;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeTaxObject employeeTaxObject = (EmployeeTaxObject) o;
    return Objects.equals(this.pagination, employeeTaxObject.pagination)
        && Objects.equals(this.problem, employeeTaxObject.problem)
        && Objects.equals(this.employeeTax, employeeTaxObject.employeeTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, employeeTax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeTaxObject {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    employeeTax: ").append(toIndentedString(employeeTax)).append("\n");
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

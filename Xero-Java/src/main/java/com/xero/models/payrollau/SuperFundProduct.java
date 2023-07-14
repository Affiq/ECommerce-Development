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
import java.util.Objects;

/** SuperFundProduct */
public class SuperFundProduct {
  StringUtil util = new StringUtil();

  @JsonProperty("ABN")
  private String ABN;

  @JsonProperty("USI")
  private String USI;

  @JsonProperty("SPIN")
  private String SPIN;

  @JsonProperty("ProductName")
  private String productName;
  /**
   * The ABN of the Regulated SuperFund
   *
   * @param ABN String
   * @return SuperFundProduct
   */
  public SuperFundProduct ABN(String ABN) {
    this.ABN = ABN;
    return this;
  }

  /**
   * The ABN of the Regulated SuperFund
   *
   * @return ABN
   */
  @ApiModelProperty(example = "839182848805", value = "The ABN of the Regulated SuperFund")
  /**
   * The ABN of the Regulated SuperFund
   *
   * @return ABN String
   */
  public String getABN() {
    return ABN;
  }

  /**
   * The ABN of the Regulated SuperFund
   *
   * @param ABN String
   */
  public void setABN(String ABN) {
    this.ABN = ABN;
  }

  /**
   * The USI of the Regulated SuperFund
   *
   * @param USI String
   * @return SuperFundProduct
   */
  public SuperFundProduct USI(String USI) {
    this.USI = USI;
    return this;
  }

  /**
   * The USI of the Regulated SuperFund
   *
   * @return USI
   */
  @ApiModelProperty(example = "839182848805001", value = "The USI of the Regulated SuperFund")
  /**
   * The USI of the Regulated SuperFund
   *
   * @return USI String
   */
  public String getUSI() {
    return USI;
  }

  /**
   * The USI of the Regulated SuperFund
   *
   * @param USI String
   */
  public void setUSI(String USI) {
    this.USI = USI;
  }

  /**
   * The SPIN of the Regulated SuperFund. This field has been deprecated. New superfunds will not
   * have a SPIN value. The USI field should be used instead of SPIN
   *
   * @param SPIN String
   * @return SuperFundProduct
   */
  public SuperFundProduct SPIN(String SPIN) {
    this.SPIN = SPIN;
    return this;
  }

  /**
   * The SPIN of the Regulated SuperFund. This field has been deprecated. New superfunds will not
   * have a SPIN value. The USI field should be used instead of SPIN
   *
   * @return SPIN
   */
  @ApiModelProperty(
      example = "NML0117AU",
      value =
          "The SPIN of the Regulated SuperFund. This field has been deprecated. New superfunds"
              + " will not have a SPIN value. The USI field should be used instead of SPIN")
  /**
   * The SPIN of the Regulated SuperFund. This field has been deprecated. New superfunds will not
   * have a SPIN value. The USI field should be used instead of SPIN
   *
   * @return SPIN String
   */
  public String getSPIN() {
    return SPIN;
  }

  /**
   * The SPIN of the Regulated SuperFund. This field has been deprecated. New superfunds will not
   * have a SPIN value. The USI field should be used instead of SPIN
   *
   * @param SPIN String
   */
  public void setSPIN(String SPIN) {
    this.SPIN = SPIN;
  }

  /**
   * The name of the Regulated SuperFund
   *
   * @param productName String
   * @return SuperFundProduct
   */
  public SuperFundProduct productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * The name of the Regulated SuperFund
   *
   * @return productName
   */
  @ApiModelProperty(
      example =
          "MLC Navigator Retirement Plan - Superannuation Service (including Series 2) (MLC"
              + " Superannuation Fund)",
      value = "The name of the Regulated SuperFund")
  /**
   * The name of the Regulated SuperFund
   *
   * @return productName String
   */
  public String getProductName() {
    return productName;
  }

  /**
   * The name of the Regulated SuperFund
   *
   * @param productName String
   */
  public void setProductName(String productName) {
    this.productName = productName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuperFundProduct superFundProduct = (SuperFundProduct) o;
    return Objects.equals(this.ABN, superFundProduct.ABN)
        && Objects.equals(this.USI, superFundProduct.USI)
        && Objects.equals(this.SPIN, superFundProduct.SPIN)
        && Objects.equals(this.productName, superFundProduct.productName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ABN, USI, SPIN, productName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuperFundProduct {\n");
    sb.append("    ABN: ").append(toIndentedString(ABN)).append("\n");
    sb.append("    USI: ").append(toIndentedString(USI)).append("\n");
    sb.append("    SPIN: ").append(toIndentedString(SPIN)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
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

/*
 * Xero Assets API
 * The Assets API exposes fixed asset related functions of the Xero Accounting application and can be used for a variety of purposes such as creating assets, retrieving asset valuations etc.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.assets;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.LocalDate;

/** Setting */
public class Setting {
  StringUtil util = new StringUtil();

  @JsonProperty("assetNumberPrefix")
  private String assetNumberPrefix;

  @JsonProperty("assetNumberSequence")
  private String assetNumberSequence;

  @JsonProperty("assetStartDate")
  private LocalDate assetStartDate;

  @JsonProperty("lastDepreciationDate")
  private LocalDate lastDepreciationDate;

  @JsonProperty("defaultGainOnDisposalAccountId")
  private UUID defaultGainOnDisposalAccountId;

  @JsonProperty("defaultLossOnDisposalAccountId")
  private UUID defaultLossOnDisposalAccountId;

  @JsonProperty("defaultCapitalGainOnDisposalAccountId")
  private UUID defaultCapitalGainOnDisposalAccountId;

  @JsonProperty("optInForTax")
  private Boolean optInForTax;
  /**
   * The prefix used for fixed asset numbers (“FA-” by default)
   *
   * @param assetNumberPrefix String
   * @return Setting
   */
  public Setting assetNumberPrefix(String assetNumberPrefix) {
    this.assetNumberPrefix = assetNumberPrefix;
    return this;
  }

  /**
   * The prefix used for fixed asset numbers (“FA-” by default)
   *
   * @return assetNumberPrefix
   */
  @ApiModelProperty(
      example = "FA-",
      value = "The prefix used for fixed asset numbers (“FA-” by default)")
  /**
   * The prefix used for fixed asset numbers (“FA-” by default)
   *
   * @return assetNumberPrefix String
   */
  public String getAssetNumberPrefix() {
    return assetNumberPrefix;
  }

  /**
   * The prefix used for fixed asset numbers (“FA-” by default)
   *
   * @param assetNumberPrefix String
   */
  public void setAssetNumberPrefix(String assetNumberPrefix) {
    this.assetNumberPrefix = assetNumberPrefix;
  }

  /**
   * The next available sequence number
   *
   * @param assetNumberSequence String
   * @return Setting
   */
  public Setting assetNumberSequence(String assetNumberSequence) {
    this.assetNumberSequence = assetNumberSequence;
    return this;
  }

  /**
   * The next available sequence number
   *
   * @return assetNumberSequence
   */
  @ApiModelProperty(example = "0022", value = "The next available sequence number")
  /**
   * The next available sequence number
   *
   * @return assetNumberSequence String
   */
  public String getAssetNumberSequence() {
    return assetNumberSequence;
  }

  /**
   * The next available sequence number
   *
   * @param assetNumberSequence String
   */
  public void setAssetNumberSequence(String assetNumberSequence) {
    this.assetNumberSequence = assetNumberSequence;
  }

  /**
   * The date depreciation calculations started on registered fixed assets in Xero
   *
   * @param assetStartDate LocalDate
   * @return Setting
   */
  public Setting assetStartDate(LocalDate assetStartDate) {
    this.assetStartDate = assetStartDate;
    return this;
  }

  /**
   * The date depreciation calculations started on registered fixed assets in Xero
   *
   * @return assetStartDate
   */
  @ApiModelProperty(
      value = "The date depreciation calculations started on registered fixed assets in Xero")
  /**
   * The date depreciation calculations started on registered fixed assets in Xero
   *
   * @return assetStartDate LocalDate
   */
  public LocalDate getAssetStartDate() {
    return assetStartDate;
  }

  /**
   * The date depreciation calculations started on registered fixed assets in Xero
   *
   * @param assetStartDate LocalDate
   */
  public void setAssetStartDate(LocalDate assetStartDate) {
    this.assetStartDate = assetStartDate;
  }

  /**
   * The last depreciation date
   *
   * @param lastDepreciationDate LocalDate
   * @return Setting
   */
  public Setting lastDepreciationDate(LocalDate lastDepreciationDate) {
    this.lastDepreciationDate = lastDepreciationDate;
    return this;
  }

  /**
   * The last depreciation date
   *
   * @return lastDepreciationDate
   */
  @ApiModelProperty(value = "The last depreciation date")
  /**
   * The last depreciation date
   *
   * @return lastDepreciationDate LocalDate
   */
  public LocalDate getLastDepreciationDate() {
    return lastDepreciationDate;
  }

  /**
   * The last depreciation date
   *
   * @param lastDepreciationDate LocalDate
   */
  public void setLastDepreciationDate(LocalDate lastDepreciationDate) {
    this.lastDepreciationDate = lastDepreciationDate;
  }

  /**
   * Default account that gains are posted to
   *
   * @param defaultGainOnDisposalAccountId UUID
   * @return Setting
   */
  public Setting defaultGainOnDisposalAccountId(UUID defaultGainOnDisposalAccountId) {
    this.defaultGainOnDisposalAccountId = defaultGainOnDisposalAccountId;
    return this;
  }

  /**
   * Default account that gains are posted to
   *
   * @return defaultGainOnDisposalAccountId
   */
  @ApiModelProperty(
      example = "346ddb97-739a-4274-b43b-66aa3218d17c",
      value = "Default account that gains are posted to")
  /**
   * Default account that gains are posted to
   *
   * @return defaultGainOnDisposalAccountId UUID
   */
  public UUID getDefaultGainOnDisposalAccountId() {
    return defaultGainOnDisposalAccountId;
  }

  /**
   * Default account that gains are posted to
   *
   * @param defaultGainOnDisposalAccountId UUID
   */
  public void setDefaultGainOnDisposalAccountId(UUID defaultGainOnDisposalAccountId) {
    this.defaultGainOnDisposalAccountId = defaultGainOnDisposalAccountId;
  }

  /**
   * Default account that losses are posted to
   *
   * @param defaultLossOnDisposalAccountId UUID
   * @return Setting
   */
  public Setting defaultLossOnDisposalAccountId(UUID defaultLossOnDisposalAccountId) {
    this.defaultLossOnDisposalAccountId = defaultLossOnDisposalAccountId;
    return this;
  }

  /**
   * Default account that losses are posted to
   *
   * @return defaultLossOnDisposalAccountId
   */
  @ApiModelProperty(
      example = "1b798541-24e2-4855-9309-c023a0b576f3",
      value = "Default account that losses are posted to")
  /**
   * Default account that losses are posted to
   *
   * @return defaultLossOnDisposalAccountId UUID
   */
  public UUID getDefaultLossOnDisposalAccountId() {
    return defaultLossOnDisposalAccountId;
  }

  /**
   * Default account that losses are posted to
   *
   * @param defaultLossOnDisposalAccountId UUID
   */
  public void setDefaultLossOnDisposalAccountId(UUID defaultLossOnDisposalAccountId) {
    this.defaultLossOnDisposalAccountId = defaultLossOnDisposalAccountId;
  }

  /**
   * Default account that capital gains are posted to
   *
   * @param defaultCapitalGainOnDisposalAccountId UUID
   * @return Setting
   */
  public Setting defaultCapitalGainOnDisposalAccountId(UUID defaultCapitalGainOnDisposalAccountId) {
    this.defaultCapitalGainOnDisposalAccountId = defaultCapitalGainOnDisposalAccountId;
    return this;
  }

  /**
   * Default account that capital gains are posted to
   *
   * @return defaultCapitalGainOnDisposalAccountId
   */
  @ApiModelProperty(
      example = "6d6a0bdb-e118-45d8-a023-2ad617ec1cb7",
      value = "Default account that capital gains are posted to")
  /**
   * Default account that capital gains are posted to
   *
   * @return defaultCapitalGainOnDisposalAccountId UUID
   */
  public UUID getDefaultCapitalGainOnDisposalAccountId() {
    return defaultCapitalGainOnDisposalAccountId;
  }

  /**
   * Default account that capital gains are posted to
   *
   * @param defaultCapitalGainOnDisposalAccountId UUID
   */
  public void setDefaultCapitalGainOnDisposalAccountId(UUID defaultCapitalGainOnDisposalAccountId) {
    this.defaultCapitalGainOnDisposalAccountId = defaultCapitalGainOnDisposalAccountId;
  }

  /**
   * opt in for tax calculation
   *
   * @param optInForTax Boolean
   * @return Setting
   */
  public Setting optInForTax(Boolean optInForTax) {
    this.optInForTax = optInForTax;
    return this;
  }

  /**
   * opt in for tax calculation
   *
   * @return optInForTax
   */
  @ApiModelProperty(example = "false", value = "opt in for tax calculation")
  /**
   * opt in for tax calculation
   *
   * @return optInForTax Boolean
   */
  public Boolean getOptInForTax() {
    return optInForTax;
  }

  /**
   * opt in for tax calculation
   *
   * @param optInForTax Boolean
   */
  public void setOptInForTax(Boolean optInForTax) {
    this.optInForTax = optInForTax;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Setting setting = (Setting) o;
    return Objects.equals(this.assetNumberPrefix, setting.assetNumberPrefix)
        && Objects.equals(this.assetNumberSequence, setting.assetNumberSequence)
        && Objects.equals(this.assetStartDate, setting.assetStartDate)
        && Objects.equals(this.lastDepreciationDate, setting.lastDepreciationDate)
        && Objects.equals(
            this.defaultGainOnDisposalAccountId, setting.defaultGainOnDisposalAccountId)
        && Objects.equals(
            this.defaultLossOnDisposalAccountId, setting.defaultLossOnDisposalAccountId)
        && Objects.equals(
            this.defaultCapitalGainOnDisposalAccountId,
            setting.defaultCapitalGainOnDisposalAccountId)
        && Objects.equals(this.optInForTax, setting.optInForTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assetNumberPrefix,
        assetNumberSequence,
        assetStartDate,
        lastDepreciationDate,
        defaultGainOnDisposalAccountId,
        defaultLossOnDisposalAccountId,
        defaultCapitalGainOnDisposalAccountId,
        optInForTax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Setting {\n");
    sb.append("    assetNumberPrefix: ").append(toIndentedString(assetNumberPrefix)).append("\n");
    sb.append("    assetNumberSequence: ")
        .append(toIndentedString(assetNumberSequence))
        .append("\n");
    sb.append("    assetStartDate: ").append(toIndentedString(assetStartDate)).append("\n");
    sb.append("    lastDepreciationDate: ")
        .append(toIndentedString(lastDepreciationDate))
        .append("\n");
    sb.append("    defaultGainOnDisposalAccountId: ")
        .append(toIndentedString(defaultGainOnDisposalAccountId))
        .append("\n");
    sb.append("    defaultLossOnDisposalAccountId: ")
        .append(toIndentedString(defaultLossOnDisposalAccountId))
        .append("\n");
    sb.append("    defaultCapitalGainOnDisposalAccountId: ")
        .append(toIndentedString(defaultCapitalGainOnDisposalAccountId))
        .append("\n");
    sb.append("    optInForTax: ").append(toIndentedString(optInForTax)).append("\n");
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

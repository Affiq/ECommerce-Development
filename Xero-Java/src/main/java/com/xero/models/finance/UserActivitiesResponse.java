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
import java.util.UUID;

/** UserActivitiesResponse */
public class UserActivitiesResponse {
  StringUtil util = new StringUtil();

  @JsonProperty("organisationId")
  private UUID organisationId;

  @JsonProperty("dataMonth")
  private String dataMonth;

  @JsonProperty("users")
  private List<UserResponse> users = new ArrayList<UserResponse>();
  /**
   * The requested Organisation to which the data pertains
   *
   * @param organisationId UUID
   * @return UserActivitiesResponse
   */
  public UserActivitiesResponse organisationId(UUID organisationId) {
    this.organisationId = organisationId;
    return this;
  }

  /**
   * The requested Organisation to which the data pertains
   *
   * @return organisationId
   */
  @ApiModelProperty(value = "The requested Organisation to which the data pertains")
  /**
   * The requested Organisation to which the data pertains
   *
   * @return organisationId UUID
   */
  public UUID getOrganisationId() {
    return organisationId;
  }

  /**
   * The requested Organisation to which the data pertains
   *
   * @param organisationId UUID
   */
  public void setOrganisationId(UUID organisationId) {
    this.organisationId = organisationId;
  }

  /**
   * The month of the report
   *
   * @param dataMonth String
   * @return UserActivitiesResponse
   */
  public UserActivitiesResponse dataMonth(String dataMonth) {
    this.dataMonth = dataMonth;
    return this;
  }

  /**
   * The month of the report
   *
   * @return dataMonth
   */
  @ApiModelProperty(value = "The month of the report")
  /**
   * The month of the report
   *
   * @return dataMonth String
   */
  public String getDataMonth() {
    return dataMonth;
  }

  /**
   * The month of the report
   *
   * @param dataMonth String
   */
  public void setDataMonth(String dataMonth) {
    this.dataMonth = dataMonth;
  }

  /**
   * users
   *
   * @param users List&lt;UserResponse&gt;
   * @return UserActivitiesResponse
   */
  public UserActivitiesResponse users(List<UserResponse> users) {
    this.users = users;
    return this;
  }

  /**
   * users
   *
   * @param usersItem UserResponse
   * @return UserActivitiesResponse
   */
  public UserActivitiesResponse addUsersItem(UserResponse usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<UserResponse>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   *
   * @return users
   */
  @ApiModelProperty(value = "")
  /**
   * users
   *
   * @return users List<UserResponse>
   */
  public List<UserResponse> getUsers() {
    return users;
  }

  /**
   * users
   *
   * @param users List&lt;UserResponse&gt;
   */
  public void setUsers(List<UserResponse> users) {
    this.users = users;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserActivitiesResponse userActivitiesResponse = (UserActivitiesResponse) o;
    return Objects.equals(this.organisationId, userActivitiesResponse.organisationId)
        && Objects.equals(this.dataMonth, userActivitiesResponse.dataMonth)
        && Objects.equals(this.users, userActivitiesResponse.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationId, dataMonth, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserActivitiesResponse {\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    dataMonth: ").append(toIndentedString(dataMonth)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

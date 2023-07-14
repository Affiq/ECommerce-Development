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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/** ContactGroup */
public class ContactGroup {
  StringUtil util = new StringUtil();

  @JsonProperty("Name")
  private String name;
  /**
   * The Status of a contact group. To delete a contact group update the status to DELETED. Only
   * contact groups with a status of ACTIVE are returned on GETs.
   */
  public enum StatusEnum {
    /** ACTIVE */
    ACTIVE("ACTIVE"),

    /** DELETED */
    DELETED("DELETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    /**
     * getValue
     *
     * @return String value
     */
    @JsonValue
    public String getValue() {
      return value;
    }

    /**
     * toString
     *
     * @return String value
     */
    @Override
    public String toString() {
      return String.valueOf(value);
    }

    /**
     * fromValue
     *
     * @param value String
     */
    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Status")
  private StatusEnum status;

  @JsonProperty("ContactGroupID")
  private UUID contactGroupID;

  @JsonProperty("Contacts")
  private List<Contact> contacts = new ArrayList<Contact>();
  /**
   * The Name of the contact group. Required when creating a new contact group
   *
   * @param name String
   * @return ContactGroup
   */
  public ContactGroup name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The Name of the contact group. Required when creating a new contact group
   *
   * @return name
   */
  @ApiModelProperty(
      value = "The Name of the contact group. Required when creating a new contact  group")
  /**
   * The Name of the contact group. Required when creating a new contact group
   *
   * @return name String
   */
  public String getName() {
    return name;
  }

  /**
   * The Name of the contact group. Required when creating a new contact group
   *
   * @param name String
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The Status of a contact group. To delete a contact group update the status to DELETED. Only
   * contact groups with a status of ACTIVE are returned on GETs.
   *
   * @param status StatusEnum
   * @return ContactGroup
   */
  public ContactGroup status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The Status of a contact group. To delete a contact group update the status to DELETED. Only
   * contact groups with a status of ACTIVE are returned on GETs.
   *
   * @return status
   */
  @ApiModelProperty(
      value =
          "The Status of a contact group. To delete a contact group update the status to DELETED."
              + " Only contact groups with a status of ACTIVE are returned on GETs.")
  /**
   * The Status of a contact group. To delete a contact group update the status to DELETED. Only
   * contact groups with a status of ACTIVE are returned on GETs.
   *
   * @return status StatusEnum
   */
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * The Status of a contact group. To delete a contact group update the status to DELETED. Only
   * contact groups with a status of ACTIVE are returned on GETs.
   *
   * @param status StatusEnum
   */
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * The Xero identifier for an contact group – specified as a string following the endpoint name.
   * e.g. /297c2dc5-cc47-4afd-8ec8-74990b8761e9
   *
   * @param contactGroupID UUID
   * @return ContactGroup
   */
  public ContactGroup contactGroupID(UUID contactGroupID) {
    this.contactGroupID = contactGroupID;
    return this;
  }

  /**
   * The Xero identifier for an contact group – specified as a string following the endpoint name.
   * e.g. /297c2dc5-cc47-4afd-8ec8-74990b8761e9
   *
   * @return contactGroupID
   */
  @ApiModelProperty(
      value =
          "The Xero identifier for an contact group – specified as a string following the endpoint"
              + " name. e.g. /297c2dc5-cc47-4afd-8ec8-74990b8761e9")
  /**
   * The Xero identifier for an contact group – specified as a string following the endpoint name.
   * e.g. /297c2dc5-cc47-4afd-8ec8-74990b8761e9
   *
   * @return contactGroupID UUID
   */
  public UUID getContactGroupID() {
    return contactGroupID;
  }

  /**
   * The Xero identifier for an contact group – specified as a string following the endpoint name.
   * e.g. /297c2dc5-cc47-4afd-8ec8-74990b8761e9
   *
   * @param contactGroupID UUID
   */
  public void setContactGroupID(UUID contactGroupID) {
    this.contactGroupID = contactGroupID;
  }

  /**
   * The ContactID and Name of Contacts in a contact group. Returned on GETs when the ContactGroupID
   * is supplied in the URL.
   *
   * @param contacts List&lt;Contact&gt;
   * @return ContactGroup
   */
  public ContactGroup contacts(List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  /**
   * The ContactID and Name of Contacts in a contact group. Returned on GETs when the ContactGroupID
   * is supplied in the URL.
   *
   * @param contactsItem Contact
   * @return ContactGroup
   */
  public ContactGroup addContactsItem(Contact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<Contact>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

  /**
   * The ContactID and Name of Contacts in a contact group. Returned on GETs when the ContactGroupID
   * is supplied in the URL.
   *
   * @return contacts
   */
  @ApiModelProperty(
      value =
          "The ContactID and Name of Contacts in a contact group. Returned on GETs when the"
              + " ContactGroupID is supplied in the URL.")
  /**
   * The ContactID and Name of Contacts in a contact group. Returned on GETs when the ContactGroupID
   * is supplied in the URL.
   *
   * @return contacts List<Contact>
   */
  public List<Contact> getContacts() {
    return contacts;
  }

  /**
   * The ContactID and Name of Contacts in a contact group. Returned on GETs when the ContactGroupID
   * is supplied in the URL.
   *
   * @param contacts List&lt;Contact&gt;
   */
  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactGroup contactGroup = (ContactGroup) o;
    return Objects.equals(this.name, contactGroup.name)
        && Objects.equals(this.status, contactGroup.status)
        && Objects.equals(this.contactGroupID, contactGroup.contactGroupID)
        && Objects.equals(this.contacts, contactGroup.contacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, contactGroupID, contacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactGroup {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    contactGroupID: ").append(toIndentedString(contactGroupID)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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
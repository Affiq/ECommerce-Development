/*
 * Xero Files API
 * These endpoints are specific to Xero Files API
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.file;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** FileObject */
public class FileObject {
  StringUtil util = new StringUtil();

  @JsonProperty("Name")
  private String name;

  @JsonProperty("MimeType")
  private String mimeType;

  @JsonProperty("Size")
  private Integer size;

  @JsonProperty("CreatedDateUtc")
  private String createdDateUtc;

  @JsonProperty("UpdatedDateUtc")
  private String updatedDateUtc;

  @JsonProperty("User")
  private User user;

  @JsonProperty("Id")
  private UUID id;

  @JsonProperty("FolderId")
  private UUID folderId;
  /**
   * File Name
   *
   * @param name String
   * @return FileObject
   */
  public FileObject name(String name) {
    this.name = name;
    return this;
  }

  /**
   * File Name
   *
   * @return name
   */
  @ApiModelProperty(example = "File2.jpg", value = "File Name")
  /**
   * File Name
   *
   * @return name String
   */
  public String getName() {
    return name;
  }

  /**
   * File Name
   *
   * @param name String
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * MimeType of the file (image/png, image/jpeg, application/pdf, etc..)
   *
   * @param mimeType String
   * @return FileObject
   */
  public FileObject mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * MimeType of the file (image/png, image/jpeg, application/pdf, etc..)
   *
   * @return mimeType
   */
  @ApiModelProperty(
      example = "image/jpeg",
      value = "MimeType of the file (image/png, image/jpeg, application/pdf, etc..)")
  /**
   * MimeType of the file (image/png, image/jpeg, application/pdf, etc..)
   *
   * @return mimeType String
   */
  public String getMimeType() {
    return mimeType;
  }

  /**
   * MimeType of the file (image/png, image/jpeg, application/pdf, etc..)
   *
   * @param mimeType String
   */
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * Numeric value in bytes
   *
   * @param size Integer
   * @return FileObject
   */
  public FileObject size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Numeric value in bytes
   *
   * @return size
   */
  @ApiModelProperty(example = "3615", value = "Numeric value in bytes")
  /**
   * Numeric value in bytes
   *
   * @return size Integer
   */
  public Integer getSize() {
    return size;
  }

  /**
   * Numeric value in bytes
   *
   * @param size Integer
   */
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   * Created date in UTC
   *
   * @param createdDateUtc String
   * @return FileObject
   */
  public FileObject createdDateUtc(String createdDateUtc) {
    this.createdDateUtc = createdDateUtc;
    return this;
  }

  /**
   * Created date in UTC
   *
   * @return createdDateUtc
   */
  @ApiModelProperty(example = "2020-12-03T19:04:58.6970000", value = "Created date in UTC")
  /**
   * Created date in UTC
   *
   * @return createdDateUtc String
   */
  public String getCreatedDateUtc() {
    return createdDateUtc;
  }

  /**
   * Created date in UTC
   *
   * @param createdDateUtc String
   */
  public void setCreatedDateUtc(String createdDateUtc) {
    this.createdDateUtc = createdDateUtc;
  }

  /**
   * Updated date in UTC
   *
   * @param updatedDateUtc String
   * @return FileObject
   */
  public FileObject updatedDateUtc(String updatedDateUtc) {
    this.updatedDateUtc = updatedDateUtc;
    return this;
  }

  /**
   * Updated date in UTC
   *
   * @return updatedDateUtc
   */
  @ApiModelProperty(example = "2020-12-03T19:04:58.6970000", value = "Updated date in UTC")
  /**
   * Updated date in UTC
   *
   * @return updatedDateUtc String
   */
  public String getUpdatedDateUtc() {
    return updatedDateUtc;
  }

  /**
   * Updated date in UTC
   *
   * @param updatedDateUtc String
   */
  public void setUpdatedDateUtc(String updatedDateUtc) {
    this.updatedDateUtc = updatedDateUtc;
  }

  /**
   * user
   *
   * @param user User
   * @return FileObject
   */
  public FileObject user(User user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   *
   * @return user
   */
  @ApiModelProperty(value = "")
  /**
   * user
   *
   * @return user User
   */
  public User getUser() {
    return user;
  }

  /**
   * user
   *
   * @param user User
   */
  public void setUser(User user) {
    this.user = user;
  }

  /**
   * File object&#39;s UUID
   *
   * @param id UUID
   * @return FileObject
   */
  public FileObject id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * File object&#39;s UUID
   *
   * @return id
   */
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", value = "File object's UUID")
  /**
   * File object&#39;s UUID
   *
   * @return id UUID
   */
  public UUID getId() {
    return id;
  }

  /**
   * File object&#39;s UUID
   *
   * @param id UUID
   */
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   * Folder relation object&#39;s UUID
   *
   * @param folderId UUID
   * @return FileObject
   */
  public FileObject folderId(UUID folderId) {
    this.folderId = folderId;
    return this;
  }

  /**
   * Folder relation object&#39;s UUID
   *
   * @return folderId
   */
  @ApiModelProperty(
      example = "0f8ccf21-7267-4268-9167-a1e2c40c84c8",
      value = "Folder relation object's UUID")
  /**
   * Folder relation object&#39;s UUID
   *
   * @return folderId UUID
   */
  public UUID getFolderId() {
    return folderId;
  }

  /**
   * Folder relation object&#39;s UUID
   *
   * @param folderId UUID
   */
  public void setFolderId(UUID folderId) {
    this.folderId = folderId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileObject fileObject = (FileObject) o;
    return Objects.equals(this.name, fileObject.name)
        && Objects.equals(this.mimeType, fileObject.mimeType)
        && Objects.equals(this.size, fileObject.size)
        && Objects.equals(this.createdDateUtc, fileObject.createdDateUtc)
        && Objects.equals(this.updatedDateUtc, fileObject.updatedDateUtc)
        && Objects.equals(this.user, fileObject.user)
        && Objects.equals(this.id, fileObject.id)
        && Objects.equals(this.folderId, fileObject.folderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, mimeType, size, createdDateUtc, updatedDateUtc, user, id, folderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileObject {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    createdDateUtc: ").append(toIndentedString(createdDateUtc)).append("\n");
    sb.append("    updatedDateUtc: ").append(toIndentedString(updatedDateUtc)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
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

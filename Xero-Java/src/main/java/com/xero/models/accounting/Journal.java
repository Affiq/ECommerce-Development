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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneId;

/** Journal */
public class Journal {
  StringUtil util = new StringUtil();

  @JsonProperty("JournalID")
  private UUID journalID;

  @JsonProperty("JournalDate")
  private String journalDate;

  @JsonProperty("JournalNumber")
  private Integer journalNumber;

  @JsonProperty("CreatedDateUTC")
  private String createdDateUTC;

  @JsonProperty("Reference")
  private String reference;

  @JsonProperty("SourceID")
  private UUID sourceID;
  /** The journal source type. The type of transaction that created the journal */
  public enum SourceTypeEnum {
    /** ACCREC */
    ACCREC("ACCREC"),

    /** ACCPAY */
    ACCPAY("ACCPAY"),

    /** ACCRECCREDIT */
    ACCRECCREDIT("ACCRECCREDIT"),

    /** ACCPAYCREDIT */
    ACCPAYCREDIT("ACCPAYCREDIT"),

    /** ACCRECPAYMENT */
    ACCRECPAYMENT("ACCRECPAYMENT"),

    /** ACCPAYPAYMENT */
    ACCPAYPAYMENT("ACCPAYPAYMENT"),

    /** ARCREDITPAYMENT */
    ARCREDITPAYMENT("ARCREDITPAYMENT"),

    /** APCREDITPAYMENT */
    APCREDITPAYMENT("APCREDITPAYMENT"),

    /** CASHREC */
    CASHREC("CASHREC"),

    /** CASHPAID */
    CASHPAID("CASHPAID"),

    /** TRANSFER */
    TRANSFER("TRANSFER"),

    /** ARPREPAYMENT */
    ARPREPAYMENT("ARPREPAYMENT"),

    /** APPREPAYMENT */
    APPREPAYMENT("APPREPAYMENT"),

    /** AROVERPAYMENT */
    AROVERPAYMENT("AROVERPAYMENT"),

    /** APOVERPAYMENT */
    APOVERPAYMENT("APOVERPAYMENT"),

    /** EXPCLAIM */
    EXPCLAIM("EXPCLAIM"),

    /** EXPPAYMENT */
    EXPPAYMENT("EXPPAYMENT"),

    /** MANJOURNAL */
    MANJOURNAL("MANJOURNAL"),

    /** PAYSLIP */
    PAYSLIP("PAYSLIP"),

    /** WAGEPAYABLE */
    WAGEPAYABLE("WAGEPAYABLE"),

    /** INTEGRATEDPAYROLLPE */
    INTEGRATEDPAYROLLPE("INTEGRATEDPAYROLLPE"),

    /** INTEGRATEDPAYROLLPT */
    INTEGRATEDPAYROLLPT("INTEGRATEDPAYROLLPT"),

    /** EXTERNALSPENDMONEY */
    EXTERNALSPENDMONEY("EXTERNALSPENDMONEY"),

    /** INTEGRATEDPAYROLLPTPAYMENT */
    INTEGRATEDPAYROLLPTPAYMENT("INTEGRATEDPAYROLLPTPAYMENT"),

    /** INTEGRATEDPAYROLLCN */
    INTEGRATEDPAYROLLCN("INTEGRATEDPAYROLLCN");

    private String value;

    SourceTypeEnum(String value) {
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
    public static SourceTypeEnum fromValue(String value) {
      for (SourceTypeEnum b : SourceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("SourceType")
  private SourceTypeEnum sourceType;

  @JsonProperty("JournalLines")
  private List<JournalLine> journalLines = new ArrayList<JournalLine>();
  /**
   * Xero identifier
   *
   * @param journalID UUID
   * @return Journal
   */
  public Journal journalID(UUID journalID) {
    this.journalID = journalID;
    return this;
  }

  /**
   * Xero identifier
   *
   * @return journalID
   */
  @ApiModelProperty(value = "Xero identifier")
  /**
   * Xero identifier
   *
   * @return journalID UUID
   */
  public UUID getJournalID() {
    return journalID;
  }

  /**
   * Xero identifier
   *
   * @param journalID UUID
   */
  public void setJournalID(UUID journalID) {
    this.journalID = journalID;
  }

  /**
   * Date the journal was posted
   *
   * @param journalDate String
   * @return Journal
   */
  public Journal journalDate(String journalDate) {
    this.journalDate = journalDate;
    return this;
  }

  /**
   * Date the journal was posted
   *
   * @return journalDate
   */
  @ApiModelProperty(value = "Date the journal was posted")
  /**
   * Date the journal was posted
   *
   * @return journalDate String
   */
  public String getJournalDate() {
    return journalDate;
  }
  /**
   * Date the journal was posted
   *
   * @return LocalDate
   */
  public LocalDate getJournalDateAsDate() {
    if (this.journalDate != null) {
      try {
        return util.convertStringToDate(this.journalDate);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  /**
   * Date the journal was posted
   *
   * @param journalDate String
   */
  public void setJournalDate(String journalDate) {
    this.journalDate = journalDate;
  }

  /**
   * Date the journal was posted
   *
   * @param journalDate LocalDateTime
   */
  public void setJournalDate(LocalDate journalDate) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = journalDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.journalDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  /**
   * Xero generated journal number
   *
   * @param journalNumber Integer
   * @return Journal
   */
  public Journal journalNumber(Integer journalNumber) {
    this.journalNumber = journalNumber;
    return this;
  }

  /**
   * Xero generated journal number
   *
   * @return journalNumber
   */
  @ApiModelProperty(value = "Xero generated journal number")
  /**
   * Xero generated journal number
   *
   * @return journalNumber Integer
   */
  public Integer getJournalNumber() {
    return journalNumber;
  }

  /**
   * Xero generated journal number
   *
   * @param journalNumber Integer
   */
  public void setJournalNumber(Integer journalNumber) {
    this.journalNumber = journalNumber;
  }

  /**
   * Created date UTC format
   *
   * @return createdDateUTC
   */
  @ApiModelProperty(example = "/Date(1573755038314)/", value = "Created date UTC format")
  /**
   * Created date UTC format
   *
   * @return createdDateUTC String
   */
  public String getCreatedDateUTC() {
    return createdDateUTC;
  }
  /**
   * Created date UTC format
   *
   * @return OffsetDateTime
   */
  public OffsetDateTime getCreatedDateUTCAsDate() {
    if (this.createdDateUTC != null) {
      try {
        return util.convertStringToOffsetDateTime(this.createdDateUTC);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  /**
   * reference field for additional indetifying information
   *
   * @param reference String
   * @return Journal
   */
  public Journal reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * reference field for additional indetifying information
   *
   * @return reference
   */
  @ApiModelProperty(value = "reference field for additional indetifying information")
  /**
   * reference field for additional indetifying information
   *
   * @return reference String
   */
  public String getReference() {
    return reference;
  }

  /**
   * reference field for additional indetifying information
   *
   * @param reference String
   */
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * The identifier for the source transaction (e.g. InvoiceID)
   *
   * @param sourceID UUID
   * @return Journal
   */
  public Journal sourceID(UUID sourceID) {
    this.sourceID = sourceID;
    return this;
  }

  /**
   * The identifier for the source transaction (e.g. InvoiceID)
   *
   * @return sourceID
   */
  @ApiModelProperty(value = "The identifier for the source transaction (e.g. InvoiceID)")
  /**
   * The identifier for the source transaction (e.g. InvoiceID)
   *
   * @return sourceID UUID
   */
  public UUID getSourceID() {
    return sourceID;
  }

  /**
   * The identifier for the source transaction (e.g. InvoiceID)
   *
   * @param sourceID UUID
   */
  public void setSourceID(UUID sourceID) {
    this.sourceID = sourceID;
  }

  /**
   * The journal source type. The type of transaction that created the journal
   *
   * @param sourceType SourceTypeEnum
   * @return Journal
   */
  public Journal sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * The journal source type. The type of transaction that created the journal
   *
   * @return sourceType
   */
  @ApiModelProperty(
      value = "The journal source type. The type of transaction that created the journal")
  /**
   * The journal source type. The type of transaction that created the journal
   *
   * @return sourceType SourceTypeEnum
   */
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }

  /**
   * The journal source type. The type of transaction that created the journal
   *
   * @param sourceType SourceTypeEnum
   */
  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  /**
   * See JournalLines
   *
   * @param journalLines List&lt;JournalLine&gt;
   * @return Journal
   */
  public Journal journalLines(List<JournalLine> journalLines) {
    this.journalLines = journalLines;
    return this;
  }

  /**
   * See JournalLines
   *
   * @param journalLinesItem JournalLine
   * @return Journal
   */
  public Journal addJournalLinesItem(JournalLine journalLinesItem) {
    if (this.journalLines == null) {
      this.journalLines = new ArrayList<JournalLine>();
    }
    this.journalLines.add(journalLinesItem);
    return this;
  }

  /**
   * See JournalLines
   *
   * @return journalLines
   */
  @ApiModelProperty(value = "See JournalLines")
  /**
   * See JournalLines
   *
   * @return journalLines List<JournalLine>
   */
  public List<JournalLine> getJournalLines() {
    return journalLines;
  }

  /**
   * See JournalLines
   *
   * @param journalLines List&lt;JournalLine&gt;
   */
  public void setJournalLines(List<JournalLine> journalLines) {
    this.journalLines = journalLines;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Journal journal = (Journal) o;
    return Objects.equals(this.journalID, journal.journalID)
        && Objects.equals(this.journalDate, journal.journalDate)
        && Objects.equals(this.journalNumber, journal.journalNumber)
        && Objects.equals(this.createdDateUTC, journal.createdDateUTC)
        && Objects.equals(this.reference, journal.reference)
        && Objects.equals(this.sourceID, journal.sourceID)
        && Objects.equals(this.sourceType, journal.sourceType)
        && Objects.equals(this.journalLines, journal.journalLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        journalID,
        journalDate,
        journalNumber,
        createdDateUTC,
        reference,
        sourceID,
        sourceType,
        journalLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Journal {\n");
    sb.append("    journalID: ").append(toIndentedString(journalID)).append("\n");
    sb.append("    journalDate: ").append(toIndentedString(journalDate)).append("\n");
    sb.append("    journalNumber: ").append(toIndentedString(journalNumber)).append("\n");
    sb.append("    createdDateUTC: ").append(toIndentedString(createdDateUTC)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    sourceID: ").append(toIndentedString(sourceID)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    journalLines: ").append(toIndentedString(journalLines)).append("\n");
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

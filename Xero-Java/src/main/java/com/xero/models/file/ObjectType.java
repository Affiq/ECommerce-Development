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


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** The Object Type */
public enum ObjectType {

  /** UNKNOWN */
  UNKNOWN("Unknown"),

  /** ACCPAY */
  ACCPAY("Accpay"),

  /** ACCPAYCREDIT */
  ACCPAYCREDIT("AccPayCredit"),

  /** ACCPAYPAYMENT */
  ACCPAYPAYMENT("AccPayPayment"),

  /** ACCREC */
  ACCREC("AccRec"),

  /** ACCRECCREDIT */
  ACCRECCREDIT("AccRecCredit"),

  /** ACCRECPAYMENT */
  ACCRECPAYMENT("AccRecPayment"),

  /** ADJUSTMENT */
  ADJUSTMENT("Adjustment"),

  /** APCREDITPAYMENT */
  APCREDITPAYMENT("ApCreditPayment"),

  /** APOVERPAYMENT */
  APOVERPAYMENT("ApOverPayment"),

  /** APOVERPAYMENTPAYMENT */
  APOVERPAYMENTPAYMENT("ApOverPaymentPayment"),

  /** APOVERPAYMENTSOURCEPAYMENT */
  APOVERPAYMENTSOURCEPAYMENT("ApOverPaymentSourcePayment"),

  /** APPREPAYMENT */
  APPREPAYMENT("ApPrepayment"),

  /** APPREPAYMENTPAYMENT */
  APPREPAYMENTPAYMENT("ApPrepaymentPayment"),

  /** APPREPAYMENTSOURCEPAYMENT */
  APPREPAYMENTSOURCEPAYMENT("ApPrepaymentSourcePayment"),

  /** ARCREDITPAYMENT */
  ARCREDITPAYMENT("ArCreditPayment"),

  /** AROVERPAYMENT */
  AROVERPAYMENT("ArOverPayment"),

  /** AROVERPAYMENTPAYMENT */
  AROVERPAYMENTPAYMENT("ArOverpaymentPayment"),

  /** AROVERPAYMENTSOURCEPAYMENT */
  AROVERPAYMENTSOURCEPAYMENT("ArOverpaymentSourcePayment"),

  /** ARPREPAYMENT */
  ARPREPAYMENT("ArPrepayment"),

  /** ARPREPAYMENTPAYMENT */
  ARPREPAYMENTPAYMENT("ArPrepaymentPayment"),

  /** ARPREPAYMENTSOURCEPAYMENT */
  ARPREPAYMENTSOURCEPAYMENT("ArPrepaymentSourcePayment"),

  /** CASHPAID */
  CASHPAID("CashPaid"),

  /** CASHREC */
  CASHREC("CashRec"),

  /** EXPPAYMENT */
  EXPPAYMENT("ExpPayment"),

  /** MANJOURNAL */
  MANJOURNAL("ManJournal"),

  /** PURCHASEORDER */
  PURCHASEORDER("PurchaseOrder"),

  /** RECEIPT */
  RECEIPT("Receipt"),

  /** TRANSFER */
  TRANSFER("Transfer"),

  /** ACCOUNT */
  ACCOUNT("Account"),

  /** CONTACT */
  CONTACT("Contact"),

  /** BUSINESS */
  BUSINESS("Business"),

  /** EMPLOYEE */
  EMPLOYEE("Employee"),

  /** PERSON */
  PERSON("Person"),

  /** USER */
  USER("User"),

  /** ORG */
  ORG("Org"),

  /** FIXEDASSET */
  FIXEDASSET("FixedAsset"),

  /** PAYRUN */
  PAYRUN("PayRun"),

  /** PRICELISTITEM */
  PRICELISTITEM("PriceListItem"),

  /** BANK */
  BANK("Bank"),

  /** CURRENT */
  CURRENT("Current"),

  /** EQUITY */
  EQUITY("Equity"),

  /** EXPENSE */
  EXPENSE("Expense"),

  /** FIXED */
  FIXED("Fixed"),

  /** LIABILITY */
  LIABILITY("Liability"),

  /** PREPAYMENT */
  PREPAYMENT("Prepayment"),

  /** REVENUE */
  REVENUE("Revenue"),

  /** SALES */
  SALES("Sales"),

  /** OVERHEADS */
  OVERHEADS("Overheads"),

  /** DEPRECIATN */
  DEPRECIATN("Depreciatn"),

  /** OTHERINCOME */
  OTHERINCOME("OtherIncome"),

  /** DIRECTCOSTS */
  DIRECTCOSTS("DirectCosts"),

  /** CURRLIAB */
  CURRLIAB("Currliab"),

  /** TERMLIAB */
  TERMLIAB("Termliab"),

  /** NONCURRENT */
  NONCURRENT("NonCurrent"),

  /** SALESQUOTE */
  SALESQUOTE("SalesQuote");

  private String value;

  ObjectType(String value) {
    this.value = value;
  }

  /** @return String value */
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
  public static ObjectType fromValue(String value) {
    for (ObjectType b : ObjectType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

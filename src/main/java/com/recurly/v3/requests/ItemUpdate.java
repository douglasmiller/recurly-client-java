/**
 * This file is automatically created by Recurly's OpenAPI generation process and thus any edits you
 * make by hand will be lost. If you wish to make a change to this file, please create a Github
 * issue explaining the changes you need and we will usher them to the appropriate places.
 */
package com.recurly.v3.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Request;
import com.recurly.v3.resources.*;
import java.util.List;

public class ItemUpdate extends Request {

  /** Accounting code for invoice line items. */
  @SerializedName("accounting_code")
  @Expose
  private String accountingCode;

  /** Unique code to identify the item. */
  @SerializedName("code")
  @Expose
  private String code;

  /** Item Pricing */
  @SerializedName("currencies")
  @Expose
  private List<Pricing> currencies;

  @SerializedName("custom_fields")
  @Expose
  private List<CustomField> customFields;

  /** Optional, description. */
  @SerializedName("description")
  @Expose
  private String description;

  /** Optional, stock keeping unit to link the item to other inventory systems. */
  @SerializedName("external_sku")
  @Expose
  private String externalSku;

  /**
   * This name describes your item and will appear on the invoice when it's purchased on a one time
   * basis.
   */
  @SerializedName("name")
  @Expose
  private String name;

  /** Revenue schedule type */
  @SerializedName("revenue_schedule_type")
  @Expose
  private String revenueScheduleType;

  /**
   * Used by Avalara, Vertex, and Recurly’s EU VAT tax feature. The tax code values are specific to
   * each tax system. If you are using Recurly’s EU VAT feature you can use `unknown`, `physical`,
   * or `digital`.
   */
  @SerializedName("tax_code")
  @Expose
  private String taxCode;

  /** `true` exempts tax on the item, `false` applies tax on the item. */
  @SerializedName("tax_exempt")
  @Expose
  private Boolean taxExempt;

  /** Accounting code for invoice line items. */
  public String getAccountingCode() {
    return this.accountingCode;
  }

  /** @param accountingCode Accounting code for invoice line items. */
  public void setAccountingCode(final String accountingCode) {
    this.accountingCode = accountingCode;
  }

  /** Unique code to identify the item. */
  public String getCode() {
    return this.code;
  }

  /** @param code Unique code to identify the item. */
  public void setCode(final String code) {
    this.code = code;
  }

  /** Item Pricing */
  public List<Pricing> getCurrencies() {
    return this.currencies;
  }

  /** @param currencies Item Pricing */
  public void setCurrencies(final List<Pricing> currencies) {
    this.currencies = currencies;
  }

  public List<CustomField> getCustomFields() {
    return this.customFields;
  }

  /** @param customFields */
  public void setCustomFields(final List<CustomField> customFields) {
    this.customFields = customFields;
  }

  /** Optional, description. */
  public String getDescription() {
    return this.description;
  }

  /** @param description Optional, description. */
  public void setDescription(final String description) {
    this.description = description;
  }

  /** Optional, stock keeping unit to link the item to other inventory systems. */
  public String getExternalSku() {
    return this.externalSku;
  }

  /**
   * @param externalSku Optional, stock keeping unit to link the item to other inventory systems.
   */
  public void setExternalSku(final String externalSku) {
    this.externalSku = externalSku;
  }

  /**
   * This name describes your item and will appear on the invoice when it's purchased on a one time
   * basis.
   */
  public String getName() {
    return this.name;
  }

  /**
   * @param name This name describes your item and will appear on the invoice when it's purchased on
   *     a one time basis.
   */
  public void setName(final String name) {
    this.name = name;
  }

  /** Revenue schedule type */
  public String getRevenueScheduleType() {
    return this.revenueScheduleType;
  }

  /** @param revenueScheduleType Revenue schedule type */
  public void setRevenueScheduleType(final String revenueScheduleType) {
    this.revenueScheduleType = revenueScheduleType;
  }

  /**
   * Used by Avalara, Vertex, and Recurly’s EU VAT tax feature. The tax code values are specific to
   * each tax system. If you are using Recurly’s EU VAT feature you can use `unknown`, `physical`,
   * or `digital`.
   */
  public String getTaxCode() {
    return this.taxCode;
  }

  /**
   * @param taxCode Used by Avalara, Vertex, and Recurly’s EU VAT tax feature. The tax code values
   *     are specific to each tax system. If you are using Recurly’s EU VAT feature you can use
   *     `unknown`, `physical`, or `digital`.
   */
  public void setTaxCode(final String taxCode) {
    this.taxCode = taxCode;
  }

  /** `true` exempts tax on the item, `false` applies tax on the item. */
  public Boolean getTaxExempt() {
    return this.taxExempt;
  }

  /** @param taxExempt `true` exempts tax on the item, `false` applies tax on the item. */
  public void setTaxExempt(final Boolean taxExempt) {
    this.taxExempt = taxExempt;
  }
}
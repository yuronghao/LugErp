package com.emi.wms.bean;

import java.math.BigDecimal;
import java.util.Date;

public class WmInvoiceC {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_Invoice_C.pk
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    private Integer pk;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_Invoice_C.gid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    private String gid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_Invoice_C.invoiceUid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    private String invoiceuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_Invoice_C.goodsUid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    private String goodsuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_Invoice_C.number
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    private BigDecimal number;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_Invoice_C.localTaxPrice
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    private BigDecimal localtaxprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_Invoice_C.localPrice
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    private BigDecimal localprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_Invoice_C.localTaxMoney
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    private BigDecimal localtaxmoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_Invoice_C.localTax
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    private BigDecimal localtax;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_Invoice_C.currencyTaxTotal
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    private BigDecimal currencytaxtotal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_Invoice_C.amount
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_Invoice_C.verificationDate
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    private Date verificationdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_Invoice_C.pk
     *
     * @return the value of dbo.WM_Invoice_C.pk
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_Invoice_C.pk
     *
     * @param pk the value for dbo.WM_Invoice_C.pk
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_Invoice_C.gid
     *
     * @return the value of dbo.WM_Invoice_C.gid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getGid() {
        return gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_Invoice_C.gid
     *
     * @param gid the value for dbo.WM_Invoice_C.gid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setGid(String gid) {
        this.gid = gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_Invoice_C.invoiceUid
     *
     * @return the value of dbo.WM_Invoice_C.invoiceUid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getInvoiceuid() {
        return invoiceuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_Invoice_C.invoiceUid
     *
     * @param invoiceuid the value for dbo.WM_Invoice_C.invoiceUid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setInvoiceuid(String invoiceuid) {
        this.invoiceuid = invoiceuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_Invoice_C.goodsUid
     *
     * @return the value of dbo.WM_Invoice_C.goodsUid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getGoodsuid() {
        return goodsuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_Invoice_C.goodsUid
     *
     * @param goodsuid the value for dbo.WM_Invoice_C.goodsUid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setGoodsuid(String goodsuid) {
        this.goodsuid = goodsuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_Invoice_C.number
     *
     * @return the value of dbo.WM_Invoice_C.number
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public BigDecimal getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_Invoice_C.number
     *
     * @param number the value for dbo.WM_Invoice_C.number
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_Invoice_C.localTaxPrice
     *
     * @return the value of dbo.WM_Invoice_C.localTaxPrice
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public BigDecimal getLocaltaxprice() {
        return localtaxprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_Invoice_C.localTaxPrice
     *
     * @param localtaxprice the value for dbo.WM_Invoice_C.localTaxPrice
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setLocaltaxprice(BigDecimal localtaxprice) {
        this.localtaxprice = localtaxprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_Invoice_C.localPrice
     *
     * @return the value of dbo.WM_Invoice_C.localPrice
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public BigDecimal getLocalprice() {
        return localprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_Invoice_C.localPrice
     *
     * @param localprice the value for dbo.WM_Invoice_C.localPrice
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setLocalprice(BigDecimal localprice) {
        this.localprice = localprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_Invoice_C.localTaxMoney
     *
     * @return the value of dbo.WM_Invoice_C.localTaxMoney
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public BigDecimal getLocaltaxmoney() {
        return localtaxmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_Invoice_C.localTaxMoney
     *
     * @param localtaxmoney the value for dbo.WM_Invoice_C.localTaxMoney
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setLocaltaxmoney(BigDecimal localtaxmoney) {
        this.localtaxmoney = localtaxmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_Invoice_C.localTax
     *
     * @return the value of dbo.WM_Invoice_C.localTax
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public BigDecimal getLocaltax() {
        return localtax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_Invoice_C.localTax
     *
     * @param localtax the value for dbo.WM_Invoice_C.localTax
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setLocaltax(BigDecimal localtax) {
        this.localtax = localtax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_Invoice_C.currencyTaxTotal
     *
     * @return the value of dbo.WM_Invoice_C.currencyTaxTotal
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public BigDecimal getCurrencytaxtotal() {
        return currencytaxtotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_Invoice_C.currencyTaxTotal
     *
     * @param currencytaxtotal the value for dbo.WM_Invoice_C.currencyTaxTotal
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setCurrencytaxtotal(BigDecimal currencytaxtotal) {
        this.currencytaxtotal = currencytaxtotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_Invoice_C.amount
     *
     * @return the value of dbo.WM_Invoice_C.amount
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_Invoice_C.amount
     *
     * @param amount the value for dbo.WM_Invoice_C.amount
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_Invoice_C.verificationDate
     *
     * @return the value of dbo.WM_Invoice_C.verificationDate
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public Date getVerificationdate() {
        return verificationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_Invoice_C.verificationDate
     *
     * @param verificationdate the value for dbo.WM_Invoice_C.verificationDate
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setVerificationdate(Date verificationdate) {
        this.verificationdate = verificationdate;
    }
}
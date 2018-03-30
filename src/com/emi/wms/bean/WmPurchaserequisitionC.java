package com.emi.wms.bean;

import java.math.BigDecimal;
import java.util.Date;

import com.emi.sys.core.annotation.EmiColumn;
import com.emi.sys.core.annotation.EmiTable;
@EmiTable(name="WM_PurchaseRequisition_C")
public class WmPurchaserequisitionC {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_PurchaseRequisition_C.pk
     *
     * @mbggenerated Wed Dec 02 15:26:30 CST 2015
     */
	@EmiColumn(name="pk" ,increment=true)
    private Integer pk;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_PurchaseRequisition_C.gid
     *
     * @mbggenerated Wed Dec 02 15:26:30 CST 2015
     */
	@EmiColumn(name = "gid", ID = true)
    private String gid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_PurchaseRequisition_C.purchaseRequisitionUid
     *
     * @mbggenerated Wed Dec 02 15:26:30 CST 2015
     */
	@EmiColumn(name="purchaserequisitionuid" )
    private String purchaserequisitionuid;//主表id

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_PurchaseRequisition_C.goodsUid
     *
     * @mbggenerated Wed Dec 02 15:26:30 CST 2015
     */
	@EmiColumn(name="goodsuid" )
    private String goodsuid;//物料id

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_PurchaseRequisition_C.number
     *
     * @mbggenerated Wed Dec 02 15:26:30 CST 2015
     */
	@EmiColumn(name="number" )
    private BigDecimal number;//主数量

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_PurchaseRequisition_C.demandDate
     *
     * @mbggenerated Wed Dec 02 15:26:30 CST 2015
     */
	@EmiColumn(name="demanddate" )
    private Date demanddate;//需求日期

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_PurchaseRequisition_C.amount
     *
     * @mbggenerated Wed Dec 02 15:26:30 CST 2015
     */
	@EmiColumn(name="amount" )
    private BigDecimal amount;//辅数量

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_PurchaseRequisition_C.pk
     *
     * @return the value of dbo.WM_PurchaseRequisition_C.pk
     *
     * @mbggenerated Wed Dec 02 15:26:30 CST 2015
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_PurchaseRequisition_C.pk
     *
     * @param pk the value for dbo.WM_PurchaseRequisition_C.pk
     *
     * @mbggenerated Wed Dec 02 15:26:30 CST 2015
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_PurchaseRequisition_C.gid
     *
     * @return the value of dbo.WM_PurchaseRequisition_C.gid
     *
     * @mbggenerated Wed Dec 02 15:26:30 CST 2015
     */
    public String getGid() {
        return gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_PurchaseRequisition_C.gid
     *
     * @param gid the value for dbo.WM_PurchaseRequisition_C.gid
     *
     * @mbggenerated Wed Dec 02 15:26:30 CST 2015
     */
    public void setGid(String gid) {
        this.gid = gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_PurchaseRequisition_C.purchaseRequisitionUid
     *
     * @return the value of dbo.WM_PurchaseRequisition_C.purchaseRequisitionUid
     *
     * @mbggenerated Wed Dec 02 15:26:30 CST 2015
     */
    public String getPurchaserequisitionuid() {
        return purchaserequisitionuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_PurchaseRequisition_C.purchaseRequisitionUid
     *
     * @param purchaserequisitionuid the value for dbo.WM_PurchaseRequisition_C.purchaseRequisitionUid
     *
     * @mbggenerated Wed Dec 02 15:26:30 CST 2015
     */
    public void setPurchaserequisitionuid(String purchaserequisitionuid) {
        this.purchaserequisitionuid = purchaserequisitionuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_PurchaseRequisition_C.goodsUid
     *
     * @return the value of dbo.WM_PurchaseRequisition_C.goodsUid
     *
     * @mbggenerated Wed Dec 02 15:26:30 CST 2015
     */
    public String getGoodsuid() {
        return goodsuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_PurchaseRequisition_C.goodsUid
     *
     * @param goodsuid the value for dbo.WM_PurchaseRequisition_C.goodsUid
     *
     * @mbggenerated Wed Dec 02 15:26:30 CST 2015
     */
    public void setGoodsuid(String goodsuid) {
        this.goodsuid = goodsuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_PurchaseRequisition_C.number
     *
     * @return the value of dbo.WM_PurchaseRequisition_C.number
     *
     * @mbggenerated Wed Dec 02 15:26:30 CST 2015
     */
    public BigDecimal getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_PurchaseRequisition_C.number
     *
     * @param number the value for dbo.WM_PurchaseRequisition_C.number
     *
     * @mbggenerated Wed Dec 02 15:26:30 CST 2015
     */
    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_PurchaseRequisition_C.demandDate
     *
     * @return the value of dbo.WM_PurchaseRequisition_C.demandDate
     *
     * @mbggenerated Wed Dec 02 15:26:30 CST 2015
     */
    public Date getDemanddate() {
        return demanddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_PurchaseRequisition_C.demandDate
     *
     * @param demanddate the value for dbo.WM_PurchaseRequisition_C.demandDate
     *
     * @mbggenerated Wed Dec 02 15:26:30 CST 2015
     */
    public void setDemanddate(Date demanddate) {
        this.demanddate = demanddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_PurchaseRequisition_C.amount
     *
     * @return the value of dbo.WM_PurchaseRequisition_C.amount
     *
     * @mbggenerated Wed Dec 02 15:26:30 CST 2015
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_PurchaseRequisition_C.amount
     *
     * @param amount the value for dbo.WM_PurchaseRequisition_C.amount
     *
     * @mbggenerated Wed Dec 02 15:26:30 CST 2015
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
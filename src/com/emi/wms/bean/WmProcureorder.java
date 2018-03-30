package com.emi.wms.bean;

import java.math.BigDecimal;
import java.util.Date;

import com.emi.sys.core.annotation.EmiColumn;
import com.emi.sys.core.annotation.EmiTable;
@EmiTable(name="WM_ProcureOrder")
public class WmProcureorder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.pk
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="pk" ,increment=true)
    private Integer pk;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.gid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name = "gid", ID = true)
    private String gid;


//    @EmiColumn(name = "goodsUid")
	private String goodsUid;


    public String getGoodsUid() {
        return goodsUid;
    }

    public void setGoodsUid(String goodsUid) {
        this.goodsUid = goodsUid;
    }

    @EmiColumn(name = "departmentUid")
    private  String departmentUid;

    public String getDepartmentUid() {
        return departmentUid;
    }

    public void setDepartmentUid(String departmentUid) {
        this.departmentUid = departmentUid;
    }

    private String recordPersonName;
    private String departName;
    private String wareHouseName;
    private String goodsCode;


    private String unitName;

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getRecordPersonName() {
        return recordPersonName;
    }

    public void setRecordPersonName(String recordPersonName) {
        this.recordPersonName = recordPersonName;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getWareHouseName() {
        return wareHouseName;
    }

    public void setWareHouseName(String wareHouseName) {
        this.wareHouseName = wareHouseName;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.notes
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="notes" )
    private String notes;//备注



    private String providercustomername;//供应商名称

    private String providercustomercode;//供应商编码

    public String getProvidercustomercode() {
        return providercustomercode;
    }

    public void setProvidercustomercode(String providercustomercode) {
        this.providercustomercode = providercustomercode;
    }

    public String getProvidercustomername() {
        return providercustomername;
    }

    public void setProvidercustomername(String providercustomername) {
        this.providercustomername = providercustomername;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.supplierUid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="supplieruid" )
    private String supplieruid;//供应商id

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.procureType
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="procuretype" )
    private String procuretype;//采购类型

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.currency
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="currency" )
    private String currency;//币种

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.exchangeRate
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="exchangerate" )
    private BigDecimal exchangerate;//汇率

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.rate
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="rate" )
    private BigDecimal rate;//税率

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.transportation
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="transportation" )
    private String transportation;//运输方式

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.billCode
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="billcode" )
    private String billcode;//订单编码

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.billState
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="billstate" )
    private String billstate;//订单状态

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.billDate
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="billdate" )
    private Date billdate;//订单日期

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.recordPersonUid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="recordpersonuid" )
    private String recordpersonuid;//记录人id

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.recordDate
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="recorddate" )
    private Date recorddate;//记录日期


    private BigDecimal number;

    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.recordTime
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="recordtime" )
    private Date recordtime;//记录时间

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.auditPersonUid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="auditpersonuid" )
    private String auditpersonuid;//审核人id

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.auditDate
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="auditdate" )
    private Date auditdate;//审核日期

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.auditTime
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="audittime" )
    private Date audittime;//审核时间

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.barCode
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="barcode" )
    private String barcode;//条码

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.auditState
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="auditstate" )
    private Integer auditstate;//审核状态

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.departmentUid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="departmentuid" )
    private String departmentuid;//部门id

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.personUid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="personuid" )
    private String personuid;//业务员

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.sobGid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="sobgid" )
    private String sobgid;//账套id

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.orgGid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="orggid" )
    private String orggid;//组织id

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.advance
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="advance" )
    private Integer advance;//是否允许预付款

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.advanceMoney
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="advancemoney" )
    private BigDecimal advancemoney;//是否预付款金额

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.lock
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="lock" )
    private Integer lock;//是否锁定

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.WM_ProcureOrder.accounting
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="accounting" )
    private Integer accounting;//是否记账

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.pk
     *
     * @return the value of dbo.WM_ProcureOrder.pk
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="isdel" )
    private Integer isdel;//是否记账
	
    public Integer getPk() {
        return pk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.pk
     *
     * @param pk the value for dbo.WM_ProcureOrder.pk
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.gid
     *
     * @return the value of dbo.WM_ProcureOrder.gid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getGid() {
        return gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.gid
     *
     * @param gid the value for dbo.WM_ProcureOrder.gid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setGid(String gid) {
        this.gid = gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.notes
     *
     * @return the value of dbo.WM_ProcureOrder.notes
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getNotes() {
        return notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.notes
     *
     * @param notes the value for dbo.WM_ProcureOrder.notes
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.supplierUid
     *
     * @return the value of dbo.WM_ProcureOrder.supplierUid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getSupplieruid() {
        return supplieruid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.supplierUid
     *
     * @param supplieruid the value for dbo.WM_ProcureOrder.supplierUid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setSupplieruid(String supplieruid) {
        this.supplieruid = supplieruid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.procureType
     *
     * @return the value of dbo.WM_ProcureOrder.procureType
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getProcuretype() {
        return procuretype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.procureType
     *
     * @param procuretype the value for dbo.WM_ProcureOrder.procureType
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setProcuretype(String procuretype) {
        this.procuretype = procuretype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.currency
     *
     * @return the value of dbo.WM_ProcureOrder.currency
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.currency
     *
     * @param currency the value for dbo.WM_ProcureOrder.currency
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.exchangeRate
     *
     * @return the value of dbo.WM_ProcureOrder.exchangeRate
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public BigDecimal getExchangerate() {
        return exchangerate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.exchangeRate
     *
     * @param exchangerate the value for dbo.WM_ProcureOrder.exchangeRate
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setExchangerate(BigDecimal exchangerate) {
        this.exchangerate = exchangerate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.rate
     *
     * @return the value of dbo.WM_ProcureOrder.rate
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.rate
     *
     * @param rate the value for dbo.WM_ProcureOrder.rate
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.transportation
     *
     * @return the value of dbo.WM_ProcureOrder.transportation
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getTransportation() {
        return transportation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.transportation
     *
     * @param transportation the value for dbo.WM_ProcureOrder.transportation
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.billCode
     *
     * @return the value of dbo.WM_ProcureOrder.billCode
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getBillcode() {
        return billcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.billCode
     *
     * @param billcode the value for dbo.WM_ProcureOrder.billCode
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setBillcode(String billcode) {
        this.billcode = billcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.billState
     *
     * @return the value of dbo.WM_ProcureOrder.billState
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getBillstate() {
        return billstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.billState
     *
     * @param billstate the value for dbo.WM_ProcureOrder.billState
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setBillstate(String billstate) {
        this.billstate = billstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.billDate
     *
     * @return the value of dbo.WM_ProcureOrder.billDate
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public Date getBilldate() {
        return billdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.billDate
     *
     * @param billdate the value for dbo.WM_ProcureOrder.billDate
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.recordPersonUid
     *
     * @return the value of dbo.WM_ProcureOrder.recordPersonUid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getRecordpersonuid() {
        return recordpersonuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.recordPersonUid
     *
     * @param recordpersonuid the value for dbo.WM_ProcureOrder.recordPersonUid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setRecordpersonuid(String recordpersonuid) {
        this.recordpersonuid = recordpersonuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.recordDate
     *
     * @return the value of dbo.WM_ProcureOrder.recordDate
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public Date getRecorddate() {
        return recorddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.recordDate
     *
     * @param recorddate the value for dbo.WM_ProcureOrder.recordDate
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.recordTime
     *
     * @return the value of dbo.WM_ProcureOrder.recordTime
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public Date getRecordtime() {
        return recordtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.recordTime
     *
     * @param recordtime the value for dbo.WM_ProcureOrder.recordTime
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.auditPersonUid
     *
     * @return the value of dbo.WM_ProcureOrder.auditPersonUid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getAuditpersonuid() {
        return auditpersonuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.auditPersonUid
     *
     * @param auditpersonuid the value for dbo.WM_ProcureOrder.auditPersonUid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setAuditpersonuid(String auditpersonuid) {
        this.auditpersonuid = auditpersonuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.auditDate
     *
     * @return the value of dbo.WM_ProcureOrder.auditDate
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public Date getAuditdate() {
        return auditdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.auditDate
     *
     * @param auditdate the value for dbo.WM_ProcureOrder.auditDate
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.auditTime
     *
     * @return the value of dbo.WM_ProcureOrder.auditTime
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public Date getAudittime() {
        return audittime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.auditTime
     *
     * @param audittime the value for dbo.WM_ProcureOrder.auditTime
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setAudittime(Date audittime) {
        this.audittime = audittime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.barCode
     *
     * @return the value of dbo.WM_ProcureOrder.barCode
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.barCode
     *
     * @param barcode the value for dbo.WM_ProcureOrder.barCode
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.auditState
     *
     * @return the value of dbo.WM_ProcureOrder.auditState
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public Integer getAuditstate() {
        return auditstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.auditState
     *
     * @param auditstate the value for dbo.WM_ProcureOrder.auditState
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setAuditstate(Integer auditstate) {
        this.auditstate = auditstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.departmentUid
     *
     * @return the value of dbo.WM_ProcureOrder.departmentUid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getDepartmentuid() {
        return departmentuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.departmentUid
     *
     * @param departmentuid the value for dbo.WM_ProcureOrder.departmentUid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setDepartmentuid(String departmentuid) {
        this.departmentuid = departmentuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.personUid
     *
     * @return the value of dbo.WM_ProcureOrder.personUid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getPersonuid() {
        return personuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.personUid
     *
     * @param personuid the value for dbo.WM_ProcureOrder.personUid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setPersonuid(String personuid) {
        this.personuid = personuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.sobGid
     *
     * @return the value of dbo.WM_ProcureOrder.sobGid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getSobgid() {
        return sobgid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.sobGid
     *
     * @param sobgid the value for dbo.WM_ProcureOrder.sobGid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setSobgid(String sobgid) {
        this.sobgid = sobgid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.orgGid
     *
     * @return the value of dbo.WM_ProcureOrder.orgGid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getOrggid() {
        return orggid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.orgGid
     *
     * @param orggid the value for dbo.WM_ProcureOrder.orgGid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setOrggid(String orggid) {
        this.orggid = orggid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.advance
     *
     * @return the value of dbo.WM_ProcureOrder.advance
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public Integer getAdvance() {
        return advance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.advance
     *
     * @param advance the value for dbo.WM_ProcureOrder.advance
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setAdvance(Integer advance) {
        this.advance = advance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.advanceMoney
     *
     * @return the value of dbo.WM_ProcureOrder.advanceMoney
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public BigDecimal getAdvancemoney() {
        return advancemoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.advanceMoney
     *
     * @param advancemoney the value for dbo.WM_ProcureOrder.advanceMoney
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setAdvancemoney(BigDecimal advancemoney) {
        this.advancemoney = advancemoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.lock
     *
     * @return the value of dbo.WM_ProcureOrder.lock
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public Integer getLock() {
        return lock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.lock
     *
     * @param lock the value for dbo.WM_ProcureOrder.lock
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setLock(Integer lock) {
        this.lock = lock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.WM_ProcureOrder.accounting
     *
     * @return the value of dbo.WM_ProcureOrder.accounting
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public Integer getAccounting() {
        return accounting;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.WM_ProcureOrder.accounting
     *
     * @param accounting the value for dbo.WM_ProcureOrder.accounting
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setAccounting(Integer accounting) {
        this.accounting = accounting;
    }

	public Integer getIsdel() {
		return isdel;
	}

	public void setIsdel(Integer isdel) {
		this.isdel = isdel;
	}
    
}
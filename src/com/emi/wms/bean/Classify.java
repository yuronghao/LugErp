package com.emi.wms.bean;

import java.io.Serializable;

import com.emi.sys.core.annotation.EmiColumn;
import com.emi.sys.core.annotation.EmiTable;

/*
 * 类别
 */
@EmiTable(name="classify")
public class Classify implements Serializable{
	private static final long serialVersionUID = -7355038960980455970L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.classify.pk
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
	@EmiColumn(name="pk" ,increment=true)
    private Integer pk;

	@EmiColumn(name = "gid", ID = true)
    private String gid;

    /**
     * 类别名称
     */
	@EmiColumn(name="classificationName" )
    private String classificationname;

    /**
     * 类别类型码
     */
	@EmiColumn(name="styleGid" )
    private String stylegid;

    /**
     * 父id
     */
	@EmiColumn(name="parentid" )
    private String parentid;

    /**
     * 备注
     */
	@EmiColumn(name="note" )
    private String note;

    /**
     * 账套id
     */
	@EmiColumn(name="sobId" )
    private String sobid;

    /**
     * 组织id
     */
	@EmiColumn(name="orgId" )
    private String orgid;

	@EmiColumn(name="isDelete",hasDefault=true )
	private Integer isDelete;//是否已删除 1：已删除
	
	private String parentName;//父级名称
	private Boolean isRoot;//是否是根节点
	private Integer childrenNum;//子节点个数
	private Boolean isParent;//是否是父节点
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.classify.pk
     *
     * @return the value of dbo.classify.pk
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.classify.pk
     *
     * @param pk the value for dbo.classify.pk
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.classify.gid
     *
     * @return the value of dbo.classify.gid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getGid() {
        return gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.classify.gid
     *
     * @param gid the value for dbo.classify.gid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setGid(String gid) {
        this.gid = gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.classify.classificationName
     *
     * @return the value of dbo.classify.classificationName
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getClassificationname() {
        return classificationname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.classify.classificationName
     *
     * @param classificationname the value for dbo.classify.classificationName
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setClassificationname(String classificationname) {
        this.classificationname = classificationname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.classify.styleGid
     *
     * @return the value of dbo.classify.styleGid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getStylegid() {
        return stylegid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.classify.styleGid
     *
     * @param stylegid the value for dbo.classify.styleGid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setStylegid(String stylegid) {
        this.stylegid = stylegid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.classify.parentid
     *
     * @return the value of dbo.classify.parentid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.classify.parentid
     *
     * @param parentid the value for dbo.classify.parentid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.classify.note
     *
     * @return the value of dbo.classify.note
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.classify.note
     *
     * @param note the value for dbo.classify.note
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.classify.sobId
     *
     * @return the value of dbo.classify.sobId
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getSobid() {
        return sobid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.classify.sobId
     *
     * @param sobid the value for dbo.classify.sobId
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setSobid(String sobid) {
        this.sobid = sobid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.classify.orgId
     *
     * @return the value of dbo.classify.orgId
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getOrgid() {
        return orgid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.classify.orgId
     *
     * @param orgid the value for dbo.classify.orgId
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public Boolean getIsRoot() {
		return isRoot;
	}

	public void setIsRoot(Boolean isRoot) {
		this.isRoot = isRoot;
	}

	public Integer getChildrenNum() {
		return childrenNum;
	}

	public void setChildrenNum(Integer childrenNum) {
		this.childrenNum = childrenNum;
	}

	public Boolean getIsParent() {
		return isParent;
	}

	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
	}

    
}
package com.emi.wms.bean;

import java.io.Serializable;

import com.emi.sys.core.annotation.EmiColumn;
import com.emi.sys.core.annotation.EmiTable;
@EmiTable(name="AA_SoulationDetail")
public class AaSoulationdetail implements Serializable{
	private static final long serialVersionUID = -8402907146910819012L;

	//pk 
	@EmiColumn(name="pk" ,increment=true)
    private Integer pk;

	//属性值gid 
	@EmiColumn(name = "gid", ID = true)
    private String gid;

	//属性gid 
	@EmiColumn(name="soulationlistgid" )
    private String soulationlistgid;


	//基本属性值gid 
	@EmiColumn(name="basevaluegid" )
    private String basevaluegid;


    public Integer getPk() {
        return pk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_SoulationDetail.pk
     *
     * @param pk the value for dbo.AA_SoulationDetail.pk
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.AA_SoulationDetail.gid
     *
     * @return the value of dbo.AA_SoulationDetail.gid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getGid() {
        return gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_SoulationDetail.gid
     *
     * @param gid the value for dbo.AA_SoulationDetail.gid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setGid(String gid) {
        this.gid = gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.AA_SoulationDetail.soulationListgid
     *
     * @return the value of dbo.AA_SoulationDetail.soulationListgid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getSoulationlistgid() {
        return soulationlistgid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_SoulationDetail.soulationListgid
     *
     * @param soulationlistgid the value for dbo.AA_SoulationDetail.soulationListgid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setSoulationlistgid(String soulationlistgid) {
        this.soulationlistgid = soulationlistgid;
    }


    public String getBasevaluegid() {
        return basevaluegid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_SoulationDetail.baseValuegid
     *
     * @param basevaluegid the value for dbo.AA_SoulationDetail.baseValuegid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setBasevaluegid(String basevaluegid) {
        this.basevaluegid = basevaluegid;
    }
}
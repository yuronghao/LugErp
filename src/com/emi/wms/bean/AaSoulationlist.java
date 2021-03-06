package com.emi.wms.bean;

import java.io.Serializable;
import java.util.List;

import com.emi.sys.core.annotation.EmiColumn;
import com.emi.sys.core.annotation.EmiTable;
@EmiTable(name="AA_SoulationList")
public class AaSoulationlist implements Serializable{

	private static final long serialVersionUID = 4077577599025934598L;

	//pk 
	@EmiColumn(name="pk" ,increment=true)
    private Integer pk;

	//属性gid 
	@EmiColumn(name = "gid", ID = true)
    private String gid;

	//属性方案gid 
	@EmiColumn(name="soulationgid" )
    private String soulationgid;


	//基本属性gId 
	@EmiColumn(name="basepropertygid" )
    private String basepropertygid;

	
	

    public Integer getPk() {
        return pk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_SoulationList.pk
     *
     * @param pk the value for dbo.AA_SoulationList.pk
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.AA_SoulationList.gid
     *
     * @return the value of dbo.AA_SoulationList.gid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getGid() {
        return gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_SoulationList.gid
     *
     * @param gid the value for dbo.AA_SoulationList.gid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setGid(String gid) {
        this.gid = gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.AA_SoulationList.soulationgid
     *
     * @return the value of dbo.AA_SoulationList.soulationgid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public String getSoulationgid() {
        return soulationgid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_SoulationList.soulationgid
     *
     * @param soulationgid the value for dbo.AA_SoulationList.soulationgid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setSoulationgid(String soulationgid) {
        this.soulationgid = soulationgid;
    }

    public String getBasepropertygid() {
        return basepropertygid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.AA_SoulationList.basePropertygid
     *
     * @param basepropertygid the value for dbo.AA_SoulationList.basePropertygid
     *
     * @mbggenerated Wed Dec 02 15:26:31 CST 2015
     */
    public void setBasepropertygid(String basepropertygid) {
        this.basepropertygid = basepropertygid;
    }


    
}
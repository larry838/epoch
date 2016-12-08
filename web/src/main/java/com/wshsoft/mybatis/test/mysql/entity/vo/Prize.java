package com.wshsoft.mybatis.test.mysql.entity.vo;

import java.io.Serializable;
import java.util.Date;

import com.wshsoft.mybatis.annotations.IdType;
import com.wshsoft.mybatis.annotations.TableField;
import com.wshsoft.mybatis.annotations.TableId;
import com.wshsoft.mybatis.annotations.TableName;

/**
 *
 * 奖品表
 *
 */
@TableName(value = "prize") 
public class Prize implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** id */
	@TableId(value = "draw_id", type = IdType.AUTO)
	private Integer drawId;

	/** 奖品 */
	private String name;

	/** 概率 */
	private Double vinningvate;

	/** 数量 */
	private Integer number;

	/**  */
	@TableField(value = "gmt_modified")
	private Date gmtModified;

	public Integer getDrawId() {
		return this.drawId;
	}

	public void setDrawId(Integer drawId) {
		this.drawId = drawId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getVinningvate() {
		return this.vinningvate;
	}

	public void setVinningvate(Double vinningvate) {
		this.vinningvate = vinningvate;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

}

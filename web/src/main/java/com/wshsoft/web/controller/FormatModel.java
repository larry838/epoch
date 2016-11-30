package com.wshsoft.web.controller;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class FormatModel implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 7966421718013851499L;
	@NumberFormat(style=Style.CURRENCY)
	private Double money;

	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date  date;
	
	
	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


}

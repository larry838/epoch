package com.wshsoft.mybatis.test.mysql.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.session.RowBounds;

import com.wshsoft.mybatis.mapper.AutoMapper;
import com.wshsoft.mybatis.test.mysql.entity.vo.Draw;
import com.wshsoft.mybatis.test.mysql.pd.Page;



/**
 * <p>
 * 继承 AutoMapper，就自动拥有CRUD方法
 * </p>
 * 
 * @author xiejian
 * @Date 2016-01-23
 */
public interface DrawMapper extends AutoMapper<Draw> {
	
	public List datalistPage( Page page);



}

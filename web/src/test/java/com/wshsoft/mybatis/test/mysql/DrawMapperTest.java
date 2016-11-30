package com.wshsoft.mybatis.test.mysql;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.wshsoft.MybatisMapperTest;
import com.wshsoft.mybatis.test.mysql.mapper.DrawMapper;
import com.wshsoft.mybatis.test.mysql.pd.Page;




/**
 * <p>
 *  测试类
 * </p>
 * 
 * @author xiejian
 * @Date 2016-01-23 
 */
public class DrawMapperTest  extends MybatisMapperTest{
	@Autowired
	private DrawMapper drawMapper;

	@Test
	   public void testSelect(){
		drawMapper.selectById((long) 1);
	}
	
	@Test
	   public void testpage(){
		drawMapper.datalistPage(new Page());
	}
	
}

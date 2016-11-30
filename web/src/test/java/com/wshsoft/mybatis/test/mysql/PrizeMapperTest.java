package com.wshsoft.mybatis.test.mysql;

import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.wshsoft.MybatisMapperTest;
import com.wshsoft.mybatis.test.mysql.mapper.PrizeMapper;



/**
 * <p>
 *  测试类
 * </p>
 * 
 * @author xiejian
 * @Date 2016-01-23
 */
public class PrizeMapperTest  extends MybatisMapperTest{
	@Autowired
	private PrizeMapper prizeMapper;

	@Test
	   public void testSelect(){
		prizeMapper.selectById(1L);
	}
	@Test
	 public void testSelectListRow(){
	   prizeMapper.selectListRow(new RowBounds());
	}
	
}

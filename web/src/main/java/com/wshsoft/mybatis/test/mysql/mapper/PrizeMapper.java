package com.wshsoft.mybatis.test.mysql.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.wshsoft.mybatis.mapper.AutoMapper;
import com.wshsoft.mybatis.test.mysql.entity.vo.Prize;

/**
 *
 * Prize 表数据库控制层接口
 *
 */
public interface PrizeMapper extends AutoMapper<Prize> {
	
	/**
	 * 用户列表，分页显示
	 * 
	 * @param pagination
	 *            传递参数包含该属性，即自动分页
	 * @return
	 */
	List<Prize> selectListRow(RowBounds pagination);


}
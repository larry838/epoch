package com.wshsoft.framework.datasource.annotations;

import java.lang.annotation.*;

/**
 * 数据源管理，使用name注入
 */
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSourceManage {
	String name() default "";
	// 数据库的数量，默认只多数据源，故默认为0，多从库的可设置为从库数量
	int dbSize() default 0;
}
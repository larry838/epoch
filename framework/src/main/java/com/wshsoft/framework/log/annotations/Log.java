package com.wshsoft.framework.log.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * 系统日志注解
 * </p>
 * 
 * @author xiejian
 * @Date 2016-05-09
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {

	/**
	 * 操作描述
	 */
	String value() default "";

}

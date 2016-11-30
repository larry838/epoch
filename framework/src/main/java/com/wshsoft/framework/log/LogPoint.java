package com.wshsoft.framework.log;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * <p>
 * 日志切入点接口类
 * </p>
 * 
 * @author xiejian
 * @Date 2016-05-09
 */
public interface LogPoint {

	void saveLog(ProceedingJoinPoint joinPoint, String methodName, String operate);

}

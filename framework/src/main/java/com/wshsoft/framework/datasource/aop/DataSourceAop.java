package com.wshsoft.framework.datasource.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import com.wshsoft.framework.datasource.DynamicDataSource;
import com.wshsoft.framework.datasource.annotations.DataSourceManage;

/**
 * 多数据源切换Aop
 */
@Aspect
public class DataSourceAop {

    @Around("@annotation(dataSourceManage)")
    public Object doAround(ProceedingJoinPoint joinPoint, DataSourceManage dataSourceManage) throws Throwable {
        Object retVal = null;
        boolean selectedDataSource = false;
        try {
            if (null != dataSourceManage) {
                String dbName = dataSourceManage.name();
                int dbSize = dataSourceManage.dbSize();
                DynamicDataSource.use(dbName, dbSize);
                selectedDataSource = true;
            }
            retVal = joinPoint.proceed();
        } catch (Throwable e) {
            throw e;
        } finally {
            if (selectedDataSource) {
                DynamicDataSource.reset();
            }
        }
        return retVal;
    }

}
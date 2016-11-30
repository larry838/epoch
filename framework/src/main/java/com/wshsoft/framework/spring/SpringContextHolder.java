package com.wshsoft.framework.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.wshsoft.framework.exception.FrameWorkException;

/**
 * <p>
 * Spring 工具类 ，获取Spring容器中的上下文信息
 * </p>
 * <p>
 *  使用的时候需要注入到 ApplicaitonContext.xml
 *  如下设置：
 *  <br>
 *  <!-- 获取ApplicationContext上下文 -->
 *	<bean id="springContextHolder" class="com.wshsoft.framework.spring.SpringContextHolder" />
 * </p>
 * @author xiejian
 * @Date 2016-01-15
 */
public class SpringContextHolder implements ApplicationContextAware {

	private static ApplicationContext context;

	public static ApplicationContext getApplicationContext() {
		checkApplicationContext();
		return context;
	}

	public static <T> T getBean(Class<T> clazz) {
		checkApplicationContext();
		return context.getBean(clazz);
	}

	public void setApplicationContext(ApplicationContext ac) throws BeansException {
		context = ac;
	}

	private static void checkApplicationContext() {
		if (context == null) {
			throw new FrameWorkException("ApplicaitonContext未注入,请在ApplicationContext.xml中定义SpringContextHolder");
		}
	}

}
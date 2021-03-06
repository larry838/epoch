package com.wshsoft.framework.log.listener;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

import com.wshsoft.framework.RunEnvironment;
import com.wshsoft.framework.common.FrameworkConstants;
import com.wshsoft.framework.exception.FrameWorkException;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;

/**
 * <p>
 * logback spring 加载监听器，支持动态环境配置
 * </p>
 * @author xiejian
 * @date 2016-06-27 
 */
public class LogbackConfigListener implements ServletContextListener {

	private String charset = FrameworkConstants.UTF_8;

	private RunEnvironment runEnvironment;

	public static final String CONFIG_LOCATION_PARAM = "logbackConfigLocation";

	private static LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();

	private static JoranConfigurator configurator = new JoranConfigurator();


	@Override
	public void contextDestroyed( ServletContextEvent event ) {
		lc.stop();
	}


	@Override
	public void contextInitialized( ServletContextEvent event ) {
		try {
			String location = event.getServletContext().getInitParameter(CONFIG_LOCATION_PARAM);
			Resource resource = new DefaultResourceLoader().getResource(location);
			Map<Object, Object> context = new HashMap<Object, Object>();
			context.put("env", getRunEnvironment());
			StringWriter writer = new StringWriter();
			BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream(), getCharset()));
			Velocity.evaluate(new VelocityContext(context), writer, "LogbackConfigListener", br);
			this.initLogging(new ByteArrayInputStream(writer.toString().getBytes(getCharset())));
		} catch ( Exception e ) {
			throw new FrameWorkException(e);
		}
	}


	/**
	 * 启动 logback 日志功能
	 */
	public void initLogging( InputStream in ) {
		configurator.setContext(lc);
		lc.reset();
		try {
			configurator.doConfigure(in);
		} catch ( Exception e ) {
			throw new FrameWorkException(e);
		}
		lc.start();
	}


	public RunEnvironment getRunEnvironment() {
		if ( runEnvironment == null ) {
			return new RunEnvironment();
		}
		return runEnvironment;
	}


	public void setRunEnvironment( RunEnvironment runEnvironment ) {
		this.runEnvironment = runEnvironment;
	}


	public String getCharset() {
		return charset;
	}


	public void setCharset( String charset ) {
		this.charset = charset;
	}

}

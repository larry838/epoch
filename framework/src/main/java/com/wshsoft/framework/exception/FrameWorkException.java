package com.wshsoft.framework.exception;
/**
 * <p>
 * FrameWorkException 异常类
 * </p>
 * 
 * @author xiejian
 * @Date 2016-01-23
 */
public class FrameWorkException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public FrameWorkException(String message) {
		super(message);
	}

	public FrameWorkException(Throwable throwable) {
		super(throwable);
	}

	public FrameWorkException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
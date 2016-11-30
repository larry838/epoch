package com.wshsoft.framework.aop;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.wshsoft.framework.annotation.FormToken;


/**
 * <p>
 * 表单重复提交切面，使用注解标记是否验证。
 * </p>
 * <p>
 * 【使用】前台页面的表单中，增加下面内容来提交 token 验证是否重复提交。
 * <input type="hidden" name="token" value="${requestScope.token}" />
 * </p>
 * 
 * @author xiejian
 * @Date 2016-04-09
 */
@Aspect
@Component
public class ResubmitAspect {
	private static final String PARAM_TOKEN = "token";
	private static final String PARAM_TOKEN_FLAG = "TokenFlag_";

	/**
	 * <p>
	 * 执行切面拦截逻辑
	 * </p>
	 * 
	 * @param joinPoint
	 *            切面对象
	 * @param formToken
	 *            表单票据注解
	 * @throws Throwable
	 */
	@Around("@annotation(formToken)")
	public void execute(ProceedingJoinPoint joinPoint, FormToken formToken) throws Throwable {
		Object[] args = joinPoint.getArgs();
		String className = joinPoint.getTarget().getClass().getName();
		for (Object arg : args) {
			if (arg != null && arg instanceof HttpServletRequest) {
				HttpServletRequest request = (HttpServletRequest) arg;
				HttpSession session = request.getSession(true);
				if (formToken != null) {
					if ("GET".equalsIgnoreCase(request.getMethod())) {
						/* GET 生成 token */
						this.generate(joinPoint, request, session, PARAM_TOKEN_FLAG + className);
					} else {
						/* POST 验证 token */
						this.validation(joinPoint, request, session, PARAM_TOKEN_FLAG + className);
					}
				}
			}
		}
	}

	/**
	 * <p>
	 * 生成表单 token
	 * </p>
	 */
	public void generate(ProceedingJoinPoint joinPoint, HttpServletRequest request, HttpSession session,
			String tokenFlag) throws Throwable {
		String uuid = UUID.randomUUID().toString();
		session.setAttribute(tokenFlag, uuid);
		request.setAttribute(PARAM_TOKEN, uuid);
		joinPoint.proceed();
	}

	/**
	 * <p>
	 * 验证表单 token
	 * </p>
	 * <p>
	 * 验证结果一致，既为第一次提交，删除会话中存储的token，并继续执行方法。<br>
	 * 否则不做任何处理。
	 * </p>
	 */
	public void validation(ProceedingJoinPoint joinPoint, HttpServletRequest request, HttpSession session,
			String tokenFlag) throws Throwable {
		Object sessionFlag = session.getAttribute(tokenFlag);
		Object requestFlag = request.getParameter(PARAM_TOKEN);
		if (sessionFlag != null && sessionFlag.equals(requestFlag)) {
			session.removeAttribute(tokenFlag);
			joinPoint.proceed();
		}
	}

}

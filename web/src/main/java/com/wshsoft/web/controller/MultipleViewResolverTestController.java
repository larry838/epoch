package com.wshsoft.web.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 多视图解析器支持示例
 * @author xiejian
 * @Date 2016-01-23
 *
 */
@Controller
@RequestMapping(value = "/demo")
public class MultipleViewResolverTestController {
    private static Log logger = LogFactory.getLog(MultipleViewResolverTestController.class);
    
    @RequestMapping(value = "/test1")
    public String test1(HttpServletRequest request, ModelMap map) {
        logger.info("使用JSP视图解析器");
        map.put("name", "hello world");
        map.put("date", new Date());
        return "jspTest.jsp";
    }
    
    @RequestMapping(value = "/test2")
    public String test2(HttpServletRequest request, ModelMap map) {
        logger.info("使用Freemarker视图解析器");
        map.put("date", new Date());
        map.put("name", "hello world");
        return "hello.ftl";
    }
    
    @RequestMapping(value = "/test3")
    public String test3(HttpServletRequest request, ModelMap map) {
        logger.info("使用Velocity视图解析器");
        map.put("name", "hello world");
        map.put("date", new Date());
        return "demo.vm";
    }
}
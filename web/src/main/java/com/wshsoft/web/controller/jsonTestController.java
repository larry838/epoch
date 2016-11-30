package com.wshsoft.web.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/demo")
public class jsonTestController {

	@RequestMapping("/json1")
	@ResponseBody
	public JsonModel json1() {
		JsonModel demo=new JsonModel();
	    demo.setBirthday(new Date());
	    demo.setCreateTime(new Date());
	    demo.setHeight(170);
	    demo.setName("tomcat"); 
	    demo.setRemark("json测试"); 
	    demo.setStatus((short)1); 
	    return demo;
	}
	
	@RequestMapping("/json2")
	public void json2() {
		JsonModel demo=new JsonModel();
	    demo.setBirthday(new Date());
	    demo.setCreateTime(new Date());
	    demo.setHeight(170);
	    demo.setName("tomcat");
	    demo.setRemark("json测试");
	    demo.setStatus((short)1);
	  //  String json=JsonUtil.toJson(obj);//;json处理工具类
	   // HttpServletResponse response = //获取response对象
	  //  response.getWriter().print(json);
	}
}

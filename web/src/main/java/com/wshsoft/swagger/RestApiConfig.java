package com.wshsoft.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/* 
 * Restful API 访问路径: 
 * http://IP:port/{context-path}/swagger-ui.html 
 * eg:http://localhost:8080/epoch/swagger-ui.html 
 */  
@EnableWebMvc  
@EnableSwagger2  
@ComponentScan(basePackages = {"com.wshsoft.swagger"})  
@Configuration  

public class RestApiConfig extends WebMvcConfigurationSupport{  
	  @Bean  
	      public Docket createRestApi() {  
	          return new Docket(DocumentationType.SWAGGER_2)  
	                  .apiInfo(demoApiInfo())  
	                  .select()  
	                  .apis(RequestHandlerSelectors.basePackage("com.wshsoft.swagger"))  
	                  .paths(PathSelectors.any())  
	                  .build();  
	      }  
	 
	  private ApiInfo demoApiInfo() {
	         ApiInfo apiInfo = new ApiInfo("Cust Domain's API",//大标题
	                "Cust Domain's REST API, for system administrator",//小标题
	                "1.0",//版本
	                "NO terms of service",
	                 "329458839@qq.com",//作者
	                "cust共享",//链接显示文字
	                "https://github.com/zhbxzc/cust"//网站链接
	        );
			return apiInfo;
	  }
	        		 
	     private ApiInfo apiInfo() {  
	         return new ApiInfoBuilder()  
	              .title("Spring 中使用Swagger2构建RESTful APIs") 
	              .description("更多Spring Boot相关文章请关注:")
	                .termsOfServiceUrl("http://blog.csdn.net/he90227")  
	                .contact("xiejian")  
	                  .version("1.1")  
	                  .build();  
	      }  


}

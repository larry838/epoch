<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Hello World!</h2>

  


  
 


 





























































































 




WORKING的专栏









目录视图
 摘要视图
 订阅
 . 




深度学习代码专栏      攒课--我的学习我做主      开启你的知识管理，知识库个人图谱上线      
 

            

 关于web.xml中配置404错误跳转页面 在ie不能显示自定义错误页面的问题   .


标签： java  

2014-11-06 13:56 488人阅读 评论(0) 收藏 举报 
.

  

 分类： 

java web（62）   


 . 
关于web.xml中配置404错误跳转页面 在ie不能显示自定义错误页面的问题
<error-page>
   <error-code>404</error-code>
   <location>/error_pages/404.html</location>
 </error-page>

本来自己定义了一个错误页面，不过在ie 6中怎么也显示不出来，firefox一点问题都没有，几经查询才知道原来是ie自作聪明给换掉了，
 对错误页面的处理在ie来看页面大小<1024b 会被认为十分不友好，所以ie就将改页面给替换成自己的错误提示页面了，解决办法就是充实一下页面,让大小超过1024即可  
 
      .
        
顶1踩0.
  

 
 
上一篇

Hibernate中Criteria的使用


下一篇

jQuery选中当前行

.


我的同类文章


java web（62）  

 •项目中发现Element类下无getTextContent函数2015-06-16阅读108
•DWR3常见错误解决方法2015-03-29阅读138
•如何正确地在Axis、Axis2和Apache CXF之间抉择？2015-02-24阅读92
•以jetty做容器，数据在传输过程中出现乱码2015-01-24阅读205
•java动态代理（JDK和cglib）2015-01-20阅读171
•windows和linux 下将tomcat注册为服务2015-01-17阅读159
•java.lang.NoClassDefFoundError: javax/el/ELResolver解决方案2015-03-29阅读298
•struts2核心工作流程与原理2015-03-07阅读117
•CXF动态客户端调用webservice实例2015-02-24阅读113
•java获取系统网络端口IP2015-01-24阅读176
•过多if-else分支的优化2015-01-20阅读177

更多文章
 

   








猜你在找

  
java语言从入门到精通2016+项目实训零基础学Java系列从入门到精通微信公众平台深度开发Java版 v2.0（第一季）完整版微信公众平台深度开发Java版v2.0（第二季）完整版Android开发精品课程【Java核心知识】
前端性能优化前端性能优化指南前端性能优化指南前端性能优化指南iOS 9新功能 
 


 

查看评论


  暂无评论








发表评论
用 户 名：
larry838
评论内容：

插入代码



  
* 以上用户言论只代表其个人观点，不代表CSDN网站的观点或立场
  




快速回复 TOP 
  

核心技术类目

全部主题 Hadoop AWS 移动游戏 Java Android iOS Swift 智能硬件 Docker OpenStack VPN Spark ERP IE10 Eclipse CRM JavaScript 数据库 Ubuntu NFC WAP jQuery BI HTML5 Spring Apache .NET API HTML SDK IIS Fedora XML LBS Unity Splashtop UML components Windows Mobile Rails QEMU KDE Cassandra CloudStack FTC coremail OPhone  CouchBase 云计算 iOS6 Rackspace  Web App SpringSide Maemo Compuware 大数据 aptech Perl Tornado Ruby Hibernate ThinkPHP HBase Pure Solr Angular Cloud Foundry Redis Scala Django Bootstrap 
 


   




个人资料
  

WK_ITing

  



访问：25965次
积分：572 
等级：  

 
排名：千里之外
.原创：15篇
转载：105篇
译文：0篇
评论：4条
.
文章搜索
     
.
 文章分类java web(63) 
js(6) 
maven(1) 
浏览器(1) 
SpringMVC(16) 
Spring(10) 
http(2) 
集群(1) 
生活琐事(2) 
数据库(23) 
centos(4) 
MQ(2) 

文章存档
2015年06月(1).
2015年03月(3).
2015年02月(5).
2015年01月(15).
2014年12月(14).




展开
.
阅读排行  Spring MVC @RequestBody接收JSON报HTTP 415/400问题的解决(1625) 
Eclipse建立Web项目出现 Runtime "Apache Tomcat v7.0" is invalid. The JRE could not be found. Edit the serve(921) 
http协议中:GET/POST/PUT/DELETE/INPUT/TRACE/OPTIONS/HEAD方法(487) 
关于web.xml中配置404错误跳转页面 在ie不能显示自定义错误页面的问题(482) 
CentOS安装MySQL-server-5.6.13-1.el6.x86_64.rpm(474) 
在SpringMVC中使用@RequestBody注解处理json时，报出HTTP Status 415的解决方案(460) 
java读文件时，明明文件存在，却报错java.io.FileNotFoundException(456) 
PRIMARY KEY、UNIQUE KEY、INDEX区别(379) 
正确使用日志的10个技巧(373) 
java实现根据Linux上的mount的网络路径取到Linux上的mount的本地地址(354) 

评论排行Spring MVC @RequestBody接收JSON报HTTP 415/400问题的解决(4) 
上传第三方jar包到nexus(0) 
常被设计成单例的场景(0) 
java 进程间通讯的有几种方法？(0) 
jsp页面离开时，揭示是否保存页面修改内容，最简单的方法(0) 
关于java for()循环 remove 的使用(0) 
Java将科学计数法数据转为字符串(0) 
maven3常用命令、java项目搭建、web项目搭建详细图解(0) 
使用递归遍历文件夹构建文件树（一）(0) 
项目中发现Element类下无getTextContent函数(0) 

推荐文章* 2016 年最受欢迎的编程语言是什么？
* Chromium扩展（Extension）的页面（Page）加载过程分析
* Android Studio 2.2 来啦
* 手把手教你做音乐播放器（二）技术原理与框架设计
* JVM 性能调优实战之：使用阿里开源工具 TProfiler 在海量业务代码中精确定位性能代码

最新评论Spring MVC @RequestBody接收JSON报HTTP 415/400问题的解决 
远方的彪: 增加header 属性Content-Type：application/json 

Spring MVC @RequestBody接收JSON报HTTP 415/400问题的解决 
yynwhu: 加上哪句？ 

Spring MVC @RequestBody接收JSON报HTTP 415/400问题的解决 
yynwhu: 到底要加上哪句啊？ 

Spring MVC @RequestBody接收JSON报HTTP 415/400问题的解决 
JimmyLincole: 请问，“补充：使用postman测试时，也要加上下面这句”下面这句指的是？？？ 



 


  

.   


公司简介

|

招贤纳士

|

广告服务

|

银行汇款帐号

|

联系方式

|

版权声明

|

法律顾问

|

问题报告

|

合作伙伴

|

论坛反馈

网站客服

杂志客服

微博客服

webmaster@csdn.net

400-600-2320

|

北京创新乐知信息技术有限公司 版权所有

|

江苏乐知网络技术有限公司 提供商务支持

京 ICP 证 09002463 号

|

Copyright © 1999-2014, CSDN.NET, All Rights Reserved 

GongshangLogo








              


   




 





























































































</body>
</html>

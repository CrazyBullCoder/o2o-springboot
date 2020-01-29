# SSM到Spring Boot -从零开发校园商铺平台

[![Travis](https://img.shields.io/badge/language-Java-yellow.svg)](http://tyronblog.com/tags/school-o2o)<br/>

### 核心技术栈：

**前端**：前端UI库 SUI Mobile／ jQuery<br/>
**后端**：SSM／Spring Boot／图片开源工具 Thumbnailator / 验证码组件Kaptcha<br/>
**数据库**：MySQL<br/>

慕课网教程：[SSM到Spring Boot-从零开发校园商铺平台-慕课网实战](https://coding.imooc.com/class/144.html)

### 校园商铺从SSM到springboot搭建过程中遇到的问题

### 1、java.lang.AbstractMethodError: Method com/mchange/v2/c3p0/impl/NewProxyResultSet.isClosed()Z is abstract<br/>
pom.xml中c3p0 c3p0 0.9.1.2  改成  com.mchange c3p0 0.9.5.2
### 2、The type WebMvcConfigurerAdapter is deprecated<br/>
可以采用直接实现WebMvcConfigurer接口的方式，而不用使用WebMvcConfigurerAdapter 


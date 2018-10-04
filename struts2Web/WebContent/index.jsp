<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>struts示例演示</title>
  </head>
  
  <body>
   <h3>版本1.1：访问默认业务方法:POJO+execute() </h3>
   <form action="Login" method="post">
         姓名:<input type="text" name="userName" /><br/>
         密码:<input type="password" name="password" /> <br/>
     <input type="submit" value="登录">
   </form>
       
   <h3>版本1.2：访问自定义业务方法,如:fun1()</h3>
   <form action="Login!fun1" method="post">
         姓名:<input type="text" name="userName" /><br/>
         密码:<input type="password" name="password" /> <br/>
     <input type="submit" value="登录">
   </form>   
    
   <h3>版本1.3：访问使用Web环境的自定义业务方法fun2()</h3>
   <form action="Login!fun2" method="post">
         姓名:<input type="text" name="userName" /><br/>
         密码:<input type="password" name="password" /> <br/>
     <input type="submit" value="登录">
   </form>    

   <h3>版本2.1：访问继承ActionSupport类的Action + Struts标签</h3>
   <s:form action="Login2">
     <s:textfield name="userName" label="姓名:"/>
     <s:password name="password" label=" 密码:"/>
     <s:submit value="登录" align="center"/>
   </s:form>  
   
   <h3>版本2.2：访问继承ActionSupport类的Action + Struts标签+validation校验框架</h3>
   <s:form action="Login3">
     <s:textfield name="userName" label="姓名:"/>
     <s:password name="password" label=" 密码:"/>
     <s:submit value="登录" align="center"/>
   </s:form>  
	
	<br/><br/>
  </body>
</html>

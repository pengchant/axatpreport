<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  	<script type="text/javascript"> 
		function before() { 
					if (loginForm.account.value.length == 0) {
				alert("请输入用户名！");
				loginForm.username.focus() ;      
				return false;
			} 
						if (loginForm.password.value.length==0) {
				alert("请输入密码！");
				loginForm.password.focus();      
				return false;
			} 
			loginForm.action="/springmvc/user/login";
	        loginForm.submit();
		}
		</script>
  <body>
   <form name="loginForm"  onSubmit="return before()" method="post">
   		<br>用户名称：<input  type="text" name="account" value=""/>
   		<br>用户密码：<input  type="text" name="password" value=""/>
   		<br><input type="submit" value="登录"/>
   </form>
  </body>
</html>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>教务信息管理系统</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<link href="CSS/login.css" rel="stylesheet" type="text/css" />
<style type="text/css">
.form {
	float: center;
	height: 60px;
	line-height: 40px;
	font-size: 20px;
	letter-spacing: 10px;
	color: #fff;
	cursor: pointer;
	font-family: "微软雅黑";
}
</style>

</head>
<body background="images/002.jpg" style="background-size: 100% 100%;">
	<table width="1300" height="500" border="0">
		<tr width="1300" height="30" colspan="0" align="center">
			<td><font size="+4">教务信息管理系统</font></td>
		</tr>
		<tr width="1300" height="30" colspan="0" align="center">
			<td><font style="color:	#FFFFFF; " size="+2">
			Educational	Administration Information Management System</font></td>
		</tr>
		<tr align="center">
			<td width="1300">
				<form class="form" method="post" action="UserLogin">
						<s:property value="msg"/><br>
						用户名 <label> <input class="form-control" type="text"
							name="username">
						</label>
						密&nbsp;&nbsp;码 <label> <input class="form-control"
							type="password" name="password">
						</label>
					<input type="radio" name="person" value="student" checked="checked" />学生
					<input type="radio" name="person" value="teacher" checked="checked" />教师
					<input type="radio" name="person" value="admin" checked="checked" />管理员
					<p>
						<input
							class="button button-glow button-rounded button-raised button-primary"
							type="submit" name="Submit" value="登    录" /> 
						<input
							class="button button-glow button-rounded button-caution"
							type="reset" name="Submit" value="重置" />
					</p>
				</form>
			</td>
		</tr>
	</table>
</body>
</html>

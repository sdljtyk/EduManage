<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="CSS/login.css">
  </head>
  
  <body>
    <div align="center" >
		<form action="tea_UpdateInfo.action" method="post" class="my_form">
			<table width="470"  cellpadding="1" >
				<tr>
					<td height="25" colspan="2">
						<div align="center">
							<strong><font color="#00EE00">信息修改</font></strong>
						</div>
					</td>
				</tr>
			</table>
			<table width="470" height="95%" cellpadding="1" align="center" >
				<tr>
					<td width="140" height="20"><strong>姓名：</strong></td>
					<td width="320"><input class="form-control" type="text" name="teacher.TName" value="<s:property value="#session.teacher.TName"/>"/></td>
				</tr>
				<tr>
					<td width="140" height="20"><strong>年龄：</strong></td>
					<td width="320"><input class="form-control" type="text" name="teacher.TAge" value="<s:property value="#session.teacher.TAge"/>"/></td>
				</tr>
				<tr>
					<td width="140" height="20"><strong>联系方式：</strong></td>
					<td width="320"><input class="form-control" type="text" name="teacher.TTel" value="<s:property value="#session.teacher.TTel"/>"/></td>
				</tr>
				
				<tr>
					<td width="140" height="20"><strong>电子邮件：</strong></td>
					<td width="320"><input class="form-control" type="text" name="teacher.TEmail" value="<s:property value="#session.teacher.TEmail"/>"/></td>
				</tr>
				<tr>
					<td height="25" colspan="2">
						<div align="center">
							<input  class="button button-pill button-primary" type="submit" value="修改" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						</div>
					</td>
				</tr>
			</table>
		</form>
	</div>
  </body>
</html>

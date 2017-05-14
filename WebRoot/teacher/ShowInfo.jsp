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
    
    <title>个人信息</title>
    
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
    	<div align="center">
		<form method="post" style="height: 100%;" class="my_form">
			<table width="470"  cellpadding="1" >
				<tr>
					<td height="20" colspan="2">
						<div align="center">
							<strong><font color="#00EE00">信息查看</font></strong>
						</div>
					</td>
				</tr>
			</table>
			<table width="470" height="95%" cellpadding="1" align="center" >
				<tr>
					<td width="140" height="20"><strong>姓名：</strong></td>
					<td width="320"><input class="form-control" type="text" name="teacher.TName" value="<s:property value="#session.teacher.TName"/>" readonly="readonly"/></td>
				</tr>
				<tr>
					<td width="140" height="20"><strong>年龄：</strong></td>
					<td width="320"><input class="form-control" type="text" name="teacher.TAge" value="<s:property value="#session.teacher.TAge"/>" readonly="readonly"/></td>
				</tr>
				<tr>
					<td width="140" height="20"><strong>联系方式：</strong></td>
					<td width="320"><input class="form-control" type="text" name="teacher.TTel" value="<s:property value="#session.teacher.TTel"/>" readonly="readonly"/></td>
				</tr>
				
				<tr>
					<td width="140" height="20"><strong>电子邮件：</strong></td>
					<td width="320"><input class="form-control" type="text" name="teacher.TEmail" value="<s:property value="#session.teacher.TEmail"/>" readonly="readonly"/></td>
				</tr>
				<tr>
					<td width="140" height="20"><strong>教师职称：</strong></td>
					<td width="320"><input class="form-control" type="text" name="teacher.TType" value="<s:property value="#session.teacher.TType"/>" readonly="readonly"/></td>
				</tr>
			</table>
		</form>
	</div>
  </body>
</html>

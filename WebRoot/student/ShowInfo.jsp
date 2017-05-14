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
					<td width="320"><input class="form-control" type="text" name="student.SName" value="<s:property value="#session.student.SName"/>" readonly="readonly"/></td>
				</tr>
				<tr>
					<td width="140" height="20"><strong>学号：</strong></td>
					<td width="320"><input class="form-control" type="text" name="student.SNo" value="<s:property value="#session.student.SNo"/>" readonly="readonly"/></td>
				</tr>
				<tr>
					<td width="140" height="20"><strong>性别：</strong></td>
					<td width="320"><input class="form-control" type="text" name="student.SSex" value="<s:property value="#session.student.SSex"/>" readonly="readonly"/></td>
				</tr>
				
				<tr>
					<td width="140" height="20"><strong>籍贯：</strong></td>
					<td width="320"><input class="form-control" type="text" name="student.SFrom" value="<s:property value="#session.student.SFrom"/>" readonly="readonly"/></td>
				</tr>
				<tr>
					<td width="140" height="20"><strong>邮件：</strong></td>
					<td width="320"><input class="form-control" type="text" name="student.SEmail" value="<s:property value="#session.student.SEmail"/>" readonly="readonly"/></td>
				</tr>
				<tr>
					<td width="140" height="20"><strong>电话：</strong></td>
					<td width="320"><input class="form-control" type="text" name="student.STel" value="<s:property value="#session.student.STel"/>" readonly="readonly"/></td>
				</tr>
				
				<tr>
					<td width="140" height="20"><strong>所需学分：</strong></td>
					<td width="320"><input class="form-control" type="text" name="student.SMark" value="<s:property value="#session.student.SMark"/>" readonly="readonly"/></td>
				</tr>
				<tr>
					<td width="140" height="20"><strong>已获学分：</strong></td>
					<td width="320"><input class="form-control" type="text" name="student.SMarked" value="<s:property value="#session.student.SMarked"/>" readonly="readonly"/></td>
				</tr>
				<tr>
					<td width="140" height="20"><strong>所属院系：</strong></td>
					<td width="320"><input class="form-control" type="text" name="student.SDepartment" value="<s:property value="#session.student.SDepartment"/>" readonly="readonly"/></td>
				</tr>
				<tr>
					<td width="140" height="20"><strong>最大选课量：</strong></td>
					<td width="320"><input class="form-control" type="text" name="student.SMaxclass" value="<s:property value="#session.student.SMaxclass"/>" readonly="readonly"/></td>
				</tr>
			</table>
		</form>
	</div>
  </body>
</html>

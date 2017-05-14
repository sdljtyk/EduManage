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
    
    <title>所有课程</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="CSS/login.css">
	<style type="text/css">
		.STYLE1 {color: #FF0000}
	</style>
  </head>
  
  <body>
  	<center class="STYLE1">${msg}</center>
    <table border="2" cellpadding="0" cellspacing="0" 
		width="98%" align="center">
		<tr>
			<th height="30">课程名称</th>
			<th height="30">开课量</th>
			<th height="30">学分</th>
			<th height="30">已选人数</th>
			<th height="30">开课教室</th>
			<th height="30">上课时间</th>
			<th height="30">开课院校</th>
			<th height="30">用户操作</th>
		</tr>
		<s:iterator value="classes" id="classes">
			<tr>
				<td align="center"><s:property value="CName" /></td>
				<td align="center"><s:property value="CChoosemax" /></td>
				<td align="center"><s:property value="CMark" /></td>
				<td align="center"><s:property value="CChoosed" /></td>
				<td align="center"><s:property value="CRoom" /></td>
				<td align="center"><s:property value="CTime" /></td>
				<td align="center"><s:property value="CDepartment" /></td>
				<td align="center"><a href="ClassInfo.action?stuclass.CId=<s:property value="CId"/>">录入成绩</a></td>
			</tr>
		</s:iterator>
	</table>
	
  </body>
</html>

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
    
    <title>查看教师</title>
    
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
  <form action="tea_findLike.action" class="my_form">
  	<table>
  		<tr align="right">
			<td colspan="8">
				老师姓名：
				<input type="text" name="likeName" >
			</td>
			<td align="center"><input type="submit" value="查询">
		</tr>
  	</table>
  </form>
    <table border="2" cellpadding="0" cellspacing="0" 
		width="98%" align="center"  class="my_form">
		<tr>
			<th height="30">老师编号</th>
			<th height="30">老师姓名</th>
			<th height="30">老师年龄</th>
			<th height="30">联系方式</th>
			<th height="30">老师邮箱</th>
			<th height="30">老师职称</th>
			<th height="30">用户操作</th>
		</tr>

		<s:iterator value="tea" id="tea">
			<tr>
				<td align="center"><s:property value="TId" /></td>
				<td align="center"><s:property value="TName" /></td>
				<td align="center"><s:property value="TAge" /></td>
				<td align="center"><s:property value="TTel" /></td>
				<td align="center"><s:property value="TEmail" /></td>
				<td align="center"><s:property value="TType" /></td>
				<td align="center"><a href="delTeacher.action?teacher.TId=<s:property value="TId" />">删除</a></td>
			</tr>
		</s:iterator>
	</table>
  </body>
</html>

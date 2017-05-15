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
    
    <title>查看学生</title>
    
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
    <table border="2" cellpadding="0" cellspacing="0" 
		width="98%" align="center" class="my_form">
		<tr>
			<th height="30">头像</th>
			<th height="30">学生学号</th>
			<th height="30">学生姓名</th>
			<th height="30">学生性别</th>
			<th height="30">所需学分</th>
			<th height="30">已获学分</th>
			<th height="30">学生籍贯</th>
			<th height="30">电子邮箱</th>
			<th height="30">所属院系</th>
			<th height="30">联系方式</th>
			<th height="30">最大选课量</th>
			<th height="30">用户操作</th>
		</tr>

		<s:iterator value="stu" id="stu">
			<tr>
				<td><img alt="touxiang" src="uploads/<s:property value="SImage" />" height="40">
				<td align="center"><s:property value="SNo" /></td>
				<td align="center"><s:property value="SName" /></td>
				<td align="center"><s:property value="SSex" /></td>
				<td align="center"><s:property value="SMark" /></td>
				<td align="center"><s:property value="SMarked" /></td>
				<td align="center"><s:property value="SFrom" /></td>
				<td align="center"><s:property value="SEmail" /></td>
				<td align="center"><s:property value="SDepartment" /></td>
				<td align="center"><s:property value="STel" /></td>
				<td align="center"><s:property value="SMaxclass" /></td>
				<td align="center"><a href="delStudent.action?student.SId=<s:property value="SId" />">删除</a></td>
			</tr>
		</s:iterator>
	</table>
  </body>
</html>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>管理员界面</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
-->
<link href="CSS/login.css" rel="stylesheet" type="text/css">

<style type="text/css">
    frameset {border:0px;}
    frame {border:0px;}
</style>
</head>
<body background="images/003.jpg">
	<div align="center">
		<table width="100%" border="0.3"  background="images/005.jpg" style="border-radius: 10px;opacity: 0.8;box-shadow: 2px 2px 20px 0px #fff;">
			<tr>
				<td width="100%" height="80">
				    <div align="center">
				    	<span><font size="+4">教务信息管理系统</font></span>
				 	</div>
				</td>
			</tr>
		</table>
		<table  width="100%" border="0.3"  background="images/005.jpg" style="border-radius: 10px;opacity: 0.8;box-shadow: 2px 2px 20px 0px #fff;">
			<tr>
				<td width="15%" rowspan="2">
					<div align="center">
						<a class="button button-3d button-primary button-rounded" href="showStudent.action" target="main"><strong><font size="0">查看学生信息</font></strong></a><br /> <br />
						<a class="button button-3d button-primary button-rounded" href="<c:url value='/admin/AddStudent.jsp'/>" target="main"><strong><font size="0">添加学生信息</font></strong></a><br /> <br />
						<a class="button button-3d button-primary button-rounded" href="showTeacher.action" target="main"><strong><font size="0">查看教师信息</font></strong></a><br /> <br />
						<a class="button button-3d button-primary button-rounded" href="<c:url value='/admin/AddTeacher.jsp'/>" target="main"><strong><font size="0">添加教师信息</font></strong></a><br /><br />
						<a class="button button-3d button-primary button-rounded" href="showClass.action" target="main"><strong><font size="0">查看课程信息</font></strong></a><br /> <br />
						<a class="button button-3d button-primary button-rounded" href="<c:url value='/admin/AddClass.jsp'/>" target="main"><strong><font size="0">添加课程信息</font></strong></a><br /> <br />
						<a class="button button-3d button-primary button-rounded" href="<c:url value='/admin/UpdatePass.jsp'/>" target="main"><strong><font size="0">密&nbsp;&nbsp;&nbsp;码&nbsp;&nbsp;&nbsp;修&nbsp;改</font></strong></a><br /><br />
						<a class="button button-3d button-primary button-rounded" href="UserLayOut.action"><strong><font size="0">退&nbsp;&nbsp;&nbsp;出&nbsp;&nbsp;&nbsp;主&nbsp;页</font></strong></a><br />
					</div>
				</td>
				<td width="85%" height="100%" >
					<iframe name="main" width="98%" height="450" frameborder=no border=0 marginwidth=0 marginheight=0 scrolling=no></iframe><br>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>

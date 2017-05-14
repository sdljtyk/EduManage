<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>选课情况</title>
    
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
		<form method="post" class="my_form">
			<table border="2" cellpadding="0" cellspacing="0" 
				width="98%" align="center">
			<tr>
					<th height="30">课程编号</th>
					<th height="30">学号</th>
					<th height="30">姓名</th>
					<th height="30">性别</th>
					<th height="30">联系方式</th>
					<th height="30">电子邮件</th>
					<th height="30">所属院系</th>
					<th height="30">方案成绩</th>
					
				</tr>
			<s:iterator value="stuclasses" id="stuclasses" status="L">
				<tr>
					<td align="center"><s:property value="CId" /></td>
					<td align="center"><s:property value="students[#L.index].SNo" /></td>
					<td align="center"><s:property value="students[#L.index].SName" /></td>
					<td align="center"><s:property value="students[#L.index].SSex" /></td>
					<td align="center"><s:property value="students[#L.index].STel" /></td>
					<td align="center"><s:property value="students[#L.index].SEmail" /></td>
					<td align="center"><s:property value="students[#L.index].SDepartment" /></td>
					<td align="center">
						<s:property value="scScore" />
					</td>
					
				</tr>
			</s:iterator>
			</table>
		</form>
	</div>
  </body>
</html>

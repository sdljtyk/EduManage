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
    
    <title>修改密码</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="CSS/login.css">
		<script language="javascript">
	function sure() {

		var flag = confirm("你确定要修改密码吗");
		if (flag) {
			return true;
		} else {
			return false;
		}

	}
	function myCheck()
    {
      for(var i=0;i<document.form1.elements.length-1;i++)
      {
       if(document.form1.elements[i].value=="")
       {
         alert("当前表单不能有空项");
         document.form1.elements[i].focus();
         return false;
       }
      }
      var pd1=document.getElementById("newpass");
      var pd2=document.getElementById("surepass");
      if(pd1.value!=pd2.value)
      {
      	alert("两次密码不一致，请重新输入！")
      	return false;
      }
      return true;
      
    }
</script>
  </head>
  
  <body>
    <div align="center" >
		<form action="stu_updatePass.action" method="post" name="form1" onSubmit="return myCheck()"
			onSubmit="return sure()"  enctype="multipart/form-data" class="my_form">
			<table width="470"  cellpadding="1" >
				<tr>
					<td height="25" colspan="2">
						<div align="center">
							<strong><font color="#00EE00">密码修改</font></strong>
						</div>
					</td>
				</tr>
				<tr>
					<td align="center">
						<font color="#990033"><s:property value="msg"/></font>
					</td>
				</tr>
			</table>
			<table width="470"  cellpadding="1" align="center" >
				<tr>
					<td width="140" height="30"><strong>原密码：</strong></td>
					<td width="320"><input class="form-control" type="password" name="student.SPass" />
				</tr>
				<tr>
					<td width="140" height="25"><strong>新密码：</strong></td>
					<td width="320"><input class="form-control" type="password" name="newpass" /></td>
				</tr>
				<tr>
					<td width="140" height="25"><strong>确认密码：</strong></td>
					<td width="320"><input class="form-control" type="password" name="surepass" />
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

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加教师界面</title>

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

		var flag = confirm("你确定要添加新的教师吗");
		if (flag) {
			return true;
		} else {
			return false;
		}

	}
	function chkblk(ele)
	{
		//去掉所有空格后再判断是否为空
		if (ele.value.replace(/(^\s*)|(\s*$)/g, "")=="")
		alert("Input is blank");
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
      return true;
      
    }
</script>
</head>
  
  <body>
  	<div align="center">
		<form method="post" action="AddTeacher.action" name="form1" onSubmit="return myCheck()" onsubmit="return sure();" enctype="multipart/form-data"
			class="my_form">
			<table width="400" height="100% ">
				<tr>
					<td height="25" colspan="2"><div align="center">
							<strong><font color="#00EE00">添加教师信息</font></strong>
						</div></td>
				</tr>
				<tr>
					<td height="30"><strong>姓名</strong></td>
					<td><label> <input class="form-control" type="text" onmouseout="chkblk(this)"
							name="teacher.TName">
					</label></td>
				</tr>
				<tr>
					<td height="30"><strong>年龄</strong></td>
					<td><label> <input class="form-control" type="text" onmouseout="chkblk(this)"
							name="teacher.TAge">
					</label></td>
				</tr>
				<tr>
					<td height="30"><strong>联系方式</strong></td>
					<td><label> <input class="form-control" type="text" onmouseout="chkblk(this)"
							name="teacher.TTel">
					</label></td>
				</tr>
				<tr>
					<td height="30"><strong>电子邮件</strong></td>
					<td><label> <input class="form-control" type="text" onmouseout="chkblk(this)"
							name="teacher.TEmail">
					</label></td>
				</tr>
				<tr>
					<td height="30"><strong>教师类型</strong></td>
					<td><label> <select style="width: 221px;height:30" name="teacher.TType">
								<option value="助教">助教</option>
								<option value="讲师">讲师</option>
								<option value="副教授">副教授</option>
								<option value="教授">教授</option>
						</select>
					</label></td>
				</tr>
				<tr>
					<td height="25" colspan="2">
						<div align="center">
							<input class="button button-pill button-primary" type="submit"
								name="Submit" value="提交" /> <a
								class="button button-pill button-primary"
								href="showTeacher.action">返回</a>
						</div>
					</td>
				</tr>
			</table>
		</form>
	</div>
  </body>
</html>

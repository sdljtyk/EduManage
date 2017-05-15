<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>添加课程</title>

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

		var flag = confirm("你确定要添加新的课程吗");
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
		<form method="post" action="AddClass.action" name="form1" onSubmit="return myCheck()"
			onSubmit="return sure()"  enctype="multipart/form-data" class="my_form">
			<table width="400" height="100% ">
				<tr>
					<td height="25" colspan="2"><div align="center">
							<strong><font color="#00EE00">添加课程信息</font></strong>
						</div></td>
				</tr>
				<tr>
					<td height="30"><strong>课程名称</strong></td>
					<td><label> <input class="form-control" type="text" onmouseout="chkblk(this)"
							name="class1.CName">
					</label></td>
				</tr>
				<tr>
					<td height="30"><strong>任课教师</strong></td>
					<td><select style="width: 221px;height:30" id="tid" onmouseout="chkblk(this)" 
						name="class1.TId">
						<s:iterator value="#session.teachers" id="#session.teachers">
							<option value="<s:property value="TId" />"><s:property value="TName" /></option>
						</s:iterator>
					</select></td>
				</tr>
				<tr>
					<td height="30"><strong>最大人数</strong></td>
					<td><label> <input class="form-control" type="text"  onmouseout="chkblk(this)"
						name="class1.CChoosemax">
					</label></td>
				</tr>

				<tr>
					<td height="30"><strong>上课教室</strong></td>
					<td><label> <input class="form-control" type="text" onmouseout="chkblk(this)"
						name="class1.CRoom">
					</label></td>
				</tr>
				<tr>
					<td height="30"><strong>上课时间</strong></td>
					<td><label> <input class="form-control" type="text" onmouseout="chkblk(this)"
							name="class1.CTime" />
					</label></td>
				</tr>
				<tr>
					<td height="30"><strong>课程学分</strong></td>
					<td><label> <input class="form-control" type="text" onmouseout="chkblk(this)" 
							name="class1.CMark">
					</label></td>
				</tr>
				<tr>
					<td height="30"><strong>开课院系</strong></td>
					<td><label> <select style="width: 221px;height:30"
							id="department" name="class1.CDepartment">
								<option value="信息与电气工程学院">信息与电气学院</option>
								<option value="数学院">数学院</option>
								<option value="土木学院">土木学院</option>
								<option value="文学院">文学院</option>
								<option value="公选课">公选课</option>
						</select>
					</label></td>
				</tr>
				<tr>
					<td height="25" colspan="2">
						<div align="center">
							<input class="button button-pill button-primary" type="submit"
								name="Submit" value="提交"/> <a
								class="button button-pill button-primary"
								href="showClass.action">返回</a>
						</div>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>

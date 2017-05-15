<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加学生界面</title>

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

		var flag = confirm("你确定要添加新的学生吗");
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
		<form method="post" action="AddStudent.action" name="form1" onSubmit="return myCheck()"
			onSubmit="return sure()" enctype="multipart/form-data"
			class="my_form">
			<table width="400" height="100% ">
				<tr>
					<td height="25" colspan="2"><div align="center">
							<strong><font color="#00EE00">添加学生信息</font></strong>
						</div></td>
				</tr>
				<tr>
					<td height="30"><strong>学号</strong></td>
					<td><label> <input class="form-control" type="text" onmouseout="chkblk(this)"
							name="student.SNo">
					</label></td>
				</tr>
				<tr>
					<td height="30"><strong>姓名</strong></td>
					<td><label> <input class="form-control" type="text" onmouseout="chkblk(this)"
							name="student.SName">
					</label></td>
				</tr>
				<tr>
					<td height="30"><strong>性别</strong></td>
					<td>&nbsp;&nbsp;男 <input type="radio" name="student.SSex" value="男"/> &nbsp;&nbsp;&nbsp;&nbsp;
					 女<input type="radio" name="student.SSex" value="女" />
					</td>
				</tr>
				<tr>
					<td height="30"><strong>院系</strong></td>
					<td><label> <select style="width: 221px;height:30"
							id="department" name="student.SDepartment">
								<option value="信息与电气工程学院">信息与电气学院</option>
								<option value="数学院">数学院</option>
								<option value="土木学院">土木学院</option>
								<option value="文学院">文学院</option>
								<option value="公选课">公选课</option>
						</select>
					</label></td>
				</tr>

				<tr>
					<td height="30"><strong>籍贯</strong></td>
					<td><label> <input class="form-control" type="text" onmouseout="chkblk(this)"
							name="student.SFrom">
					</label></td>
				</tr>
				<tr>
					<td height="30"><strong>所需学分</strong></td> 
					<td><label> <input class="form-control" type="text" onmouseout="chkblk(this)"
							name="student.SMark" />
					</label></td>
				</tr>
				<tr>
					<td height="30"><strong>已获学分</strong></td>
					<td><label> <input class="form-control" type="text" onmouseout="chkblk(this)"
							name="student.SMarked" />
					</label></td>
				</tr>
				<tr>
					<td height="30"><strong>电子邮件</strong></td>
					<td><label> <input class="form-control" type="text" onmouseout="chkblk(this)"
							name="student.SEmail">
					</label></td>
				</tr>
				<tr>
					<td height="30"><strong>选择照片</strong></td>
					<td><label> 
					<input class="form-control"  type="file" name="file" /> 
					</label></td>
				</tr>
				<tr>
					<td height="30"><strong>联系方式</strong></td>
					<td><label> 
					<input class="form-control"  type="text" name="student.STel"  onmouseout="chkblk(this)" >
					</label></td>
				</tr>
				<tr>
					<td height="25" colspan="2">
						<div align="center">
							<input class="button button-pill button-primary" type="submit"
								name="Submit" value="提交" /> <a
								class="button button-pill button-primary"
								href="showStudent.action">返回</a>
						</div>
					</td>
				</tr>
			</table>
		</form>
	</div>
  </body>
</html>

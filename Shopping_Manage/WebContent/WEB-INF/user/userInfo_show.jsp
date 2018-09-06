<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息显示</title>

<link rel="stylesheet" href="static/css/bootstrap/bootstrap.min.css"/>

<script type="text/javascript" src="static/js/lib/jQuery/jquery.js"></script>

<script type="text/javascript" src="static/js/lib/bootstrap/bootstrap.min.js"></script>

<link rel="shortcut icon" href="image/favicon.ico" />

</head>
<body>
	
	<jsp:include page="../base/nav_content.jsp"></jsp:include>
<table border="0" width="600px">
<tr>
<td align="center" style="font-size:24px; color:#666">用户信息</td>
</tr>
<tr>
<td align="right" > 
<a class="btn btn-info" href="user-edit1?user_id=${ user_id }">修改</a> &nbsp;&nbsp;
</td>
</tr>
</table>
<br/>
<center>
<s:form id="saveForm1" action="user-update1" method="post" theme="simple" namespace="/">
<s:hidden name="user_id" value="%{model.user_id }"></s:hidden>
<s:hidden name="createTime" value="%{model.createTime }"></s:hidden>
<table border='0' cellpadding="0"  cellspacing="10">
<tr>
<td>用户名：</td>
<td><s:property value="%{model.user_name }"></s:property></td>
<td>密码：</td>
<td><s:property value="%{model.user_password }"></s:property></td>
</tr>
<tr>
<td>邮箱：</td>
<td><s:property value="%{model.user_email }"></s:property></td>
<td>手机号码：</td>
<td><s:property  value="%{model.user_phone }"></s:property></td>
</tr>

<tr>
<td>地址：</td>
<td><s:property value="%{model.user_address }"></s:property></td>
<td>状态：</td>
<td><s:property value="%{model.user_state}"></s:property></td>
</tr>
</table>
</s:form>
</center>
	<jsp:include page="../base/footer.jsp"></jsp:include>
</body>
</html>
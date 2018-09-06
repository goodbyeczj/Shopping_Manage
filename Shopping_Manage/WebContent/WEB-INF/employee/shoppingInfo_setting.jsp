<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息设置</title>

<link rel="stylesheet" href="static/css/bootstrap/bootstrap.min.css"/>

<script type="text/javascript" src="static/js/lib/jQuery/jquery.js"></script>

<script type="text/javascript" src="static/js/lib/bootstrap/bootstrap.min.js"></script>

<link rel="shortcut icon" href="image/favicon.ico" />

</head>
<body>
	
	<jsp:include page="../base/nav_content.jsp"></jsp:include>
<table border="0" width="600px">
<tr>
<td align="center" style="font-size:24px; color:#666"> 编辑用户信息</td>
</tr>
<tr>
<td align="right" > 
<a href="javascript:document.getElementById('saveForm1').submit()">保存</a> &nbsp;&nbsp;
<a href="javascript:history.go(-1)">退回</a>
</td>
</tr>
</table>
<br/>
<s:form id="saveForm1" action="order-updateBook" method="post" theme="simple" namespace="/">
<s:hidden name="book_id" value="%{model.book_id }"></s:hidden>
<s:hidden name="price" value="%{model.price }"></s:hidden>
<s:hidden name="book_state" value="%{model.book_state }"></s:hidden>
<s:hidden name="book_name" value="%{model.book_name }"></s:hidden>
<center>
<table border='0' cellpadding="0"  cellspacing="10">
<tr>
<td>数量：</td>
<td><s:textfield name="quantity" value="%{model.quantity }"></s:textfield></td>
</tr>
</table>
</center>
</s:form>
	<jsp:include page="../base/footer.jsp"></jsp:include>
</body>
</html>
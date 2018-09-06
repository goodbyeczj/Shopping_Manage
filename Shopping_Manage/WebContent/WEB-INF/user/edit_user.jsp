<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head></head>
<body>
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

<s:form id="saveForm1" action="user-update" method="post" theme="simple" namespace="/">
<s:hidden name="user_id" value="%{model.user_id }"></s:hidden>
<s:hidden name="user_password" value="%{model.user_password }"></s:hidden>
<s:hidden name="user_name" value="%{model.user_name }"></s:hidden>
<s:hidden name="user_email" value="%{model.user_email }"></s:hidden>
<s:hidden name="user_phone" value="%{model.user_phone }"></s:hidden>
<s:hidden name="createTime" value="%{model.createTime }"></s:hidden>
<s:hidden name="user_address" value="%{model.user_address }"></s:hidden>
<table border='0' cellpadding="0"  cellspacing="10">

<tr>
<td>姓名：</td>
<td><s:property value="%{model.user_name }" /></td>
<td>状态：</td>
<td><s:radio name="user_state" list="{'1','2','3'}" value="%{model.user_state }"/></td>
</tr>
<%-- <s:property value="%{model.user_phone }"/> --%>
</table>
</s:form>

</body>
</html>
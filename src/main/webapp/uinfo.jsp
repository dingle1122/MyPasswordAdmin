<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="user/update.do" method="post">
<table align="center">
	<tr>
		<td>编号</td><td>姓名</td><td>年龄</td><td>密码</td><td>性别</td><td>工资</td><td>住址 </td>
	</tr>
	<tr>
		<td><input type="text" readonly="readonly" name="uid" value="${user.uid }"></td>
		<td><input type="text" name="name" value="${user.name }"></td>
		<td><input type="text" name="age" value="${user.age }"></td>
		<td><input type="password" name="pwd" value="${user.pwd }"></td>
		<td><input type="radio" name="sex" value="男"${user.sex=="男"? "checked='checked'":""} >男<input type="radio" name="sex" value="女" ${user.sex=="女"? "checked='checked'":""}>女</td>
		<td><input type="text" name="salary" value="${user.salary }"></td>
		<td><input type="text" name="address" value="${user.address }"> </td>
	</tr>
	<tr><td colspan="7" align="center">
		<input type="submit" value="修改" >
	</td></tr>
</table>
</form>
</body>
</html>
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
<form action="system/update.do" method="post">
<table align="center">
	<tr>
		<td>编号</td><td>姓名</td><td>密码</td>
	</tr>
	<tr>
		<td><input type="text" readonly="readonly" name="id" value="${systemUser.id }"></td>
		<td><input type="text" name="userName" value="${systemUser.userName }"></td>
		<td><input type="text" name="userPassword" value=""></td>
	</tr>
	<tr><td colspan="7" align="center">
		<input type="submit" value="修改" >
	</td></tr>
</table>
</form>
</body>
</html>
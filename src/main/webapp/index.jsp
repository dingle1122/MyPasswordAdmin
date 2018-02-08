<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
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
<form action="user/add.do" method="post">
<table align="center">
		<tr>
			<td>编号</td><td>姓名</td><td>年龄</td><td>密码</td><td>性别</td><td>工资</td><td>住址 </td><td>操作 </td>
		</tr>
	<c:forEach items="${ulist }" var="u">
		<tr>
			<td>${u.uid }</td><td>${u.name }</td><td>${u.age }</td><td>${u.pwd }</td><td>${u.sex }</td><td>${u.salary }</td>	<td>${u.address }</td>
			<td><a href="user/selectById.do?id=${u.uid }">修改</a> | <a href="user/delete.do?id=${u.uid }">删除</a></td>
		</tr>
	</c:forEach>
	<tr>
		<td></td>
		<td><input type="text" name="name"></td>
		<td><input type="text" name="age"></td>
		<td><input type="password" name="pwd"></td>
		<td><input type="radio" name="sex" value="男">男<input type="radio" name="sex" value="女">女</td>
		<td><input type="text" name="salary"></td>
		<td><input type="text" name="address"> </td>
		<td><a href="user/select.do">刷新</a></td>
	</tr>
	<tr><td colspan="8" align="center">
		<input type="submit" value="添加" >
	</td></tr>
</table>
</form>
</body>
</html>
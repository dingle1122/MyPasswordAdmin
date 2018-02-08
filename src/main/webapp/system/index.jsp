<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
欢迎${loginUser.userName }
<hr />
<form action="system/add.do" method="post">
<table align="center">
		<tr>
			<td>编号</td><td>姓名</td><td>密码</td><td>修改时间</td><td>创建时间</td><td>操作 </td>
		</tr>
	<c:forEach items="${systemUsers }" var="sys">
		<tr>
			<td>${sys.id }</td><td>${sys.userName }</td><td>${sys.userPassword }</td>
			<td><fmt:formatDate value="${sys.updateTime }" pattern="yyyy-MM-dd hh:mm:ss" /></td>
			<td><fmt:formatDate value="${sys.createTime }" pattern="yyyy-MM-dd hh:mm:ss" /></td>
			<td><a href="system/selectById.do?id=${sys.id }">修改</a> | <a href="system/delete.do?id=${sys.id }">删除</a></td>
		</tr>
	</c:forEach>
	<tr>
		<td></td>
		<td><input type="text" name="userName"></td>
		<td><input type="text" name="userPassword"></td>
		<td></td><td></td>
		<td><a href="system/select.do">刷新</a></td>
	</tr>
	<tr><td colspan="8" align="center">
		<input type="submit" value="添加" >
	</td></tr>
</table>
</form>
</body>
</html>
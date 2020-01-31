<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
<h1>
	${username}님 홈에 오신 것을 환영합니다.  
</h1>
<form action="/springlegacy/hello" method="POST">
	<input type="hidden" name="id" value="ssar" />
	<input type="hidden" name="pw" value="1234" />
	<input type="submit" value="hello페이지로 이동" />
</form>

<a href="/springlegacy/hello/ssar/1234">hello페이지로 이동</a>
</body>
</html>

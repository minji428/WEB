<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 확인</title>
</head>
<body>
	<!-- el 표현식의 session접근 방법 sessionScope.속성명 -->
	<h2>${sessionScope.id }님 환영합니다.</h2>
	<a href="MyPage">마이 페이지로 이동</a>
</body>
</html>
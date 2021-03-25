<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href="./bankbook/bankbookList"> BankBook List</a>  <!-- href -> 주소 넣는 속성 -->

<c:if test="${empty member}">
<a href="./member/memberJoin">Join</a> <!-- 입력폼이 나와야함 --> <!-- 서비스랑 컨트롤러 만들어서 -->
<a href="./member/memberLogin">Login</a> <!-- 입력폼이 나와야함 id/pw 등나와야함 -->
</c:if>

<c:if test="${not empty member}">
<h3> ${member.id} 님 환영합니다.</h3>

<a href="./member/memberPage">Mypage</a> 
<a href="./member/memberLogout">Logout</a> 
</c:if>

</body>
</html>

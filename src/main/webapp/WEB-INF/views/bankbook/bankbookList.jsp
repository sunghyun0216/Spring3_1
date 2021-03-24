<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>BankBook List</h2>
	<!-- list는 ul태그나 table 많이씀 -->
	
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Rate</th>
				<th>Sale</th>
			</tr>		
		</thead>
		
		<tbody> <!-- 여러개 쓸라면 반복문 필요 / jsp 선언부에 사용할 태그 라이브러리(태그) 사용-->
		<c:forEach items="${list}" var="dto">
			<tr>
				<td><a href="./bankbookSelect?bookNumber=${dto.bookNumber}">${dto.bookName}</a></td>
				<td>${dto.bookRate}</td>
				<td>${dto.bookSale}</td>				
			</tr>
		</c:forEach>
		</tbody>
		
	</table>
	
</body>
</html>
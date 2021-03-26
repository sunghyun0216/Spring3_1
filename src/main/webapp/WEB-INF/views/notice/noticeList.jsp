<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html>
<head>
 <!-- Required meta tags -->
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
   
   <c:import url="../template/bootStrap.jsp"></c:import>
<title>Insert title here</title>
</head>
<body>

<c:import url="../template/header.jsp"></c:import>

<div class="container"></div>
	<h2>Notice List</h2>

	<table class="table">
		<thead class="thead-dark">
			<tr>
				<th>Num</th>
				<th>Title</th>
				<th>Writer</th>
				<th>Hit</th>
				<th>Regdate</th>
			</tr>
		</thead>
		
		<tbody>
		<c:forEach items="${list}" var="notice">
			<tr>
				<td>${notice.num}</td>
				<td><a href="./noticeSelect?title=${notice.title}">${notice.title}</a></td>
				<td>${notice.writer}</td>
				<td>${notice.hit}</td>
				<td>${notice.regdate}</td>
			</tr>
		</c:forEach>
		</tbody>
		
	
	</table>

</body>
</html>
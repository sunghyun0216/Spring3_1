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
				<th>Regdate</th>
				<th>Hit</th>
			</tr>
		</thead>
		
		<tbody>
		<c:forEach items="${list}" var="dto">
			<tr>
				<td>${dto.num}</td>
				<td><a href="./noticeSelect?num=${dto.num}">${dto.title}</a></td>
				<td>${dto.writer}</td>
				<td>${dto.regdate}</td>
				<td>${dto.hit}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="container">
             
  <ul class="pagination">
     <c:if test="${pager.pre}">
    <li class="page-item"><a class="page-link" href="./noticeList?curPage=${pager.startNum-1}">Previous</a></li>
  	</c:if>
  	<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
	    <li class="page-item"><a class="page-link" href="./noticeList?curPage= ${i}">${i}</a></li>
  	</c:forEach>
  
  	<c:if test="${pager.next}">
    <li class="page-item"><a class="page-link" href="./noticeList?curPage=${pager.lastNum+1}">Next</a></li>
    </c:if>
  </ul>
</div>
		
	
	<button><a href="./noticeInsert?num=${dto.num}">게시물작성</a></button><br>
</body>
</html>
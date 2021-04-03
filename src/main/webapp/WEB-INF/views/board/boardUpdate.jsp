<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/bootStrap.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
	<h2> ${dto.title} </h2>
	<form action="./boardUpdate" method="post">
	<input type="hidden" name = "num" value="${dto.num}">
	TITLE <input type="text" name = "title" value="${dto.title}"> <br>
	CONTENTS <input type="text" name = "contents" value="${dto.contents}">
	<button>Update</button>
	</form>
	
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/bootStrap.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>

<div class="container">
<h2>Member Join Check Page</h2>

<div class="form-check">
  <label class="form-check-label">
    <input type="checkbox" id="all" name="c1" value="1">전체 동의
  </label>
</div>

<div class="form-check">
  <label class="form-check-label">
    <input type="checkbox" class="form-check-input" name="c1" value="1">동의
  </label>
</div>
<div class="jumbotron">
  <h1>Bootstrap Tutorial</h1>
  <p>Bootstrap is the most popular HTML, CSS...</p>
</div>

<div class="form-check">
  <label class="form-check-label">
    <input type="checkbox" class="form-check-input" name="c1" value="1">동의
  </label>
</div>
<div class="jumbotron">
  <h1>Bootstrap Tutorial</h1>
  <p>Bootstrap is the most popular HTML, CSS...</p>
</div>

<div class="form-check">
  <label class="form-check-label">
    <input type="checkbox" class="form-check-input" name="c1" value="1">동의
  </label>
</div>
<div class="jumbotron">
  <h1>Bootstrap Tutorial</h1>
  <p>Bootstrap is the most popular HTML, CSS...</p>
</div>

<div class="form-check">
  <label class="form-check-label">
    <input type="checkbox" class="form-check-input" name="c1" value="1">동의
  </label>
</div>
<div class="jumbotron">
  <h1>Bootstrap Tutorial</h1>
  <p>Bootstrap is the most popular HTML, CSS...</p>
</div>

	<div id="d1"></div>
	<button class="btn btn-danger" onclick="check()">Join</button>
<script type="text/javascript" src="../resources/js/memberJoinCheck.js"></script>
		
</div>
</body>
</html>
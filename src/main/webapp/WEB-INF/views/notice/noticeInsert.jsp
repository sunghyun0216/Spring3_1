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
<h1>Notice Insert Page</h1>

   <div class="container">
      <form action="./noticeInsert" method="post">
         <div class="form-group">
            <label for="title">타이틀</label> 
            <input type="text" class="form-control" id="title" name="title"> 
         </div>         
         
         <div class="form-group">
            <label for="writer">작성자</label> 
            <input type="text" class="form-control" id="writer" name="writer"> 
         </div>
         
         <div class="form-group">
            <label for="contents">내용</label> 
            <input type="text" class="form-control" id="contents" name="contents"> 
         </div>
         
         <button type="submit" class="btn btn-primary">작성</button>
      </form>
   </div>

</body>
</html>
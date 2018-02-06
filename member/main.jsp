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
<h2 align="left">도서대출</h2>

	
	<!-- 로그인창 -->
		<p align="right">	
			<input type="button" value="로그인">&nbsp;
			<input type="button" value="회원가입"><br>
		</p>
	<!-- 검색창 -->
	<form action="/book/Book.do?command=book_search">
		<p align="center">
			<input type="hidden" value="book_search" name="command">
			<input type="text" name="search" size="50">
			<input type="submit" value="검색">
			
		</p>
	</form>
<!-- 검색순위 창 -->
	
	<table>
		<tr>
			<th>검색순위</th>
		</tr>
	<c:forEach var="rank" items="">
		<tr>
			<td>${rank.title}</td>
		</tr>
	</c:forEach>
	</table>
	
<!-- 추천도서 이미지 -->
	
	<div align="right"><a></a></div>
	


</body>
</html>
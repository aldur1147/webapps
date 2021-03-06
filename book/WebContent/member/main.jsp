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
<!-- 해더  수정요망 -->
<header>
    <!-- 로그인창 -->
		<p align="right">	
			<input type="button" value="로그인" onclick="location.href='/book/Book.do?command=book_login'">&nbsp;
			<input type="button" value="회원가입" onclick="location.href='/book/Book.do?command=book_join'"><br>
		</p>
	<!-- 검색창 -->
	<form action="/book/Book.do">
		<p align="center">
			<select name="find_search">
			<option value="title">제목</option>
			<option value="writer">작가</option>
			<option value="publisher">출판사</option>
			</select>
			<input type="hidden" value="book_search" name="command">
			<input type="search" name="search" size="50">
			<input type="submit" value="검색">
		</p>
	</form>
</header>
	
	
<!-- 검색순위 창 수정요망-->
	
	<table>
		<tr>
			<th>검색순위</th>
		</tr>
	<c:forEach var="rank" items="${rank}">
		<tr>
			<td>${rank.title}</td>
		</tr>
	</c:forEach>
	</table>
	
<!-- 추천도서 이미지  수정요망-->
	
	<div align="right"><img src="\book\image\Noimage.png"></div>
	


</body>
</html>
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
<!-- 해더  수정요망 -->
<header>
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
</header>
<form>
<table>
<tr>
	<td>
		<c:choose>
		<c:when test="${empty product.pictue}">
			<img src="book/noimage.gif">
		</c:when>
		<c:otherwise>
			<img src="book/${product.pictue}">
		</c:otherwise>
		</c:choose>
	</td>
</tr>
<tr>
	<td>
	<table>
		<tr>
			<th>제목</th>
			<td>${book.title}</td>
		</tr>
		<tr>
			<th>저자</th>
			<td>${book.writer}</td>
		</tr>
		<tr>
			<th>출고날짜</th>
			<td>${book.outdate}</td>
		</tr>
		<tr>
			<th>출판사</th>
			<td>${book.publisher}</td>
		</tr>
		<tr>
			<th>책 번호</th>
			<td>${book.num}</td>
		</tr>
	</table>
	</td>
</tr>
</table>

	<input type="submit" value="대출신청" >
	
	<input type="button" value="대출불가">

	<input type="button" value="목록" onclick="location.href=''">
</form>
</body>
</html>
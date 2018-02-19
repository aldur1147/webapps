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
			<input type="button" value="로그인" onclick="location.href='/book/Book.do?command=book_login'">&nbsp;
			<input type="button" value="회원가입 " onclick="location.href='/book/Book.do?command=book_join'"><br>
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
<form action="Book.do?command=book_borrow">
<input type="hidden" name="command" value="book_borrow">
<table>
<tr>
	<td>
		<%-- <c:choose>
		<c:when test="${empty book.pictue}">
			<img src="/book/image/Noimage.png">
		</c:when>
		<c:otherwise>
			<img src="book/${book.pictue}">
		</c:otherwise>
		</c:choose>  --%>
		<img src ="\book\image\Noimage.png" height="300" width="200">
	</td>


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
<div align="center">

	<c:if test="${book.confirm ==0}">
	<input type="submit" value="대출신청" >
	</c:if>
	<c:if test="${book.confirm ==1}">
	<input type="button" value="대출불가">
	</c:if>

	<input type="button" value="목록" onclick="location.href='book/Book.do?command='">
</div>
</form>
</body>
</html>
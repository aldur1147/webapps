<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<h3>검색 내용이 없습니다.</h3>

</body>
</html>
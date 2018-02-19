<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<!-- 검색 결과 창 아무것도 안넣을때에도 결과창 나오는거 방지, -->
	 <c:choose> 
		 <c:when test="${sh == ''}">
			<h3>검색 내용이 없습니다.</h3>
		</c:when>
		 <c:otherwise> 
			<table border="1">
				<tr>
					<th>제목</th>
					<th>저자</th>
					<th>출판사</th>
					<th>번호</th>
					<th>대출가능여부</th>
				</tr>
				<c:forEach var="rank" items="${search}">

					<tr onclick="location.href='Book.do?command=book_detail&title=${rank.title}'">
						<td>${rank.title}</td>
						<td>${rank.writer}</td>
						<td>${rank.publisher}</td>
						<td>${rank.num}</td>
						<td><c:if test="${rank.confirm == 0}">O</c:if>
							<c:if test="${rank.confirm == 1}">X</c:if></td>
					</tr>
				</c:forEach>
			</table>
		 </c:otherwise> 

	 </c:choose> 
</body>
</html>
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
<!-- 검색 결과 창 수정요망-->
<table>
	<tr>
		<th>제목</th>
		<th>저자</th>
		<th>출판사</th>
		<th>번호</th>
		<th>대출여부</th>
	</tr>
<c:forEach var="rank" items="">
	<tr onclick="location.href='/book/Book.do?command=데이터'">
		<td>${rank.title}</td>
		<td>${rank.writer}</td>
		<td>${rank.publisher}</td>
		<td>${rank.num}</td>
		<td><%
			String b = (String)request.getAttribute("");
			int confirm = 0;//Integer.parseInt(""); 
			confirm = 1;
			if(confirm==0){
				out.print("O");
			}
			else{
				out.print("X");
			}
			%>
		
		</td>
	</tr>
</c:forEach>
</table>
</body>
</html>
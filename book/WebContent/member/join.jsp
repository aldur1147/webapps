<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 관리</title>
<script type="text/javascript" src="/book/member/script/member.js"></script>
</head>
<body>
<h2>회원가입</h2>
'*'표시 항목은 필수 입력 항목입니다.
<form action="/book/Book.do?command=book_joinin" method="post" name="frm">
<table>
<tr>
<td>아이디</td>
<td>
<input type="text" name="userid" id="userid">
<input type="hidden" name="reid">
<input type="button" value="중복체크" onclick="idCheck()">
</td>
</tr>
<tr>
<td>암호</td>
<td><input type="password" name="pwd">*</td>
</tr>
<tr>
<td>암호 확인</td>
<td><input type="password" name="pwd_check">*</td>
</tr>
<tr>
<td>이름</td>
<td><input type="text" name="name">*</td>
</tr>
<tr>
<td>이메일</td>
<td><input type="text" name="email"></td>
</tr>
<tr>
<td>전화번호</td>
<td><input type="text" name="phone"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="확인" onclick="return joinCheck()">&nbsp;&nbsp;&nbsp;&nbsp;
<input type="reset" value="취소" >
</td>
</tr>
<tr><td colspan="2">${message }</td></tr>
</table>
</form>
</body>
</html>
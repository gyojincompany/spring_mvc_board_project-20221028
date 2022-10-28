<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시판 글목록</title>
</head>
<body>
	<h2>자유게시판</h2>
	<hr>
	<table border="1" cellspacing="0" cellpadding="0" width="1000">
		<tr bgcolor="pink" height="40">
			<th>번호</th>
			<th>글쓴이</th>
			<th width="500">글제목</th>
			<th>게시일</th>
			<th>조회수</th>
		</tr>
		
		<tr height="30" align="center">
			<td>1</td>
			<td>홍길동</td>
			<td align="left">안녕하세요! 가입인사드립니다.</td>
			<td>2022-10-28 20:18:30</td>
			<td>13</td>
		</tr>	
		
		<tr height="30">
			<td colspan="5" align="right"><input type="button" value="글쓰기" onclick="javascript:window.location='write_form'"></td>
			<!-- <a href="write_form">글쓰기</a> -->
		</tr>
	</table>
</body>
</html>
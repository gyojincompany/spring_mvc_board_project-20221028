<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 내용 보기</title>
</head>
<body>
	<h2>글 내용 보기</h2>
	<hr>
	<table width="500" border="1" cellspacing="0" cellpadding="0">
		<tr>
			<th>글번호</th>
			<td>21</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>17</td>
		</tr>
		<tr>
			<th>글쓴이</th>
			<td>홍길동</td>
		</tr>
		<tr>
			<th>글제목</th>
			<td>안녕하세요! 가입합니다.</td>
		</tr>
		<tr>
			<th valign="top">내 용</th>
			<td height="100" valign="top">오늘 날씨가 좋습니다. 가을 하늘이 청명하네요!</td>
		</tr>
		<tr>
			<th>등록일</th>
			<td>2022-10-28 21:09:31</td>
		</tr>
		<tr>
			<td colspan="2" align="right">
				<input type="button" value="답변" onclick="javascript:window.location='reply_write'">
				<input type="button" value="수정" onclick="javascript:window.location='modify_view'">
				<input type="button" value="삭제" onclick="javascript:window.location='delete'">
				<input type="button" value="목록" onclick="javascript:window.location='list'">
			</td>
		</tr>
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>英単語帳</title>
</head>
<body>
	<form action="/jmaster2/wordservlet" method="get">
		<a href="registword.jsp">単語登録</a>
		<a href="/searchword.jsp">単語検索</a>
		<hr>
			<input type="hidden" name="ACTION" value="search">
			キーワード：<input type="text" name="KEY">
			<br>
			<input type="submit" value="検索">
	</form>
</body>
</html>
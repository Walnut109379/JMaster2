<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>英単語帳</title>
</head>
<body>
	<form action="/jmaster2/wordservlet" method="get">
	<a href="registword.jsp">単語登録</a>
	<a href="searchword.jsp">単語検索</a>
	<hr>
		英語：<input type="text" name="ENG">
		<br>
		日本語：<input type="text" name="JPN">
		<br>
		<input type="submit" value="登録">
		<input type="hidden" name="ACTION" value="regist">
</form>
</body>
</html>
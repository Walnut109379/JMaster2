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
	<a href="kadai31/registword.jsp">単語登録</a>
	<hr>
	<table border="1">
	<tr><th>英語</th><th>日本語</th></tr>
	<c:forEach var="w" items="${BEAN}">
	<tr><td>${w.eng}</td><td>${w.jpn}</td></tr>
	</c:forEach>
	</table>
</body>
</html>
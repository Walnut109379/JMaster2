<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>占い</title>
</head>
<body>
<form action="/jmaster2/fortuneservlet"  method="get">
<h1>占いたい月を入力してね</h1>
	<select name="month">
		<option value="1">1</option>
		<option value="2">2</option>
		<option value="3">3</option>
		<option value="4">4</option>
		<option value="5">5</option>
		<option value="6">6</option>
		<option value="7">7</option>
		<option value="8">8</option>
		<option value="9">9</option>
		<option value="10">10</option>
		<option value="11">11</option>
		<option value="12">12</option>
	</select>
	月
	<input type="submit" value="占ってみる">
</form>
<hr>
<c:if test="${bean.month ne null}">
${bean.month}月の運勢は、、、<br>
<ul>
	<li>ラッキーカラー：${bean.color}</li>
	<li>ラッキーアイテム：${bean.item}</li>
	<li>順位は：${bean.rank}位</li>
</ul>
</c:if>
</body>
</html>
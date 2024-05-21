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
<form action="/jmaster/fortuneservlet"  method="get">
<h1>占いたい月を入力してね</h1>
	<select>
		<option name="month" value="1">1</option>
		<option name="month" value="2">2</option>
		<option name="month" value="3">3</option>
		<option name="month" value="4">4</option>
		<option name="month" value="5">5</option>
		<option name="month" value="6">6</option>
		<option name="month" value="7">7</option>
		<option name="month" value="8">8</option>
		<option name="month" value="9">9</option>
		<option name="month" value="10">10</option>
		<option name="month" value="11">11</option>
		<option name="month" value="12">12</option>
	</select>
	月
	<input type="submit" value="占ってみる">
</form>
<hr>
${bean.month}月の運勢は、、、<br>
<ul>
	<li>ラッキーカラー：${bean.color}</li>
	<li>ラッキーアイテム：${bean.item}</li>
	<li>順位は：${bean.rank}位</li>
</ul>
</c:if>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Map"%>
<%@ page import="java.util.HashMap"%>
<%@ page session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>フォワード処理</title>
</head>
<body>
<%
String[] canon = {"椿", "木村", "小川"};
request.setAttribute("canon", canon);

List<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);
request.setAttribute("LIST", list);

Map<String, Integer> map = new HashMap<>();
map.put("AAA", 100);
map.put("BBB", 200);
map.put("CCC", 300);
request.setAttribute("MAP", map);
%>
●EL式<br>
名前：${NAME}<br>
年齢：${AGE}<br>
会社：${COMPANY}<br>
<hr>
ID：${USER.id}<br>
名前：${USER.name}<br>
年齢：${USER.age}<br>
<hr>
${canon[0]}<br>
${canon[1]}<br>
${canon[2]}<br>
<hr>
${LIST[0]}<br>
${LIST[1]}<br>
${LIST[2]}<br>
<hr>
${MAP["AAA"]}<br>
${MAP.BBB}<br>
${MAP.CCC}<br>
</body>
</html>
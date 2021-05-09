<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Output View</title>
</head>
<body>
	output view
	<h1>
	<%
	String result = (String) session.getAttribute("result");
	out.print(result);
	%>
	</h1>
</body>
</html>
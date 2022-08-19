<%@page import="com.chainsys.sample.model.Users" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${userlist}
<div>
<div>${userlist.get(3).userId}</div>
<div>${userlist.get(3).userName}</div>
<div>${userlist.get(3).password}</div>
</div>
</body>
</html>
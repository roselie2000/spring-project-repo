<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/changepwd">
<label>User name</label><br>
<input type="text" name="name">
<label>New Password</label><br>
<input type="password" name="newpwd"><br>
<label>Confirm Password</label><br>
<input type="password" name="confpwd"><br>
<input type="submit" value="change">
</form>
</body>
</html>
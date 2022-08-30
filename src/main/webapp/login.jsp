<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
<form action="/success.jsp">
<label>User name :</label><br>
<input type="text" name = "name"><br>
<label>Password :</label><br>
<input type="password" name = "pwd"><br>
<input type="submit" value="Sign in"><br>
</form>
<a href = "changepwd.jsp">forgot password?</a><br>
<a href = "logout.jsp"><input type="button" value="log out"></a>
<a href = "demo.jsp">click here!</a>
</body>
</html>
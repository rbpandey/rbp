<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="e" uri="http://error.com" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index Page</title>
</head>
<body>
<form action="test.demo" method="post">
<table align="center">
<tr>
<td><h2>Name:</h2> </td>
<td><input type="text" name="name"/> </td>
<td><e:error property="name"/></td>
</tr>
<tr>
<td><h2>Email:</h2> </td>
<td><input type="text" name="email"/> </td>
<td><e:error property="email"/> </td>
</tr>
<tr>
<td><input type="submit" value="Check"/></td>
</tr>
</table>
</form>
</body>
</html>
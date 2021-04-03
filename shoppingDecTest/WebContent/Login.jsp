<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="./styles/theme.css">
<title>ShoppingDec - Login</title>
</head>
<body>
	<form action="log" method="post">
		<table>
			<tr>
				<td>User Name</td>
				<td><input class="ipt" type="text" name="uid"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input class="ipt" type="password" name="pass"></td>
			</tr>
			<tr>
				<td><input type="submit" class="btn" name="submit" value="login"></td>
			</tr>
		</table>
	</form>
</body>
</html>
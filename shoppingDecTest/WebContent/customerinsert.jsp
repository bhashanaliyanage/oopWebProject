<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="./styles/theme.css">
<script src="./javascript/registValidation.js"></script>
<title>ShoppingDec - Registration</title>
</head>
<body>
	<!-- 21/03/2021 -->
	<form name="registration" action="insert" method="post" onsubmit="event.stopPropagation(); return formValidation();">
		<table>
			<tr>
				<td>Name</td>
				<td><input class="ipt" type="text" name="name"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input class="ipt" type="text" name="email"></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><input class="ipt" type="text" name="phone"></td>
			</tr>
			<tr>
				<td>User Name</td>
				<td><input class="ipt" type="text" name="uid"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input class="ipt" type="password" name="psw"></td>
			</tr>
			<tr>
				<td><input class="btn" type="submit" name="submit" value="Create Account"></td>
			</tr>
		</table>
	</form>
</body>
</html>
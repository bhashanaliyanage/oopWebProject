<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="./styles/theme.css">
<title>ShoppingDec - Update Customer Details</title>
</head>
<body>

	<%
		/* getting variables to display in the jsp page */

	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String phone = request.getParameter("email");
	String email = request.getParameter("phone");
	String username = request.getParameter("uname");
	String password = request.getParameter("pass");
	%>


	<table>
		<tr>
			<th>Previous Data</th>
		</tr>
		<tr>
			<td>Customer ID</td>
			<td><input type="text" class="ipt" id="iptGrey" name="cusid"
				value="<%=id%>" readonly></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input type="text" class="ipt" id="iptGrey" name="name"
				value="<%=name%>" readonly></td>
		</tr>
		<tr>
			<td>Phone Number</td>
			<td><input type="text" class="ipt" id="iptGrey" name="phone"
				value="<%=phone%>" readonly></td>
		</tr>
		<tr>
			<td>E-Mail</td>
			<td><input type="text" class="ipt" id="iptGrey" name="email"
				value="<%=email%>" readonly></td>
		</tr>
		<tr>
			<td>User name</td>
			<td><input type="text" class="ipt" id="iptGrey" name="uname"
				value="<%=username%>" readonly></td>
		</tr>

	</table>

	<br>

	<form action="update" method="post">
		<table>
			<tr>
				<th>New Data</th>
			</tr>
			<tr>
				<td>Customer ID</td>
				<td><input type="text" class="ipt" id="iptGrey" name="cusID"
					value="<%=id%>" readonly></td>
			</tr>

			<tr>
				<td>Name</td>
				<td><input type="text" class="ipt" name="name"
					value="<%=name%>"></td>
			</tr>
			<tr>
				<td>Phone Number</td>
				<td><input type="text" class="ipt" name="phone"
					value="<%=phone%>"></td>
			</tr>
			<tr>
				<td>E-Mail</td>
				<td><input type="text" class="ipt" name="email"
					value="<%=email%>"></td>
			</tr>
			<tr>
				<td>User name</td>
				<td><input type="text" class="ipt" name="uname"
					value="<%=username%>"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" class="ipt" name="pass" value=""></td>
			</tr>
			<tr>
				<td><input type="submit" class="btn" name="submit"
					value="Update my data"></td>
			</tr>

		</table>

	</form>

</body>
</html>
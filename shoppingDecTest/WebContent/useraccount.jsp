<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="./styles/theme.css">
<title>ShoppingDec - UserAccount</title>

</head>
<body>
	<h3>ShoppingDec - Customer Details</h3>
	<c:forEach var="cus" items="${cusDetails }">

		<c:set var="id" value="${cus.id }" />
		<c:set var="name" value="${cus.name }" />
		<c:set var="email" value="${cus.email }" />
		<c:set var="phone" value="${cus.phone }" />
		<c:set var="username" value="${cus.username }" />
		<c:set var="password" value="${cus.password }" />



		<table class="paleBlueRows">
			<thead>
				<tr>
					<th>CustomerID</th>
					<th>Name</th>
					<th>Email</th>
					<th>Phone</th>
					<th>Username</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${cus.id }</td>
					<td>${cus.name }</td>
					<td>${cus.email }</td>
					<td>${cus.phone }</td>
					<td>${cus.username }</td>
				</tr>
			</tbody>
		</table>
	</c:forEach>

	<br>

	<c:url value="updateCustomer.jsp" var="cusupdate">
		<c:param name="id" value="${id }"></c:param>
		<c:param name="name" value="${name }"></c:param>
		<c:param name="email" value="${email }"></c:param>
		<c:param name="phone" value="${phone }"></c:param>
		<c:param name="uname" value="${username }"></c:param>
		<c:param name="pass" value="${password }"></c:param>
	</c:url>

	<a href="${cusupdate }"> <input type="button" name="update"
		class="btn" value="Update My Data"></a>
	
	<c:url value="deletecustomer.jsp" var="cusdelete">
		<c:param name="id" value="${id }"></c:param>
		<c:param name="name" value="${name }"></c:param>
		<c:param name="email" value="${email }"></c:param>
		<c:param name="phone" value="${phone }"></c:param>
		<c:param name="uname" value="${username }"></c:param>
		<c:param name="pass" value="${password }"></c:param>
	</c:url>
	
	<a href="${cusdelete }"> <input type="button" name="delete" class="btn"
		value="Delete My Data"></a>
</body>
</html>
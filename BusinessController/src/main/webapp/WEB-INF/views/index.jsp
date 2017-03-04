<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<html >
	<head>
		<title>Business Controller</title>
	</head>
	<body>
	
		<!--  spring:message code="login.welcome" var="welcomeMessage"/ -->
		<h1>Welcome to Business Controller</h1>
		<hr />
		${message}
		<form method="POST" action="login">
			<table style="table-layout:fixed;">
				<tr>
					<td>Email:</td>
					<td><input id="email"  name="email" required="required"/></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input id="email"  type="password" name="password" required="required"/></td>
				</tr>
			</table>
			<button type="submit">Login</button>
		</form>
		<a href="newUser"> New user? Register here</a>
	</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<head>
	<title>Business Controller</title>
</head>
<body>
	<h1>Register on application</h1>
	<hr>
	<form action="addUser">
		<table>
			<tr>
				<td>Name:</td>
				<td><input id="name" name="name" required="required"/></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input id="email" name="email" required="required"/></td>
			</tr>
			<tr>
				<td>CPF:</td>
				<td><input id="cpf" name="cpf" required="required"/></td>
			</tr>		
			<tr>
				<td>Password:</td>
				<td><input id="password" type="password" name="password" required="required"/></td>
			</tr>						
		</table>
		<button type="submit">Register</button>
	</form>
	<hr>
</body>
</html>

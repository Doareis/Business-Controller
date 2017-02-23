<?xml version="1.0" encoding="ISO-8859-1"?>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://java.sun.com/jsf/core">

<head>
	<meta http-equiv="Content-type" content="text/html; charset=ISO-8859-1" />
	<title>Business Controller</title>
</head>
<body>
	<h1>Register on application</h1>
	<hr />
	<form action="addUser">
		<h:messages />
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
	<hr/>
</body>
</html>

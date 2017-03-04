<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
	<meta http-equiv="Content-type" content="text/html; charset=ISO-8859-1" />
	<title>Business Controller</title>
</head>
<body>
	<h1>Welcome, ${user.name} !</h1>
	Member sincee <fmt:formatDate pattern="dd/MM/yyyy" value="${user.registerDate.time}"/>
	<br />	
	<a href="product/list">My products</a>
	
	<br />
	<a href="purchase/list"> My purchases</a>
</body>
</html>

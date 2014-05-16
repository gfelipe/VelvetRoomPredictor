<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.jsp.PageContext" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
	<head>
		
	</head>

	<body>
		<form:form action="${pageContext.request.contextPath}/admin/arcana/delete" method="POST" autocomplete="off" commandName="arcana">
			<p>Are you sure you want to delete the game ${arcana.name}?</p>
			<form:hidden path="id" /><br/>
			<input type="submit" value="Yes" /><br/>
		</form:form>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.jsp.PageContext" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
	<head>
		
	</head>

	<body>
		<form:form action="${pageContext.request.contextPath}/admin/arcana/edit" method="POST" autocomplete="off" commandName="arcana">
			<form:hidden path="id" />
			<label for="name">Name: </label>
			<form:input type="text" path="name" /><br/>
			
			<label for="platform">Platform: </label>
			<form:input type="text" path="value" /><br/>
			
			<input type="submit" value="Send" /><br/>
		</form:form>
	</body>
</html>
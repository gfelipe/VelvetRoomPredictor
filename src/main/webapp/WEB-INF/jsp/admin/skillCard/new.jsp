<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.jsp.PageContext" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
	<head>
		
	</head>

	<body>
		<form:form action="${pageContext.request.contextPath}/admin/skillcard/create" method="POST" autocomplete="off" commandName="skillCardWrapper">
			<label for="name">Name: </label>
			<form:input type="text" path="skillCard.name" /><br/>
			
			<label for="description">Description: </label>
			<form:input type="text" path="skillCard.description" /><br/>
			
			<label for="skill">Skill: </label>
			<form:input type="text" path="skill.name" /><br/>
			
			<input type="submit" value="Send" /><br/>
		</form:form>
	</body>
</html>
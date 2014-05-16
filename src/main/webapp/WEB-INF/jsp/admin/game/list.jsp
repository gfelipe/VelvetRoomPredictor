<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.jsp.PageContext" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		
	</head>

	<body>
		<a href="${pageContext.request.contextPath}/admin/game/create" style="color:black;">Create</a>
		
		<ul>
		<c:forEach items="${games}" var="game">
			<li>
				${game.name}
				- <a href="${pageContext.request.contextPath}/admin/game/edit/${game.id}" style="color:black;display:inline-block;">edit</a> 
				- <a href="${pageContext.request.contextPath}/admin/game/delete/${game.id}" style="color:black;display:inline-block;">delete</a> 
			</li> 
			
		</c:forEach>
		</ul>
		
	</body>
</html>
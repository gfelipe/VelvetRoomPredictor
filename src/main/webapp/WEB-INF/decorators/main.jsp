<?xml version="1.0" encoding="UTF-8" ?>
<%@ page import="javax.servlet.jsp.PageContext" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	
	<title><decorator:title default="Velvet Room Predictor"/></title>

	<!-- JQuery -->
	<script type="text/javascript" src="<c:url value="/resources/js/jquery-1.10.2.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/jquery-ui.js"/>"></script>

	<!-- Pages CSS -->
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
	<link rel="stylesheet" href="<c:url value="/resources/css/style-products-category.css"/>">

</head>
<body>

	<header id="main-header">
		<div class="container-header">
			
			<h1 class="logo">
			<a href="${pageContext.request.contextPath}">Velvet Room Predictor</a></h1>
			
			<div id="search-area">
				<form method="get" action="${pageContext.request.contextPath}/product/search" name="searchProduct">
					<div class="search-box">
						<input type="text" name="productName" id="input-search-text" placeholder="Procurando alguma coisa?">
						<input type="submit" value="Pesquisar" id="input-search-submit" class="search-icon">
					</div>
				</form>
			</div>
			
			<nav id="main-nav" class="main-menu">
				<ul class="menu">
					<c:forEach items="${navMenu}" var="menu">
						<li class="menu-item"><a href="${menu.value}">${menu.key}</a>
							<ul class="sub-menu">
								<li class="submenu-item"><a href="${pageContext.request.contextPath}/admin/game/create">Create</a></li>
							</ul>
						</li>
					</c:forEach>
				</ul>
			</nav>		
		</div>
	</header>	
	
	<decorator:body />
	
	<c:import url="/WEB-INF/jsp/footer.jsp"/>
	
</body>
</html>
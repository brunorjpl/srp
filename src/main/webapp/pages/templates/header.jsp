<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/main.css">

<meta charset="ISO-8859-1">
<title>Sistema de Registro de Patrimonio - SRP</title>
</head>
<body>

	<nav class="navbar navbar-light bg-dark">
	   <span class="navbar-header " >
	      <h1>
	        <a class="nav-header" 
	        	href="<c:url value='/pages/home.jsp' /> ">
	        	Sistema de Registro de Patrimonio - SRP 
	        </a>
	      </h1> 
	   </span>
	   <a href="<c:url value='/pages/novo_patrimonio.jsp'/>">
	   <button type="button" class="btn btn-primary">Novo</button>
	   </a>
	</nav>

	<script type="text/javascript"
		src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
			
		
</body>
</html>



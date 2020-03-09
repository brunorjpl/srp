<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="templates/header.jsp"></jsp:include>



	<div class="container">
		<div class="row justify-content-center">
			
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Numero do Patrimonio</th>
      <th scope="col">Descricao</th>
      <th scope="col">Local</th>
      
    </tr>
  </thead>
  <tbody>
<c:forEach var="Patrimonio" items="${lista_patrimonio}">
                <tr>
                    <td><c:out value="${Patrimonio.id}" /></td>
                    <td><c:out value="${Patrimonio.numero}" /></td>
                    <td><c:out value="${Patrimonio.descricao}" /></td>
                    <td><c:out value="${Patrimonio.local}" /></td>
                    <td>
                     <a href="edit?id=<c:out value='${Patrimonio.id}' />">
                     <button type="button" class="btn btn-primary">Edit</button></a>
                   
                     <a href="delete?id=<c:out value='${Patrimonio.id}' />">
                     <button type="button" class="btn btn-danger">Delete</button></a>                     
                    </td>
                </tr>
            </c:forEach>
  </tbody>
</table>


		</div>

	</div>


</body>
</html>
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
			<div class="col-8">
				<h4 class="mt-4 texto-cinza">Fazer login</h4>


				<form action="<c:url value='/NovoSrv?action=new' />" method="post">
					<div class="form-group">
						<input type="text" name="numero" id="numero"
							placeholder="numero do patrimônio" class="form-control">
					</div>

					<div class="form-group">
						<input type="text" name="descricao" id="descricao"
							placeholder="descricao do patrimônio" class="form-control">
					</div>

					<div class="form-group">
						<input type="text" name="local" id="local"
							placeholder="local do patrimônio" class="form-control">
					</div>

					<button type="submit" class="btn btn-success">salvar</button>



				</form>

			</div>


		</div>


	</div>




	</div>



</body>
</html>
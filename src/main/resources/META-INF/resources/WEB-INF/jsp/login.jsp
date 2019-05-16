<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%
  response.addHeader("X-XSS-Protection","0; mode=block"); 
%>


<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width-device-with, initial-scale=1.0">
  
  <title></title>
  
  <link href="${contextPath}/css/bootstrap.css" rel="stylesheet"> 
  <link href="${contextPath}/css/estilos.css" rel="stylesheet">
  
  <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Lato" />
  <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Lora" />
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" integrity="sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP" crossorigin="anonymous">
</head>

<body>
	<div class="container h-100">
		<div class="d-flex justify-content-center h-100">
			<div class="tarjeta">
			
				<div class="mt-4">
				    <div class="d-flex justify-content-center">
						<h2>Col-App-Dero</h2> 
					</div>
					
					<div class="d-flex justify-content-center">
						<span>Bienvenid@s a la aplicación</span> 
					</div>
					
				</div>
				
			    <div class="d-flex justify-content-center form_contenedor">			        
			        <form id="login_form" >			        			        
			            <div class="input-group mb-2">
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" id="login" name="login" class="form-control input_usuario" value="${login}" placeholder="login" autofocus="true">
						</div>
						
						<div class="input-group mb-3">
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="password" id="password" name="password" class="form-control input_contrasena" value="" placeholder="contraseña"  >
						</div>
						   
			    </div>
			    
			    
					     <div class="d-flex justify-content-center mt-3 alert-danger">
							<%= request.getParameter("login") %>
						</div>
					    
					    
					    <div class="d-flex justify-content-center mt-3 login_contenedor">
							<button type="submit" name="button" class="btn btn_login"  >Iniciar sesión</button>
						</div>
				
				   </form>
				
		    </div>
		</div>
	</div>
	
	
	${login}

</body>
</html>
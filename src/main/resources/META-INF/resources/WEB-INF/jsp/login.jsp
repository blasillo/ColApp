<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width-device-with, initial-scale=1.0">
  
  <title></title>
  
  <link href="css/bootstrap.css" rel="stylesheet"> 
  <link href="css/estilos.css" rel="stylesheet">
  
  <link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Lato" />
  <link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Lora" />
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
			        
			        <form>
			        			        
			            <div class="input-group mb-3">
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" name="" class="form-control input_usuario" value="" placeholder="login">
						</div>
						
						<div class="input-group mb-2">
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="password" name="" class="form-control input_contrasena" value="" placeholder="contraseña">
						</div>
						
			        </form>
			    </div>
			    
			    <div class="d-flex justify-content-center mt-3 login_contenedor">
					<button type="button" name="button" class="btn btn_login">Iniciar sesión</button>
				</div>
				
		    </div>
		</div>
	</div>
	
	<div align="center">
		<h1>Bienvenid@s a Col-App-dero</h1>
	</div>
	
	<div class="alert alert-error">
		<div align="center"><b></b></div>
	</div>
	
	
	
	
	
	
	
	<form class="form-busqueda">
	  <input type="text" class="input-block-level" name="busqueda" value="" >
	  <button class="btn btn-large btn-primary" type="submit">Enviar</button>
	  
	</form>
	
	<h4><%=(request.getParameter("busqueda") != null ? request.getParameter( "busqueda" ) : "") %></h4>
	
	
</div>

<script>
</script>
</body>
</html>
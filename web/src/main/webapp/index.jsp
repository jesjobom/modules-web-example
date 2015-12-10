<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>TESTE DE MODULARIZAÇÃO</title>
	</head>
	<body>
		<div>
			<h2>
				<a href="home/" title="Controlador do web rendereizando jsp do base">
					Home
				</a>
			</h2>
		</div>
		<div>
			<h2>Menu 1</h2>
			<p>Menu obtido do projeto base</p>
			<%@include file="menu1.jsp" %>
		</div>
		<div>
			<h2>Menu 2</h2>
			<p>Menu obtido do projeto core</p>
			<%@include file="menu2.jsp" %>
		</div>
		<div>
			<h2>Menu 3</h2>
			<p>Menu obtido do projeto web (substituindo o menu dos projetos base e core)</p>
			<%@include file="menu3.jsp" %>
		</div>
	</body>
</html>

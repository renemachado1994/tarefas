<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.Livro" %>
<%@ page import="servlet.LivroServlet" %>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">




	<html>
		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
			<title>Biblioteca</title>
		</head>
	<body>
	
	<a href="index.html">Início</a>
	<br />
	<fieldset>


			<tr>
				<th>ID</th>
				<th>Titulo</th>
				<th>Numero de Páginas</th>
				<th>Autor</th>
				
				
			</tr>
			
			<c:forEach items="${caminho}" var="caminho_livro">
			    
				<tr>

				
				<td>${caminho_livro.id}</td> 
				<td>${caminho_livro.titulo}</td>
				<td>${caminho_livro.numeroDePaginas}</td>
				<td>${caminho_livro.autor}</td>
			</c:forEach>
			
			<tbody>	
	

			</tbody>
		</table>
	</fieldset>
</body>
</html>
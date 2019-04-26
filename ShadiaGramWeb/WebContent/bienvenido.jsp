<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Bienvenido
<%
out.println(request.getAttribute("mensaje"));
%>

<table>
<jsp:useBean id="uDao" class="dao.UsuarioDao" scope="request"></jsp:useBean>
<tr>
<th>Usuario</th>
<th>Email</th>
<th>Nombre</th>
<th>Apellido</th>
<th>Contraseña</th>
<th>Fecha Nacimiento</th>
<th>Pais</th>
</tr>
<c:forEach var="usuario" items="${uDao.listar()}">
<tr>
<td><c:out value="${usuario.usuario}"></c:out></td>
<td><c:out value="${usuario.email}"></c:out></td>
<td><c:out value="${usuario.nombre}"></c:out></td>
<td><c:out value="${usuairo.apellido}"></c:out></td>
<td><c:out value="${usuario.pass}"></c:out></td>
<td><c:out value="${usuario.fechanacimiento}"></c:out></td>
<td><c:out value="${usuario.pais}"></c:out></td>
</tr>
</c:forEach>
</table>
</body>
</html>
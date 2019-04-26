<%@ include file="template/header.jsp"%>

<%
out.println(request.getAttribute("mensaje"));
%>

<jsp:useBean id="usuario" class="model.Usuario" scope="session"></jsp:useBean>
Usuario en Sesion: <c:out value="${usuario.nombre}"></c:out>
<!--<c:out value="${sessionScope.usuarioNombre}"></c:out>-->
<table>
<tr>
<th>Usuario</th>
<th>Email</th>
<th>Nombre</th>
<th>Apellido</th>
<th>Contraseña</th>
<th>Fecha Nacimiento</th>
<th>Pais</th>
</tr>
<tr>
<td><c:out value="${usuario.usuario}"></c:out></td>
<td><c:out value="${usuario.email}"></c:out></td>
<td><c:out value="${usuario.nombre}"></c:out></td>
<td><c:out value="${usuairo.apellido}"></c:out></td>
<td><c:out value="${usuario.pass}"></c:out></td>
<td><c:out value="${usuario.fechanacimiento}"></c:out></td>
<td><c:out value="${usuario.pais}"></c:out></td>
</tr>
</table>
<%@ include file="template/footer.jsp"%>
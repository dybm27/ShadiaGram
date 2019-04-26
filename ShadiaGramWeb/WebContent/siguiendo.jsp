<%@ include file="template/header.jsp"%>

<jsp:useBean id="usuario" class="model.Usuario" scope="session"></jsp:useBean>
Usuario en Sesion: <c:out value="${usuario.nombre}"></c:out>
<table>
	<thead>
		<tr>
			<th>Id</th>	
			<th>Usuario</th>
			<th>Email</th>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Fecha Nacimiento</th>
			<th>Pais</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="seguidor" items="${usuario.amistads2}">
		<tr>
			<td><c:out value="${seguidor.usuario2.id}"></c:out></td>
			<td><c:out value="${seguidor.usuario2.nombre}"></c:out></td>
			<td><c:out value="${seguidor.usuario2.email}"></c:out></td>
			<td><c:out value="${seguidor.usuario2.nombre}"></c:out></td>
			<td><c:out value="${seguidor.usuario2.apellido}"></c:out></td>
			<td><c:out value="${seguidor.usuario2.fechanacimiento}"></c:out></td>
			<td><c:out value="${seguidor.usuario2.pais}"></c:out></td>
		</tr>
	</c:forEach>
	</tbody>
</table>

<div class="container-fluid" id="divContainer">
            <div class="row">
                <div class="col-lg-4">
                    <div id="divSearch">
                        <form class="form-inline">
                            <i aria-hidden="true" class="fas fa-search">
                            </i>
                            <input aria-label="Buscar" class="form-control" placeholder="Buscar" type="text">
                            </input>
                        </form>
                    </div>
                </div>
                <div class="col-lg-4" id="divSyS">
                    <h2>
                        Siguiendo
                    </h2>
                </div>
                <div class="col-lg-4">
                    <div id="divBtnAtrasSS">
                        <a href="formInicio.html" id="btnAtrasSS">
                            <img src="../Imagenes/arrow-circle-left-solid.png">
                            </img>
                        </a>
                    </div>
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-3" id="divImg">
                    <img alt="..." class="img-fluid img-thumbnail rounded-circle" id="imgPublicada" src="">
                    </img>
                </div>
                <div class="col-lg-3" id="divImg">
                    <img alt="..." class="img-fluid img-thumbnail rounded-circle" id="imgPublicada" src="">
                    </img>
                </div>
                <div class="col-lg-3" id="divImg">
                    <img alt="..." class="img-fluid img-thumbnail rounded-circle" id="imgPublicada" src="">
                    </img>
                </div>
                <div class="col-lg-3" id="divImg">
                    <img alt="..." class="img-fluid img-thumbnail rounded-circle" id="imgPublicada" src="">
                    </img>
                </div>
            </div>
        </div>
        <div id="divVerMas">
            <a href="#">
                Ver mas
            </a>
        </div>


 <%@ include file="template/footer.jsp"%>
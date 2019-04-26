<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
            <title>
                Inicio
            </title>
            <link crossorigin="anonymous" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" rel="stylesheet">
                <link crossorigin="anonymous" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" rel="stylesheet">
                </link>
                <link href="../css/dumar.css" rel="stylesheet" type="text/css">
                </link>
            </link>
        </meta>
    </head>
    <body>
        <header>
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-2" id="divImgPerfil">
                        <picture id="imgPerfil">
                            <img alt="..." class="img-fluid img-thumbnail" id="imgPerfil" src="https://i.stack.imgur.com/cR38r.jpg">
                            </img>
                        </picture>
                    </div>
                    <div class="col-lg-8" id="divTitulo">
                        <h1>
                            AngieGram
                        </h1>
                    </div>
                    <div class="col-lg-2" id="divBtnOpciones">
                        <li class="nav-item dropdown">
                            <a aria-expanded="false" aria-haspopup="true" data-toggle="dropdown" id="btnOpciones" role="button">
                                <img src="../Imagenes/angle-left-solid.png"/>
                                <img src="../Imagenes/user-solid.png"/>
                            </a>
                            <div class="dropdown-menu">
                                <a class="dropdown-item" href="formPerfil.html">
                                    Perfil (Usuario)
                                </a>
                                <a class="dropdown-item" href="siguiendo.jsp">
                                    Siguiendo
                                </a>
                                <a class="dropdown-item" href="seguidores.jsp">
                                    Seguidores
                                </a>
                                <div class="dropdown-divider">
                                </div>
                                <a class="dropdown-item" href="formConfiguraciones.html">
                                    Configuracion
                                </a>
                                <div class="dropdown-divider">
                                </div>
                                <a class="dropdown-item" href="#">
                                    Publico
                                </a>
                                <a class="dropdown-item" href="formLogin.html">
                                    Cerrar Sesion
                                </a>
                            </div>
                        </li>
                    </div>
                </div>
            </div>
        </header>
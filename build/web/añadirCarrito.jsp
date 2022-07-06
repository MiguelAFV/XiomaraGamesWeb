<%@page import="Adm.ProductoAdm"%>
<%@page import="Modelo.Productos"%>
<%@page import="Modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <a href="PSJuegos.jsp"></a>
    <head>
        <title>Añadir Carrito</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/estilo.css">
        <link rel="stylesheet" type="text/css" href="css/fontello.css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
        <script>
            function irLink(url) {
                alert(url);
                document.form_index.accion.value = url;
                document.form_index.submit();
            }
        </script>
    </head>
    <%
        Usuario bUsuario = (Usuario) session.getAttribute("Usuarios");
    %>
    <body>
        <form action="Controlador" method="post" name="form_index">
            <input type="hidden" name="accion" value="pruebas11:21">
        </form>
        <nav class="navbar navbar-expand-sm bg-light navbar-light sticky-top"  >  <!--style="background-color:#A970FF !important;"-->
            <a class="navbar-brand" href="index.jsp"><h3 class="icon-gamepad">XiomaraGame</h3></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item"><a class="nav-link" href="nosotros.jsp">Nosotros</a></li>

                    <li class="dropdown" style="padding: 2px">
                        <div class="btn-group">
                            <button type="button" class="btn btn-default" onclick="location.href = 'productos.jsp?caso=10'">Play Station</button>
                            <button type="button" class="btn btn-default dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <span class="sr-only">Toggle Dropdown</span>
                            </button>
                            <div class="dropdown-menu">
                                <a class="dropdown-item" onclick="location.href = 'productos.jsp?caso=11'">Juegos</a>
                                <a class="dropdown-item" onclick="location.href = 'productos.jsp?caso=12'">Consolas</a>
                                <a class="dropdown-item" onclick="location.href = 'productos.jsp?caso=13'">Accesorios</a>
                            </div>
                        </div>
                    </li>

                    <li class="dropdown" style="padding: 2px">
                        <div class="btn-group">
                            <button type="button" class="btn btn-default" onclick="location.href = 'productos.jsp?caso=20'">XBOX</button>
                            <button type="button" class="btn btn-default dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <span class="sr-only">Toggle Dropdown</span>
                            </button>
                            <div class="dropdown-menu">
                                <a class="dropdown-item" onclick="location.href = 'productos.jsp?caso=21'">Juegos</a>
                                <a class="dropdown-item" onclick="location.href = 'productos.jsp?caso=22'">Consolas</a>
                                <a class="dropdown-item" onclick="location.href = 'productos.jsp?caso=23'">Accesorios</a>
                            </div>
                        </div>
                    </li>

                    <li class="dropdown" style="padding: 2px">
                        <div class="btn-group">
                            <button type="button" class="btn btn-default" onclick="location.href = 'productos.jsp?caso=30'">Nintendo</button>
                            <button type="button" class="btn btn-default dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <span class="sr-only">Toggle Dropdown</span>
                            </button>
                            <div class="dropdown-menu">
                                <a class="dropdown-item" onclick="location.href = 'productos.jsp?caso=31'">Juegos</a>
                                <a class="dropdown-item" onclick="location.href = 'productos.jsp?caso=32'">Consolas</a>
                                <a class="dropdown-item" onclick="location.href = 'productos.jsp?caso=33'">Accesorios</a>
                            </div>
                        </div>
                    </li>

                    <li class="dropdown" style="padding: 2px">
                        <div class="btn-group">
                            <button type="button" class="btn btn-default" onclick="location.href = 'productos.jsp?caso=40'">PC</button>
                            <button type="button" class="btn btn-default dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <span class="sr-only">Toggle Dropdown</span>
                            </button>
                            <div class="dropdown-menu">
                                <a class="dropdown-item" onclick="location.href = 'productos.jsp?caso=41'">Juegos</a>
                                <a class="dropdown-item" onclick="location.href = 'productos.jsp?caso=43'">Accesorios</a>
                            </div>
                        </div>
                    </li>
                </ul>
                <div class="row col-md-1"></div>
                <div class="row dropdown" style="top:10px; position: relative;">
                    <a class="dropdown-toggle" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <div class="my-2 my-md-0 mr-md-3">
                            <svg width="2.0em" height="2.0em" viewBox="0 0 16 16" class="bi bi-person-circle " fill="#8E8A8A" xmlns="http://www.w3.org/2000/svg">
                            <path d="M13.468 12.37C12.758 11.226 11.195 10 8 10s-4.757 1.225-5.468 2.37A6.987 6.987 0 0 0 8 15a6.987 6.987 0 0 0 5.468-2.63z"/>
                            <path fill-rule="evenodd" d="M8 9a3 3 0 1 0 0-6 3 3 0 0 0 0 6z"/>
                            <path fill-rule="evenodd" d="M8 1a7 7 0 1 0 0 14A7 7 0 0 0 8 1zM0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8z"/>
                            </svg>
                        </div>
                    </a>
                    <div class=" dropdown-menu dropdown-menu-right" aria-labelledby="dropdownMenuButton">
                        <a class="dropdown-item" href="#">Bienvenido, <b><%=bUsuario.getNombres()%></b></a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="editarCuenta.jsp">Administrar cuenta</a>
                        <%
                            if (bUsuario.getId_perfil() == 3) {
                        %>
                        <a class="dropdown-item" style="cursor:pointer" onclick="irLink('ReporteVenta')">Reporte de Compras</a>
                        <a class="dropdown-item" href="carrito.jsp">Carrito</a>
                        <%}%>
                        <a class="dropdown-item" style="cursor:pointer" onclick="irLink('CerrarSesion')">Cerrar sesion</a>
                    </div>
                </div>
                <ul class="navbar-nav nav-flex-icons">
                    <li class="nav-item">
                        <a href="https://www.facebook.com/xiomaragames" class="nav-link" target="blank"><i class="fab fa-facebook-f"></i></a>
                    </li>
                    <li class="nav-item">
                        <a href="https://www.instagram.com/turismociva/" class="nav-link" target="blank"><i class="fab fa-instagram"></i></a>
                    </li>
                </ul>
            </div>
        </nav>
        <%
            Productos p = ProductoAdm.getProducto(Integer.parseInt(request.getParameter("id")));
            String carpeta = "";
            switch (p.getPlataforma()) {
                case "PLAYSTATION": {
                    carpeta = "playstation";
                    break;
                }
                case "XBOX": {
                    carpeta = "xbox";
                    break;
                }
                case "NINTENDO": {
                    carpeta = "nintendo";
                    break;
                }
                case "PC": {
                    carpeta = "pc";
                    break;
                }
            }
        %>
        <main>
            <div class="container">
                <div class="row">
                    <div class="col">
                        <img src="img/productos/<%=carpeta%>/<%=p.getImagen()%>" class="img-fluid" alt="Responsive image">
                    </div>
                    <div class="col">
                        <form action="Controlador" method="post">
                            <div class="form-group">
                                <label>ID Producto</label>
                                <input class="form-control" type="text" name="txtcodigo" value="<%=p.getId_producto()%>" readonly>
                                <label>Plataforma</label>
                                <input class="form-control" type="text" name="txtplataforma" value="<%=p.getPlataforma()%>" readonly>
                                <label>Subplataforma</label>
                                <input class="form-control" type="text" name="txtsubplataforma" value="<%=p.getSub_plataforma()%>" readonly>
                                <label>Tipo</label>
                                <input class="form-control" type="text" name="txttipo" value="<%=p.getTipo()%>" readonly>
                                <label>Nombre del juego</label>
                                <input class="form-control" type="text" name="txtnombre" value="<%=p.getNombre()%>" readonly>
                                <label>Precio</label>
                                <input class="form-control" type="text" name="txtprecio" value="<%=p.getPrecio()%>" readonly>
                                <label>Cantidad</label>
                                <input class="form-control" type="number" name="nmbcantidad" value="1" min="1"><br>
                                <input type="submit" class="btn btn-primary btn-block" name="btnAñadir" value="Agregar">
                                <input type="hidden" name="accion" value="AgregarCarrito">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </main>
        <footer>
            <div class="contenedor">
                <p class="copy">Xiomara Games &copy; 2022</p>
                <div class="sociales">
                    <a class="icon-facebook-official" href=""></a>
                    <a class="icon-twitter-squared" href=""></a>
                    <a class="icon-youtube-play" href=""></a>
                </div>
            </div>
        </footer>
        <footer class="bg-light text-center text-lg-start">
            <div class="container-fluid p-4">
                <div class="row">
                    <div class="col-lg-4 col-md-12 mb-4 mb-md-0">
                        <h2 class="icon-gamepad">XiomaraGame</h2>
                        <p>Siguenos en:</p>
                        <a href="https://www.facebook.com/xiomaragames" target="blank"><img src="https://img.icons8.com/ios/30/000000/facebook-circled--v2.png"/></a>
                        <a href="http://www.xiomaragames.online/" target="blank"><img src="https://img.icons8.com/ios/30/000000/instagram-new--v3.png"/></a>
                    </div>
                    <div class="col-lg-4 col-md-12 mb-4 mb-md-0">
                        <h4>CATEGORIAS</h4>
                        <li>
                            <a onclick="location.href = 'productos.jsp?caso=10'" style="cursor:pointer;">Play Station</a>
                        </li>
                        <li>
                            <a onclick="location.href = 'productos.jsp?caso=20'" style="cursor:pointer;">XBOX</a>
                        </li>
                        <li>
                            <a onclick="location.href = 'productos.jsp?caso=30'" style="cursor:pointer;">Nintendo</a>
                        </li>
                        <li>
                            <a onclick="location.href = 'productos.jsp?caso=40'" style="cursor:pointer;">PC</a>
                        </li>
                    </div>
                    <div class="col-lg-4 col-md-12 mb-4 mb-md-0">
                        <h4>Servicio al cliente</h4>
                        <p>Central telefónica +51 991703355</p>
                        <h4>UBICACIÓN</h4>
                        <p>Jr. Andahuaylas 1219-1227, Cercado de Lima 15001 - PERÚ</p>
                        <div class="my-2 my-md-0 mr-md-3">
                            <a class="btn btn-outline-primary" href="intranet.html">Intranet</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="text-center p-3" id="marca">
                <h2 class="icon-book">XiomaraGame</h2>
                <p>“El mejor premio de mis actos es el aplauso de mi conciencia”</p>
                <p>-Miguel II Ciccia-</p>
            </div>
        </footer>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    </body>
</html>
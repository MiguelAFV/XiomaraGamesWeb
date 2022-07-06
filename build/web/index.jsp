<%@page import="Modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Xiomara Games</title>
        <link rel="stylesheet" type="text/css" href="css/estilo.css">
        <link rel="stylesheet" type="text/css" href="css/fontello.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
        <script>
            function irLink(url) {
                //alert(url);
                document.form_index.accion.value = url;
                document.form_index.submit();
            }
        </script>
    </head>
    <%
        HttpSession Session = request.getSession();
        boolean flagsessionU = false;
        Usuario bUsuario = null;
        if (Session.getAttribute("Usuarios") != null) {
            bUsuario = (Usuario) Session.getAttribute("Usuarios");
            flagsessionU = true;
        }
    %>
    <body style="background: #ffffff;">
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
                <%
                    if (flagsessionU) {
                %>
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
                            if (bUsuario.getId_perfil() == 1) {
                        %>
                        <a class="dropdown-item" style="cursor:pointer" onclick="irLink('listarEmpleados')">Reporte de Empleados</a>
                        <a class="dropdown-item" style="cursor:pointer" onclick="irLink('listarClientes')">Reporte de Clientes</a>
                        <a class="dropdown-item" style="cursor:pointer" onclick="irLink('listarProductos')">Reporte de Productos</a>
                        <a class="dropdown-item" href="registro2.html">Registrar empleado</a>
                        <a class="dropdown-item" href="nuevoProducto.jsp">Agregar un nuevo producto</a>
                        <a class="dropdown-item" style="cursor:pointer" onclick="irLink('ReporteVenta')">Reporte de Ventas</a>
                        <%
                        } else if (bUsuario.getId_perfil() == 2) {
                        %>
                        <a class="dropdown-item" style="cursor:pointer" onclick="irLink('listarClientes')">Reporte de Clientes</a>
                        <a class="dropdown-item" style="cursor:pointer" onclick="irLink('listarProductos')">Reporte de Productos</a>
                        <a class="dropdown-item" href="nuevoProducto.jsp">Agregar un nuevo producto</a>
                        <a class="dropdown-item" style="cursor:pointer" onclick="irLink('ReporteVenta')">Reporte de Ventas</a>
                        <%
                        } else if (bUsuario.getId_perfil() == 3) {
                        %>
                        <a class="dropdown-item" style="cursor:pointer" onclick="irLink('ReporteVenta')">Reporte de Compras</a>
                        <a class="dropdown-item" href="carrito.jsp">Carrito</a>
                        <a class="dropdown-item" href="reclamos.jsp">Solicitudes y Reclamos</a>
                        <%}%>
                        <a class="dropdown-item" style="cursor:pointer" onclick="irLink('listarSolicitudes')">Reporte de Solicitudes</a>
                        <a class="dropdown-item" style="cursor:pointer" onclick="irLink('CerrarSesion')">Cerrar sesion</a>
                    </div>
                </div>
                <%
                } else {
                %>
                <ul class="navbar-nav nav-flex-icons">
                    <li class="nav-item">
                        <a href="https://www.facebook.com/xiomaragames" class="nav-link" target="blank"><i class="fab fa-facebook-f"></i></a>
                    </li>
                    <li class="nav-item">
                        <a href="https://www.instagram.com/turismociva/" class="nav-link" target="blank"><i class="fab fa-instagram"></i></a>
                    </li>
                </ul>

                <div class="my-2 my-md-0 mr-md-3">
                    <a class="btn btn-outline-primary" href="login.html">Iniciar sesión</a>
                    <a class="btn btn-outline-secondary" href="registro.html">Registrarse</a>
                </div>
            </div>
            <%}%>
        </nav>
        <main>
            <br>
            <div id="carouselExampleIndicators" class="carousel slide wrapper" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img class="d-block w-100" src="img/slider/ps.jpg" alt="First slide">
                        <div class="carousel-caption d-none d-md-block">
                            <h1>GOD OF WAR</h1>
                            <p>Llego el nuevo juego de GOD of War para PS3 -  RESERVA YA</p>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="img/slider/xbox.jpg" alt="Second slide">
                        <div class="carousel-caption d-none d-md-block">
                            <h1>XBOX ONE X</h1>
                            <p>La nueva consola de XBOX ya llego - COMPRALO YA</p>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="img/slider/nintendo.jpg" alt="Third slide">
                        <div class="carousel-caption d-none d-md-block">
                            <h1>SUPER MARIO ODYSSEY</h1>
                            <p>La nueva aventura de Mario en 3D ya llego - JUEGALO YA</p>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="img/slider/pc.jpg" alt="Fourth slide">
                        <div class="carousel-caption d-none d-md-block">
                            <h1>FORTNITE</h1>
                            <p>El juego que esta dando que hablar - DESCARGALO YA</p>
                        </div>
                    </div>
                </div><br><br>
                <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
            <section id="articulos">
                <h3>Revise nuestros articulos redactados por expertos de los videojuegos</h3>
                <div class="contenedor">
                    <div class="articulos-gz">
                        <img src="img/articulos/psa.jpg" alt="">
                        <h4>God of War for PS4</h4>
                    </div>
                    <div class="articulos-gz">
                        <img src="img/articulos/xboxa.jpg" alt="">
                        <h4>Halo 4 for XBOX One</h4>
                    </div>
                    <div class="articulos-gz">
                        <img src="img/articulos/nintendoa.jpg" alt="">
                        <h4>Super Smash bros for Switch</h4>
                    </div>
                    <div class="articulos-gz">
                        <img src="img/articulos/pca.jpg" alt="">
                        <h4>Fortnite for PC</h4>
                    </div>
                </div>
            </section>
        </main>
        <section class="descrip">
            <div class="container d-flex justify-content-center gap180">
                <div class="col-md-10 text-center">
                    <h2 class="titulo font-italic" style="font-size:5em;">Xiomara Game</h2>
                    <p style="color: #000000">Somos una gran corporación que tenemos como fin unir a las familias en esta etapa de cuarentena y pandemia pues contamos con ciertos protocolos y hábitos que tenemos para ustedes como desinfección de nuestros locales y buses contra la Covid 19. También tenemos todos los implementos necesarios para que no te preocupes por los robos contamos con un panel de control donde se observa nuestro viaje en tiempo real a través  de las computadoras y celulares mediante la tecnología GPS. Puedes sentirte cómodo ya que contamos con un personal que te acompañará de principio a fin del viaje y resolverá tus dudas o molestias durante el viaje. Contamos con todos los permisos y protocolos de bioseguridad para viajes tranquilo.</p>
                </div>
            </div>
        </section>
        <div>
            <div class="row align-items-center justify-content-center text-md-center">
                <div class="col-md-4 shadow p-3 mb-5 bg-white rounded">
                    <h1 class="text-info">SPIDERMAN - PS5</h1>
                    <p class="texto">Play Station 5 tiene grandes desafios a futuroes soportar la embestida de una Microsoft que llega a la nueva generación mucho mejor preparada de lo que lo estaba en 2013, cuando Xbox One aterrizó en las tiendas decidida a medirse de tú a tú con PS4.</p>
                </div>
                <div class="col-md-6">
                    <img class="figure-img img-fluid rounded-pill border border-info" src="img/reservas/ps.jpg">
                </div>
            </div>

            <div class="row align-items-center justify-content-center text-md-center">
                <div class="col-md-6">
                    <img class="figure-img img-fluid rounded-pill border border-info" src="img/reservas/xbox.jpg" >
                </div>
                <div class="col-md-4 shadow p-3 mb-5 bg-white rounded">
                    <h1 class="text-info">SONIC ORIGINS - XBOX</h1>
                    <p class="texto">El auténtico corazón de esta consola de videojuegos es el chip que aglutina tanto la CPU como la lógica gráfica, dos componentes que trabajan coordinadamente en el interior de un mismo circuito integrado.</p>
                </div>
            </div>
            
            <div class="row align-items-center justify-content-center text-md-center">
                <div class="col-md-4 shadow p-3 mb-5 bg-white rounded">
                    <h1 class="text-info">POKEMON LEGENDS ARCEUS</h1>
                    <p class="texto"> Nintendo nos tiene acostumbrados a no seguir el camino recto y a explorar rutas nada sencillas cuando uno va solo. Ha sido su máxima en los últimos años. Así es Nintendo y precisamente por ello sobrevive. La realidad es que estamos ante una especie de tablet con corazón Tegra al que se incorporan diferentes elementos, desde mandos laterales a una base, para que inmediatamente sea otra cosa diferente: sobremesa que conectamos a un televisor, portátil o hasta pantalla para jugar en cualquier lado.</p>
                </div>
                <div class="col-md-6">
                    <img class="figure-img img-fluid rounded-pill border border-info" src="img/reservas/nintendo.jpg">
                </div>
            </div>
            
            <div class="row align-items-center justify-content-center text-md-center">
                <div class="col-md-6">
                    <img class="figure-img img-fluid rounded-pill border border-info" src="img/reservas/pc.jpg">
                </div>
                <div class="col-md-4 shadow p-3 mb-5 bg-white rounded">
                    <h1 class="text-info">CRASH BANDICOOT 4 - PC</h1>
                    <p class="texto">Independientemente de los componentes que elija, todos deben funcionar al unísono para lograr una experiencia perfecta. Los componentes compatibles le ayudarán a evitar repeticiones y tiempos de retardo, a la vez que optimiza su estrategia de refrigeración.</p>
                </div>
            </div>
        </div>
        <footer>
            <div class="contenedor">
                <p class="copy">Xiomara Games &copy; 2022</p>
                <div class="sociales">
                    <a class="icon-facebook-official" href="https://www.facebook.com/xiomaragames/"></a>
                    <a class="icon-twitter-squared" href="https://twitter.com/Hunt_Dog_Arts"></a>
                    <a class="icon-youtube-play" href="https://www.youtube.com/channel/UCjZVQIeN0drw7OXY2wig0-w/featured"></a>
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
    </body>
</html>
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Usuario;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Xiomara Games</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilo.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/fontello.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            function irLink(url) {\n");
      out.write("                //alert(url);\n");
      out.write("                document.form_index.accion.value = url;\n");
      out.write("                document.form_index.submit();\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    ");

        HttpSession Session = request.getSession();
        boolean flagsessionU = false;
        Usuario bUsuario = null;
        if (Session.getAttribute("Usuarios") != null) {
            bUsuario = (Usuario) Session.getAttribute("Usuarios");
            flagsessionU = true;
        }
    
      out.write("\n");
      out.write("    <body style=\"background: #ffffff;\">\n");
      out.write("        <form action=\"Controlador\" method=\"post\" name=\"form_index\">\n");
      out.write("            <input type=\"hidden\" name=\"accion\" value=\"pruebas11:21\">\n");
      out.write("        </form>\n");
      out.write("        <nav class=\"navbar navbar-expand-sm bg-light navbar-light sticky-top\"  >  <!--style=\"background-color:#A970FF !important;\"-->\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.jsp\"><h3 class=\"icon-gamepad\">XiomaraGame</h3></a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"nosotros.jsp\">Nosotros</a></li>\n");
      out.write("\n");
      out.write("                    <li class=\"dropdown\" style=\"padding: 2px\">\n");
      out.write("                        <div class=\"btn-group\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default\" onclick=\"location.href = 'productos.jsp?caso=10'\">Play Station</button>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default dropdown-toggle dropdown-toggle-split\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <span class=\"sr-only\">Toggle Dropdown</span>\n");
      out.write("                            </button>\n");
      out.write("                            <div class=\"dropdown-menu\">\n");
      out.write("                                <a class=\"dropdown-item\" onclick=\"location.href = 'productos.jsp?caso=11'\">Juegos</a>\n");
      out.write("                                <a class=\"dropdown-item\" onclick=\"location.href = 'productos.jsp?caso=12'\">Consolas</a>\n");
      out.write("                                <a class=\"dropdown-item\" onclick=\"location.href = 'productos.jsp?caso=13'\">Accesorios</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"dropdown\" style=\"padding: 2px\">\n");
      out.write("                        <div class=\"btn-group\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default\" onclick=\"location.href = 'productos.jsp?caso=20'\">XBOX</button>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default dropdown-toggle dropdown-toggle-split\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <span class=\"sr-only\">Toggle Dropdown</span>\n");
      out.write("                            </button>\n");
      out.write("                            <div class=\"dropdown-menu\">\n");
      out.write("                                <a class=\"dropdown-item\" onclick=\"location.href = 'productos.jsp?caso=21'\">Juegos</a>\n");
      out.write("                                <a class=\"dropdown-item\" onclick=\"location.href = 'productos.jsp?caso=22'\">Consolas</a>\n");
      out.write("                                <a class=\"dropdown-item\" onclick=\"location.href = 'productos.jsp?caso=23'\">Accesorios</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"dropdown\" style=\"padding: 2px\">\n");
      out.write("                        <div class=\"btn-group\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default\" onclick=\"location.href = 'productos.jsp?caso=30'\">Nintendo</button>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default dropdown-toggle dropdown-toggle-split\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <span class=\"sr-only\">Toggle Dropdown</span>\n");
      out.write("                            </button>\n");
      out.write("                            <div class=\"dropdown-menu\">\n");
      out.write("                                <a class=\"dropdown-item\" onclick=\"location.href = 'productos.jsp?caso=31'\">Juegos</a>\n");
      out.write("                                <a class=\"dropdown-item\" onclick=\"location.href = 'productos.jsp?caso=32'\">Consolas</a>\n");
      out.write("                                <a class=\"dropdown-item\" onclick=\"location.href = 'productos.jsp?caso=33'\">Accesorios</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"dropdown\" style=\"padding: 2px\">\n");
      out.write("                        <div class=\"btn-group\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default\" onclick=\"location.href = 'productos.jsp?caso=40'\">PC</button>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default dropdown-toggle dropdown-toggle-split\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <span class=\"sr-only\">Toggle Dropdown</span>\n");
      out.write("                            </button>\n");
      out.write("                            <div class=\"dropdown-menu\">\n");
      out.write("                                <a class=\"dropdown-item\" onclick=\"location.href = 'productos.jsp?caso=41'\">Juegos</a>\n");
      out.write("                                <a class=\"dropdown-item\" onclick=\"location.href = 'productos.jsp?caso=43'\">Accesorios</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                ");

                    if (flagsessionU) {
                
      out.write("\n");
      out.write("                <div class=\"row col-md-1\"></div>\n");
      out.write("                <div class=\"row dropdown\" style=\"top:10px; position: relative;\">\n");
      out.write("                    <a class=\"dropdown-toggle\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                        <div class=\"my-2 my-md-0 mr-md-3\">\n");
      out.write("                            <svg width=\"2.0em\" height=\"2.0em\" viewBox=\"0 0 16 16\" class=\"bi bi-person-circle \" fill=\"#8E8A8A\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("                            <path d=\"M13.468 12.37C12.758 11.226 11.195 10 8 10s-4.757 1.225-5.468 2.37A6.987 6.987 0 0 0 8 15a6.987 6.987 0 0 0 5.468-2.63z\"/>\n");
      out.write("                            <path fill-rule=\"evenodd\" d=\"M8 9a3 3 0 1 0 0-6 3 3 0 0 0 0 6z\"/>\n");
      out.write("                            <path fill-rule=\"evenodd\" d=\"M8 1a7 7 0 1 0 0 14A7 7 0 0 0 8 1zM0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8z\"/>\n");
      out.write("                            </svg>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\" dropdown-menu dropdown-menu-right\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                        <a class=\"dropdown-item\" href=\"#\">Bienvenido, <b>");
      out.print(bUsuario.getNombres());
      out.write("</b></a>\n");
      out.write("                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"editarCuenta.jsp\">Administrar cuenta</a>\n");
      out.write("                        ");

                            if (bUsuario.getId_perfil() == 1) {
                        
      out.write("\n");
      out.write("                        <a class=\"dropdown-item\" style=\"cursor:pointer\" onclick=\"irLink('listarEmpleados')\">Reporte de Empleados</a>\n");
      out.write("                        <a class=\"dropdown-item\" style=\"cursor:pointer\" onclick=\"irLink('listarClientes')\">Reporte de Clientes</a>\n");
      out.write("                        <a class=\"dropdown-item\" style=\"cursor:pointer\" onclick=\"irLink('listarProductos')\">Reporte de Productos</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"registro2.html\">Registrar empleado</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"nuevoProducto.jsp\">Agregar un nuevo producto</a>\n");
      out.write("                        <a class=\"dropdown-item\" style=\"cursor:pointer\" onclick=\"irLink('ReporteVenta')\">Reporte de Ventas</a>\n");
      out.write("                        ");

                        } else if (bUsuario.getId_perfil() == 2) {
                        
      out.write("\n");
      out.write("                        <a class=\"dropdown-item\" style=\"cursor:pointer\" onclick=\"irLink('listarClientes')\">Reporte de Clientes</a>\n");
      out.write("                        <a class=\"dropdown-item\" style=\"cursor:pointer\" onclick=\"irLink('listarProductos')\">Reporte de Productos</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"nuevoProducto.jsp\">Agregar un nuevo producto</a>\n");
      out.write("                        <a class=\"dropdown-item\" style=\"cursor:pointer\" onclick=\"irLink('ReporteVenta')\">Reporte de Ventas</a>\n");
      out.write("                        ");

                        } else if (bUsuario.getId_perfil() == 3) {
                        
      out.write("\n");
      out.write("                        <a class=\"dropdown-item\" style=\"cursor:pointer\" onclick=\"irLink('ReporteVenta')\">Reporte de Compras</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"carrito.jsp\">Carrito</a>\n");
      out.write("                        <a class=\"dropdown-item\" href=\"reclamos.jsp\">Solicitudes y Reclamos</a>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                        <a class=\"dropdown-item\" style=\"cursor:pointer\" onclick=\"irLink('listarSolicitudes')\">Reporte de Solicitudes</a>\n");
      out.write("                        <a class=\"dropdown-item\" style=\"cursor:pointer\" onclick=\"irLink('CerrarSesion')\">Cerrar sesion</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");

                } else {
                
      out.write("\n");
      out.write("                <ul class=\"navbar-nav nav-flex-icons\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"https://www.facebook.com/xiomaragames\" class=\"nav-link\" target=\"blank\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"https://www.instagram.com/turismociva/\" class=\"nav-link\" target=\"blank\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <div class=\"my-2 my-md-0 mr-md-3\">\n");
      out.write("                    <a class=\"btn btn-outline-primary\" href=\"login.html\">Iniciar sesión</a>\n");
      out.write("                    <a class=\"btn btn-outline-secondary\" href=\"registro.html\">Registrarse</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </nav>\n");
      out.write("        <main>\n");
      out.write("            <br>\n");
      out.write("            <div id=\"carouselExampleIndicators\" class=\"carousel slide wrapper\" data-ride=\"carousel\">\n");
      out.write("                <ol class=\"carousel-indicators\">\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"3\"></li>\n");
      out.write("                </ol>\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"carousel-item active\">\n");
      out.write("                        <img class=\"d-block w-100\" src=\"img/slider/ps.jpg\" alt=\"First slide\">\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                            <h1>GOD OF WAR</h1>\n");
      out.write("                            <p>Llego el nuevo juego de GOD of War para PS3 -  RESERVA YA</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img class=\"d-block w-100\" src=\"img/slider/xbox.jpg\" alt=\"Second slide\">\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                            <h1>XBOX ONE X</h1>\n");
      out.write("                            <p>La nueva consola de XBOX ya llego - COMPRALO YA</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img class=\"d-block w-100\" src=\"img/slider/nintendo.jpg\" alt=\"Third slide\">\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                            <h1>SUPER MARIO ODYSSEY</h1>\n");
      out.write("                            <p>La nueva aventura de Mario en 3D ya llego - JUEGALO YA</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img class=\"d-block w-100\" src=\"img/slider/pc.jpg\" alt=\"Fourth slide\">\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                            <h1>FORTNITE</h1>\n");
      out.write("                            <p>El juego que esta dando que hablar - DESCARGALO YA</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><br><br>\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\n");
      out.write("                    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <section id=\"articulos\">\n");
      out.write("                <h3>Revise nuestros articulos redactados por expertos de los videojuegos</h3>\n");
      out.write("                <div class=\"contenedor\">\n");
      out.write("                    <div class=\"articulos-gz\">\n");
      out.write("                        <img src=\"img/articulos/psa.jpg\" alt=\"\">\n");
      out.write("                        <h4>God of War for PS4</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"articulos-gz\">\n");
      out.write("                        <img src=\"img/articulos/xboxa.jpg\" alt=\"\">\n");
      out.write("                        <h4>Halo 4 for XBOX One</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"articulos-gz\">\n");
      out.write("                        <img src=\"img/articulos/nintendoa.jpg\" alt=\"\">\n");
      out.write("                        <h4>Super Smash bros for Switch</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"articulos-gz\">\n");
      out.write("                        <img src=\"img/articulos/pca.jpg\" alt=\"\">\n");
      out.write("                        <h4>Fortnite for PC</h4>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </main>\n");
      out.write("        <section class=\"descrip\">\n");
      out.write("            <div class=\"container d-flex justify-content-center gap180\">\n");
      out.write("                <div class=\"col-md-10 text-center\">\n");
      out.write("                    <h2 class=\"titulo font-italic\" style=\"font-size:5em;\">Xiomara Game</h2>\n");
      out.write("                    <p style=\"color: #000000\">Somos una gran corporación que tenemos como fin unir a las familias en esta etapa de cuarentena y pandemia pues contamos con ciertos protocolos y hábitos que tenemos para ustedes como desinfección de nuestros locales y buses contra la Covid 19. También tenemos todos los implementos necesarios para que no te preocupes por los robos contamos con un panel de control donde se observa nuestro viaje en tiempo real a través  de las computadoras y celulares mediante la tecnología GPS. Puedes sentirte cómodo ya que contamos con un personal que te acompañará de principio a fin del viaje y resolverá tus dudas o molestias durante el viaje. Contamos con todos los permisos y protocolos de bioseguridad para viajes tranquilo.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <div>\n");
      out.write("            <div class=\"row align-items-center justify-content-center text-md-center\">\n");
      out.write("                <div class=\"col-md-4 shadow p-3 mb-5 bg-white rounded\">\n");
      out.write("                    <h1 class=\"text-info\">SPIDERMAN - PS5</h1>\n");
      out.write("                    <p class=\"texto\">Play Station 5 tiene grandes desafios a futuroes soportar la embestida de una Microsoft que llega a la nueva generación mucho mejor preparada de lo que lo estaba en 2013, cuando Xbox One aterrizó en las tiendas decidida a medirse de tú a tú con PS4.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <img class=\"figure-img img-fluid rounded-pill border border-info\" src=\"img/reservas/ps.jpg\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row align-items-center justify-content-center text-md-center\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <img class=\"figure-img img-fluid rounded-pill border border-info\" src=\"img/reservas/xbox.jpg\" >\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 shadow p-3 mb-5 bg-white rounded\">\n");
      out.write("                    <h1 class=\"text-info\">SONIC ORIGINS - XBOX</h1>\n");
      out.write("                    <p class=\"texto\">El auténtico corazón de esta consola de videojuegos es el chip que aglutina tanto la CPU como la lógica gráfica, dos componentes que trabajan coordinadamente en el interior de un mismo circuito integrado.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row align-items-center justify-content-center text-md-center\">\n");
      out.write("                <div class=\"col-md-4 shadow p-3 mb-5 bg-white rounded\">\n");
      out.write("                    <h1 class=\"text-info\">POKEMON LEGENDS ARCEUS</h1>\n");
      out.write("                    <p class=\"texto\"> Nintendo nos tiene acostumbrados a no seguir el camino recto y a explorar rutas nada sencillas cuando uno va solo. Ha sido su máxima en los últimos años. Así es Nintendo y precisamente por ello sobrevive. La realidad es que estamos ante una especie de tablet con corazón Tegra al que se incorporan diferentes elementos, desde mandos laterales a una base, para que inmediatamente sea otra cosa diferente: sobremesa que conectamos a un televisor, portátil o hasta pantalla para jugar en cualquier lado.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <img class=\"figure-img img-fluid rounded-pill border border-info\" src=\"img/reservas/nintendo.jpg\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"row align-items-center justify-content-center text-md-center\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <img class=\"figure-img img-fluid rounded-pill border border-info\" src=\"img/reservas/pc.jpg\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 shadow p-3 mb-5 bg-white rounded\">\n");
      out.write("                    <h1 class=\"text-info\">CRASH BANDICOOT 4 - PC</h1>\n");
      out.write("                    <p class=\"texto\">Independientemente de los componentes que elija, todos deben funcionar al unísono para lograr una experiencia perfecta. Los componentes compatibles le ayudarán a evitar repeticiones y tiempos de retardo, a la vez que optimiza su estrategia de refrigeración.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("                <p class=\"copy\">Xiomara Games &copy; 2022</p>\n");
      out.write("                <div class=\"sociales\">\n");
      out.write("                    <a class=\"icon-facebook-official\" href=\"https://www.facebook.com/xiomaragames/\"></a>\n");
      out.write("                    <a class=\"icon-twitter-squared\" href=\"https://twitter.com/Hunt_Dog_Arts\"></a>\n");
      out.write("                    <a class=\"icon-youtube-play\" href=\"https://www.youtube.com/channel/UCjZVQIeN0drw7OXY2wig0-w/featured\"></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <footer class=\"bg-light text-center text-lg-start\">\n");
      out.write("            <div class=\"container-fluid p-4\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-4 col-md-12 mb-4 mb-md-0\">\n");
      out.write("                        <h2 class=\"icon-gamepad\">XiomaraGame</h2>\n");
      out.write("                        <p>Siguenos en:</p>\n");
      out.write("                        <a href=\"https://www.facebook.com/xiomaragames\" target=\"blank\"><img src=\"https://img.icons8.com/ios/30/000000/facebook-circled--v2.png\"/></a>\n");
      out.write("                        <a href=\"http://www.xiomaragames.online/\" target=\"blank\"><img src=\"https://img.icons8.com/ios/30/000000/instagram-new--v3.png\"/></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-12 mb-4 mb-md-0\">\n");
      out.write("                        <h4>CATEGORIAS</h4>\n");
      out.write("                        <li>\n");
      out.write("                            <a onclick=\"location.href = 'productos.jsp?caso=10'\" style=\"cursor:pointer;\">Play Station</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a onclick=\"location.href = 'productos.jsp?caso=20'\" style=\"cursor:pointer;\">XBOX</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a onclick=\"location.href = 'productos.jsp?caso=30'\" style=\"cursor:pointer;\">Nintendo</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a onclick=\"location.href = 'productos.jsp?caso=40'\" style=\"cursor:pointer;\">PC</a>\n");
      out.write("                        </li>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-12 mb-4 mb-md-0\">\n");
      out.write("                        <h4>Servicio al cliente</h4>\n");
      out.write("                        <p>Central telefónica +51 991703355</p>\n");
      out.write("                        <h4>UBICACIÓN</h4>\n");
      out.write("                        <p>Jr. Andahuaylas 1219-1227, Cercado de Lima 15001 - PERÚ</p>\n");
      out.write("                        <div class=\"my-2 my-md-0 mr-md-3\">\n");
      out.write("                            <a class=\"btn btn-outline-primary\" href=\"intranet.html\">Intranet</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"text-center p-3\" id=\"marca\">\n");
      out.write("                <h2 class=\"icon-book\">XiomaraGame</h2>\n");
      out.write("                <p>“El mejor premio de mis actos es el aplauso de mi conciencia”</p>\n");
      out.write("                <p>-Miguel II Ciccia-</p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

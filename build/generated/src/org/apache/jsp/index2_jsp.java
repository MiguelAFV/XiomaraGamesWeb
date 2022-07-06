package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Cliente;
import Modelo.Empleado;

public final class index2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        Cliente bCliente = null;
        Empleado bEmpleado = null;
        if (Session.getAttribute("Usuarios") != null) {
            bEmpleado = (Empleado) Session.getAttribute("Usuarios");
            flagsessionU = true;
        }
    
      out.write("\n");
      out.write("    <body style=\"background: #333333;\">\n");
      out.write("        <form action=\"Controlador\" method=\"post\" name=\"form_index\">\n");
      out.write("            <input type=\"hidden\" name=\"accion\" value=\"pruebas11:21\">\n");
      out.write("        </form>\n");
      out.write("        <header>\n");
      out.write("            ");

                if (flagsessionU) {
                    if (bEmpleado.getId_perfil()== 1) {
            
      out.write("\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <div id=\"userlogin\"><h1>Bienvenido: ");
      out.print(bEmpleado.getNombres());
      out.write("</h1></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <div id=\"enlaces\" style=\"float:left;\">\n");
      out.write("                    <!--<a href=\"listaUsuarios.xhtml\">Reporte de Usuarios y Administradores</a>-->\n");
      out.write("                    <a style=\"cursor:pointer\" onclick=\"irLink('listarEmpleados')\">Reporte de Empleados</a>\n");
      out.write("                    <a style=\"cursor:pointer\" onclick=\"irLink('listarClientes')\">Reporte de Clientes</a>\n");
      out.write("                    <a style=\"cursor:pointer\" onclick=\"irLink('listarProductos')\">Reporte de Productos</a>\n");
      out.write("                    <a href=\"editarCuenta2.jsp\">Administrar cuenta</a>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"enlaces\" style=\"float:right;\">\n");
      out.write("                    <a href=\"nuevoProducto.jsp\">Agregar un nuevo producto</a>\n");
      out.write("                    <a style=\"cursor:pointer\" onclick=\"irLink('ReporteVenta')\">Reporte de Ventas</a>\n");
      out.write("                    <a style=\"cursor:pointer\" onclick=\"irLink('CerrarSesion')\">Cerrar sesion</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");

            } else if (bEmpleado.getId_perfil()== 2) {
            
      out.write("\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <div id=\"userlogin\"><h1>Bienvenido: ");
      out.print(bEmpleado.getNombres());
      out.write("</h1></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <div id=\"enlaces\" style=\"float:left;\">\n");
      out.write("                    <!--<a href=\"listaUsuarios.xhtml\">Reporte de Usuarios y Administradores</a>-->\n");
      out.write("                    <a style=\"cursor:pointer\" onclick=\"irLink('listarClientes')\">Reporte de Clientes</a>\n");
      out.write("                    <a style=\"cursor:pointer\" onclick=\"irLink('listarProductos')\">Reporte de Productos</a>\n");
      out.write("                    <a href=\"editarCuenta2.jsp\">Administrar cuenta</a>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"enlaces\" style=\"float:right;\">\n");
      out.write("                    <a href=\"nuevoProducto.jsp\">Agregar un nuevo producto</a>\n");
      out.write("                    <a style=\"cursor:pointer\" onclick=\"irLink('ReporteVenta')\">Reporte de Ventas</a>\n");
      out.write("                    <a style=\"cursor:pointer\" onclick=\"irLink('CerrarSesion')\">Cerrar sesion</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");

            } else if (bCliente.getId_perfil()== 3) {
            
      out.write("\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <div id=\"userlogin\"><h1>Bienvenido: ");
      out.print(bCliente.getUsu_cli());
      out.write("</h1></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <div id=\"enlaces\">\n");
      out.write("                    <a href=\"nosotros.jsp\">Nosotros</a>\n");
      out.write("                    <a href=\"contactanos.jsp\">Contactanos</a>\n");
      out.write("                    <a href=\"editarCuenta.jsp\">Administrar cuenta</a>\n");
      out.write("                    <a style=\"cursor:pointer\" onclick=\"irLink('ReporteVenta')\">Reporte de Compras</a>\n");
      out.write("                    <a href=\"carrito.jsp\">Carrito</a>\n");
      out.write("                    <a style=\"cursor:pointer\" onclick=\"irLink('CerrarSesion')\">Cerrar sesion</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");

                }
            } else {
            
      out.write("\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <div id=\"enlaces\">\n");
      out.write("                    <a href=\"nosotros.jsp\">Nosotros</a>\n");
      out.write("                    <a href=\"contactanos.jsp\">Contactanos</a>\n");
      out.write("                    <a href=\"login.html\">Iniciar Sesion</a>\n");
      out.write("                    <a href=\"registro.html\">Registrarse</a>\n");
      out.write("                    <a href=\"intranet.html\">Intranet</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <div id=\"logo\">\n");
      out.write("                    <a href=\"index.jsp\"><h1 class=\"icon-gamepad\">Xiomara Games</h1></a>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"lista\">\n");
      out.write("                    <ul class=\"nav\">\n");
      out.write("                        <li>\n");
      out.write("                            <a onclick=\"location.href = 'productos.jsp?caso=10'\" style=\"color: #ffffff; cursor:pointer;\">Play Station</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a onclick=\"location.href = 'productos.jsp?caso=11'\" style=\"color: #ffffff; cursor:pointer;\">Juegos</a></li>\n");
      out.write("                                <li><a onclick=\"location.href = 'productos.jsp?caso=12'\" style=\"color: #ffffff; cursor:pointer;\">Consolas</a></li>\n");
      out.write("                                <li><a onclick=\"location.href = 'productos.jsp?caso=13'\" style=\"color: #ffffff; cursor:pointer;\">Accesorios</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a onclick=\"location.href = 'productos.jsp?caso=20'\" style=\"color: #ffffff; cursor:pointer;\">XBox</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a onclick=\"location.href = 'productos.jsp?caso=21'\" style=\"color: #ffffff; cursor:pointer;\">Juegos</a></li>\n");
      out.write("                                <li><a onclick=\"location.href = 'productos.jsp?caso=22'\" style=\"color: #ffffff; cursor:pointer;\">Consolas</a></li>\n");
      out.write("                                <li><a onclick=\"location.href = 'productos.jsp?caso=23'\" style=\"color: #ffffff; cursor:pointer;\">Accesorios</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a onclick=\"location.href = 'productos.jsp?caso=30'\" style=\"color: #ffffff; cursor:pointer;\">Nintendo</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a onclick=\"location.href = 'productos.jsp?caso=31'\" style=\"color: #ffffff; cursor:pointer;\">Juegos</a></li>\n");
      out.write("                                <li><a onclick=\"location.href = 'productos.jsp?caso=32'\" style=\"color: #ffffff; cursor:pointer;\">Consolas</a></li>\n");
      out.write("                                <li><a onclick=\"location.href = 'productos.jsp?caso=33'\" style=\"color: #ffffff; cursor:pointer;\">Accesorios</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a onclick=\"location.href = 'productos.jsp?caso=40'\" style=\"color: #ffffff; cursor:pointer;\">PC</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a onclick=\"location.href = 'productos.jsp?caso=41'\" style=\"color: #ffffff; cursor:pointer;\">Juegos</a></li>\n");
      out.write("                                <li><a onclick=\"location.href = 'productos.jsp?caso=43'\" style=\"color: #ffffff; cursor:pointer;\">Accesorios</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <main>\n");
      out.write("            <!--<div class=\"slider wrapper\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><img src=\"img/slider/ps.jpg\" alt=\"\"></li>\n");
      out.write("                    <li><img src=\"img/slider/xbox.jpg\" alt=\"\"></li>\n");
      out.write("                    <li><img src=\"img/slider/nintendo.jpg\" alt=\"\"></li>\n");
      out.write("                    <li><img src=\"img/slider/pc.jpg\" alt=\"\"></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>-->\n");
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
      out.write("                            <h1>Juego 1</h1>\n");
      out.write("                            <p>lorem ipsum</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img class=\"d-block w-100\" src=\"img/slider/xbox.jpg\" alt=\"Second slide\">\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                            <h1>Juego 2</h1>\n");
      out.write("                            <p>descirpcion </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img class=\"d-block w-100\" src=\"img/slider/nintendo.jpg\" alt=\"Third slide\">\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                            <h1>Juego 3</h1>\n");
      out.write("                            <p>descripcion</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img class=\"d-block w-100\" src=\"img/slider/pc.jpg\" alt=\"Fourth slide\">\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                            <h1>Juego 4</h1>\n");
      out.write("                            <p>descripcion</p>\n");
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
      out.write("        <footer>\n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("                <p class=\"copy\">Xiomara Games &copy; 2022</p>\n");
      out.write("                <div class=\"sociales\">\n");
      out.write("                    <a class=\"icon-facebook-official\" href=\"\"></a>\n");
      out.write("                    <a class=\"icon-twitter-squared\" href=\"\"></a>\n");
      out.write("                    <a class=\"icon-youtube-play\" href=\"\"></a>\n");
      out.write("                </div>\n");
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

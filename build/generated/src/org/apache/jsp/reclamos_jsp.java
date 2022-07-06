package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Usuario;

public final class reclamos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Solicitud o Reclamo</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/fontello.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilo.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" integrity=\"sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\" integrity=\"sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script>\n");
      out.write("            function irLink(url) {\n");
      out.write("                alert(url);\n");
      out.write("                document.form_index.accion.value = url;\n");
      out.write("                document.form_index.submit();\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    ");

        Usuario bUsuario = (Usuario) session.getAttribute("Usuarios");
    
      out.write("\n");
      out.write("    <body>\n");
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
      out.write("                        ");
}
      out.write("\n");
      out.write("                        <a class=\"dropdown-item\" style=\"cursor:pointer\" onclick=\"irLink('CerrarSesion')\">Cerrar sesion</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"navbar-nav nav-flex-icons\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"https://www.facebook.com/xiomaragames\" class=\"nav-link\" target=\"blank\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a href=\"https://www.instagram.com/turismociva/\" class=\"nav-link\" target=\"blank\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <main>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div id=\"capa0\">\n");
      out.write("                    <h1 id=\"titulo\">Realiza una solicitud o reclamo</h1>\n");
      out.write("                    <hr>\n");
      out.write("                    <div id=\"capa1\">\n");
      out.write("                        <form class=\"form-group\" action=\"Controlador\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                            <input type=\"hidden\" name=\"accion\" value=\"realizarReclamo\">\n");
      out.write("                            ");

                                if (bUsuario.getId_perfil() == 3) {
                            
      out.write("\n");
      out.write("                            <label for=\"\">Username</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"txtusername\" value=\"");
      out.print(bUsuario.getUsername());
      out.write("\" id=\"\" aria-describedby=\"\" required focus>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                            <label for=\"\">Asunto</label>\n");
      out.write("                            <select class=\"form-control\" name=\"asuntosolicitud\" id=\"asunto\" required focus>\n");
      out.write("                                <option>Seleccione</option>\n");
      out.write("                                <option value=\"PEDIDOS\">Pedido de un producto</option>\n");
      out.write("                                <option value=\"RECLAMOS\">Reclamo o Sugerencia</option>\n");
      out.write("                            </select><br>\n");
      out.write("                            <label for=\"\">Descripcion</label>\n");
      out.write("                            <textarea class=\"form-control\" name=\"txtdescripcion\" value=\"Escriba su solicitud\" id=\"\" aria-describedby=\"\" required></textarea>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"txtdescripcion\" value=\"Escriba su solicitud\" id=\"\" aria-describedby=\"\" required>\n");
      out.write("                            <label for=\"\">Subir archivo</label>\n");
      out.write("                            <input type=\"file\" name=\"fileimagen\" class=\"form-control\"><br>                            <br>\n");
      out.write("                            <button class=\"btn btn-outline-primary\" name=\"accion\" value=\"registrarSolicitud\">Registrar Solicitud</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
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

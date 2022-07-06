/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Articulo;
import Modelo.DetalleVenta;
import Modelo.Productos;
import Modelo.Usuario;
import Modelo.Venta;
import Adm.*;
import Modelo.Solicitud;
import java.io.File;
//import com.ws.WsProductos;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author PC
 */
@MultipartConfig
public class ServletControlador extends HttpServlet {

    String pathfiles = null;
    private File uploads;
    private String[] extens = {".png", ".jpg", "jpeg"};

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private void rutaPlataforma(String p)
    {
        switch(p)
        {
            case "NINTENDO" :{
                pathfiles = "C:\\Users\\GAMER\\Desktop\\Universidad\\Ciclo 9\\Curso Integrador II\\ProyectoXGW\\XiomaraGames\\web\\img\\productos\\nintendo\\";
                break;
            }
            case "PLAY STATION" :{
                pathfiles = "C:\\Users\\GAMER\\Desktop\\Universidad\\Ciclo 9\\Curso Integrador II\\ProyectoXGW\\XiomaraGames\\web\\img\\productos\\playstation\\";
                break;
            }
            case "XBOX" :{
                pathfiles = "C:\\Users\\GAMER\\Desktop\\Universidad\\Ciclo 9\\Curso Integrador II\\ProyectoXGW\\XiomaraGames\\web\\img\\productos\\xbox\\";
                break;
            }
            case "PC" :{
                pathfiles = "C:\\Users\\GAMER\\Desktop\\Universidad\\Ciclo 9\\Curso Integrador II\\ProyectoXGW\\XiomaraGames\\web\\img\\productos\\pc\\";
                break;
            }
            case "PEDIDOS":
            {
                pathfiles = "C:\\Users\\GAMER\\Desktop\\Universidad\\Ciclo 9\\Curso Integrador II\\ProyectoXGW\\XiomaraGames\\web\\img\\solicitudes\\pedidos\\";
                break;
            }
            case "RECLAMOS":
            {
                pathfiles = "C:\\Users\\GAMER\\Desktop\\Universidad\\Ciclo 9\\Curso Integrador II\\ProyectoXGW\\XiomaraGames\\web\\img\\solicitudes\\reclamos\\";
                break;
            }
        }
        uploads = new File(pathfiles);
    }
    private String saveFile(Part part, File pathUpload) {
        String pathAbsolute = "";
        try {
            Path path = Paths.get(part.getSubmittedFileName());
            String filename = path.getFileName().toString(); //Nombre del archivo
            InputStream input = part.getInputStream(); //El archivo en Si
            if (input != null) {
                File file = new File(pathUpload, filename);
                pathAbsolute = file.getAbsolutePath();
                Files.copy(input, file.toPath());
            }

        } catch (Exception e) {
        }
        return pathAbsolute;
    }

    private boolean isExtension(String fileName, String[] extensions) {
        for (String et : extensions) {
            if (fileName.toLowerCase().endsWith(et)) //Si tiene las extensiones jpg png o jpeg
            {
                return true; //retornará un valor verdadero
            }
        }
        return false;
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        HttpSession session = request.getSession();
//        Usuarios objUsuarios = session.getAttribute("Usuarios") != null ? (Usuarios) session.getAttribute("Usuarios") : new Usuarios();
        String accion = request.getParameter("accion");
        if (accion == null) {
            accion = "";
        }
        switch (accion) {
            case "ValidarLoginCliente": {
                //Iniciar sesion
                String user = request.getParameter("usuario");
                String pass = request.getParameter("password");
                SeguridadAdm objSeguridadAdm = new SeguridadAdm();
                Usuario objClientes = objSeguridadAdm.validarCliente(user, pass);

                if (objClientes != null) {
                    HttpSession objHttpSession = request.getSession();
                    objHttpSession.setAttribute("Usuarios", objClientes);
                    if (objClientes.getEstado() == 0) {
                        objHttpSession.removeAttribute("Usuarios");
                        objHttpSession.invalidate();
                        response.sendRedirect("mensaje.jsp?userName=" + user + "&mensaje= Su cuenta ha sido deshabilitada");
                        break;
                    }
//                    UsuarioAdm objUsuarioAdm = new UsuarioAdm();
//                    ArrayList<Usuarios> listaUsuarios = objUsuarioAdm.getListaUsuarios();
//                    request.setAttribute("listaUsuarios", listaUsuarios);
                    request.setAttribute("userName", user);
                    RequestDispatcher objDispatcher = request.getRequestDispatcher("index.jsp");
                    objDispatcher.forward(request, response);
                } else {
                    response.sendRedirect("mensaje.jsp?userName=" + user + "&mensaje= Esta cuenta no Existe");
                }
                break;
            }
            case "ValidarLoginEmpleado": {
                //Iniciar sesion
                String user = request.getParameter("usuario");
                String pass = request.getParameter("password");
                SeguridadAdm objSeguridadAdm = new SeguridadAdm();
                Usuario objEmpleados = objSeguridadAdm.validarEmpleado(user, pass);

                if (objEmpleados != null) {
                    HttpSession objHttpSession = request.getSession();
                    objHttpSession.setAttribute("Usuarios", objEmpleados);

                    if (objEmpleados.getEstado() == 0) {
                        objHttpSession.removeAttribute("Usuarios");
                        objHttpSession.invalidate();
                        response.sendRedirect("mensaje.jsp?userName=" + user + "&mensaje= Su cuenta ha sido deshabilitada");
                        break;
                    }
//                    UsuarioAdm objUsuarioAdm = new UsuarioAdm();
//                    ArrayList<Usuarios> listaUsuarios = objUsuarioAdm.getListaUsuarios();
//                    request.setAttribute("listaUsuarios", listaUsuarios);
                    request.setAttribute("userName", user);
                    RequestDispatcher objDispatcher = request.getRequestDispatcher("index.jsp");
                    objDispatcher.forward(request, response);
                } else {
                    response.sendRedirect("mensaje.jsp?userName=" + user + "&mensaje= Esta cuenta no Existe");
                }
                break;
            }
            case "RegistrarCliente": {
                //Registrar
                ClienteAdm usuAdm = new ClienteAdm();
                Usuario cli = new Usuario();
                //Definiendo los valores de objeto cli con los valores de las cajas de texto del formulario.
                cli.setUsername(request.getParameter("r_usuario"));
                cli.setDni(request.getParameter("r_dni"));
                cli.setId_perfil(3); //el cliente es 3
                cli.setNombres(request.getParameter("r_nombres"));
                cli.setAp_paterno(request.getParameter("r_apepater"));
                cli.setAp_materno(request.getParameter("r_apemater"));
                cli.setFecha_nacimiento(Date.valueOf(request.getParameter("r_fecha")));
                cli.setNumero(Integer.parseInt(request.getParameter("r_telefono")));
                cli.setCorreo(request.getParameter("r_correo"));
                cli.setClave(request.getParameter("r_contra"));
                cli.setEstado(1); //el estado es 1

                SeguridadAdm objSeguridadAdm = new SeguridadAdm();
                String codcli = String.valueOf(objSeguridadAdm.CodigoAutomatico());

                usuAdm.registrarCliente(cli, codcli);
                RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
                dispatcher.forward(request, response);
                break;
            }
            case "RegistrarEmpleado": {
                //Registrar
                EmpleadoAdm usuAdm = new EmpleadoAdm();
                Usuario emp = new Usuario();
                //Definiendo los valores de objeto emp con los valores de las cajas de texto del formulario.
                emp.setDni(request.getParameter("r_dni"));
                emp.setId_perfil(2); //el empleado es 2
                emp.setNombres(request.getParameter("r_nombres"));
                emp.setAp_paterno(request.getParameter("r_apepater"));
                emp.setAp_materno(request.getParameter("r_apemater"));
                emp.setFecha_nacimiento(Date.valueOf(request.getParameter("r_fecha")));
                emp.setNumero(Integer.parseInt(request.getParameter("r_telefono")));
                emp.setCorreo(request.getParameter("r_correo"));
                emp.setClave(request.getParameter("r_contra"));
                emp.setEstado(1); //el estado es 1

                SeguridadAdm objSeguridadAdm = new SeguridadAdm();
                String codemp = String.valueOf(objSeguridadAdm.CodigoAutomatico());

                System.out.println(codemp + " estee es ");

                usuAdm.registrarEmpleado(emp, codemp);
                RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
                dispatcher.forward(request, response);
                break;
            }
            case "goRegistrar": {
                RequestDispatcher dispatcher = request.getRequestDispatcher("registro.html");
                dispatcher.forward(request, response);
                break;
            }
            case "EditarCliente": {
                //editar
                HttpSession Session = request.getSession(true);
                Usuario objClientes = (Usuario) Session.getAttribute("Usuarios");

                ClienteAdm usuAdm = new ClienteAdm();
                Usuario cli = new Usuario();
                //Definiendo los valores de objeto cli con los valores de las cajas de texto del formulario.
                cli.setUsername(request.getParameter("txtusername"));
                cli.setDni(request.getParameter("txtdni"));
                cli.setNombres(request.getParameter("txtnombre"));
                cli.setAp_paterno(request.getParameter("txtapp"));
                cli.setAp_materno(request.getParameter("txtapm"));
//              usu.setFecha(Date.valueOf(request.getParameter("r_fecha")));
                cli.setNumero(Integer.parseInt(request.getParameter("txtcel")));
                cli.setCorreo(request.getParameter("txtcorreo"));
                cli.setClave(request.getParameter("pwdclave"));

                String codcli = objClientes.getCod_user();

                usuAdm.editarCliente(cli, codcli);
                Session.removeAttribute("Usuarios");
                Session.removeAttribute("CarritoAtribute");
                Session.invalidate();
                RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
                dispatcher.forward(request, response);
                break;
            }
            case "EditarEmpleado": {
                //editar
                HttpSession Session = request.getSession(true);
                Usuario objEmpleados = (Usuario) Session.getAttribute("Usuarios");

                EmpleadoAdm usuAdm = new EmpleadoAdm();
                Usuario emp = new Usuario();
                //Definiendo los valores de objeto cli con los valores de las cajas de texto del formulario.
                emp.setDni(request.getParameter("txtdni"));
                emp.setNombres(request.getParameter("txtnombre"));
                emp.setAp_paterno(request.getParameter("txtapp"));
                emp.setAp_materno(request.getParameter("txtapm"));
//              usu.setFecha(Date.valueOf(request.getParameter("r_fecha")));
                emp.setNumero(Integer.parseInt(request.getParameter("txtcel")));
                emp.setCorreo(request.getParameter("txtcorreo"));
                emp.setClave(request.getParameter("pwdclave"));

                String codemp = objEmpleados.getCod_user();

                usuAdm.editarEmpleado(emp, codemp);
                Session.removeAttribute("Usuarios");
                Session.removeAttribute("CarritoAtribute");
                Session.invalidate();
                RequestDispatcher dispatcher = request.getRequestDispatcher("intranet.html");
                dispatcher.forward(request, response);
                break;
            }
            case "modificarEmpleado": {
                EmpleadoAdm objEmpleadoAdm = new EmpleadoAdm();
                ArrayList<Usuario> listaUsuarios = objEmpleadoAdm.getListaEmpleados();
                int posicion = Integer.parseInt(request.getParameter("posicion"));
                for (int i = 0; i < listaUsuarios.size(); i++) {
                    if (i == posicion) {
                        //objEmpleadoAdm.EliminarEmpleado(listaUsuarios.get(i).getCod_emp());
                        HttpSession objHttpSession = request.getSession();
                        objHttpSession.setAttribute("Usuarios", listaUsuarios.get(i));
                        RequestDispatcher objDispatcher = request.getRequestDispatcher("editarCuenta.jsp");
                        objDispatcher.forward(request, response);
                    }
                }

                break;
            }
            case "goEditar": {
                RequestDispatcher dispatcher = request.getRequestDispatcher("editarCuenta.jsp");
                dispatcher.forward(request, response);
                break;
            }
            case "ReporteVenta": {
                HttpSession Session = request.getSession(true);
                Usuario objUsuarios = (Usuario) Session.getAttribute("Usuarios");
                VentaAdm objVentaAdm = new VentaAdm();
                ArrayList reporteVenta = null;
                if (objUsuarios.getId_perfil() == 1) {
                    reporteVenta = objVentaAdm.getReporteVenta(0, 1);
                } else if (objUsuarios.getId_perfil() == 2) {
                    reporteVenta = objVentaAdm.getReporteVenta(0, 2);
                } else if (objUsuarios.getId_perfil() == 3) {
                    int coduser = Integer.parseInt(objUsuarios.getCod_user()); //Obtenemos el codigo del usuario
                    reporteVenta = objVentaAdm.getReporteVenta(coduser, 3);
                }
                request.setAttribute("reporteVenta", reporteVenta);
                RequestDispatcher objDispatcher = request.getRequestDispatcher("reporteCompras.jsp");
                objDispatcher.forward(request, response);
                break;
            }
            case "AgregarCarrito": {
                int codprod = Integer.parseInt(request.getParameter("txtcodigo"));
                int cantidad = Integer.parseInt(request.getParameter("nmbcantidad"));
                HttpSession sessioncar = request.getSession(true);
                ArrayList<Articulo> articulos = sessioncar.getAttribute("CarritoAtribute") == null ? new ArrayList<>() : (ArrayList) sessioncar.getAttribute("CarritoAtribute");

                boolean flag = false;
                if (articulos.size() > 0) {
                    for (Articulo a : articulos) {
                        if (codprod == a.getId_producto()) {
                            a.setCantidad(a.getCantidad() + cantidad);
                            flag = true;
                            break;
                        }
                    }
                }
                if (!flag) {
                    articulos.add(new Articulo(codprod, cantidad));
                }
                sessioncar.setAttribute("CarritoAtribute", articulos);
                response.sendRedirect("carrito.jsp");
                break;
            }
            case "ProcesarCompra": {
                //Procesar Compra
                HttpSession Session = request.getSession();
                Usuario objUsuarios = (Usuario) Session.getAttribute("Usuarios");
                HttpSession sessioncar = request.getSession();
                ArrayList<Articulo> articulos = (ArrayList) sessioncar.getAttribute("CarritoAtribute");

                VentaAdm ventaAdm = new VentaAdm();
                Venta objVenta = new Venta();
//                DetalleVenta objDetalleVenta = new DetalleVenta();

                SeguridadAdm objSeguridadAdm = new SeguridadAdm();
                String codventa = String.valueOf(objSeguridadAdm.CodigoAutomatico());
                //Definiendo los valores de objeto Venta y DetalleVenta con los valores de las cajas de texto del formulario.
                objVenta.setCod_venta(codventa);
                objVenta.setCod_cli(objUsuarios.getCod_user());
                ventaAdm.registrarVenta(objVenta);
                for (int i = 0; i < articulos.size(); i++) {
                    DetalleVenta objDetalleVenta = new DetalleVenta();
                    objDetalleVenta.setCod_venta(codventa);
                    objDetalleVenta.setId_producto(articulos.get(i).getId_producto());
                    objDetalleVenta.setCantidad(articulos.get(i).getCantidad());
                    ventaAdm.registrarDetalleVenta(objDetalleVenta);
                }
                int coduser = Integer.parseInt(objUsuarios.getCod_user()); //Obtenemos el codigo del usuario
                VentaAdm objVentaAdm = new VentaAdm();
                ArrayList reporteVenta = objVentaAdm.getReporteVenta(coduser, 3);
                request.setAttribute("reporteVenta", reporteVenta);
                Session.removeAttribute("CarritoAtribute"); //El carrito cierra sesion
                RequestDispatcher dispatcher = request.getRequestDispatcher("reporteCompras.jsp");
                dispatcher.forward(request, response);
                break;
            }
            case "listarClientes": {
                ClienteAdm objClienteAdm = new ClienteAdm();
                ArrayList listaClientes = objClienteAdm.getListaClientes();
                request.setAttribute("listaUsuarios", listaClientes);
                RequestDispatcher objDispatcher = request.getRequestDispatcher("listarClientes.jsp");
                objDispatcher.forward(request, response);
                break;
            }
            case "listarEmpleados": {
                EmpleadoAdm objEmpleadoAdm = new EmpleadoAdm();
                ArrayList listaEmpleados = objEmpleadoAdm.getListaEmpleados();
                request.setAttribute("listaUsuarios", listaEmpleados);
                RequestDispatcher objDispatcher = request.getRequestDispatcher("listarEmpleados.jsp");
                objDispatcher.forward(request, response);
                break;
            }
            case "cambiarEstado": {
                ClienteAdm objUsuarioAdm = new ClienteAdm();
                ArrayList<Usuario> listaUsuarios = objUsuarioAdm.getListaClientes();
                int posicion = Integer.parseInt(request.getParameter("posicion"));
                for (int i = 0; i < listaUsuarios.size(); i++) {
                    if (i == posicion) {
                        if (listaUsuarios.get(i).getEstado() == 1) {
                            objUsuarioAdm.CambiarEstado(listaUsuarios.get(i).getCod_user(), listaUsuarios.get(i).getEstado());
                        } else if (listaUsuarios.get(i).getEstado() == 0) {
                            objUsuarioAdm.CambiarEstado(listaUsuarios.get(i).getCod_user(), listaUsuarios.get(i).getEstado());
                        }
                    }
                }
                listaUsuarios = objUsuarioAdm.getListaClientes();
                request.setAttribute("listaUsuarios", listaUsuarios);
                RequestDispatcher objDispatcher = request.getRequestDispatcher("listarClientes.jsp");
                objDispatcher.forward(request, response);
                break;
            }
            case "eliminarEmpleado": {
                EmpleadoAdm objEmpleadoAdm = new EmpleadoAdm();
                ArrayList<Usuario> listaUsuarios = objEmpleadoAdm.getListaEmpleados();
                int posicion = Integer.parseInt(request.getParameter("posicion"));
                for (int i = 0; i < listaUsuarios.size(); i++) {
                    if (i == posicion) {
                        objEmpleadoAdm.EliminarEmpleado(listaUsuarios.get(i).getCod_user());
                    }
                }
                listaUsuarios = objEmpleadoAdm.getListaEmpleados();
                request.setAttribute("listaUsuarios", listaUsuarios);
                RequestDispatcher objDispatcher = request.getRequestDispatcher("listarEmpleados.jsp");
                objDispatcher.forward(request, response);
                break;
            }
            case "listarProductos": {
                ProductoAdm objProductoAdm = new ProductoAdm();
                ArrayList listaProductos = objProductoAdm.getListaProductos("", "", "");
                request.setAttribute("listaProductos", listaProductos);
                RequestDispatcher objDispatcher = request.getRequestDispatcher("listarProductos.jsp");
                objDispatcher.forward(request, response);
                break;
            }
            case "editarProducto": {
                ProductoAdm objProductoAdm = new ProductoAdm();
                int id = Integer.parseInt(request.getParameter("txtcodigo"));
                String plataforma = request.getParameter("plataformaprod");
                String subplataforma = request.getParameter("subplataformaprod");
                String tipo = request.getParameter("tipopro");
                String nombre = request.getParameter("txtnombre");
                double precio = Double.parseDouble(request.getParameter("txtprecio"));
                String img = request.getParameter("img");
                Productos objProducto = new Productos(id, plataforma, subplataforma, tipo, nombre, precio, img, 30);
                objProductoAdm.editarProducto(objProducto);

                RequestDispatcher objDispatcher = request.getRequestDispatcher("editarProducto.jsp?id=" + id);
                objDispatcher.forward(request, response);
                break;
            }
            case "registrarProducto": {
                try {
                    int idprod = 61;
                    String plataforma = request.getParameter("plataformaprod");
                    String subplataforma = request.getParameter("subplataformaprod");
                    String tipo = request.getParameter("tipopro");
                    String nombre = request.getParameter("txtnomprod");
                    double precio = Double.parseDouble(request.getParameter("nmbpreprod"));

                    Part part = request.getPart("fileimagen");
                    
                    //Condicionamos la carpeta
                    rutaPlataforma(plataforma);
                    
                    if (part == null) {
                        System.out.println("No selecciono imagen o archivo");
                        return;
                    }
                    if (isExtension(part.getSubmittedFileName(), extens)) {
                        String photo = saveFile(part, uploads);
                        Productos p = new Productos(idprod, plataforma, subplataforma, tipo, nombre, precio, part.getSubmittedFileName(), 30);
                        System.out.println(p);
                        ProductoAdm objProductoAdm = new ProductoAdm();
                        objProductoAdm.registrarProducto(p);
                    }
                } catch (Exception e) {

                }
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            }
            case "registrarSolicitud":
            {
                try {
                    SeguridadAdm objSeguridadAdm = new SeguridadAdm();
                    String codsolicitud = String.valueOf(objSeguridadAdm.CodigoAutomatico());
                    String codcli = request.getParameter("txtcodcli");
                    String username = request.getParameter("txtusername");
                    String asunto = request.getParameter("asuntosolicitud");
                    String descripcion = request.getParameter("txtdescripcion");

                    Part part = request.getPart("fileimagen");
                    
                    //Condicionamos la carpeta
                    rutaPlataforma(asunto);
                    
                    if (part == null) {
                        System.out.println("No selecciono imagen o archivo");
                        return;
                    }
                    if (isExtension(part.getSubmittedFileName(), extens)) {
                        String photo = saveFile(part, uploads);
                        
                        Solicitud solicitud = new Solicitud();
                        solicitud.setCod_solicitud(codsolicitud);
                        solicitud.setCod_cli(codcli);
                        solicitud.setUsu_cli(username);
                        solicitud.setAsunto(asunto);
                        solicitud.setDescripcion(descripcion);
                        solicitud.setImagen(part.getSubmittedFileName());
                        solicitud.setRespuesta("-----");
                        
                        System.out.println(solicitud);
                        SolicitudAdm objSolicitudAdm = new SolicitudAdm();
                        objSolicitudAdm.registrarSolicitud(solicitud);
                    }
                } catch (Exception e) {

                }
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            }
            case "listarSolicitudes":
            {
                HttpSession Session = request.getSession(true);
                Usuario objUsuarios = (Usuario) Session.getAttribute("Usuarios");
                SolicitudAdm objSolicitudAdm = new SolicitudAdm();
                ArrayList listaSolicitudes = null;
                if (objUsuarios.getId_perfil() == 1) {
                    listaSolicitudes = objSolicitudAdm.getListaSolicitudes(0, 1);
                } else if (objUsuarios.getId_perfil() == 2) {
                    listaSolicitudes = objSolicitudAdm.getListaSolicitudes(0, 2);
                } else if (objUsuarios.getId_perfil() == 3) {
                    int coduser = Integer.parseInt(objUsuarios.getCod_user()); //Obtenemos el codigo del usuario
                    listaSolicitudes = objSolicitudAdm.getListaSolicitudes(coduser, 3);
                }
                request.setAttribute("listaSolicitudes", listaSolicitudes);
                RequestDispatcher objDispatcher = request.getRequestDispatcher("listarSolicitudes.jsp");
                objDispatcher.forward(request, response);
                break;
            }
            case "editarSolicitud": {
                SolicitudAdm objSolicitudAdm = new SolicitudAdm();
                Solicitud objsolicitud = new Solicitud();
                objsolicitud.setCod_solicitud(request.getParameter("txtcodsolicitud"));
                objsolicitud.setRespuesta(request.getParameter("txtrespuesta"));
                
                objSolicitudAdm.editarSolicitud(objsolicitud);

                RequestDispatcher objDispatcher = request.getRequestDispatcher("gestionarSolicitud.jsp?id=" + objsolicitud.getCod_solicitud());
                objDispatcher.forward(request, response);
                break;
            }
            case "cerrarCaso": {
                SolicitudAdm objSolicitudAdm = new SolicitudAdm();
                Solicitud objsolicitud = new Solicitud();
                objsolicitud.setCod_solicitud(request.getParameter("txtcodsolicitud"));
                
                objSolicitudAdm.editarEstado(objsolicitud);

                RequestDispatcher objDispatcher = request.getRequestDispatcher("gestionarSolicitud.jsp?id=" + objsolicitud.getCod_solicitud());
                objDispatcher.forward(request, response);
                break;
            }
            case "CerrarSesion": {
                HttpSession Session = request.getSession();
                Session.removeAttribute("Usuarios");
                Session.removeAttribute("CarritoAtribute");
                Session.invalidate();
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            }
            default: {
                processRequest(request, response);
            }
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    /*private static java.util.List<com.ws.WsProductos> getListaWSProductos() {
        com.ws.WebServiceProductos_Service service = new com.ws.WebServiceProductos_Service();
        com.ws.WebServiceProductos port = service.getWebServiceProductosPort();
        return port.getListaWSProductos();
    }*/
}

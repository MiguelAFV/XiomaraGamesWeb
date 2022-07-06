
package Control;

import Modelo.Articulo;
import Modelo.Productos;
import Adm.ProductoAdm;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class DeleteItem extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        int idproducto = Integer.parseInt(request.getParameter("idproducto"));
        HttpSession sessioncar = request.getSession(true);
        ArrayList<Articulo> articulos = sessioncar.getAttribute("CarritoAtribute") == null ? null : (ArrayList) sessioncar.getAttribute("CarritoAtribute");
        
        if(articulos != null){
            for(Articulo a : articulos){
                if(a.getId_producto() == idproducto){
                    articulos.remove(a);
                    break;
                }
            }
        }
        
        double total = 0;
        for(Articulo a : articulos){
                Productos p = ProductoAdm.getProducto(a.getId_producto());
                total = total + a.getCantidad()*p.getPrecio();
            }
        
        response.getWriter().print("TOTAL A PAGAR : S/. "+Math.round(total*100.0)/100.0);
        
        
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
        processRequest(request, response);
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

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Opcion;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author PC
 */
public class ServletComboBox extends HttpServlet {

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

        try (PrintWriter out = response.getWriter()) {
            //Opcion del primer combo, seleccionado por el usuario
            String seleccion = request.getParameter("selected");
            if (seleccion == null) {
                seleccion = "";
            }
            ArrayList<Opcion> opciones = new ArrayList();
            if (seleccion.equals("PLAY STATION")) {
                Opcion op1 = new Opcion("PLAY STATION 3", "PLAY STATION 3");
                Opcion op2 = new Opcion("PLAY STATION 4", "PLAY STATION 4");
                opciones.add(op1);
                opciones.add(op2);
            } else if (seleccion.equals("XBOX")) {
                Opcion op1 = new Opcion("XBOX 360", "XBOX 360");
                Opcion op2 = new Opcion("XBOX ONE", "XBOX ONE");
                Opcion op3 = new Opcion("XBOX ONE X", "XBOX ONE X");
                opciones.add(op1);
                opciones.add(op2);
                opciones.add(op3);
            } else if (seleccion.equals("NINTENDO")) {
                Opcion op1 = new Opcion("NINTENDO 3DS", "NINTENDO 3DS");
                Opcion op2 = new Opcion("NINTENDO WII U", "NINTENDO WII U");
                Opcion op3 = new Opcion("NINTENDO SWITCH", "NINTENDO SWITCH");
                opciones.add(op1);
                opciones.add(op2);
                opciones.add(op3);
            } else if (seleccion.equals("PC")) {
                Opcion op1 = new Opcion("PC", "PC");
                opciones.add(op1);
            } else {
                Opcion op1 = new Opcion("0", "No se tiene data para la opcion seleccionada");
                opciones.add(op1);
            }

            JSONObject jsonObject = getJsonFromMyList(opciones);

            out.println(jsonObject);
        }
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

    private JSONObject getJsonFromMyList(ArrayList<Opcion> opciones) {
        JSONObject objetoJSONInicial = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        for (int i = 0; i < opciones.size(); i++) {
            JSONObject jsonObjectItem = new JSONObject();
            jsonObjectItem.put("opcion_valor", opciones.get(i).getValor());
            jsonObjectItem.put("opcion_texto", opciones.get(i).getTexto());
            jsonArray.put(jsonObjectItem);
        }
        objetoJSONInicial.put("opciones", jsonArray);
        return objetoJSONInicial;
    }
}

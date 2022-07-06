package Adm;

import DataBase.Conecta;
import Modelo.Solicitud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SolicitudAdm {
    public int registrarSolicitud(Solicitud s)
    {
        int result = 0;
        Conecta conecta = new Conecta();
        Connection conexion = conecta.getConnection();
        try {
            PreparedStatement ps = 
                conexion.prepareStatement("insert into solicitud values (?,?,?,?,?,?,sysdate,?,sysdate,1)");
                ps.setString(1, s.getCod_solicitud());
                ps.setString(2, s.getCod_cli());
                ps.setString(3, s.getUsu_cli());
                ps.setString(4, s.getAsunto());
                ps.setString(5, s.getDescripcion());
                ps.setString(6, s.getImagen());
                ps.setString(7, s.getRespuesta());
                
                result = ps.executeUpdate();
                
                ps.close();
                ps = null;
                conexion.close();
        } catch (Exception e) {
            System.out.println("No se pudo insertar el registro en la base de datos. Mensaje: "+ e.getMessage());
        }
        return result;
    }
    public ArrayList<Solicitud> getListaSolicitudes(int coduser, int idperfil)
    {
        ArrayList<Solicitud> listaSolicitudes = new ArrayList();
        Conecta objConecta = new Conecta();
        try {
            Connection conexion = objConecta.getConnection();
            Statement st = conexion.createStatement();
            String complemento = "";
            if(idperfil==3)
            {
                complemento = "where cod_cli='" + coduser + "'";
            }
            ResultSet rs = st.executeQuery("select cod_solicitud, cod_cli, usu_cli, asunto, descripcion, imagen, fecha_solicitud, respuesta, fecha_solucion, estado from solicitud "+complemento);
            while (rs.next())
            {
                Solicitud objSolucitud = new Solicitud();
                objSolucitud.setCod_solicitud(rs.getString(1));
                objSolucitud.setCod_cli(rs.getString(2));
                objSolucitud.setUsu_cli(rs.getString(3));
                objSolucitud.setAsunto(rs.getString(4));
                objSolucitud.setDescripcion(rs.getString(5));
                objSolucitud.setImagen(rs.getString(6));
                objSolucitud.setFecha_solicitud(rs.getDate(7));
                objSolucitud.setRespuesta(rs.getString(8));
                objSolucitud.setFecha_solucion(rs.getDate(9));
                objSolucitud.setEstado(rs.getInt(10));
                listaSolicitudes.add(objSolucitud);
            }
            rs.close();
            st.close();
            conexion.close();
        } catch (Exception e){
            System.out.println("No se pudo obtener los registros de usuarios de la base de datos. Mensaje: "+ e.getMessage());
        }
        return listaSolicitudes;
    }
    public static Solicitud getSolicitud(String codigo)
    {
        Solicitud objSolicitud = null;
        Conecta objConecta = new Conecta();
        Connection conn = objConecta.getConnection();
        try
        {
            PreparedStatement ps = conn.prepareStatement("select cod_solicitud, cod_cli, usu_cli, asunto, descripcion, imagen, fecha_solicitud, respuesta, fecha_solucion, estado from solicitud where cod_solicitud=?");
            ps.setString(1,codigo);
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                //objSolicitud = new Solicitud(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getString(8), rs.getDate(9));
                objSolicitud = new Solicitud();
                objSolicitud.setCod_solicitud(rs.getString(1));
                objSolicitud.setCod_cli(rs.getString(2));
                objSolicitud.setUsu_cli(rs.getString(3));
                objSolicitud.setAsunto(rs.getString(4));
                objSolicitud.setDescripcion(rs.getString(5));
                objSolicitud.setImagen(rs.getString(6));
                objSolicitud.setFecha_solicitud(rs.getDate(7));
                objSolicitud.setRespuesta(rs.getString(8));
                objSolicitud.setFecha_solucion(rs.getDate(9));
                objSolicitud.setEstado(rs.getInt(10));
            }
            
        } catch (Exception e){
            System.out.println("No se pudo obtener los registros de productos de la base de datos. Mensaje: "+ e.getMessage());
        }
        return objSolicitud;
    }
    public int editarSolicitud(Solicitud s){
        int result = 0;
        Conecta conecta = new Conecta();
        Connection conn = conecta.getConnection();
        try
        {
            PreparedStatement ps = conn.prepareStatement("update solicitud set respuesta = ?, fecha_solucion = sysdate where cod_solicitud = ?");
            ps.setString(1, s.getRespuesta());
            ps.setString(2, s.getCod_solicitud());

            result = ps.executeUpdate();
            ps.close();
            ps = null;
            conn.close();
        } catch (Exception e) {
            System.out.println("No se pudo insertar el registro en la base de datos. Mensaje: "+ e.getMessage());
        }
        return result;
    }
    public int editarEstado(Solicitud s){
        int result = 0;
        Conecta conecta = new Conecta();
        Connection conn = conecta.getConnection();
        try
        {
            PreparedStatement ps = conn.prepareStatement("update solicitud set estado = 0 where cod_solicitud = ?");
            ps.setString(1, s.getCod_solicitud());

            result = ps.executeUpdate();
            ps.close();
            ps = null;
            conn.close();
        } catch (Exception e) {
            System.out.println("No se pudo insertar el registro en la base de datos. Mensaje: "+ e.getMessage());
        }
        return result;
    }
}

package Adm;

//import DataBase.ConectaMySQL;
import DataBase.Conecta;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpleadoAdm
{
    public ArrayList<Usuario> getListaEmpleados()
    {
        ArrayList<Usuario> listaEmpleados = new ArrayList();
        Conecta objConecta = new Conecta();
        try {
            Connection conexion = objConecta.getConnection();
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select cod_emp, dni, id_perfil, nombres, ap_paterno, ap_materno, fecha_nacimiento, numero, correo, estado, fecha_registro, fecha_update  from empleado where id_perfil=2");
            while (rs.next())
            {
                Usuario objEmpleados = new Usuario();
                objEmpleados.setCod_user(rs.getString(1));
                objEmpleados.setDni(rs.getString(2));
                objEmpleados.setId_perfil(rs.getInt(3));
                objEmpleados.setNombres(rs.getString(4));
                objEmpleados.setAp_paterno(rs.getString(5));
                objEmpleados.setAp_materno(rs.getString(6));
                objEmpleados.setFecha_nacimiento(rs.getDate(7));
                objEmpleados.setNumero(rs.getInt(8));
                objEmpleados.setCorreo(rs.getString(9));
                objEmpleados.setEstado(rs.getInt(10));
                objEmpleados.setFecha_registro(rs.getDate(11));
                objEmpleados.setFecha_update(rs.getDate(12));
                listaEmpleados.add(objEmpleados);
            }
            rs.close();
            st.close();
            conexion.close();
        } catch (Exception e){
            System.out.println("No se pudo obtener los registros de usuarios de la base de datos. Mensaje: "+ e.getMessage());
        }
        return listaEmpleados;
    }
    public int registrarEmpleado(Usuario emp, String codemp)
    {
        int result = 0;
        Conecta conecta = new Conecta();
        Connection conexion = conecta.getConnection();
        try {
            PreparedStatement ps = 
                conexion.prepareStatement("insert into empleado values (?,?,?,?,?,?,?,?,?,?,?,sysdate,sysdate)");
                ps.setString(1, codemp);
                ps.setString(2, emp.getDni());
                ps.setInt(3, emp.getId_perfil());
                ps.setString(4, emp.getNombres());
                ps.setString(5, emp.getAp_paterno());
                ps.setString(6, emp.getAp_materno());
                ps.setDate(7, emp.getFecha_nacimiento());
                ps.setInt(8, emp.getNumero());
                ps.setString(9, emp.getCorreo());
                ps.setString(10, emp.getClave());
                ps.setInt(11, emp.getEstado());
                
                result = ps.executeUpdate();
                
                ps.close();
                ps = null;
                conexion.close();
        } catch (Exception e) {
            System.out.println("No se pudo insertar el registro en la base de datos. Mensaje: "+ e.getMessage());
        }
        return result;
    }
    public int editarEmpleado(Usuario emp, String codemp){
        int result = 0;
        Conecta conecta = new Conecta();
        Connection conn = conecta.getConnection();
        try
        {
            PreparedStatement ps = conn.prepareStatement("UPDATE empleado SET dni=?, nombres=?, ap_paterno=?, ap_materno=?, numero=?, correo=?, clave=?, fecha_update=sysdate where cod_emp=?");
            ps.setString(1, emp.getDni());
            ps.setString(2, emp.getNombres());
            ps.setString(3, emp.getAp_paterno());
            ps.setString(4, emp.getAp_materno());
//            ps.setDate(7, usu.getFecha());
            ps.setInt(5, emp.getNumero());
            ps.setString(6, emp.getCorreo());
            ps.setString(7, emp.getClave());
            ps.setString(8, codemp);

            result = ps.executeUpdate();
            ps.close();
            ps = null;
            conn.close();
        } catch (Exception e) {
            System.out.println("No se pudo insertar el registro en la base de datos. Mensaje: "+ e.getMessage());
        }
        return result;
    }
    public int EliminarEmpleado(String ucod)
    {
        int result = 0;
        Conecta conecta = new Conecta();
        Connection conn = conecta.getConnection();
        try
        {
            PreparedStatement ps = conn.prepareStatement("delete from empleado where cod_emp = ?");
            ps.setString(1,ucod);
            result = ps.executeUpdate();
            ps.close();
            ps = null;
            conn.close();
        }catch(Exception e)
        {
            System.out.println("No se pudo eliminar el empleado: "+ e.getMessage());
        }
        return result;
    }
}
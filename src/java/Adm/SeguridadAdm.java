package Adm;

//import DataBase.ConectaMySQL;
import DataBase.Conecta;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

public class SeguridadAdm
{
    public Usuario validarCliente(String usucli,String clave)
    {
        Usuario objClientes = null;
        Conecta conecta = new Conecta();
        Connection conn = conecta.getConnection();
        try
        {
            PreparedStatement ps = conn.prepareStatement("select cod_cli, usu_cli, dni, id_perfil, nombres, ap_paterno, ap_materno, fecha_nacimiento, numero, correo, estado, fecha_registro, fecha_update from cliente where usu_cli= ? and clave= ?");
            ps.setString(1, usucli);
            ps.setString(2, clave);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                objClientes = new Usuario();
                objClientes.setCod_user(rs.getString(1));
                objClientes.setUsername(rs.getString(2));
                objClientes.setDni(rs.getString(3));
                objClientes.setId_perfil(rs.getInt(4));
                objClientes.setNombres(rs.getString(5));
                objClientes.setAp_materno(rs.getString(6));
                objClientes.setAp_paterno(rs.getString(7));
                objClientes.setFecha_nacimiento(rs.getDate(8));
                objClientes.setNumero(rs.getInt(9));
                objClientes.setCorreo(rs.getString(10));
                objClientes.setEstado(rs.getInt(11));
                objClientes.setFecha_registro(rs.getDate(12));
                objClientes.setFecha_update(rs.getDate(13));
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("No se pudo validar las credenciales en la base de datos.Mensaje: " + e.getMessage() );
        }
        
        return objClientes;
    }
    public Usuario validarEmpleado(String codemp,String clave)
    {
        Usuario objEmpleados = null;
        Conecta conecta = new Conecta();
        Connection conn = conecta.getConnection();
        try
        {
            PreparedStatement ps = conn.prepareStatement("select cod_emp, dni, id_perfil, nombres, ap_paterno, ap_materno, fecha_nacimiento, numero, correo, estado, fecha_registro, fecha_update from empleado where cod_emp = ? and clave = ?");
            ps.setString(1, codemp);
            ps.setString(2, clave);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                objEmpleados = new Usuario();
                objEmpleados.setCod_user(rs.getString(1));
                objEmpleados.setDni(rs.getString(2));
                objEmpleados.setId_perfil(rs.getInt(3));
                objEmpleados.setNombres(rs.getString(4));
                objEmpleados.setAp_materno(rs.getString(5));
                objEmpleados.setAp_paterno(rs.getString(6));
                objEmpleados.setFecha_nacimiento(rs.getDate(7));
                objEmpleados.setNumero(rs.getInt(8));
                objEmpleados.setCorreo(rs.getString(9));
                objEmpleados.setEstado(rs.getInt(10));
                objEmpleados.setFecha_registro(rs.getDate(11));
                objEmpleados.setFecha_update(rs.getDate(12));
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("No se pudo validar las credenciales en la base de datos.Mensaje: " + e.getMessage() );
        }
        return objEmpleados;
    }
    public int CodigoAutomatico()
    {
        Random rnd = new Random();
        int codigo=0;
        for(int i = 1; i<2; i++){
            codigo = rnd.nextInt(999999999-10000000+1)+10;
            System.out.println(codigo);
        }
        return codigo;
    }
}
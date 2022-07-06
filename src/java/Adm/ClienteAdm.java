package Adm;

import DataBase.Conecta;
//import DataBase.ConectaMySQL;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ClienteAdm
{
    public ArrayList<Usuario> getListaClientes()
    {
        ArrayList<Usuario> listaUsuarios = new ArrayList();
        Conecta objConecta = new Conecta();
        try {
            Connection conexion = objConecta.getConnection();
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("select cod_cli,usu_cli, dni, id_perfil, nombres, ap_paterno, ap_materno, fecha_nacimiento, numero, correo, estado, fecha_registro, fecha_update  from cliente where id_perfil=3");
            while (rs.next())
            {
                Usuario objClientes = new Usuario();
                objClientes.setCod_user(rs.getString(1));
                objClientes.setUsername(rs.getString(2));
                objClientes.setDni(rs.getString(3));
                objClientes.setId_perfil(rs.getInt(4));
                objClientes.setNombres(rs.getString(5));
                objClientes.setAp_paterno(rs.getString(6));
                objClientes.setAp_materno(rs.getString(7));
                objClientes.setFecha_nacimiento(rs.getDate(8));
                objClientes.setNumero(rs.getInt(9));
                objClientes.setCorreo(rs.getString(10));
                objClientes.setEstado(rs.getInt(11));
                objClientes.setFecha_registro(rs.getDate(12));
                objClientes.setFecha_update(rs.getDate(13));
                listaUsuarios.add(objClientes);
            }
            rs.close();
            st.close();
            conexion.close();
        } catch (Exception e){
            System.out.println("No se pudo obtener los registros de usuarios de la base de datos. Mensaje: "+ e.getMessage());
        }
        return listaUsuarios;
    }
    public int registrarCliente(Usuario cli, String clicod)
    {
        int result = 0;
        Conecta conecta = new Conecta();
        Connection conexion = conecta.getConnection();
        try {
            PreparedStatement ps = 
                conexion.prepareStatement("insert into cliente values (?,?,?,?,?,?,?,?,?,?,?,?,sysdate,sysdate)");
                ps.setString(1, clicod);
                ps.setString(2, cli.getUsername());
                ps.setString(3, cli.getDni());
                ps.setInt(4, cli.getId_perfil());
                ps.setString(5, cli.getNombres());
                ps.setString(6, cli.getAp_paterno());
                ps.setString(7, cli.getAp_materno());
                ps.setDate(8, cli.getFecha_nacimiento());
                ps.setInt(9, cli.getNumero());
                ps.setString(10, cli.getCorreo());
                ps.setString(11, cli.getClave());
                ps.setInt(12, cli.getEstado());
                
                result = ps.executeUpdate();
                
                ps.close();
                ps = null;
                conexion.close();
        } catch (Exception e) {
            System.out.println("No se pudo insertar el registro en la base de datos. Mensaje: "+ e.getMessage());
        }
        return result;
    }
    public int editarCliente(Usuario cli, String codcli){
        int result = 0;
        Conecta conecta = new Conecta();
        Connection conn = conecta.getConnection();
        try
        {
            PreparedStatement ps = conn.prepareStatement("UPDATE cliente SET usu_cli=? ,dni=?, nombres=?, ap_paterno=?, ap_materno=?, numero=?, correo=?, clave=?, fecha_update=sysdate where cod_cli=?");
            ps.setString(1, cli.getUsername());
            ps.setString(2, cli.getDni());
            ps.setString(3, cli.getNombres());
            ps.setString(4, cli.getAp_paterno());
            ps.setString(5, cli.getAp_materno());
//            ps.setDate(7, usu.getFecha());
            ps.setInt(6, cli.getNumero());
            ps.setString(7, cli.getCorreo());
            ps.setString(8, cli.getClave());
            ps.setString(9, codcli);

            result = ps.executeUpdate();
            ps.close();
            ps = null;
            conn.close();
        } catch (Exception e) {
            System.out.println("No se pudo insertar el registro en la base de datos. Mensaje: "+ e.getMessage());
        }
        return result;
    }
    public int CambiarEstado(String ucod, int uestado)
    {
        int result = 0;
        Conecta conecta = new Conecta();
        Connection conn = conecta.getConnection();
        try
        {
            PreparedStatement ps = conn.prepareStatement("update cliente set estado=? where cod_cli=?");
            if(uestado==1)
            {
                ps.setInt(1, 0);
                ps.setString(2, ucod);
            }else if(uestado==0)
            {
                ps.setInt(1, 1);
                ps.setString(2, ucod);
            }
            result = ps.executeUpdate();
            ps.close();
            ps = null;
            conn.close();
        }catch(Exception e)
        {
            System.out.println("No se pudo actualizar el estado del usuario: "+ e.getMessage());
        }
        return result;
    }
}
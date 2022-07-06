package Adm;

import DataBase.Conecta;
import Modelo.Productos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductoAdm
{
    public static ArrayList<Productos> getListaProductos(String p, String sp, String t)
    {
        ArrayList<Productos> listaProductos = new ArrayList<>();
        Conecta objConecta = new Conecta();
        try
        {
            Connection conn = objConecta.getConnection();
            Statement st = conn.createStatement();
            String consulta = "";
            switch(p)
            {
                case "PLAYSTATION":
                {
                    switch(t)
                    {
                        case "JUEGO":
                        {
                            if("".equals(sp))
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='PLAYSTATION' and tipo='JUEGO'";
                            }else if(sp=="PLAYSTATION 3")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='PLAYSTATION' and sub_plataforma='PLAYSTATION 3' and tipo='JUEGO'";
                            }else if(sp=="PLAYSTATION 4")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='PLAYSTATION' and sub_plataforma='PLAYSTATION 4' and tipo='JUEGO'";
                            }
                            break;
                        }
                        case "CONSOLA":
                        {
                            if(sp=="")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='PLAYSTATION' and tipo='CONSOLA'";
                            }else if(sp=="PLAYSTATION 3")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='PLAYSTATION' and sub_plataforma='PLAYSTATION 3' and tipo='CONSOLA'";
                            }else if(sp=="PLAYSTATION 4")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='PLAYSTATION' and sub_plataforma='PLAYSTATION 4' and tipo='CONSOLA'";
                            }
                            break;
                        }
                        case "ACCESORIO":
                        {
                            if(sp=="")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='PLAYSTATION' and tipo='ACCESORIO'";
                            }else if(sp=="PLAYSTATION 3")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='PLAYSTATION' and sub_plataforma='PLAYSTATION 3' and tipo='ACCESORIO'";
                            }else if(sp=="PLAYSTATION 4")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='PLAYSTATION' and sub_plataforma='PLAYSTATION 4' and tipo='ACCESORIO'";
                            }
                            break;
                        }
                        default:
                        {
                            consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='PLAYSTATION'";
                        }
                    }
                    break;
                }
                case "XBOX":
                {
                    switch(t)
                    {
                        case "JUEGO":
                        {
                            if(sp=="")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='XBOX' and tipo='JUEGO'";
                            }else if(sp=="XBOX 360")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='XBOX' and sub_plataforma='XBOX 360' and tipo='JUEGO'";
                            }else if(sp=="XBOX ONE")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='XBOX' and sub_plataforma='XBOX ONE' and tipo='JUEGO'";
                            }else if(sp=="XBOX ONE X")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='XBOX' and sub_plataforma='XBOX ONE X' and tipo='JUEGO'";
                            }
                            break;
                        }
                        case "CONSOLA":
                        {
                            if(sp=="")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='XBOX' and tipo='CONSOLA'";
                            }else if(sp=="XBOX 360")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='XBOX' and sub_plataforma='XBOX 360' and tipo='CONSOLA'";
                            }else if(sp=="XBOX ONE")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='XBOX' and sub_plataforma='XBOX ONE' and tipo='CONSOLA'";
                            }else if(sp=="XBOX ONE X")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='XBOX' and sub_plataforma='XBOX ONE X' and tipo='CONSOLA'";
                            }
                            break;
                        }
                        case "ACCESORIO":
                        {
                            if(sp=="")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='XBOX' and tipo='ACCESORIO'";
                            }else if(sp=="XBOX 360")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='XBOX' and sub_plataforma='XBOX 360' and tipo='ACCESORIO'";
                            }else if(sp=="XBOX ONE")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='XBOX' and sub_plataforma='XBOX ONE' and tipo='ACCESORIO'";
                            }else if(sp=="XBOX ONE X")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='XBOX' and sub_plataforma='XBOX ONE X' and tipo='ACCESORIO'";
                            }
                            break;
                        }
                        default:
                        {
                            consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='XBOX'";
                        }
                    }
                    break;
                }
                case "NINTENDO":
                {
                    switch(t)
                    {
                        case "JUEGO":
                        {
                            if(sp=="")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='NINTENDO' and tipo='JUEGO'";
                            }else if(sp=="NINTENDO 3DS")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='NINTENDO' and sub_plataforma='NINTENDO 3DS' and tipo='JUEGO'";
                            }else if(sp=="NINTENDO WII U")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='NINTENDO' and sub_plataforma='NINTENDO WII U' and tipo='JUEGO'";
                            }else if(sp=="NINTENDO SWITCH")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='NINTENDO' and sub_plataforma='NINTENDO SWITCH' and tipo='JUEGO'";
                            }
                            break;
                        }
                        case "CONSOLA":
                        {
                            if(sp=="")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='NINTENDO' and tipo='CONSOLA'";
                            }else if(sp=="NINTENDO 3DS")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='NINTENDO' and sub_plataforma='NINTENDO 3DS' and tipo='CONSOLA'";
                            }else if(sp=="NINTENDO WII U")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='NINTENDO' and sub_plataforma='NINTENDO WII U' and tipo='CONSOLA'";
                            }else if(sp=="NINTENDO SWITCH")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='NINTENDO' and sub_plataforma='NINTENDO SWITCH' and tipo='CONSOLA'";
                            }
                            break;
                        }
                        case "ACCESORIO":
                        {
                            if(sp=="")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='NINTENDO' and tipo='ACCESORIO'";
                            }else if(sp=="NINTENDO 3DS")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='NINTENDO' and sub_plataforma='NINTENDO 3DS' and tipo='ACCESORIO'";
                            }else if(sp=="NINTENDO WII U")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='NINTENDO' and sub_plataforma='NINTENDO WII U' and tipo='ACCESORIO'";
                            }else if(sp=="NINTENDO SWITCH")
                            {
                                consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='NINTENDO' and sub_plataforma='NINTENDO SWITCH' and tipo='ACCESORIO'";
                            }
                            break;
                        }
                        default:
                        {
                            consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='NINTENDO'";
                        }
                    }
                    break;
                }
                case "PC":
                {
                    switch(t)
                    {
                        case "JUEGO":
                        {
                            consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='PC' and tipo='JUEGO'";
                            break;
                        }
                        case "ACCESORIO":
                        {
                            consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='PC' and tipo='ACCESORIO'";
                            break;
                        }
                        default:
                        {
                            consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where plataforma='PC'";
                        }
                    }
                    break;
                }
                default:
                {
                    consulta = "select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos order by id_producto";
                    break;
                }
            }
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next())
            {
                Productos objProductos = new Productos(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDouble(6), rs.getString(7),3);
                listaProductos.add(objProductos);
            }
            rs.close();
            st.close();
            conn.close();
        }catch(Exception e)
        {
            System.out.println("No se pudo obtener los registros de productos de la base de datos. Mensaje: "+ e.getMessage());
        }
        return listaProductos;
    }
    public static Productos getProducto(int codigo)
    {
        Productos objProductos = null;
        Conecta objConecta = new Conecta();
        Connection conn = objConecta.getConnection();
        try
        {
            PreparedStatement ps = conn.prepareStatement("select id_producto, plataforma, sub_plataforma, tipo, nombre, precio, imagen from productos where id_producto=?");
            ps.setInt(1,codigo);
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                objProductos = new Productos(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDouble(6), rs.getString(7), 30);
            }
            
        } catch (Exception e){
            System.out.println("No se pudo obtener los registros de productos de la base de datos. Mensaje: "+ e.getMessage());
        }
        return objProductos;
    }
    public int editarProducto(Productos p){
        int result = 0;
        Conecta conecta = new Conecta();
        Connection conn = conecta.getConnection();
        try
        {
            PreparedStatement ps = conn.prepareStatement("update productos set plataforma=?,sub_plataforma=?,tipo=?,nombre=?,precio=?,imagen=? where id_producto=?");
            ps.setString(1, p.getPlataforma());
            ps.setString(2, p.getSub_plataforma());
            ps.setString(3, p.getTipo());
            ps.setString(4, p.getNombre());
            ps.setDouble(5, p.getPrecio());
            ps.setString(6, p.getImagen());
            ps.setInt(7, p.getId_producto());
            result = ps.executeUpdate();
            ps.close();
            ps = null;
            conn.close();
        } catch (Exception e) {
            System.out.println("No se pudo insertar el registro en la base de datos. Mensaje: "+ e.getMessage());
        }
        return result;
    }
    public int registrarProducto(Productos p){
        int result = 0;
        Conecta conecta = new Conecta();
        Connection conn = conecta.getConnection();
        try 
        {
            PreparedStatement ps = conn.prepareStatement("insert into productos values(?,?,?,?,?,?,?,?)");
            ps.setInt(1, p.getId_producto());
            ps.setString(2, p.getPlataforma());
            ps.setString(3, p.getSub_plataforma());
            ps.setString(4, p.getTipo());
            ps.setString(5, p.getNombre());
            ps.setDouble(6, p.getPrecio());
            ps.setString(7, p.getImagen());
            ps.setInt(8, p.getStock());
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
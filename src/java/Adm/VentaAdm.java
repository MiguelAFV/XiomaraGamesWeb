package Adm;

import DataBase.Conecta;
import Modelo.DetalleVenta;
import Modelo.ReporteVenta;
import Modelo.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class VentaAdm {

    public ArrayList<ReporteVenta> getReporteVenta(int coduser, int idperfil)
    {
        ArrayList<ReporteVenta> reporteVenta = new ArrayList();
        Conecta objConecta = new Conecta();
        try {
            Connection conn = objConecta.getConnection();
            Statement st = conn.createStatement();
            String complemento = "";
            if(idperfil==3)
            {
                complemento = "where cliente.cod_cli='" + coduser + "'\n";
            }
            ResultSet rs = st.executeQuery("select venta.cod_venta,fecha_venta,\n"
                    + "cliente.cod_cli,usu_cli,\n"
                    + "productos.id_producto,plataforma,nombre,precio,imagen,cantidad from detalleventa\n"
                    + "inner join venta on detalleventa.cod_venta=venta.cod_venta\n"
                    + "inner join cliente on venta.cod_cli=cliente.cod_cli\n"
                    + "inner join productos on detalleventa.id_producto=productos.id_producto\n"
                    + complemento + "order by fecha_venta desc");
            while (rs.next()) {
                ReporteVenta objReporteVenta = new ReporteVenta();
                objReporteVenta.setCod_venta(rs.getString(1));
                objReporteVenta.setFecha_venta(rs.getDate(2));
                objReporteVenta.setCoduser(rs.getString(3));
                objReporteVenta.setUsername(rs.getString(4));
                objReporteVenta.setId_producto(rs.getInt(5));
                objReporteVenta.setPlataforma(rs.getString(6));
                objReporteVenta.setNombre_producto(rs.getString(7));
                objReporteVenta.setPrecio(rs.getDouble(8));
                objReporteVenta.setImagen(rs.getString(9));
                objReporteVenta.setCantidad(rs.getInt(10));
                reporteVenta.add(objReporteVenta);
            }
            rs.close();
            st.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("No se pudo obtener el reporte de ventas de la base de datos. Mensaje: " + e.getMessage());
        }
        return reporteVenta;
    }

    public int registrarVenta(Venta objVenta) {
        int result = 0;
        Conecta conecta = new Conecta();
        Connection conn = conecta.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO venta VALUES(?,?,sysdate)");
            ps.setString(1, objVenta.getCod_venta());
            ps.setString(2, objVenta.getCod_cli());
            result = ps.executeUpdate();
            ps.close();
            ps = null;
            conn.close();
        } catch (Exception e) {
            System.out.println("No se pudo procesar la compra en la base de datos. Mensaje: " + e.getMessage());
        }
        return result;
    }

    public int registrarDetalleVenta(DetalleVenta objDetalleVenta) {
        int result = 0;
        Conecta conecta = new Conecta();
        Connection conn = conecta.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("insert into detalleventa values(?,?,?)");
            ps.setString(1, objDetalleVenta.getCod_venta());
            ps.setInt(2, objDetalleVenta.getId_producto());
            ps.setInt(3, objDetalleVenta.getCantidad());
            result = ps.executeUpdate();
            ps.close();
            ps = null;
            conn.close();
        } catch (Exception e) {
            System.out.println("No se pudo procesar la compra en la base de datos. Mensaje: " + e.getMessage());
        }
        return result;
    }
}
package Modelo;

public class DetalleVenta
{
    String cod_venta;
    int id_producto;
    int cantidad;

    public String getCod_venta() {
        return cod_venta;
    }

    public void setCod_venta(String cod_venta) {
        this.cod_venta = cod_venta;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
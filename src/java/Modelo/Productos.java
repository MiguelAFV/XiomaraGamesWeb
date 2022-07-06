package Modelo;

public class Productos
{
    int id_producto;
    String plataforma;
    String sub_plataforma;
    String tipo;
    String nombre;
    double precio;
    String imagen;
    int stock;

    public Productos(int id_producto, String plataforma, String sub_plataforma, String tipo, String nombre, double precio, String imagen, int stock) {
        this.id_producto = id_producto;
        this.plataforma = plataforma;
        this.sub_plataforma = sub_plataforma;
        this.tipo = tipo;
        this.nombre = nombre;
        this.precio = precio;
        this.imagen = imagen;
        this.stock = stock;
    }
    
    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getSub_plataforma() {
        return sub_plataforma;
    }

    public void setSub_plataforma(String sub_plataforma) {
        this.sub_plataforma = sub_plataforma;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
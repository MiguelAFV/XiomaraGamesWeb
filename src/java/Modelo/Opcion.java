package Modelo;

public class Opcion
{
    String valor;
    String texto;
    public Opcion(String valor, String texto) {
        this.valor = valor;
        this.texto = texto;
    }
    public String getValor() {
        return valor;
    }
    public String getTexto() {
        return texto;
    }
}
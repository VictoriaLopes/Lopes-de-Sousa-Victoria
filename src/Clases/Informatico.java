package Clases;

public class Informatico extends Mueble{
    private String nombreFabricante;

    public Informatico() {
    }

    public Informatico(Integer stok, String nombre, Double precio, String nombreFabricante) {
        super(stok, nombre, precio);
        this.nombreFabricante = nombreFabricante;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }


}

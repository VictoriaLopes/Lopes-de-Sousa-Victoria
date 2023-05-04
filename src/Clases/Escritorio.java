package Clases;

import Interfaz.Descuento;

public class Escritorio extends Mueble {
    private Double alto;
    private Double largo;

    public Escritorio() {
    }

    public Escritorio(Integer stok, String nombre, Double precio, Double alto, Double largo) {
        super(stok, nombre, precio);
        this.alto = alto;
        this.largo = largo;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return " Escritorio { " + " Nombre -" + super.getNombre() + " Stok -" + super.getStok() + " Precio -" + super.getPrecio() +
        " Alto -" + alto + " Largo " + largo + '}';
    }
}

package Clases;

import Interfaz.Descuento;

public class Impresora extends Informatico implements Descuento {
    private Integer cantidadImpreciones;

    public Impresora() {
    }

    public Impresora(Integer stok, String nombre, Double precio, String nombreFabricante, Integer cantidadImpreciones) {
        super(stok, nombre, precio, nombreFabricante);
        this.cantidadImpreciones = cantidadImpreciones;
    }

    public Integer getCantidadImpreciones() {
        return cantidadImpreciones;
    }

    public void setCantidadImpreciones(Integer cantidadImpreciones) {
        this.cantidadImpreciones = cantidadImpreciones;
    }

    @Override
    public String toString() {
        return "Impresora{" + " Nombre - " + super.getNombre() + " Stok - " + super.getStok() + " Precio - " + super.getPrecio() +
                " Cantidad de Impreciones =" + cantidadImpreciones +
                '}';
    }

    public Integer descuento(Integer descuento) {
        return (int) (this.getPrecio()-(this.getPrecio()*(descuento/100)));
    }
}

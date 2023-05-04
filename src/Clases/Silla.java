package Clases;

import Interfaz.Descuento;

public class Silla extends Mueble implements Descuento {
    private boolean rueda;

    public Silla() {
    }

    public Silla(Integer stok, String nombre, Double precio, boolean rueda) {
        super(stok, nombre, precio);
        this.rueda = rueda;
    }

    public boolean getRuedas() {
        if(rueda){
            return rueda;
        }
        return false;
    }

    public void setRuedas(Boolean ruedas) {
        this.rueda = ruedas;
    }

    @Override
    public String toString() {
        return "Silla{" + " Nombre - " + super.getNombre() + " Stok - " + super.getStok() + " Precio - " + super.getPrecio() +
                " Tiene ruedas " + rueda +
                '}';
    }

    @Override
    public Integer descuento(Integer descuento) {
        return (int) (this.getPrecio()-(this.getPrecio()*(descuento/100)));
    }
}

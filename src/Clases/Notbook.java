package Clases;

public class Notbook extends Informatico{
    private Integer cantidadMemoria;

    public Notbook() {
    }

    public Notbook(Integer stok, String nombre, Double precio, String nombreFabricante, Integer cantidadMemoria) {
        super(stok, nombre, precio, nombreFabricante);
        this.cantidadMemoria = cantidadMemoria;
    }

    public Integer getCantidadMemoria() {
        return cantidadMemoria;
    }

    public void setCantidadMemoria(Integer cantidadMemoria) {
        this.cantidadMemoria = cantidadMemoria;
    }

    @Override
    public String toString() {
        return "Notbook{" + " Nombre - " + super.getNombre() + " Stok - " + super.getStok() + " Precio - " + super.getPrecio() +
                " Cantidad de Memoria " + cantidadMemoria +
                '}';
    }
}

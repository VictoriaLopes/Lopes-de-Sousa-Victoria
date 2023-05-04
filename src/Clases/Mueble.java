package Clases;

public abstract class Mueble {
    private Integer stok; //no llege a que baje el stok cuando compran un producto
    private String nombre;
    private Double precio;

    public Mueble() {
    }

    public Mueble(Integer stok, String nombre, Double precio) {
        this.stok = stok;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}

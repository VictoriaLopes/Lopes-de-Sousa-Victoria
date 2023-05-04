package Clases;

public class Cliente {
    private String nombre;
    private Boolean premium;

    public Cliente() {
    }

    public Cliente(String nombre, Boolean premium) {
        this.nombre = nombre;
        this.premium = premium;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getPremium() {
        return premium;
    }

    public void setPremium(Boolean premium) {
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", premium=" + premium +
                '}';
    }
}

package Clases;

public class Compra {
    private Mueble mueble;
    private Cliente cliente;

    public Compra(Mueble mueble, Cliente cliente) {
        this.mueble = mueble;
        this.cliente = cliente;
    }

    public Mueble getMueble() {
        return mueble;
    }

    public void setMueble(Mueble mueble) {
        this.mueble = mueble;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "mueble=" + mueble +
                ", cliente=" + cliente +
                '}';
    }
}

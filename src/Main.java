import Clases.*;
import Contenedora.Empresa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();
        List<Cliente> clienteList = new ArrayList<>();

        //region Muebles
        Silla silla1 = new Silla(200, "Pawer", 70000.0, true);
        Silla silla2 = new Silla(150, "Ofi", 30000.2, false);
        Impresora imp1 = new Impresora(50, "Impresorita", 150000.0, "HP", 45);
        Impresora imp2 = new Impresora(40, "Impresorita2", 50000.0, "Intel", 85);
        Escritorio es1 = new Escritorio(30, "es", 30000.0, 20.4, 30.5);
        Escritorio es2 = new Escritorio(70, "esji", 50000.0, 20.4, 30.5);
        Notbook n1 = new Notbook(57, "Compu", 452000.2, "Acer", 300);
        Notbook n2 = new Notbook(7, "Compu2", 452000.2, "Lenova", 1000);
        //endregion

        empresa.addMueble(silla1);
        empresa.addMueble(silla2);
        empresa.addMueble(imp1);
        empresa.addMueble(imp2);
        empresa.addMueble(es1);
        empresa.addMueble(es2);
        empresa.addMueble(n1);
        empresa.addMueble(n2);

        empresa.listaMuebles();

        Cliente cliente = new Cliente();
        Cliente c1 = new Cliente("Rodrigo ", true);
        Cliente c2 = new Cliente("Florencia", true);
        Cliente c3 = new Cliente("Martin", true);
        Cliente c4 = new Cliente("Lucas", true);

        empresa.addClientes(c1);
        empresa.addClientes(c2);
        empresa.addClientes(c3);
        empresa.addClientes(c4);

        empresa.comprarMueble(n1, c2);
        empresa.comprarMueble(silla1, c3);
        empresa.comprarMueble(imp2, c1);
        empresa.comprarMueble(es1, c4);

        //va a mostrar null porque no llege a arreglar el metodo que realiza la compra
        empresa.listaCompras();




    }
}
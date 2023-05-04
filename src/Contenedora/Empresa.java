package Contenedora;

import Clases.*;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Mueble> muebles;
    private ArrayList<Cliente> clientes;
    private ArrayList<Compra> compras;


    public Empresa() {
        this.muebles = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void addClientes(Cliente cl) {
        clientes.add(cl);
    }

    public void addMueble(Mueble mueble){
        muebles.add(mueble);
    }

    public void listaMuebles(){
        System.out.println(muebles);
    }
    public void listaCompras(){
        System.out.println(compras);
    }

    public Compra comprarMueble(Mueble mueble, Cliente cliente) {
        Mueble mb = buscaMueble(mueble);
//        if (mb != null) { //si existe entonces
//            if (mueble instanceof Silla ) { //aplico el descuento
//                Compra compra = new Compra( ((Silla) mueble).descuento(50), cliente); //no se como arreglarlo
//                compras.add(compra);
//                return compra;
//            } else if (mueble instanceof Impresora) {
//                Compra compra = new Compra( ((Impresora) mueble).descuento(30), cliente);
//                compras.add(compra);
//                return compra;
//            }else{
////                compras.add(compra);
////                return compra;
//            }
//        }
        return null;
    }

    public Mueble buscaMueble(Mueble mueble){
        for (Mueble mb : muebles){
            if (mb.equals(mueble)){
                return mb;
            }
        }
        return null;
    }




}

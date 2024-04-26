package modelo;

import java.util.ArrayList;
import java.util.List;

public class Tarjeta {
    private double limite;
    private double saldo;
    private List<Compra> listaDeCompras;

    // constructor
    public Tarjeta(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>();
    }

    // metodo

    public boolean lazarCompra(Compra compra){
        if(this.saldo >= compra.getValorDelArticulo()){
            this.saldo -= compra.getValorDelArticulo();
            this.listaDeCompras.add(compra);
            return true;
        }
        return false;
    }

    //getters & setters
    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }

    public double getLimite() {
        return limite;
    }
}

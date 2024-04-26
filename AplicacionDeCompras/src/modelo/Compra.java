package modelo;

public class Compra implements Comparable<Compra> {

    private String articuloDecompra;
    private double valorDelArticulo;

    //constructor
    public Compra(String articuloDecompra, double valorDelArticulo) {
        this.articuloDecompra = articuloDecompra;
        this.valorDelArticulo = valorDelArticulo;
    }

    // getters
    public String getArticuloDecompra() {
        return articuloDecompra;
    }

    public double getValorDelArticulo() {
        return valorDelArticulo;
    }

    @Override
    public String toString() {
        return "Compra articulo De compra= " + articuloDecompra +
                ", valor Del Articulo= " + valorDelArticulo;
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.valorDelArticulo).compareTo(Double.valueOf(otraCompra.getValorDelArticulo()));
    }
}

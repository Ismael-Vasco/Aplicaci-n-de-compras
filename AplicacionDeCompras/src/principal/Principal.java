package principal;

import modelo.Compra;
import modelo.Tarjeta;

import java.util.Collections;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba su saldo inicial: ");
        double limite = teclado.nextDouble();

        // Saldo de tarjeta
        Tarjeta tarjeta = new Tarjeta(limite);
        System.out.println(limite);

        int salir = 1;

        while(salir != 0) {
            // descripción de compra
            System.out.println("Escriba el articulo que desea adquirir: ");
            String nombreArticulo = teclado.next();

            // valor del articulo
            System.out.println("Escriba el valor articulo: " + nombreArticulo);
            double valorArticulo = Double.valueOf(teclado.next());

            // valores del objeto Compra
            Compra compra = new Compra(nombreArticulo, valorArticulo);
            boolean compraRealizada = tarjeta.lazarCompra(compra);

            //condición
            if (compraRealizada) {
                System.out.println("Compra Realizada!!\n");
                System.out.println("""
                        Escriba:
                        0 - para salir
                        1 - para continuar comprando
                        """);
                salir = teclado.nextInt();
            } else {
                System.out.println("Saldo insuficiente");
                salir = 0;
            }
        }

        System.out.println("*****************************************************************");
        System.out.println("COMPRAS REALIZADAS EN TIENDA");
        Collections.sort(tarjeta.getListaDeCompras());

        for (Compra compra : tarjeta.getListaDeCompras()){
            System.out.println(compra.getArticuloDecompra() + " - " + compra.getValorDelArticulo());
        }

        System.out.println("\n*****************************************************************");
        System.out.println("\nSALDO DE LA TARJETA: " + tarjeta.getSaldo());


//        var nombre = new Compra(nombreArticulo, valorArticulo);
//
//        System.out.println("Compra realizada!");
//
//        System.out.println(nombreArticulo + valorArticulo);




    }
}

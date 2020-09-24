package Practico5;

import java.util.Scanner;

public class GestionarProductos {

    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        Producto p1 = new Producto();

        //Producto p3 = new Producto();
        System.out.println("Ingrese nombre del producto 1: ");
        String unNombre = input.next();
        System.out.println("Ingrese codigo del producto 1: ");
        int unCodigo = input.nextInt();
        System.out.println("Ingrese nro Lote producto 1: ");
        String unNroLote = input.next();
        System.out.println("Ingrese nro de Producto :");
        int unNro = input.nextInt();
        Producto p3 = new Producto(unNombre, unCodigo , unNroLote, unNro);
        p3.setImportado(true);
        System.out.println(p3);


        System.out.println(p1);



        //System.out.println(p2);
        //System.out.println(p3);








    }
}

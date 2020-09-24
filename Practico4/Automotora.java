package Practico5;

import javax.sound.midi.Soundbank;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Automotora {

    public static void main (String args[]){



        Scanner input = new Scanner(System.in);

        Camion camion0 = new Camion();
        Camion camion1 = new Camion();
        Camion camion2 = new Camion();
        System.out.println(camion0);
        System.out.println(camion1);
        System.out.println(camion2);

        System.out.println("Ingrese el color del Camion");
        String colorDelCamion = input.next();

        System.out.println("Ingrese la chapa del Camion");
        int chapaDelCamion = input.nextInt();

        Camion c1 = new Camion();
        //System.out.println("Datos del camion C1" + c1);



        System.out.println("Actualizando datos......");
        c1.setChapa(chapaDelCamion);
        c1.setColor(colorDelCamion);
        c1.setAño(2010);

        if (c1.leTocaRevision() == true) {
            System.out.println("Al camion le toca revision");
        } else {
            System.out.println("No le toca revision");
        }

        System.out.println(c1);
        System.out.println("el color del c1 es " + c1.getColor());
        System.out.println("el color del camion 2 es " + camion2.getColor());

        if(c1.tieneMismoColor(camion2) == true){
            System.out.println("Los camiones c1 y camion 2 tienen el mismo color");
        }else {
            System.out.println("No tienen el mismo Color");
        }






        System.out.println("Ingrese el color del Camion 2");
        String colorCamion2 = input.next();
        System.out.println("Ingrese la chapa del Camion 2");
        int chapaCamion2 = input.nextInt();

      //  Camion camion2 = new Camion(chapaCamion2, colorCamion2);
        System.out.println("*****Datos camion 2*****");
        System.out.println(camion2);








        /* Camion c2 = new Camion(1233);
        System.out.println("Datos del camion C2");
        System.out.println("La chapa es " + c2.getChapa());
        System.out.println("El color es " + c2.getColor());

        Camion c3 = new Camion(777, "Violeta");
        System.out.println("Datos del camion C3");
        System.out.println("La chapa es " + c3.getChapa());
        System.out.println("El color es " + c3.getColor());

        System.out.println(c2);*/
    }



}

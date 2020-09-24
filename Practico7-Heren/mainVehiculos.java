package Practico7;

public class mainVehiculos {

    public static void main(String args[]) {


        Vehiculo a1 = new Auto();
        System.out.println(a1);

        Vehiculo a2 = new Auto(4, "verde", 160, "1000");
        System.out.println(a2);

        Vehiculo m1 = new Motocicleta();
        System.out.println(m1);

        Vehiculo m2 = new Motocicleta(3, "roja", 220, "Seiscientos");
        System.out.println(m2);

        Vehiculo s1 = new Semiremolque();
        System.out.println(s1);

        Vehiculo s2 = new Semiremolque(8, "blanco", 5);
        System.out.println(s2);
    }

}

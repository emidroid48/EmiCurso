package Practico7;

public class Motocicleta extends Vehiculo {

    private int velocidad;
    private String cilindrada;

    public Motocicleta() {
        this.velocidad = 110;
        this.cilindrada = "trescientos";
    }

    public Motocicleta(int unasRuedas, String unColor, int unaVelocidad, String unaCilindrada) {
        super(unasRuedas, unColor);
        this.velocidad = unaVelocidad;
        this.cilindrada = unaCilindrada;

    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String toString(){
        return super.toString() + " Velocidad: " + this.getVelocidad()
                + " Cilindrada: " + this.getCilindrada() + " cc";
    }
}

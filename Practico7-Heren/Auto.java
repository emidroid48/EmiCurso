package Practico7;

public class Auto extends Vehiculo {


    private int velocidadMaxima;
    private String cilindrada;

    public Auto() {
        this.velocidadMaxima = 130;
        this.cilindrada = "quinientos";
    }


    public Auto(int unasRuedas, String unColor, int veloMaxima, String unaCilindrada) {
        super(unasRuedas,unColor);
        this.velocidadMaxima = veloMaxima;
        this.cilindrada = unaCilindrada;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String toString() {
        return super.toString() + " La velocidad maxima es: " + this.getVelocidadMaxima()
                + " Su cilindrada es: " + this.getCilindrada() + " cc";

    }
}

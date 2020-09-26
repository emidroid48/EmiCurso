package Practico7;

public class Vehiculo {


    protected int ruedas;
    protected String color;

    public Vehiculo() {

        this.ruedas = 2;
        this.color = "negro";
    }

    public Vehiculo(int unasRuedas, String unColor) {
        this.ruedas = unasRuedas;
        this.color = unColor;
    }

    public int getRuedas() {
        return ruedas;
    }

    public String getColor() {
        return color;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "El vehiculo tiene: " + this.getRuedas() + " ruedas."
                + " su color es: " + this.getColor();
    }
}

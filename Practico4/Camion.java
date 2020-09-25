package Practico5;

public class Camion {
    //atributos
    private int chapa;
    private String color;
    private int año;
    private static int CONTADOR_CAMIONES = 1000;
    private int identificadorCamion;




    //contructores
    //constructor sin parametros..
    public Camion(){
        this.chapa = 100000;
        this.color = "Negro";
        this.año = 2020;
        CONTADOR_CAMIONES++;
        this.identificadorCamion = CONTADOR_CAMIONES;
    }

    public Camion(int unaChapa){
        if (unaChapa < 1000){
            this.chapa = 0;
        } else {
            this.chapa = unaChapa;
        }
        CONTADOR_CAMIONES++;
        this.identificadorCamion = CONTADOR_CAMIONES;
        this.año = 2020;
        this.color = "Rojo";
    }
    public Camion(String unColor){

        this.año = 2020;
        this.chapa = 1000;
        this.color = unColor;
        CONTADOR_CAMIONES++;
        this.identificadorCamion = CONTADOR_CAMIONES;
    }

    public Camion(int unaChapa, String unColor) {
        if (unaChapa < 1000){
            this.chapa = 0;
        } else {
            this.chapa = unaChapa;
        }
        this.año = 2020;
        this.color = unColor;
        CONTADOR_CAMIONES++;
        this.identificadorCamion = CONTADOR_CAMIONES;
    }

    //metodos...
    public void setChapa(int unaChapa) {
        this.chapa = unaChapa;
    }
    public int getChapa() {
        return this.chapa;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    public int getAño() {
        return this.año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    public boolean leTocaRevision(){
        if(this.getAño() < 2015) {
            return true;
        } else {
            return false;
        }

    }
    public boolean tieneMismoColor(Camion unCamion){
    return this.getColor().equals(unCamion.getColor());
    }

    public String toString(){
        String retorno = "El camion "+ this.identificadorCamion +" es de color " + this.getColor() + " y su chapa es " + this.getChapa()
                + " el año del camion es " + this.getAño();

        if(this.leTocaRevision() == true){
            retorno += " y Le toca revision ";
            }else {
            retorno += " y no le toca revision";
        }
        return retorno;
    }
}

package Practico7;

public class Semiremolque extends Vehiculo{

    private int cantidadEjes;

    public Semiremolque(){
        this.cantidadEjes = 4;
    }
    public Semiremolque(int unasRuedas, String unColor , int cantEjes){
        super(unasRuedas,unColor);
        this.cantidadEjes = cantEjes;
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }
    public String toString(){
        return super.toString() + " cantidad de ejes: " + this.getCantidadEjes();
    }
}

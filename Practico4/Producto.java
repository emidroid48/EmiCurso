package Practico5;

public class Producto {



    private String nombre;
    private int codigo;
    private boolean importado;
    private String nroLote;
    private int nroProducto;

    private static int CONTADORPRODUCTO = 1;
    private int identificadorProducto;

    public Producto(){
        this.nombre = "Desconocido";
        this.codigo = 0;
        this.importado = false;
        this.nroLote = "Desconocido";
        this.nroProducto = 0;
        CONTADORPRODUCTO++;
        this.identificadorProducto = CONTADORPRODUCTO;

    }


    public Producto(String unNombre){
        this.nombre= unNombre;
        this.codigo = 0;
        this.importado = false;
        this.nroLote = "Desconocido";
        this.nroProducto = 0;
        CONTADORPRODUCTO++;
        this.identificadorProducto = CONTADORPRODUCTO;

    }

    public Producto(int unCodigo){
        this.nombre= "Desconocido";
        this.codigo = unCodigo;
        this.importado = false;
        this.nroLote = "Desconocido";
        this.nroProducto = 0;
        CONTADORPRODUCTO++;
        this.identificadorProducto = CONTADORPRODUCTO;
    }

    public Producto(String unNombre, int unCodigo){
        this.nombre = unNombre;
        this.codigo = unCodigo;
        this.importado = false;
        this.nroLote = "Desconocido";
        this.nroProducto = 0;
        CONTADORPRODUCTO++;
        this.identificadorProducto = CONTADORPRODUCTO;
    }
    public Producto(String unNombre , int unCodigo , String unnroLote , int unNroProducto ) {
        this.nombre = unNombre;
        this.codigo = unCodigo;
        this.nroLote = unnroLote;
        this.nroProducto = unNroProducto;
        this.importado = false;
        CONTADORPRODUCTO++;
        this.identificadorProducto = CONTADORPRODUCTO;

    }

    public String getNombre() {
        return this.nombre;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public boolean isImportado() {
        return this.importado;
    }

    public String getNroLote() {
        return this.nroLote;
    }

    public int getNroProducto() {
        return this.nroProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setImportado(boolean importado) {
        this.importado = importado;
    }

    public void setNroLote(String nroLote) {
        this.nroLote = nroLote;
    }

    public void setNroProducto(int nroProducto) {
        this.nroProducto = nroProducto;
    }

    public String toString(){
        String retorno = "";
        retorno = "producto nro " + identificadorProducto +" Nombre: " + this.getNombre() + " Codigo " + this.getCodigo() + " Numero de Lote " + this.getNroLote()
                + " Numero de Producto " + this.getNroProducto();


        if(this.importado == false){
            retorno += " Es Nacional";
        } else{
           retorno += (" Es Importado");
        }


        return retorno;
    }
}

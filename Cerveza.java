public class Cerveza extends Bebida{
    private String tipo_cerveza = '';
    private Recipiente recipiente;

    // CONSTRUCTOR

    public Cerveza(String tc){
        setTipoCerveza(tc);
    }

    // SETTERS

    public void setTipoCerveza(tipo){
        this.tipo_cerveza = tipo_cerveza;
    }

    // GETTERS

    public getTipoCerveza(){
        this.tipo_cerveza;
    }
}
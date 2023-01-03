public class Gaseosa extends Bebida{
    private String sabor_gaseosa = '';
    private Recipiente recipiente;

    // CONSTRUCTOR

    public Gaseosa(String m,String tb,double pc, double pv,String sag, int stg){
        setMarca(m);
        setTipoBebida(tb);
        setPrecioCompra(pc);
        setPrecioVenta(pv);
        setSaborGaseosa(sag);
        setStock(stg);
    }

    // SETTERS

    public void setSabor(String s){
        this.sabor_gaseosa = s;
    }

    // GETTERS

    public getSaborGaseosa(){
        return this.sabor_gaseosa;
    }
}
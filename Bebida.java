public class Bebida {
    // ATRIBUTOS
    private String marca = '';
    private String tipo_bebida = '';
    private Recipiente recipiente;
    private double precio_compra;
    private double precio_venta;
    private int stock;

    // CONSTRUCTORES

    public Bebida(String m, String tp, double pc, double pv, int s){
        setMarca(m);
        setTipoBebida(tp);
        setPrecioCompra(pc);
        setPrecioVenta(pv);
        setStock(s)
    }

    // SETTER

    public void setMarca(String m){
        this.marca = m;
    }

    public void setTipoBebida(String tp){
        this.tipo_bebida = tp;
    }

    public void setPrecioCompra(double pc){
        this.precio_compra = pc;
    }

    public void setPrecioVenta(double pv){
        this.precio_venta = pv;
    }

    public void setRecipiente(Recipiente recipiente){
        this.recipiente = recipiente;
    }

    public void setSotck(int stock){
        this.stock = stock;
    }

    // GETTER

    public String getMarca(){
        return this.marca;
    }

    public String getTipoBebida(){
        return this.tipo_bebida;
    }

    public double getPrecioCompra(){
        return this.precio_compra;
    }

    public double getPrecioVenta(){
        return this.precio_venta;
    }

    public int getStock(){
        return this.stock;
    }
}
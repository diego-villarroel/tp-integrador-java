public class Licor extends Bebida{
    private String tipo_licor = '';
    private String sabor_licor = '';
    private Recipiente recipiente;

    // CONSTRUCTOR

    public Licor(String tl, String sl){
        setTipoLicor(tl);
        setSaborLicor(sl);
    }

    // SETTERS

    public void setTipoLicor(String tipo){
        this.tipo_licor = tipo;
    }

    public void setSaborLicor(String sabor){
        this.sabor_licor = sabor;
    }

    // GETTERS

    public getTipoLicor(){
        return this.tipo_licor;
    }

    public getSaborLicor(){
        return this.sabor_licor;
    }
    
}
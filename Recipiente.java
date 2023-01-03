public class Recipiente {
    private String tipo_envase = '';
    private String material = '';
    private double cantindad_litro = 0.0;

    // CONSTRUCTORES

    public Recipiente(String me,String te, double cl){
        setMaterial(me)
        setEnvase(te);
        setCantidad(cl);
    }

    // SETTERS

    public void setMaterial(String mat){
        this.material = mat;
    }

    public void setEnvase(String envase){
        this.envase = envase;
    }

    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }

    // GETTERS

    public String getMaterial(){
        return this.material;
    }

    public String getEnvase(){
        return envase;
    }

    public double getCantidad(){
        return cantidad;
    }
}
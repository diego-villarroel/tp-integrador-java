import java.util.ArrayList;
import java.util.List;

public class Heladera {
    private List<Cerveza> cervezas = ArrayList<>();
    private List<Gaseosa> gaseosas = ArrayList<>();
    private List<Licor> licores = ArrayList<>();

    // LISTAR ELEMENTOS HELADERA
    public void listarCervezas() {
        for (Cerveza c : cervezas) {
            System.out.println(c);
        }
    }

    public void listarGaseosas() {
        for (Gaseosa g : gaseosas) {
            System.out.println(g);
        }
    }

    public void listarLicores() {
        for (Licor l : licores) {
            System.out.println(l);
        }
    }

    // AGREGAR NUEVA MARCA DE BEBIDA
    public void addNuevaCerveza(Cerveza c) {
        this.cervezas.add(c);
    }

    public void addNuevaGaseosa(Gaseosa g) {
        this.gaseosas.add(g);
    }

    public void addNuevoLicor(Licor l) {
        this.licores.add(l);
    }

    // ELIMINAR MARCA DE BEBIDA
    public void eliminarCervezaExistente(Cerveza c) {
        this.cervezas.remove(c);
    }

    public void eliminarGaseosaExistente(Gaseosa g) {
        this.gaseosas.remove(g);
    }

    public void eliminarLicorExistente(Licor l) {
        this.licores.remove(l);
    }

    // CONSUMIR BEBIDAS    
    public void consumirCerveza(Cerveza cer) {
        for (Cerveza c : cervezas) {
            if(cer.getMarca() == c.getMarca()){
                if(c.getStock() != 0){
                    c.setStock(c.getStock()-1);
                    break;
                }                
            }
        }
    }

    public void consumirGaseosa(Gaseosa gas) {
        for (Gaseosa g : gaseosas) {
            if(gas.getMarca() == g.getMarca()){
                if(g.getStock() != 0){
                    g.setStock(g.getStock()-1);
                    break;
                }                
            }
        }
    }

    public void consumirLicor(Licor lic) {
        for (Licor l : licores) {
            if(lic.getMarca() == l.getMarca()){
                if(l.getStock() != 0){
                    l.setStock(l.getStock()-1);
                    break;
                }                
            }
        }
    }

    // LISTAR ELEMENTOS HELADERA
    public void mostrarCerveza(String marca) {
        for (int i = 0; i < cervezas.size(); i++) {
            if(marca == cervezas[i].getMarca()){
                System.out.println(cervezas.get(i));
            }
        }
    }

    public void mostrarGaseosa(String marca) {
        for (int i = 0; i < gaseosas.size(); i++) {
            if(marca == gaseosas[i].getMarca()){
                System.out.println(gaseosas.get(i));
            }
        }
    }

    public void mostrarLicor(String marca) {
        for (int i = 0; i < licores.size(); i++) {
            if(marca == licores[i].getMarca()){
                System.out.println(licores.get(i));
            }
        }
    }
}

public class Main {
    public static void main(String[] args){

        // OBJETOS CERVEZAS        
        Recipiente botellaCervezaQuilmes = new Recipiente('Vidrio','Botella',1.00);

        Cerveza cervezaQuilmes = new Cerveza('Lager');
        cervezaQuilmes.setMarca('Quilmes');
        cervezaQuilmes.setTipoBebida('Alcoholica');
        cervezaQuilmes.setPrecioVenta(800.00);
        cervezaQuilmes.setPrecioCompra(250.00);
        cervezaQuilmes.setStock(50);
        cervezaQuilmes.setRecipiente(botellaCervezaQuilmes);

        // OBJETO GASEOSA
        Recipiente botellaGaseosaManaos = new Recipiente('Plastico','Botella',2.25);

        Gaseosa gaseosaManaos = new Gaseosa('Manaos','No alcoholica',180.00,500.00,'Uva',40);
        gaseosaManaos.setRecipiente(botellaGaseosaManaos);

        // OBJETO GASEOSA
        Recipiente lataSidra = new Recipiente('Aluminio','Lata',0.47);

        Licor sidraDelValle = new Licor('Del Valle','Alcoholica',230.00,550.00,'Manzana',30);
        sidraDelValle.setRecipiente(lataSidra);

        // OBJETO HELADERA
        Heladera heladera = new Heladera();

        heladera.addNuevaCerveza(cervezaQuilmes);
        heladera.addNuevaGaseosa(gaseosaManaos);
        heladera.addNuevoLicor(sidraDelValle);

    }
}
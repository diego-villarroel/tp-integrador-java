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

        // OBJETOS CERVEZAS
        Cerveza cervezaStella = new Cerveza('Sout');
        cervezaStella.setMarca('Stella Noire');
        cervezaStella.setTipoBebida('Alcoholica');
        cervezaStella.setPrecioVenta(1200.00);
        cervezaStella.setPrecioCompra(400.00);
        cervezaStella.setStock(50);
        cervezaStella.setRecipiente(botellaCervezaQuilmes);

        // OBJETO GASEOSA
        Recipiente botellaGaseosaManaos = new Recipiente('Plastico','Botella',2.25);

        Gaseosa gaseosaManaos = new Gaseosa('Manaos','No alcoholica',180.00,500.00,'Uva',40);
        gaseosaManaos.setRecipiente(botellaGaseosaManaos);

        // OBJETO LICOR
        Recipiente lataSidra = new Recipiente('Aluminio','Lata',0.47);

        Licor sidraDelValle = new Licor('Del Valle','Alcoholica',230.00,550.00,'Manzana',30);
        sidraDelValle.setRecipiente(lataSidra);

        // OBJETO LICOR
        Recipiente botellaFernet = new Recipiente('Vidrio','Botella',1.00);

        Licor fernetBranca = new Licor('Branca','Alcoholica',800.00,1500.00,'Hierbas',10);
        fernetBranca.setRecipiente(botellaFernet);

        // OBJETO HELADERA
        Heladera heladera = new Heladera();

        heladera.addNuevaCerveza(cervezaQuilmes);
        heladera.addNuevaGaseosa(gaseosaManaos);
        heladera.addNuevoLicor(sidraDelValle);
        heladera.addNuevoLicor(fernetBranca);

        heladera.listarLicores();
        heladera.mostrarCerveza('Quilmes');
        heladera.consumirCerveza(cervezaQuilmes);
        heladera.mostrarCerveza('Quilmes');
        heladera.mostrarCerveza('Stella Noire');
    }
}

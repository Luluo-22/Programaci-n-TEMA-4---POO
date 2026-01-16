package teoria.getters_setters.ENER09plusENER13;

public class MainAutomovil {
    public static void main(String[] args) {
        //constructor
        Automovil automovil1 = new Automovil();
        Automovil automovil2 = new Automovil();

        //MARCA
        automovil1.setMarca("KIA");
        automovil2.setMarca("Toyota");

        //MODELO
        automovil1.setModelo("4B");
        automovil2.setModelo("10A");

        //NUMERO DE ASIENTOS
        automovil1.setNumeroAsietos(5);
        automovil2.setNumeroAsietos(7);

        //ELECTRICO
        automovil1.setElectrico(true);
        automovil2.setElectrico(false);

        //DATOS sin definir el @override de toString()
        /*
            .toString() --> está en finito depsues del . poorque llama a un metodo de la clase padre (Object)
                - paqueteria@direcciondememoeria   --> referencia de automoviles
                --> si le damos a insert + alt ~~ toString() te genera el codigo con el @override para mostrarlo bien!
        */
        System.out.println( "Datos con el toString(): " );
        System.out.println( automovil1.toString() );
        System.out.println( automovil2 );


        System.out.println("===================================================");


        //INFORMACION DE LOS AUTOMOVILES:
        System.out.println( "Datos con el metodo hecho a mano: " );
        System.out.println( "Automovil 1: " + automovil1.informacionAutomovil() );
        System.out.println( "Automovil 2: " + automovil2.informacionAutomovil() );

    }
}

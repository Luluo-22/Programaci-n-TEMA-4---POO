package teoria.getters_setters.ENER08;
/*
    GETTER Y SETTER
 */

public class MainCirculo {
    public static void main(String[] args){
        //================================================================================//
        //===========================GETTER Y SETTER DE ATRIB=============================//
        //================================================================================//
        //CONSTRUCTOR (mismo nombre que la clase) --> Van en MAYUS

        //NombreClase nombreVarible = new nombreClase();
        Circulo circulo1 = new Circulo();
        //para llamar a los metodos de Circulo...
        int radioCirculo1 = circulo1.getRadio();
        System.out.printf( "Radio circulo1: %d  %n", radioCirculo1 );


        Circulo circulo2 = new Circulo();
        int radioCirculo2 = circulo1.getRadio();
        System.out.printf( "Radio circulo2: %d  %n", radioCirculo2 );
        circulo2.setRadio(8);
        //luego hacemos un get para cambiarlo en la pila tambien, no solo en el monticulo
        radioCirculo2 = circulo2.getRadio();
        System.out.printf( "Radio circulo2: %d  %n", radioCirculo2 );


        //SIN VARIABLES, DIRECTAMENTE DE LOS METODOS
        Circulo circulo3 = new Circulo();
        System.out.printf( "Radio circulo3: %d  %n", circulo3.getRadio() );
        circulo3.setRadio(10);
        System.out.printf( "Radio circulo3: %d  %n", circulo3.getRadio() );


        //__________________________________________________________________________________________________//

        //================================================================================//
        //===========================METODOS APARTE DE ATRIB==============================//
        //================================================================================//ç
        System.out.printf("Radio circulo 2: %.2f  %n", circulo2.getRadio());
        System.out.printf("Area circulo 2: %.2f  %n", circulo2.calcularArea());
        System.out.printf("Perimetro circulo 2: %.2f  %n", circulo2.calcularPerimetro());
    }
}

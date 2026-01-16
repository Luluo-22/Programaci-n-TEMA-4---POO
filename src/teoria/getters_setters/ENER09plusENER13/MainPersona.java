package teoria.getters_setters.ENER09plusENER13;
/*
    SET --> Definir valores de los atributos
    GET --> Mostrar datos
 */
public class MainPersona {
    public static void main(String[] args) {
        //constructor
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        //informacion ANTES de hacer los sets:
        System.out.println("Antes de los sets:  " + persona1.darInformacion() );;


        //NOMBRE
        persona1.setNombre("Luis");
        persona2.setNombre("Maria");

        //APELLIDO
        persona1.setApellido("Castro Lopez");
        persona2.setApellido("Morales Llorent");

        //EDAD
        persona1.setEdad(32);
        persona2.setEdad(10);

        //informacion DESPUES de hacer los sets:
        System.out.println("Despues de los sets:  " + persona1.darInformacion() );


        System.out.println("===================================================");


        //INFORMACION DE LAS PERSONAS
                System.out.println( "Informacion de las personas: " );
                System.out.println( persona1.darInformacion() );;
                System.out.println( persona2.darInformacion() );


        System.out.println("===================================================");


        //ES MAYOR DE EDAD
        String mensaje1 = persona1.esMayorDeEdad() ? "Es mayor de edad" : "Es menor de edad";
        String mensaje2 = persona2.esMayorDeEdad() ? "Es mayor de edad" : "Es menor de edad";

        System.out.println( persona1.getNombre() + " --> " + mensaje1 );
        System.out.println( persona1 );

        System.out.println( persona2.getNombre() + " --> " + mensaje2 );
        System.out.println( persona2);


    }
}
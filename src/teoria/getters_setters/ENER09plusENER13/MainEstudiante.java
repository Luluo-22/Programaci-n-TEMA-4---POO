package teoria.getters_setters.ENER09plusENER13;

public class MainEstudiante {
    public static void main (String[] args){
        //constructor
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();


        //DATOS SIN AÑADIR: (por defecto)
        System.out.println("Datos Iniciales del Estudiante 1: \n" + estudiante1.darInformacion() );
        System.out.println("Datos Iniciales del Estudiante 2: \n" + estudiante2.darInformacion() );


        //nombreCompleto
        estudiante1.setNombreCompleto("Jacinto García");
        estudiante2.setNombreCompleto("Marisa Escudero" );


        //dni
        estudiante1.setDni("87654321Z");
        estudiante2.setDni("12345678A");


        //curso [ ENUM ]
        estudiante1.setCurso( Curso.DAM );
        estudiante2.setCurso( Curso.SMR );


        System.out.println("===================================================");


        //DAR INFORMACION
        System.out.println("Datos del Estudiante 1: \n" + estudiante1.darInformacion() );
        System.out.println("Datos del Estudiante 2: \n" + estudiante2.darInformacion() );

    }
}

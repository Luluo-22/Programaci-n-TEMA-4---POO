package teoria.getters_setters.ENER08;

import java.util.ArrayList;
import java.util.List;

public class MainRectangulo {
    public static void main(String[] args){
        //1. CONSTRUCTOR (mando a distancia)
        Rectangulo rectangulo1 = new Rectangulo();

        //2. Cambiar valores por defecto:
        System.out.printf( "Base   del rectangulo: %d %n", rectangulo1.getAncho() );
        System.out.printf( "Altura del rectangulo: %d %n", rectangulo1.getAlto() );
        rectangulo1.setAlto(10);
        rectangulo1.setAncho(16);
        System.out.printf( "Nueva Base   del rectangulo: %d %n", rectangulo1.getAncho() );
        System.out.printf( "Nueva Altura del rectangulo: %d %n", rectangulo1.getAlto() );

        //3. Otros metodos:
        System.out.printf( "Area del rectangulo: %d  %n", rectangulo1.calcularArea() );



        Rectangulo rectangulo2 = new Rectangulo();
        /*
            comprobación de la diferencia del set y cambiarlo manualmente
            En los set  cambias los datos guardados en el monticulo [ relacionados solo
            con las variables (constructores) ]
            Si lo cambiaramos con las variables (desde el Rectangulo.java) se
            cambiaría el valor por defecto!
        */
        System.out.printf( "Base   del rectangulo: %d %n", rectangulo2.getAncho() );
        System.out.printf( "Altura del rectangulo: %d %n", rectangulo2.getAlto() );
        rectangulo2.setAlto(6);
        rectangulo2.setAncho(5);
        System.out.printf( "Nueva Base   del rectangulo: %d %n", rectangulo2.getAncho() );
        System.out.printf( "Nueva Altura del rectangulo: %d %n", rectangulo2.getAlto() );
        System.out.printf( "Area del rectangulo: %d  %n", rectangulo2.calcularArea() );

        System.out.println("========================================================================");

        //COLECCION DINAMICA DE OBJETOS RECTANGULOS!!! --> Las clases son OBJETOS
        List<Rectangulo> rectangulos = new ArrayList<>();
        rectangulos.add(rectangulo1);
        rectangulos.add(rectangulo2);

        mostrarDatosDeRectangulo(rectangulos);
    }

    public static void mostrarDatosDeRectangulo( List<Rectangulo> rectangulos ){
        //recorrer colección rectángulos para ir mostrando datos:
        for ( Rectangulo rectangulo : rectangulos){
            System.out.printf( "Base del rectangulo  : %d %n",  rectangulo.getAncho() );
            System.out.printf( "Altura del rectangulo: %d %n",  rectangulo.getAlto() );
            System.out.printf( "Area del rectangulo  : %d %n",  rectangulo.calcularArea() );
        }


    }

}

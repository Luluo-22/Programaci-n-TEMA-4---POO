package teoria.lombok.ENER13;

import java.util.ArrayList;
import java.util.List;

public class MainOrdenador {
    public static void main(String[] args){
        Ordenador ordenador1 = new Ordenador();
        Ordenador ordenador2 = new Ordenador();

        ordenador1.setRam(8);
        ordenador1.setProcesador(1.3f);
        ordenador1.setTarjetaRedIntegrada(true);

        ordenador2.setRam(32);
        ordenador2.setProcesador(6.2f);
        ordenador2.setTarjetaRedIntegrada(false);

        //System.out.println( "Datos del ordenador finales: " + ordenador.toString() );

        //crear una lista
        List<Ordenador> ordenadores = new ArrayList<>();

        //añadimos a la lista
        ordenadores.add(ordenador1);
        ordenadores.add(ordenador2);

        //llamar al metodo para mostrar los datos
        mostrarDatosOrdenador(ordenadores);
    }

    public static void mostrarDatosOrdenador(List<Ordenador> ordenadores){
        for (Ordenador ordenador : ordenadores) System.out.println(ordenador); //bucle mejorado para recorrer la lista de objetos tipo Ordenador (creando una variable de tipo Ordenador)
    }
}

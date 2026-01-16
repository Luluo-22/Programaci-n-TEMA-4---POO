package teoria.lombok.ENER13;
/*
    Gracias al plugin Lombok, este genera los setters, getters y StringTo automaticamente!!
    Es mucho más rápido y sencillo
 */
public class MainPrueba {
    public static void main(String[] args){
        Prueba prueba = new Prueba();
        System.out.println(prueba);

        prueba.setUno(1);
        prueba.setDos("Dos");

        System.out.println(prueba);

    }
}

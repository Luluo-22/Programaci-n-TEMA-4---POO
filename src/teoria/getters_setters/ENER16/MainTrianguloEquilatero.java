package teoria.getters_setters.ENER16;

public class MainTrianguloEquilatero {
    public static void main(String[] args){
        TrianguloEquilatero tring1 = new TrianguloEquilatero(5);
        System.out.printf("Triangulo equilatero con lado: %d   \n", tring1.getLado()     );
        System.out.printf("Perimetro del Triangulo:       %d   \n", tring1.getPerimetro());
        System.out.printf("Area del Triangulo:            %.2f \n", tring1.getArea()     );
    }
}

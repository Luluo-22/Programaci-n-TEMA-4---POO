package ejercicios.ej2;

public class MainTrianguloRectangulo {
    public static void main(String[] args){
        TrianguloRectangulo triangulo1 = new TrianguloRectangulo(5, 20);
        System.out.printf("Triangulo rectangulo con: altura = %d; base = %d  \n", triangulo1.cateto1(), triangulo1.cateto2() );
        System.out.printf("Hipotenusa del triangulo: %.2f  \n", triangulo1.calcularHip() );
        System.out.printf("Area Triangulo: %.2f;  Perimetro Triangulo: %.2f  \n", triangulo1.calcularArea(), triangulo1.calcularPerimetro());
    }
}

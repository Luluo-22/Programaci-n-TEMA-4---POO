package ejercicios.ej2;

public class MainTrianguloRectangulo {
    public static void main(String[] args){
        int cat1 = 5;
        int cat2 = 20;

        TrianguloRectangulo triangulo1 = new TrianguloRectangulo( cat1, cat2, calcularHip(cat1, cat2));
        System.out.println(triangulo1);
        System.out.printf("Area Triangulo: %.2f;  Perimetro Triangulo: %.2f", triangulo1.calcularArea(), triangulo1.calcularPerimetro());
    }

    //DUDA: NO SE HACERLO EN EL RECORD!!! AAAAA
    public static double calcularHip(int cateto1, int cateto2){
        return Math.sqrt( (cateto1*cateto1)+(cateto2*cateto2) );
    }

}

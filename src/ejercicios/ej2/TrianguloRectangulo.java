package ejercicios.ej2;

public record TrianguloRectangulo( int cateto1, int cateto2, double hipotenusa) {
    //  public double calcularHip(){ return Math.sqrt( (cateto1*cateto1)+(cateto2*cateto2) ); }

    public double calcularArea(){ return ((cateto1*cateto2)/2); }
    public double calcularPerimetro(){ return cateto1+cateto2+hipotenusa; }

    @Override
    public String toString() {
        return String.format("Triangulo[ cateto 1 = %d; cateto 2 = %d; hipotenusa = %.2f ]", cateto1, cateto2, hipotenusa );
    }
}

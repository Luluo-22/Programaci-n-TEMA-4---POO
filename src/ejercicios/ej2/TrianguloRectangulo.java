package ejercicios.ej2;

public record TrianguloRectangulo( int cateto1, int cateto2) {
    public double calcularHip(){ return Math.hypot(cateto1, cateto2); }
    public double calcularArea(){ return ((cateto1*cateto2)/2.0); } //2.0 para que te de un double, no un int
    public double calcularPerimetro(){ return cateto1+cateto2+calcularHip(); }

    @Override
    public String toString() {
        return String.format("Triangulo[ cateto 1 = %d; cateto 2 = %d ]", cateto1, cateto2);
    }
}

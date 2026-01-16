package teoria.getters_setters.ENER16;
/*
    Ejemplo de como hacer un objeto inmutable sin record!
 */

public class TrianguloEquilatero {
    private final int lado;

    //constructor
    public TrianguloEquilatero(int lado) { this.lado = lado; }

    public int getLado() { return lado; }
    public int getPerimetro(){ return lado*3; }
    public double getArea(){ return (lado*lado*Math.sqrt(3))/4;  }
}

package ejercicios.ej3;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class EcuacionSegundoGrado {
    private final int a;
    private final int b;
    private final int c;
    private double x1;
    private double x2;

    /*
        Ecuacion de 2o grado: a*x^2 + b*x + c
        Resolucion 2o grado: [ -b +- raiz2( b^2 - 4ac) ] / 2a
     */
    public List<Double> calcularEcuacion(){
        List<Double> results = new ArrayList<>();

        //SI a = 0
        if (a == 0){
            x1 = c/b;
            results.set(1, x1);
            return results;
        }

        //SI b = 0
        if(b == 0){
            x1 = Math.sqrt(c/a);
            x2 = Math.sqrt((-c)/a);
            results.set(1, x1);
            results.set(2, x2);
            return results;
        } else{ //SI b != 0
            x1 = (   (-b) + Math.sqrt((b*b) - (4*a*c))  ) / (2*a);
            x2 = (   (-b) - Math.sqrt((b*b) - (4*a*c))  ) / (2*a);
            results.set(1, x1);
            results.set(2, x2);
            return results;
        }
    }

    public EcuacionSegundoGrado(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

package ejercicios.ej1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cilindro{

    private int radio;
    private int altura;

    public double calcularArea () {
        return 2 * Math.PI * radio * (radio + altura);
    }

    public double calcularVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public String toString() {
        return String.format("CILINDRO\nradio: %d\naltura: %d\nsuperficie: %.2f\nvolumen: %.2f",
                              radio, altura, calcularArea(), calcularVolumen());
    }
}


package teoria.lombok.ENER13;

import lombok.Data;

@Data
public class Ordenador {
    private int ram;
    private float procesador;
    private boolean tarjetaRedIntegrada;

    @Override
    public String toString() {
        String mensaje = tarjetaRedIntegrada ? "Sí" : "No"; //MENSAJE true : false
        return String.format("%n_________________________________________________%n%nOrdenador:%n   RAM: %d%n   Procesador: %.1f%n   Tarjeta de Red Integrada: %s", ram, procesador, mensaje );
    }
}

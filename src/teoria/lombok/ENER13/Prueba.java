package teoria.lombok.ENER13;
/*
    1. Instalar Plugin Lombok [ File --> Settings --> Plugins --> Buscar el plugin "lombok" --> Instalar y Reiniciar ]
    2. [ File --> Settings --> Build, Execution, Deployment --> Annotation Processors --> Enable Annotation Processors (tick) ]
    3. Resetar IntelliJ

    Gracias a este plugin nos genera varios elementos de la programacion orientada a objetos.

    1.- Encima de la clase: @Data
    2.- Bombillita del @
    3.- Añadir lombok al classpath
    4.- importar clase: lombok.Data
 */

import lombok.Data;

@Data
public class Prueba {
    private int uno;
    private String dos;
}

/*
    COMO CREAR TEST:

    1) Crear paquete al nivel del src llamada Test
    2) click derecho sobre la carpeta --> Mark Directory As --> Test source
    3) En el archivo del que queremos hacer los test: alt + insert --> test
 */

package ejercicios.ej3;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EcuacionSegundoGradoTest {

    @Test
    void calcularEcuacion() {
        //numeros enteros
        EcuacionSegundoGrado ec1 = new EcuacionSegundoGrado(1, 2, -15);


        //cada elemento a 0
        EcuacionSegundoGrado ec2 = new EcuacionSegundoGrado(0, 3, 2);

        EcuacionSegundoGrado ec3 = new EcuacionSegundoGrado(6, 0, 2);

        EcuacionSegundoGrado ec4 = new EcuacionSegundoGrado(4, 6, 0);


        //todos 0
        EcuacionSegundoGrado ec5 = new EcuacionSegundoGrado(0, 0, 0);


        //numeros negativos
        EcuacionSegundoGrado ec6 = new EcuacionSegundoGrado(-8, -3, -7);

    }

}
package teoria.getters_setters.ENER08;
/*
    08 / 01 / 2026

    1. Hacer la Clase
    2. Hacerlos métodos en OTRO archivo .java

    ATRIB   --> privados
    METODOS --> publicos
    si inicializas un atrib hace que ese sea su valor por defecto, sino
    es el valor por defecto del tipo de dato:
        - int = 0
        - String = null
        - boolean = false
*/

public class Circulo {
    //visibilidad tipoDato nombreAtrib
    private int radio = 1;

    //alt + insert --> eliges opcion
    // --> GETTER
    public int getRadio() {
        return radio;
    }

    // --> SETTER
    public void setRadio(int r) {
        //radio = r;
        this.radio = r; //<-- this hace referencia al propio obj (direccion de memoria)
    }

    public double calcularArea( ){ //no hace falta pasarle ningun parametro
        return Math.PI * radio * radio; //el llama los atributos
    }

    public double calcularPerimetro( ){
        return 2 * Math.PI * radio;
    }
}

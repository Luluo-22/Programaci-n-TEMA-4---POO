package teoria.getters_setters.ENER09plusENER13;

public class Automovil {
    //MARCA
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    //MODELO
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    //NUMERO DE ASIENTOS
    private int numeroAsietos;

    public int getNumeroAsietos() {
        return numeroAsietos;
    }

    public void setNumeroAsietos(int numeroAsietos) {
        this.numeroAsietos = numeroAsietos;
    }


    //SI ES ELECTRICO O NO
    private boolean electrico;

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    //INFORMACION COCHES
    public String informacionAutomovil(){
        String mensaje = electrico ? "Electrico" : "No electrico";
        return String.format( "%s,  %s,  %d, %s", marca, modelo, numeroAsietos, mensaje );
    }

    //INFORMION COCHES BETTER: [ Insert + Alt --> toString() ]
    @Override
    public String toString() {
        return String.format( "%s,%s,%d,%B", marca, modelo, numeroAsietos, electrico );
    }
}

package teoria.getters_setters.ENER09plusENER13;

public class Estudiante {
    //NOMBRE COMPLETO
    private String nombreCompleto;
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }


    //DNI
    private String dni;
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) { this.dni = dni; }


    //PRIMERO SE HACE EL ENUM EN UN ARCHIVO APARTE!!!
    //CURSO --> Al ser un Enum crear un Atrib, lo crear llamando al enum SIN PONER TIPO
    private Curso curso;

    public Curso getCurso() { return curso; }

    public void setCurso(Curso curso) { this.curso = curso; }

    //DAR INFORMACION
    public String darInformacion(){
        return String.format( " Nombre: %s%n DNI: %s%n Curso: %s%n", nombreCompleto, dni, curso ); // <- se escribe igual que un printf
    }

}

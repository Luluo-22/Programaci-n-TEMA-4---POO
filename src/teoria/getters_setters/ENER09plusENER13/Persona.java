package teoria.getters_setters.ENER09plusENER13;

public class Persona {
    //NOMBRE
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //APELLIDO
    private String apellido;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    //EDAD
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    //MAYOR DE EDAD
    public boolean esMayorDeEdad() {
        //Al ser una expresion booleana cuenta directamente como expresion, asi que te devielve true o false
        return edad >= 18;
        /*
        if( edad >= 18) return true;
        return false;
        */
    }

    //DAR INFORMACION
    public String darInformacion(){
        //System.out.printf("%s, %s: %d", apellido, nombre, edad);
        //return apellido +  ", " + nombre +  ": " + edad + " años"   <-- se puede hacer con objetos string builder!!!! o con...
        //String format:
        return String.format( "%s, %s: %d", apellido, nombre, edad ); // <- se escribe igual que un printf
    }
}

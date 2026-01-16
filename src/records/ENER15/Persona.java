package records.ENER15;
/*
    public nombreObjeto(atrib1, atrib2) <-- te crea el constructor directamente basico de ese,
    si quisieras hacer otro aparte, dentro del Objeto hace otro constructor (como el
    public Persona (int edad)  )

    SOLO SE USAN CUANDO NO SE QUIEREN SETTERS ya que despues de asignar los valores se vuelven CONSTANTES (no se pueden cambiar)
 */
public record Persona(String nombre, String direccion, int edad) {
    public Persona (int edad) {
        this("administrador", "dirección administrador", edad);
    }
}
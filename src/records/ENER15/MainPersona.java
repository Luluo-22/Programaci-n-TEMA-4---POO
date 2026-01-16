package records.ENER15;

public class MainPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("pedro ruiz", "avda. madrid 12", 18);

        String direccion = persona1.direccion();
        String nombre = persona1.nombre();

        System.out.println("Datos de la persona");
        System.out.println("NOMBRE: " + nombre);
        System.out.println("DIRECCIÓN: " + direccion);

        System.out.println("==========================================");

        System.out.println(persona1);
        Persona administrador = new Persona(42);

        System.out.println("==========================================");

        System.out.println(administrador);
    }
}
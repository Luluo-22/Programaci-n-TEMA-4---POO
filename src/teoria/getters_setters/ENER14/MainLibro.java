package teoria.getters_setters.ENER14;

public class MainLibro {
    public static void main(String[] args){
        //asi al construit el objeto, directamente puedes poner sus valores:
        Libro libro1 = new Libro("Juan Manuel Lopez", "La Orilla del Mar", 345, "0001A");
        System.out.println(libro1);
        libro1.setNumeroPags(2_100);
        System.out.println(libro1);

        System.out.println("----------------");

        Libro libro2 = new Libro();
        System.out.println(libro2);
        libro2.setAutor("Cervantes");
        libro2.setTitulo("El Quijote");
        libro2.setNumeroPags(1_500);
        libro2.setIsbn("0002A");
        System.out.println(libro2);

        System.out.println("----------------");

        Libro libro3 = new Libro("0003A");
        System.out.println(libro3);
        libro3.setAutor("Anonimo");
        libro3.setTitulo("El Lazarillo");
        libro3.setNumeroPags(60);
        System.out.println(libro3);

    }


}

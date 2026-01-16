package ejercicios.ej1;

public class MainCilindro {
    public static void main(String[] args) {
        Cilindro cilindro1 = new Cilindro();
        cilindro1.setAltura(10);
        cilindro1.setRadio(2);
        System.out.println(cilindro1);


        Cilindro cilindro2 = new Cilindro(5, 7);
        System.out.println(cilindro2);
    }
}

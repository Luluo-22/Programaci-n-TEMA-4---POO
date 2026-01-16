package teoria.getters_setters.ENER14;

import java.util.List;

public class Libro {
    //ATRIBUTOS
    private String autor;
    private int numeroPags;
    private String titulo;
    private String isbn;


    //GETTER & SETTER: Los setter son para CAMBIAR realmente, su funcion principal no es inicializar
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getNumeroPags() { return numeroPags; }
    public void setNumeroPags(int numeroPags) { this.numeroPags = numeroPags; }


    //insertar CONSTURCTOR: señalando a los objetos de Libro los inicializa como los parametros
    public Libro( String autor, String titulo, int numeroPags, String isbn ) {
        this.autor = autor;
        this.titulo = titulo;
        this.numeroPags = numeroPags;
        this.isbn = isbn;
    }

    //para meter solo el isbn porque NO tenemos set de isbn
    public Libro(String isbn){ this.isbn = isbn; }
    public Libro(){};

    @Override
    public String toString() {
        return "Libro{ " +
                "autor = '" + autor + '\'' +
                ", numeroPags = " + numeroPags +
                ", titulo = '" + titulo + '\'' +
                ", isbn = '" + isbn + '\'' +
                " }";
    }
}

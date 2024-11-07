import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        // Añadiendo al menos 3 libros
        biblioteca.agregarLibro(new Libro("Book One", "Author One", "ISBN001"));
        biblioteca.agregarLibro(new Libro("Book Two", "Author Two", "ISBN002"));
        Libro libro3 = new Libro("Book Three", "Author Three", "ISBN003");
        biblioteca.agregarLibro(libro3);

        // Haciendo que el libro 3 no esté disponible
        libro3.prestar();

        // Mostrando la colección de libros disponible
        System.out.println("Colección de libros disponible:");
        for (Libro libro : biblioteca.getLibros()) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor() + " - " + libro.getISBN() + " - " + libro.getEstado());
        }

        // Permitir prestar un libro introduciendo su ISBN
        System.out.println("\nIntroduce el ISBN del libro que quieres prestar:");
        String isbnPrestar = scanner.nextLine();
        biblioteca.prestarLibro(isbnPrestar);

        // Permitir devolver un libro por ISBN
        System.out.println("\nIntroduce el ISBN del libro que quieres devolver:");
        String isbnDevolver = scanner.nextLine();
        biblioteca.devolverLibro(isbnDevolver);

        // Mostrando el estado actualizado de los libros
        System.out.println("\nEstado actualizado de los libros:");
        for (Libro libro : biblioteca.getLibros()) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor() + " - " + libro.getISBN() + " - " + libro.getEstado());
        }

        scanner.close();
    }
}

class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscarLibroPorISBN(String isbn) {
        for (Libro libro : libros) {
            if (libro.getISBN().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void prestarLibro(String isbn) {
        Libro libro = buscarLibroPorISBN(isbn);
        if (libro != null && libro.getEstado().equals(Libro.ESTADO_DISPONIBLE)) {
            libro.prestar();
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("No se pudo prestar el libro. Puede que ya esté prestado o no existe.");
        }
    }

    public void devolverLibro(String isbn) {
        Libro libro = buscarLibroPorISBN(isbn);
        if (libro != null && libro.getEstado().equals(Libro.ESTADO_PRESTADO)) {
            libro.devolver();
            System.out.println("El libro ha sido devuelto.");
        } else {
            System.out.println("No se pudo devolver el libro. Puede que ya esté disponible o no exista.");
        }
    }

    public List<Libro> getLibros() {
        return libros;
    }
}

class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private String estado;

    public static final String ESTADO_DISPONIBLE = "disponible";
    public static final String ESTADO_PRESTADO = "prestado";

    public Libro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.estado = ESTADO_DISPONIBLE;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getEstado() {
        return estado;
    }

    public void prestar() {
        if (estado.equals(ESTADO_DISPONIBLE)) {
            estado = ESTADO_PRESTADO;
        }
    }

    public void devolver() {
        if (estado.equals(ESTADO_PRESTADO)) {
            estado = ESTADO_DISPONIBLE;
        }
    }
}
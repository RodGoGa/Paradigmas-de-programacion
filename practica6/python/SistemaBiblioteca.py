class Libro:
    ESTADO_DISPONIBLE = "disponible"
    ESTADO_PRESTADO = "prestado"

    def __init__(self, titulo, autor, isbn):
        self.titulo = titulo
        self.autor = autor
        self.isbn = isbn
        self.estado = self.ESTADO_DISPONIBLE

    def prestar(self):
        if self.estado == self.ESTADO_DISPONIBLE:
            self.estado = self.ESTADO_PRESTADO

    def devolver(self):
        if self.estado == self.ESTADO_PRESTADO:
            self.estado = self.ESTADO_DISPONIBLE


class Biblioteca:
    def __init__(self):
        self.libros = []

    def agregar_libro(self, libro):
        self.libros.append(libro)

    def buscar_libro_por_isbn(self, isbn):
        for libro in self.libros:
            if libro.isbn == isbn:
                return libro
        return None

    def prestar_libro(self, isbn):
        libro = self.buscar_libro_por_isbn(isbn)
        if libro and libro.estado == Libro.ESTADO_DISPONIBLE:
            libro.prestar()
            print("El libro ha sido prestado.")
        else:
            print("No se pudo prestar el libro. Puede que ya esté prestado o no existe.")

    def devolver_libro(self, isbn):
        libro = self.buscar_libro_por_isbn(isbn)
        if libro and libro.estado == Libro.ESTADO_PRESTADO:
            libro.devolver()
            print("El libro ha sido devuelto.")
        else:
            print("No se pudo devolver el libro. Puede que ya esté disponible o no exista.")


def main():
    biblioteca = Biblioteca()

    # Añadiendo libros
    biblioteca.agregar_libro(Libro("Book One", "Author One", "ISBN001"))
    biblioteca.agregar_libro(Libro("Book Two", "Author Two", "ISBN002"))
    libro3 = Libro("Book Three", "Author Three", "ISBN003")
    biblioteca.agregar_libro(libro3)

    # Haciendo que el libro 3 no esté disponible
    libro3.prestar()

    # Mostrando la colección de libros disponible
    print("Colección de libros disponible:")
    for libro in biblioteca.libros:
        print(f"{libro.titulo} - {libro.autor} - {libro.isbn} - {libro.estado}")

    # Permitir prestar un libro
    isbn_prestar = input("\nIntroduce el ISBN del libro que quieres prestar: ")
    biblioteca.prestar_libro(isbn_prestar)

    # Permitir devolver un libro
    isbn_devolver = input("\nIntroduce el ISBN del libro que quieres devolver: ")
    biblioteca.devolver_libro(isbn_devolver)

    # Mostrando el estado actualizado de los libros
    print("\nEstado actualizado de los libros:")
    for libro in biblioteca.libros:
        print(f"{libro.titulo} - {libro.autor} - {libro.isbn} - {libro.estado}")


if __name__ == "__main__":
    main()
# Clase base
class Animal:
    def __init__(self, edad, color):
        self.edad = edad
        self.__color = color  # Atributo privado color

    def hacer_sonido(self):
        print("El animal hace un sonido")

    def comer(self):
        print("El animal está comiendo")

    def set_color(self, color):
        self.__color = color

    def get_color(self):
        return self.__color


# Clases derivadas
class Perro(Animal):
    def __init__(self, edad, color):
        super().__init__(edad, color)

    def hacer_sonido(self):
        print("El perro ladra")

    def comer(self):
        print("El perro está comiendo huesos")


class Gato(Animal):
    def __init__(self, edad, color):
        super().__init__(edad, color)

    def hacer_sonido(self):
        print("El gato maúlla")

    def comer(self):
        print("El gato está comiendo pescado")


class Pajaro(Animal):
    def __init__(self, edad, color):
        super().__init__(edad, color)

    def hacer_sonido(self):
        print("El pájaro canta")

    def comer(self):
        print("El pájaro está comiendo semillas")


# Ejemplo de uso
mi_animal = Animal(5, "Gris")
mi_animal.hacer_sonido()
mi_animal.comer()

mi_perro = Perro(7, "Marrón")
mi_perro.hacer_sonido()
mi_perro.comer()

mi_gato = Gato(4, "Negro")
mi_gato.hacer_sonido()
mi_gato.comer()

mi_pajaro = Pajaro(1, "Amarillo")
mi_pajaro.hacer_sonido()
mi_pajaro.comer()

# Ejemplo de uso de color
print("Color del perro:", mi_perro.get_color())
mi_perro.set_color("Blanco")
print("Nuevo color del perro:", mi_perro.get_color())

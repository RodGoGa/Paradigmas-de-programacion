from abc import ABC, abstractmethod

class Vehiculo(ABC):
    def __init__(self, marca, modelo, year):
        self.marca = marca
        self.modelo = modelo
        self.year = year

    @abstractmethod
    def encender(self):
        pass

    @abstractmethod
    def apagar(self):
        pass

    @abstractmethod
    def describir(self):
        pass

class Auto(Vehiculo):
    def encender(self):
        print(f"El auto {self.marca} {self.modelo} está encendido.")

    def apagar(self):
        print(f"El auto {self.marca} {self.modelo} está apagado.")

    def describir(self):
        print(f"Este es un auto de marca {self.marca}, modelo {self.modelo}, del year {self.year}.")

class Motocicleta(Vehiculo):
    def encender(self):
        print(f"La motocicleta {self.marca} {self.modelo} está encendida.")

    def apagar(self):
        print(f"La motocicleta {self.marca} {self.modelo} está apagada.")

    def describir(self):
        print(f"Esta es una motocicleta de marca {self.marca}, modelo {self.modelo}, del year {self.year}.")

class Camion(Vehiculo):
    def encender(self):
        print(f"El camión {self.marca} {self.modelo} está encendido.")

    def apagar(self):
        print(f"El camión {self.marca} {self.modelo} está apagado.")

    def describir(self):
        print(f"Este es un camión de marca {self.marca}, modelo {self.modelo}, del year {self.year}.")
        
def main():
    vehiculos = []

    vehiculos.append(Auto("Toyota", "Corolla", 2020))
    vehiculos.append(Motocicleta("Yamaha", "MT-07", 2021))
    vehiculos.append(Camion("Ford", "F-150", 2019))

    for vehiculo in vehiculos:
        vehiculo.encender()
        vehiculo.describir()
        vehiculo.apagar()
        print()  # Línea en blanco para separar las descripciones

if __name__ == "__main__":
    main()
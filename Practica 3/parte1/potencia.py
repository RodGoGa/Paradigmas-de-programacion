print("Programa que calcula la potencia de 2 más próxima a un número")
numero = int(input("Ingresa un número natural: "))

potencia = 1
cuenta = 0

while potencia * 2 < numero:
    potencia *= 2
    cuenta += 1

print("La potencia más cercana es 2^" + str(cuenta) + " = " + str(potencia))

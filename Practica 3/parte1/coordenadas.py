X = int(input("Ingresa la coordenada en x: "))
Y = int(input("Ingresa la coordenada en y: "))

if X > 0 and Y > 0:
    print("El punto (" + str(X) + "," + str(Y) + ") se encuentra en el cuadrante I")
elif X > 0 and Y < 0:
    print("El punto (" + str(X) + "," + str(Y) + ") se encuentra en el cuadrante IV")
elif X < 0 and Y > 0:
    print("El punto (" + str(X) + "," + str(Y) + ") se encuentra en el cuadrante II")
elif X < 0 and Y < 0:
    print("El punto (" + str(X) + "," + str(Y) + ") se encuentra en el cuadrante III")
else:
    print("El punto (" + str(X) + "," + str(Y) + ") se encuentra en el origen o sobre un eje")

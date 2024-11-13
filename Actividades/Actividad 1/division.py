#González Garcés Rodrigo

contador = int(0);

dividendo =  int(input("valor del dividendo: "));
divisor = int(input("valor del divisor: "));

dividendo = dividendo - divisor;

while (dividendo >= 0):
    contador = contador + 1;
    dividendo = dividendo - divisor;

print("La division es igual a: " + str(contador));

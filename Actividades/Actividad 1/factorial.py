#González Garcés Rodrigo 3BV2

def factorial(n):
    f = 1
    for i in range(1, n+1):
        f = f * i
    return f

n = int(input("Introduce un número para calcular su factorial: "))

resultado = factorial(n)
print(f"El factorial de {n} es: {resultado}")

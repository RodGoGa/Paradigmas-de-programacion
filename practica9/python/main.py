# Excepción personalizada para depósitos inválidos
class DepositoInvalidoException(Exception):
    def __init__(self, mensaje):
        super().__init__(mensaje)

# Excepción personalizada para retiros inválidos
class RetiroInvalidoException(Exception):
    def __init__(self, mensaje):
        super().__init__(mensaje)

# Excepción personalizada para fondos insuficientes
class FondosInsuficientesException(Exception):
    def __init__(self, mensaje):
        super().__init__(mensaje)

# Clase CuentaBancaria
class CuentaBancaria:
    def __init__(self, numero_cuenta, saldo_inicial):
        self.numero_cuenta = numero_cuenta
        self.saldo = saldo_inicial

    def depositar(self, cantidad):
        if cantidad < 0:
            raise DepositoInvalidoException("El monto a depositar no puede ser negativo.")
        self.saldo += cantidad

    def retirar(self, cantidad):
        if cantidad < 0:
            raise RetiroInvalidoException("El monto a retirar no puede ser negativo.")
        if cantidad > self.saldo:
            raise FondosInsuficientesException("Fondos insuficientes para realizar el retiro.")
        self.saldo -= cantidad

    def obtener_saldo(self):
        return self.saldo

def main():
    cuenta = CuentaBancaria("1234567890", 1000.0)  # Saldo inicial de 1000.0
    print("Bienvenido al sistema de gestión de cuentas bancarias.")
    print(f"Número de cuenta: {cuenta.numero_cuenta}")
    print(f"Saldo inicial: ${cuenta.obtener_saldo()}")

    while True:
        print("\nSeleccione una operación:")
        print("1. Depositar")
        print("2. Retirar")
        print("3. Salir")
        opcion = input("Opción: ")

        try:
            if opcion == "1":
                cantidad = float(input("Ingrese el monto a depositar: "))
                cuenta.depositar(cantidad)
                print(f"Depósito exitoso. Saldo actual: ${cuenta.obtener_saldo():.2f}")
            elif opcion == "2":
                cantidad = float(input("Ingrese el monto a retirar: "))
                cuenta.retirar(cantidad)
                print(f"Retiro exitoso. Saldo actual: ${cuenta.obtener_saldo():.2f}")
            elif opcion == "3":
                print("Gracias por usar el sistema. ¡Hasta luego!")
                break
            else:
                print("Opción inválida. Intente de nuevo.")
        except (DepositoInvalidoException, RetiroInvalidoException, FondosInsuficientesException) as e:
            print(f"Error: {e}")

if __name__ == "__main__":
    main()

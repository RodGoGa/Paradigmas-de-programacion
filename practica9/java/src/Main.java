import java.util.Scanner;

// Excepción personalizada para depósitos inválidos
class DepositoInvalidoException extends Exception {
    public DepositoInvalidoException(String mensaje) {
        super(mensaje);
    }
}

// Excepción personalizada para retiros inválidos
class RetiroInvalidoException extends Exception {
    public RetiroInvalidoException(String mensaje) {
        super(mensaje);
    }
}

// Excepción personalizada para fondos insuficientes
class FondosInsuficientesException extends Exception {
    public FondosInsuficientesException(String mensaje) {
        super(mensaje);
    }
}

// Clase CuentaBancaria
class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) throws DepositoInvalidoException {
        if (cantidad < 0) {
            throw new DepositoInvalidoException("El monto a depositar no puede ser negativo.");
        }
        saldo += cantidad;
    }

    public void retirar(double cantidad) throws RetiroInvalidoException, FondosInsuficientesException {
        if (cantidad < 0) {
            throw new RetiroInvalidoException("El monto a retirar no puede ser negativo.");
        }
        if (cantidad > saldo) {
            throw new FondosInsuficientesException("Fondos insuficientes para realizar el retiro.");
        }
        saldo -= cantidad;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria("1234567890", 1000.0); // Saldo inicial de 1000.0
        boolean continuar = true;

        System.out.println("Bienvenido al sistema de gestión de cuentas bancarias.");
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo inicial: $" + cuenta.getSaldo());

        while (continuar) {
            System.out.println("\nSeleccione una operación:");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    try {
                        cuenta.depositar(deposito);
                        System.out.println("Depósito exitoso. Saldo actual: $" + cuenta.getSaldo());
                    } catch (DepositoInvalidoException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    try {
                        cuenta.retirar(retiro);
                        System.out.println("Retiro exitoso. Saldo actual: $" + cuenta.getSaldo());
                    } catch (RetiroInvalidoException | FondosInsuficientesException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}

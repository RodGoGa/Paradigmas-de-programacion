/**
 *
 * @author Rodrigo González Garcés 3BV2
 */
import java.util.Scanner;
public class horas {
    public static void main(String[] args) {
        System.out.println("Programa para calcular el pago de un empleado");
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Ingresa las horas trabajadas: ");
        int horas = Integer.parseInt(scanner.nextLine());
        System.out.println();
        System.out.print("Ingresa el sueldo por hora: ");
        double sueldo = Double.parseDouble(scanner.nextLine());
        System.out.println();

        if (horas<=40){
            System.out.println("Ganaste $" + sueldo*horas + " por trabajar " + horas + " horas");
        } else {
            int horasExtra = horas-40;
            double sueldoExtra = (sueldo*1.5);
            double pagoRegular = sueldo*40;
            double pagoExtra = sueldoExtra*horasExtra;

            System.out.println("Ganaste $" + pagoRegular + " por trabajar 40 horas");
            System.out.println("Pero por trabajar " + horasExtra + " horas extra ganas $" + pagoExtra);
            System.out.println("Terminaste ganando: $" + (pagoRegular+pagoExtra));
        }
    }
}

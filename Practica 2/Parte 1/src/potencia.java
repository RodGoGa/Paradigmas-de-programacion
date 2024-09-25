/**
 *
 * @author Rodrigo González Garcés 3BV2
 */
import java.util.Scanner;

public class potencia {
    public static void main(String[] args) {
        System.out.println("Programa que te indica la potencia más próxima a un número");
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        System.out.print("Ingresa un número natural: ");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.println();

        int potencia = 1;
        int cuenta = 0;
        while (potencia * 2 < numero) {
            potencia *= 2;
            cuenta++;
        }
        System.out.println("La potencia mas cercana es 2^" + cuenta + " = " + potencia);
    }
}

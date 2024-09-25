/**
 *
 * @author Rodrigo González Garcés 3BV2
 */
import java.util.Scanner;

public class coordenadas {
    public static void main(String[] args) {

        System.out.println("Programa que indica en que cuadrante del plano cartesiano se encuentra un punto");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la coordenada en X: ");
        int X = Integer.parseInt(scanner.nextLine());
        System.out.println();

        System.out.print("Ingresa la coordenada en Y: ");
        int Y = Integer.parseInt(scanner.nextLine());
        System.out.println();

        if (X > 0 && Y > 0) {
            System.out.println("El punto (" + X + "," + Y + ") se encuentra en el cuadrante I");
        }
        else if (X > 0 && Y < 0) {
            System.out.println("El punto (" + X + "," + Y + ") se encuentra en el cuadrante VI");
        }
        else if (X < 0 && Y > 0) {
            System.out.println("El punto (" + X + "," + Y + ") se encuentra en el cuadrante II");
        }
        else if (X < 0 && Y < 0) {
            System.out.println("El punto (" + X + "," + Y + ") se encuentra en el cuadrante III");
        }
        else {
            System.out.println("El punto (" + X + "," + Y + ") se encuentra en el origen o sobre un eje");
        }
    }
}

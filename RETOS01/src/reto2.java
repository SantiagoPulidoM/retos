import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el peso del bebé en kg: ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese la edad del bebé en meses: ");
        int meses = scanner.nextInt();

        double dosisVacuna = peso + 10.0/meses * 10 * 8;

        System.out.println("La dosis de la vacuna es de " + dosisVacuna + " ml.");
        scanner.close();
    }
}
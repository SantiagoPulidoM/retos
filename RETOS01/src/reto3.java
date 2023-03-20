import java.util.Random;
import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elige Cara o Sello: ");
        String eleccion = scanner.nextLine();
        
        // Lanzamiento de la moneda
        Random rand = new Random();
        int resultadoLanzamiento = rand.nextInt(2); // Genera un número aleatorio entre 0 y 1

        // Determinar el resultado del juego
        String resultadoJuego;
        if (resultadoLanzamiento == 0) {
            resultadoJuego = "Cara";
        } else {
            resultadoJuego = "Sello";
        }

        if (eleccion.equalsIgnoreCase(resultadoJuego)) {
            System.out.println("Ganaste! La moneda cayó en " + resultadoJuego + ".");
        } else {
            System.out.println("Perdiste. La moneda cayó en " + resultadoJuego + ".");
        }
        scanner.close();
    }
}
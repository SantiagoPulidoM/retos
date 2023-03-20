import java.util.Scanner;
import java.util.Random;

public class reto4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int opcionComputadora = random.nextInt(3); // 0 es piedra, 1 es papel, 2 es tijera
        String[] opciones = {"piedra", "papel", "tijera"};

        System.out.println("Juguemos a Piedra, Papel o Tijera! Ingresa tu opción (piedra, papel o tijera): ");
        String opcionJugador = sc.nextLine().toLowerCase();

        System.out.println("La computadora eligió " + opciones[opcionComputadora] + ".");

        if (opcionJugador.equals(opciones[opcionComputadora])) {
            System.out.println("¡Es un empate!");
        } else if (opcionJugador.equals("piedra")) {
            if (opciones[opcionComputadora].equals("papel")) {
                System.out.println("¡Perdiste! El papel envuelve la piedra.");
            } else {
                System.out.println("¡Ganaste! La piedra aplasta las tijeras.");
            }
        } else if (opcionJugador.equals("papel")) {
            if (opciones[opcionComputadora].equals("tijera")) {
                System.out.println("¡Perdiste! Las tijeras cortan el papel.");
            } else {
                System.out.println("¡Ganaste! El papel envuelve la piedra.");
            }
        } else if (opcionJugador.equals("tijera")) {
            if (opciones[opcionComputadora].equals("piedra")) {
                System.out.println("¡Perdiste! La piedra aplasta las tijeras.");
            } else {
                System.out.println("¡Ganaste! Las tijeras cortan el papel.");
            }
        } else {
            System.out.println("Opción inválida. Ingresa piedra, papel o tijera.");
        }
        sc.close();
    }
}
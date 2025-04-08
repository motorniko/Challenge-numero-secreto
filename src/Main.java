import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gracias por jugar. ¡Hasta la próxima!");
        System.out.println("ADIVINA EL NUMERO SECRETO");

        int i;
        int numAleatorio = (int) (Math.random() * 100 + 1);

        for (i = 0; i < 5; i++) {
            System.out.println("DISPONIBLES: " + (5 - i) + " VIDAS");

            Scanner teclado = new Scanner(System.in);

            System.out.println("Introduce un número entre 1 y 100");
            int numIngresado = teclado.nextInt();

                if (numIngresado == numAleatorio) {
                    System.out.println("¡HAS ENCONTRADO EL NUMERO SECRETO!");
                    break;

                } else if (numIngresado < numAleatorio) {
                    System.out.println("El número secreto es mayor que " + numIngresado);
                } else {
                    System.out.println("El número secreto es menor que " + numIngresado);
                }
        }

        if (i == 5) {
            System.out.println("¡GAME OVER! te quedaste sin vidas el numero era:" + numAleatorio);
        }

        System.out.println("¿Quieres jugar de nuevo? (s/n)");

        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            main(args);
        } else {
            System.out.println("¡Hasta la próxima!");
        }
    }
}
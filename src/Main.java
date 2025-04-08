import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            System.out.println("Gracias por jugar. ¡Hasta la próxima!");
            System.out.println("ADIVINA EL NUMERO SECRETO");

            for (int i = 0; i < 5; i++) {
                System.out.println("TE QUEDAN " + (5 - i) + " VIDAS");

                Scanner teclado = new Scanner(System.in);
                int numAleatorio = (int) (Math.random() * 100 + 1);

                System.out.println("Introduce un número entre 1 y 100");
                int numIngresado = teclado.nextInt();

                if (numIngresado == numAleatorio) {
                    System.out.println("¡Has acertado el número secreto!");
                } else if (numIngresado < numAleatorio) {
                    System.out.println("El número secreto es mayor que " + numIngresado);
                } else {
                    System.out.println("El número secreto es menor que " + numIngresado);
                }
            }

            System.out.println("VIDAS GAME OVER te has quedado sin vidas");
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
package clase6.clase7;

import java.util.Scanner;

public class Ejerccio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, suma = 0;

        // Ciclo for "infinito"
        for (;;) {
            System.out.print("Ingrese un número entero (0 para terminar): ");

            numero = sc.nextInt();

            if (numero == 0) {
                break; // salir del ciclo cuando el usuario ingresa 0
            }

            suma += numero;

        }
        System.out.println("La suma total es: " + suma);

        sc.close();
    }
}

package clase6.clase7;

import java.util.Scanner;

public class Ejerccio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num, suma = 0, media;
        int contador = 0;

        System.out.print("Ingrese un número positivo (negativo para terminar): ");
        num = sc.nextDouble();

        while (num > 0) {
            suma += num;
            contador++;

            System.out.print("Ingrese otro número positivo (negativo para terminar): ");
            num = sc.nextDouble();
        }

        if (contador > 0) {
            media = suma / contador;
            System.out.println("La media es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos");
        }

        sc.close();
    }
}

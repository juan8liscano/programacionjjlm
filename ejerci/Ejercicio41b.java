package ejerci;

import java.util.Scanner;

public class Ejercicio41b {
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pedir la temperatura al usuario
        System.out.println("Digite la temperatura:");
        double temperatura = sc.nextDouble();

        // Condicional
        if (temperatura > 100) {
            System.out.println("Por encima del punto de ebullición del agua");
        } else {
            System.out.println("Por debajo del punto de ebullición del agua");
        }

        sc.close();
    }
}

package ejerci;

import java.util.Scanner;

public class ejercicio44 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite un número:");
        double numero = sc.nextDouble();

        if (numero < 0) {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo");
        } else {
            double raiz = Math.sqrt(numero);
            System.out.println("La raíz cuadrada es: " + raiz);
        }

        sc.close();
    }
}

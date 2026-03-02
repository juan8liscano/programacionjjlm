package ejerci;

import java.util.Scanner;

public class Ejercicio42 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el primer número:");
        double num1 = sc.nextDouble();

        System.out.println("Digite el segundo número:");
        double num2 = sc.nextDouble();

        if (num1>num2) {
            System.out.println("El primer número es el mayor");
        } else if (num1 < num2) {
            System.out.println("El primer número es el más pequeño");
        } else {
            System.out.println("Ambos números son iguales");
        }

        sc.close();
    }
    
}

package ejerci;

import java.util.Scanner;

public class Ejercicio48 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el primer número:");
        int num1 = sc.nextInt();

        System.out.println("Digite el segundo número:");
        int num2 = sc.nextInt();

        if (num2 != 0 && num1 % num2 == 0) {
            System.out.println("El segundo número es divisor del primero");
        } else if (num1 != 0 && num2 % num1 == 0) {
            System.out.println("El primer número es divisor del segundo");
        } else {
            System.out.println("Ninguno es divisor del otro");
        }

        sc.close();
    }
}

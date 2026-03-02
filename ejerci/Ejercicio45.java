package ejerci;

import java.util.Scanner;

public class Ejercicio45 {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite un número:");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        sc.close();
    }

}

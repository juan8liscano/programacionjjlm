package ejerci;

import java.util.Scanner;

public class Ejercicio41c {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalPositivos = 0;
        double totalNegativos = 0;

        System.out.println("Digite un número:");
        double numero = sc.nextDouble();

        if (numero > 0) {
            totalPositivos = totalPositivos + numero;
        } else {
            totalNegativos = totalNegativos + numero;
        }

        System.out.println("Total de positivos: " + totalPositivos);
        System.out.println("Total de negativos: " + totalNegativos);

        sc.close();
     }
}

package ejerci;

import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el primer número:");
        int num1 = sc.nextInt();

        System.out.println("Digite el segundo número:");
        int num2 = sc.nextInt();

        System.out.println("Digite el tercer número:");
        int num3 = sc.nextInt();

        int central;

        if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
            central = num1;
        } else if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
            central = num2;
        } else {
            central = num3;
        }

        System.out.println("El número central es: " + central);

        sc.close();
    }
}

package ejerci;

import java.util.Scanner;

public class Ejercicio41d {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el valor de x:");
        int x = sc.nextInt();

        System.out.println("Digite el valor de y:");
        int y = sc.nextInt();

        System.out.println("Digite el valor de z:");
        int z = sc.nextInt();

        if (x > y && z < 20) {
            System.out.println("Digite el valor de p");
           int  p = sc.nextInt();
           System.out.println("Digite el valor de p" + p);
        } else {
            System.out.println("No se cumplen las condiciones");
        }
    
        sc.close();
    }
}

package clase6;

import java.util.Scanner;

public class Ejerccio412 {
    ublic static void mpain(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2;
        int seleccion;
        System.out.println("Digite numero1");
        num1 = sc.nextDouble();
        System.out.println("Digite numero2");
        num2 = sc.nextDouble();
        System.out.println("Digite lo seleccion 1,2.3");
        seleccion = sc.nextInt();

        if (seleccion == 1) {

            System.out.println("la suma"  + (num1 + num2));
        } else {
            if (seleccion == 2) {

                System.out.println("la multipica" + (num1 * num2));

            } else {

                if (seleccion == 3) {

                    System.out.println("la division" + (num1 / num2));

                } else {
                    System.out.println("opcion no valida");

                }
            } // else

        }

        sc.close();

    }
}
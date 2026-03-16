package clase6.clase7;

import java.util.Scanner;

public class Ejerccio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Ingrese un número para ver su tabla: ");
        num = sc.nextInt();

        System.out.println("Tabla del " + num + ":");

        for (int i = 5; i <= 10; i++) {
            int resultado = i * num;
            System.out.println(i + " x " + num + " = " + resultado);
        }

        
        sc.close();
    }
}

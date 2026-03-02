package ejerci;

import java.util.Scanner;

public class Ejercicio47 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int menos40 = 40;
        int entre40y50 = 45;
        int entre50y60 = 55;
        int mayorIgual60 = 60;

        System.out.println("¿Cuántos alumnos va a ingresar?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite el peso del alumno " + i + ":");
            double peso = sc.nextDouble();

            if (peso < 40) {
                menos40++;
            } else if (peso >= 40 && peso <= 50) {
                entre40y50++;
            } else if (peso > 50 && peso < 60) {
                entre50y60++;
            } else {
                mayorIgual60++;
            }
        }

        System.out.println("Alumnos con menos de 40 kg: " + menos40);
        System.out.println("Alumnos entre 40 y 50 kg: " + entre40y50);
        System.out.println("Alumnos entre 50 y 60 kg: " + entre50y60);
        System.out.println("Alumnos con 60 kg o más: " + mayorIgual60);

        sc.close();
    }
}

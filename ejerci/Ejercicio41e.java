package ejerci;

import java.util.Scanner;

public class Ejercicio41e {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite la distancia:");
        double distancia = sc.nextDouble();

        double tiempo = 0; 

        if (distancia > 20 && distancia < 35) {
            System.out.println("Digite el valor del tiempo:");
            tiempo = sc.nextDouble();
        } else {
            System.out.println("La distancia no está en el rango permitido");
        }
     System.out.println("Tiempo:  + tiempo");

        sc.close();
    }
}

package ejerci;

import java.util.Scanner;

public class Ejercicio41e {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // perdir distancia
        System.out.println("Digite la distancia:");
        double distancia = sc.nextDouble();
        //codicional
        if (distancia > 20 && distancia < 35) {
            System.out.println("Digite el valor del tiempo:");
            double tiempo = 20;
            tiempo = sc.nextDouble();
             System.out.println("Digite el valor del tiempo es:" + tiempo);
        } else {
            System.out.println("La distancia no está en el rango permitido");
        }
     
        sc.close();
    }
}

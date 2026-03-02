package ejerci;

import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el día:");
        int dia = sc.nextInt();

        System.out.println("Digite el mes:");
        int mes = sc.nextInt();

        System.out.println("Digite el año:");
        int año = sc.nextInt();

        dia = dia + 1;

        if (mes == 2 && dia > 28) {
            dia = 1;
            mes++;
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            dia = 1;
            mes++;
        } else if (dia > 31) {
            dia = 1;
            mes++;
        }

        if (mes > 12) {
            mes = 1;
            año++;
        }

        System.out.println("La fecha del día siguiente es: " 
                + dia + "/" + mes + "/" + año);

        sc.close();
    }
}

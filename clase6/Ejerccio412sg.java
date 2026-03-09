package clase6;

import java.util.Scanner;

public class Ejerccio412sg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2;
        int seleccion;
        System.out.println("Digite numero1");
        num1 = sc.nextDouble();
        System.out.println("Digite numero2");
        num2 = sc.nextDouble();
        System.out.println("Digite lo seleccion 1,2.3");
        seleccion = sc.nextInt();

        switch (seleccion) {
            case 1:
                System.out.println("la suma es"  + (num1 + num2));
                break;
        
                case 2:
                System.out.println("la multipicacion es"  + (num1 * num2));
                break;
                case 3:
                System.out.println("la division es"  + (num1 / num2));
                break;
            default:
                System.out.println("opcion no valida");
                break;
        }

        sc.close();
    }
}

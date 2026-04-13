import java.util.Scanner;

public class fase5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rutasConAlerta = 0;

        for (int ruta = 1; ruta <= 3; ruta++) {
            System.out.println("\n--- Análisis de la Ruta " + ruta + " ---");

            System.out.print("Número de pasajeros: ");
            int pasajeros = scanner.nextInt();

            System.out.print("Número de vueltas: ");
            int vueltas = scanner.nextInt();

            System.out.print("Minutos de retraso: ");
            int retraso = scanner.nextInt();

            System.out.print("Recaudo del día: ");
            double recaudo = scanner.nextDouble();

            // 🔍 Condiciones de alerta
            boolean alertaDemanda = pasajeros < 500;
            boolean alertaVueltas = vueltas > 20;
            boolean alertaRetraso = retraso > 90;
            boolean alertaRecaudo = recaudo < (pasajeros * 1500 * 0.70);

            boolean tieneAlerta = alertaDemanda || alertaVueltas || alertaRetraso || alertaRecaudo;

            if (!tieneAlerta) {
                System.out.println("Ruta " + ruta + ": OK - Sin irregularidades");
            } else {
                rutasConAlerta++;
                System.out.println("Ruta " + ruta + ": ⚠ ALERTA DETECTADA");

                if (alertaDemanda) {
                    System.out.println("- Baja demanda de pasajeros");
                }
                if (alertaVueltas) {
                    System.out.println("- Exceso de vueltas");
                }
                if (alertaRetraso) {
                    System.out.println("- Retrasos altos");
                }
                if (alertaRecaudo) {
                    System.out.println("- Bajo recaudo");
                }
            }
        }

        //  Diagnóstico global
        System.out.println("\n=== DIAGNÓSTICO GENERAL ===");

        if (rutasConAlerta == 0) {
            System.out.println("Operación del día: NORMAL");
        } else if (rutasConAlerta == 1) {
            System.out.println("Operación del día: REVISIÓN MENOR");
        } else if (rutasConAlerta == 2) {
            System.out.println("Operación del día: REVISIÓN URGENTE");
        } else {
            System.out.println("Operación del día: CRÍTICA - Notificar a Movilidad");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class fase6 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n=== SISTEMA MIO CALI ===");
            System.out.println("1. Cobrar tarifa");
            System.out.println("2. Control de ruta");
            System.out.println("3. Reporte y alertas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    fase1();
                    break;
                case 2:
                    fase2();
                    break;
                case 3:
                    fase4y5();
                    break;
                case 0:
                    System.out.println("Cerrando sistema...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);
    }

    // FASE 1
    public static void fase1() {
        System.out.print("Hora: ");
        int hora = scanner.nextInt();

        System.out.print("Tipo (1 Normal, 2 Estudiante, 3 Adulto mayor, 4 Discapacitado): ");
        int tipo = scanner.nextInt();

        int tarifaBase = 0;
        double descuento = 0;
        boolean horacali = (hora >= 9 && hora <= 16);

        switch (tipo) {
            case 1:
                tarifaBase = 3000;
                break;
            case 2:
                tarifaBase = 1500;
                if (horacali)
                    descuento = tarifaBase * 0.10;
                break;
            case 3:
                tarifaBase = 0;
                break;
            case 4:
                tarifaBase = 0;
                break;
            default:
                System.out.println("Tipo inválido");
                return;
        }

        double total = tarifaBase - descuento;

        System.out.println("Total a pagar: $" + total);
    }

    // FASE 2
    public static void fase2() {
        int pasajeros = 0;

        for (int i = 1; i <= 25; i++) {
            System.out.println("\nParada " + i);
            System.out.print("Suben (-1 para terminar): ");
            int suben = scanner.nextInt();

            if (suben == -1)
                break;

            System.out.print("Bajan: ");
            int bajan = scanner.nextInt();

            if (bajan > pasajeros) {
                System.out.println("Error");
            } else if (pasajeros + suben - bajan > 80) {
                System.out.println("Excede capacidad");
            } else {
                pasajeros += suben - bajan;
            }

            if (pasajeros == 80) {
                System.out.println("AFORO MAXIMO");
            } else if (pasajeros >= 48) {
                System.out.println("BUS A TOPE");
            } else {
                System.out.println("NORMAL");
            }
        }
    }

    // FASE 4 y 5 juntos
    public static void fase4y5() {
        int totalPasajeros = 0;
        double totalRecaudo = 0;
        int rutasConAlerta = 0;

        for (int ruta = 1; ruta <= 3; ruta++) {
            System.out.println("\nRuta " + ruta);

            System.out.print("Pasajeros: ");
            int pasajeros = scanner.nextInt();

            System.out.print("Vueltas: ");
            int vueltas = scanner.nextInt();

            System.out.print("Retraso: ");
            int retraso = scanner.nextInt();

            int pctNormal;
            System.out.print("Porcentaje normales: ");
            pctNormal = scanner.nextInt();

            int pctEst = 100 - pctNormal;

            double recaudo = (pasajeros * vueltas) *
                    ((pctNormal * 3000 + pctEst * 1500) / 100.0);

            totalPasajeros += pasajeros;
            totalRecaudo += recaudo;

            // ALERTAS
            boolean alerta = pasajeros < 500 || vueltas > 20 || retraso > 90 || recaudo < (pasajeros * 1500 * 0.7);

            if (alerta) {
                rutasConAlerta++;
                System.out.println("Ruta con alerta");
            } else {
                System.out.println("Ruta OK");
            }
        }

        System.out.println("\nTotal de pasajeros: " + totalPasajeros);
        System.out.println("Total de recaudo: $" + totalRecaudo);

        if (rutasConAlerta == 0) {
            System.out.println("Operación NORMAL");
        } else if (rutasConAlerta == 1) {
            System.out.println("REVISIÓN MENOR");
        } else if (rutasConAlerta == 2) {
            System.out.println("REVISIÓN URGENTE");
        } else {
            System.out.println("CRÍTICA");
        }

        scanner.close();
    }
}

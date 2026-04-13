import java.util.Scanner;

public class fse3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("=== SISTEMA MIO CALI ===");
            System.out.println("1. Cobrar tarifa");
            System.out.println("2. Iniciar control de ruta");
            System.out.println("3. Reporte del día");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Llamar a la lógica de la Fase 1 (cobro de tarifa)
                    System.out.println("Ejecutando Fase 1: Cobro de tarifa...");
                    // Aquí incluirías la llamada al método de Fase 1
                    break;
                case 2:
                    // Llamar a la lógica de la Fase 2 (control de ruta)
                    System.out.println("Ejecutando Fase 2: Control de ruta...");
                    // Aquí incluirías la llamada al método de Fase 2
                    break;
                case 3:
                    // Llamar a la lógica de las Fases 4 y 5 (reporte y alertas)
                    System.out.println("Ejecutando Fase 4 y 5: Reporte del día y alertas...");
                    // Aquí incluirías la llamada a esos métodos
                    break;
                case 0:
                    System.out.println("Cerrando sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        scanner.close();
    }

}

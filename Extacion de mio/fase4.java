import java.util.Scanner;

public class fase4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalPasajerosDia = 0;
        double totalRecaudoDia = 0;
        int totalVueltas = 0;
        int maxPasajeros = 0;
        int minPasajeros = Integer.MAX_VALUE;
        String rutaMasConcurrida = "";
        String rutaMenosConcurrida = "";
        double maxRecaudo = 0;
        String rutaMayorRecaudo = "";
        
        for (int ruta = 1; ruta <= 3; ruta++) {
            System.out.println("--- Datos de la ruta " + ruta + " ---");
            System.out.print("Número de pasajeros: ");
            int pasajeros = scanner.nextInt();
            
            System.out.print("Número de vueltas: ");
            int vueltas = scanner.nextInt();
            
            System.out.print("Porcentaje de pasajeros normales: ");
            int pctNormal = scanner.nextInt();
            
            int pctEstudiante = 100 - pctNormal;
            
            double tarifaNormal = 3000;
            double tarifaEstudiante = 1500;
            
            double recaudo = (pasajeros * vueltas) * ((pctNormal * tarifaNormal + pctEstudiante * tarifaEstudiante) / 100.0);
            
            totalPasajerosDia += pasajeros;
            totalRecaudoDia += recaudo;
            totalVueltas += vueltas;
            
            if (pasajeros > maxPasajeros) {
                maxPasajeros = pasajeros;
                rutaMasConcurrida = "Ruta " + ruta;
            }
            if (pasajeros < minPasajeros) {
                minPasajeros = pasajeros;
                rutaMenosConcurrida = "Ruta " + ruta;
            }
            if (recaudo > maxRecaudo) {
                maxRecaudo = recaudo;
                rutaMayorRecaudo = "Ruta " + ruta;
            }
            
            System.out.println("Recaudo de la ruta: $" + recaudo);
        }
        
        double promedioPasajeros = totalPasajerosDia / 3.0;
        
        System.out.println("\nREPORTE FINAL DEL DÍA");
        System.out.println("Total pasajeros del día: " + totalPasajerosDia);
        System.out.println("Total recaudo del día: $" + totalRecaudoDia);
        System.out.println("Total vueltas: " + totalVueltas);
        System.out.println("Ruta más concurrida: " + rutaMasConcurrida + " (" + maxPasajeros + " pasajeros)");
        System.out.println("Ruta menos concurrida: " + rutaMenosConcurrida + " (" + minPasajeros + " pasajeros)");
        System.out.println("Ruta de mayor recaudo: " + rutaMayorRecaudo + " ($" + maxRecaudo + ")");
        System.out.println("Promedio de pasajeros: " + promedioPasajeros);
        
        scanner.close();
    }
    
}

import java.util.Scanner;

public class fase2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int capacidadMaxima = 80;
        int pasajerosActuales = 0;
        int totalSubieron = 0;
        int totalBajaron = 0;
        int parada = 1;
        boolean rutaActiva = true;
        
        while (parada <= 25 && rutaActiva) {
            System.out.println("=== PARADA " + parada + " ===");
            System.out.println("Pasajeros en el bus: " + pasajerosActuales);
            
            System.out.print("Cuántos suben: ");
            int suben = scanner.nextInt();
            
            if (suben == -1) {
                rutaActiva = false;
            } else {
                System.out.print("Cuántos bajan: ");
                int bajan = scanner.nextInt();
                
                if (bajan > pasajerosActuales) {
                    System.out.println("Error: No pueden bajar más de los que hay.");
                } else if (pasajerosActuales + suben - bajan > capacidadMaxima) {
                    System.out.println("Error: No se puede superar el aforo máximo.");
                } else {
                    pasajerosActuales += suben - bajan;
                    totalSubieron += suben;
                    totalBajaron += bajan;
                }
            }
            
            int porcentaje = (pasajerosActuales * 100) / capacidadMaxima;
            
            String estado;
            if (pasajerosActuales == capacidadMaxima) {
                estado = "AFORO MAXIMO";
            } else if (porcentaje >= 60) {
                estado = "BUS LLENO";
            } else {
                estado = "NORMAL";
            }
            
            System.out.println("Estado del bus: " + estado);
            parada++;
        }
        
        System.out.println("\nRESUMEN DE RUTA COMPLETADA");
        System.out.println("Total subieron: " + totalSubieron);
        System.out.println("Total bajaron: " + totalBajaron);
        System.out.println("Pasajeros al final: " + pasajerosActuales);
        
        scanner.close();
    }
    
}

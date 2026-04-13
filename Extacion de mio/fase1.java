import java.util.Scanner;

public class fase1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la hora de abordaje (formato 24h): ");
        int hora = scanner.nextInt();
        
        System.out.print("Ingrese el tipo de pasajero (1: Normal, 2: Estudiante, 3: Adulto mayor, 4: Discapacitado): ");
        int tipo = scanner.nextInt();
        
        String nombreTipo = "";
        int tarifaBase = 0;
        double descuento = 0;
        
        boolean esHoraValle = (hora >= 9 && hora <= 16);
        
        switch (tipo) {
            case 1:
                nombreTipo = "Normal";
                tarifaBase = 3000;
                break;
            case 2:
                nombreTipo = "Estudiante";
                tarifaBase = 1500;
                if (esHoraValle) {
                    descuento = tarifaBase * 0.10;
                }
                break;
            case 3:
                nombreTipo = "Adulto mayor";
                tarifaBase = 0;
                break;
            case 4:
                nombreTipo = "Discapacitado";
                tarifaBase = 0;
                break;
            default:
                System.out.println("Tipo inválido.");
                scanner.close();
                return;
        }
        
        double totalPagar = tarifaBase - descuento;
        
        System.out.println("\nTIQUETE MIO - CALI");
        System.out.println("Hora de abordaje: " + hora);
        System.out.println("Tipo de usuario: " + nombreTipo);
        System.out.println("Tarifa base: $" + tarifaBase);
        System.out.println("Descuento: $" + descuento);
        System.out.println("TOTAL A PAGAR: $" + totalPagar);
        
        scanner.close();
    }
}

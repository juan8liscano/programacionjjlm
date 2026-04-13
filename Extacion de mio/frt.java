public class frt {
    import java.util.Scanner;

    public static void main(String[] args) {

        try (Scanner Sc = new Scanner(System.in)) {
            int opcion = -1;

            while (opcion != 0) {

                System.out.println("\n=== SISTEMA MIO CALI ===");
                System.out.println("1. Cobrar tarifa");
                System.out.println("2. Control de ruta");
                System.out.println("3. Reporte del dia + alertas");
                System.out.println("0. Salir");
                System.out.print("Seleccione: ");
                opcion = Sc.nextInt();

                switch (opcion) {

                    case 1:
                        // FASE 1
                        System.out.print("Hora (0-23): ");
                        int hora = Sc.nextInt();

                        System.out.print("Tipo (1-4): ");
                        int tipo = Sc.nextInt();

                        double tarifaBase = 0;
                        double descuento = 0;
                        String nombreTipo = "";

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
                                System.out.println("Tipo invalido");
                        }

                        double total = tarifaBase - descuento;

                        System.out.println("\nTIQUETE");
                        System.out.println("Tipo: " + nombreTipo);
                        System.out.println("Total: $" + total);
                        break;

                    case 2:
                        // FASE 2
                        int pasajerosActuales = 0;
                        int parada = 1;

                        while (parada <= 25) {

                            System.out.println("\nPARADA " + parada);
                            System.out.print("Suben (-1 salir): ");
                            int suben = Sc.nextInt();

                            if (suben == -1) break;

                            System.out.print("Bajan: ");
                            int bajan = Sc.nextInt();

                            if (bajan > pasajerosActuales) {
                                bajan = pasajerosActuales;
                            }

                            if (pasajerosActuales + suben - bajan > 80) {
                                suben = 80 - pasajerosActuales + bajan;
                            }

                            pasajerosActuales = pasajerosActuales + suben - bajan;

                            System.out.println("Pasajeros actuales: " + pasajerosActuales);

                            parada++;
                        }
                        break;

                    case 3:
                        // FASE 4 + 5
                        int rutasConAlerta = 0;

                        for (int ruta = 1; ruta <= 3; ruta++) {

                            String nombreRuta = "";
                            if (ruta == 1) nombreRuta = "T31";
                            else if (ruta == 2) nombreRuta = "A10";
                            else nombreRuta = "P22A";

                            System.out.println("\nRuta " + nombreRuta);

                            System.out.print("Pasajeros: ");
                            int pasajeros = Sc.nextInt();

                            System.out.print("Vueltas: ");
                            int vueltas = Sc.nextInt();

                            System.out.print("Porcentaje normal: ");
                            int pctNormal = Sc.nextInt();

                            int pctEstudiante = 100 - pctNormal;

                            double recaudo = pasajeros *
                                    ((pctNormal / 100.0) * 3000 +
                                     (pctEstudiante / 100.0) * 1500);

                            boolean alertaDemanda = pasajeros < 500;
                            boolean alertaVueltas = vueltas > 20;
                            boolean alertaRecaudo = recaudo < (pasajeros * 1500 * 0.7);

                            boolean tieneAlerta = alertaDemanda || alertaVueltas || alertaRecaudo;

                            if (tieneAlerta) {
                                rutasConAlerta++;
                                System.out.println("ALERTA en " + nombreRuta);
                            } else {
                                System.out.println("OK en " + nombreRuta);
                            }
                        }

                        System.out.println("\nRutas con alerta: " + rutasConAlerta);

                        if (rutasConAlerta == 0)
                            System.out.println("Operacion NORMAL");
                        else if (rutasConAlerta == 1)
                            System.out.println("REVISION MENOR");
                        else if (rutasConAlerta == 2)
                            System.out.println("REVISION URGENTE");
                        else
                            System.out.println("CRITICA");

                        break;

                    case 0:
                        System.out.println("Cerrando...");
                        break;

                    default:
                        System.out.println("Opcion no valida");
                }
            }
        }
    }
}


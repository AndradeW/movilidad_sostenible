package movilidadsostenible;

import movilidadsostenible.service.Ciudad;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Ciudad ciudad = new Ciudad("Pasto Sostenible");
        ciudad.poblarDatosSimulados(); //TODO obtener de una DB, JSON u otra fuente

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n==== MENÚ MOVILIDAD SOSTENIBLE ====");
            System.out.println("1. Ver estaciones de bicicleta");
            System.out.println("2. Ver rutas disponibles");
            System.out.println("3. Registrar nuevo usuario");
            System.out.println("4. Simular viaje");
            System.out.println("5. Ver historial de un usuario");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1 -> ciudad.mostrarEstaciones();
                case 2 -> ciudad.mostrarRutas();
                case 3 -> ciudad.registrarUsuario(sc);
                case 4 -> ciudad.simularViaje(sc);
                case 5 -> ciudad.verHistorial(sc);
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }
}

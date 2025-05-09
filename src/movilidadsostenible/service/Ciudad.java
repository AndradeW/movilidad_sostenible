package movilidadsostenible.service;

import movilidadsostenible.model.Bicicleta;
import movilidadsostenible.model.Estacion;
import movilidadsostenible.model.Ruta;
import movilidadsostenible.model.Usuario;

import java.util.*;

public class Ciudad {
    private String nombre;
    private Map<String, Estacion> estaciones;
    private Map<Integer, Ruta> rutas;
    private List<Usuario> usuarios;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.estaciones = new HashMap<>();
        this.rutas = new HashMap<>();
        this.usuarios = new ArrayList<>();
    }

    public void poblarDatosSimulados() {
        // Estaciones y bicicletas
        List<Estacion> listaEstaciones = List.of(
                new Estacion("Estación Central", 10),
                new Estacion("Estación Norte", 8)
        );

        listaEstaciones.get(0).agregarBicicletas(List.of(new Bicicleta("B001"), new Bicicleta("B002")));

        listaEstaciones.get(1).agregarBicicleta(new Bicicleta("B003"));

        listaEstaciones.forEach(est -> estaciones.put(est.getNombre(), est));

        // Rutas
        List<Ruta> listaRutas = List.of(
                new Ruta("Centro", "Universidad", List.of("Parque Central", "Zona Comercial", "Biblioteca Pública"), 15.0, 0.5),
                new Ruta("Norte", "Universidad", List.of("Torre Empresarial", "Estadio", "Biblioteca Pública"), 20.0, 0.7),
                new Ruta("Centro", "Norte", List.of("Parque Central", "Estadio", "Torre Empresarial"), 18.0, 0.6)
        );

        for (int i = 0; i < listaRutas.size(); i++) {
            rutas.put(i + 1, listaRutas.get(i));
        }
    }


    public void mostrarEstaciones() {
        estaciones.forEach((nombre, est) -> {
            System.out.println("- " + nombre + ": " + est.getCantidadDisponible() + " bicicletas disponibles.");
        });
    }

    public void mostrarRutas() {
        rutas.forEach((k, ruta) -> {
            System.out.println(k + " : " + ruta.getOrigen() + " → " + ruta.getDestino() + " | Paradas: " + ruta.getParadas() + " | Tiempo: " + ruta.getTiempoEstimado() + " mins");
        });
    }

    public void registrarUsuario(Scanner sc) {
        System.out.print("Ingrese nombre del usuario: ");
        String nombre = sc.nextLine();
        System.out.print("Modo de transporte preferido (bici/bus/caminar): ");
        String modo = sc.nextLine();
        usuarios.add(new Usuario(nombre, modo));
        System.out.println("Usuario registrado con éxito.");
    }

    public void simularViaje(Scanner sc) {
        System.out.print("Nombre del usuario: ");
        String nombre = sc.nextLine();
        Optional<Usuario> user = usuarios.stream().filter(u -> u.getNombre().equalsIgnoreCase(nombre)).findFirst();
        if (user.isEmpty()) {
            System.out.println("Usuario no encontrado.");
            return;
        }

        mostrarRutas();
        System.out.print("Ingrese id de la ruta: ");
        int idRuta = sc.nextInt();
        Ruta ruta = rutas.get(idRuta);
        if (ruta != null) {
            user.get().agregarViaje("Viaje: " + ruta.getOrigen() + " a " + ruta.getDestino());
            System.out.println("Viaje simulado correctamente.");
        } else {
            System.out.println("Ruta no encontrada.");
        }
    }

    public void verHistorial(Scanner sc) {
        System.out.print("Nombre del usuario: ");
        String nombre = sc.nextLine();
        Optional<Usuario> user = usuarios.stream().filter(u -> u.getNombre().equalsIgnoreCase(nombre)).findFirst();
        if (user.isPresent()) {
            System.out.println("Historial de " + nombre + ":");
            user.get().getHistorial().forEach(System.out::println);
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }
}

package movilidadsostenible.model;

import java.util.*;

public class Usuario {
    private String nombre;
    private String modoPreferido;
    private List<String> historialDeViajes;

    public Usuario(String nombre, String modo) {
        this.nombre = nombre;
        this.modoPreferido = modo;
        this.historialDeViajes = new ArrayList<>();
    }

    public String getNombre() { return nombre; }

    public void agregarViaje(String viaje) {
        historialDeViajes.add(viaje);
    }

    public List<String> getHistorial() {
        return historialDeViajes;
    }
}

package movilidadsostenible.model;

import java.util.*;

public class Estacion {
    private String nombre;
    private int capacidadMaxima;
    private Set<Bicicleta> bicicletas;

    public Estacion(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidad;
        this.bicicletas = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarBicicleta(Bicicleta bici) {
        if (bicicletas.size() < capacidadMaxima) {
            bicicletas.add(bici);
        }
    }

    public void agregarBicicletas(List<Bicicleta> bicis) {
        for (Bicicleta bici : bicis) {
            agregarBicicleta(bici);
        }
    }


    public int getCantidadDisponible() {
        return bicicletas.size();
    }
}

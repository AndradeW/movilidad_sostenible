package movilidadsostenible.model;

import java.util.*;

public class Ruta {
    private String origen, destino;
    private List<String> paradas;
    private double tiempoEstimado;
    private double emisionesCO2;

    public Ruta(String origen, String destino, List<String> paradas, double tiempo, double co2) {
        this.origen = origen;
        this.destino = destino;
        this.paradas = paradas;
        this.tiempoEstimado = tiempo;
        this.emisionesCO2 = co2;
    }

    public String getOrigen() { return origen; }
    public String getDestino() { return destino; }
    public List<String> getParadas() { return paradas; }
    public double getTiempoEstimado() { return tiempoEstimado; }
}

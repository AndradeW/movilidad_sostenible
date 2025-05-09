package movilidadsostenible.model;

public class Bicicleta {
    private String id;
    private boolean enUso;

    public Bicicleta(String id) {
        this.id = id;
        this.enUso = false;
    }

    public String getId() {
        return id;
    }
}

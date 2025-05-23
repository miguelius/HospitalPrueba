package entity;

public abstract class Estudio {
    private boolean realizado;

    void realizar() {
        realizado = true;
    }

    public abstract String getNombre();

    public abstract String getDescripcion();
}

package entity;

public class Profesional {
    private int matricula;
    private String nombre;

    public Profesional(int matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }
}

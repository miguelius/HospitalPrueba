package entity;

public class Paciente {
    private int dni;
    private String nombre;

    public Paciente(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
}

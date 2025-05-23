package entity;

public class Receta {
    private int idReceta;
    private boolean procesado;
    private Estudio[] estudios;
    private Paciente paciente;

    public Receta(Paciente paciente, Estudio[] estudios) {
        this.paciente = paciente;
        this.estudios = estudios;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public boolean isProcesado() {
        return procesado;
    }

    public Estudio[] getEstudios() {
        return estudios;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void procesar() {
        procesado = true;
    }
}

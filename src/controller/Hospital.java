package controller;

import entity.Estudio;
import entity.Paciente;
import entity.Profesional;
import entity.Receta;

import java.util.Map;
import java.util.List;

public class Hospital {
    private final String nombre;
    Map<Integer, Profesional> profesionales;
    Map<Integer, Paciente> pacientes;
    List<Receta> recetas;

    public Hospital(String nombre) {
        this.nombre = nombre;
    }

    public Profesional registrarProfesional(String nombre, int matricula) {
        if (profesionales.containsKey(matricula)) {
            throw new RuntimeException("No se puede crear un profesional con una matricula repetida.");
        }
        Profesional prof = new Profesional(matricula, nombre);
        profesionales.put(matricula, prof);
        return prof;
    }

    public Paciente registrarPaciente(String nombre, int dni) {
        if (pacientes.containsKey(dni)) {
            throw new RuntimeException("No se puede crear un paciente con un dni repetido.");
        }
        Paciente paciente = new Paciente(dni, nombre);
        pacientes.put(dni, paciente);
        return paciente;
    }

    public Receta cargarReceta(Profesional profesional, Paciente paciente, Estudio[] estudios) {
        // si existe el profesional
        // si existe el paciente
        // agregar receta a la colección de recetas
        new Receta(paciente, estudios);
    }

    public void procesar(Receta receta) {
        for (Receta rec : recetas) {
            if (rec.getIdReceta() == receta.getIdReceta()) {

            }
        }
    }

    public void mostrarRecetas() {
    }

    public void mostrarRecetasProcesadas() {
    }

    public void mostrarPacientesConEstudios(int minimoEstudiosRealizados) {
    }
}

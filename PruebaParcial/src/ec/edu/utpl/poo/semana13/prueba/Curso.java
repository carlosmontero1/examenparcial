package ec.edu.utpl.poo.semana13.prueba;

import java.util.ArrayList;
import java.util.List;

public abstract class Curso {

    private double nombre;
    private int numHoras;
    private double costoBase;
    private String horario;

    private Docente docente;
    private List<Recurso> recursos = new ArrayList<>();

    public Curso(double nombre, int numHoras, double costoBase, String horario) {
        this.nombre = nombre;
        this.numHoras = numHoras;
        this.costoBase = costoBase;
        this.horario = horario;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public void addRecursos(Recurso recurso) {
        this.recursos.add(recurso);
    }

    public Docente getDocente() {
        return docente;
    }

    public List<Recurso> getRecursos() {
        return recursos;
    }

    public double getCostoBase() {
        return costoBase;
    }


}

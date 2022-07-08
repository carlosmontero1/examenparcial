package ec.edu.utpl.poo.semana13.prueba;

public class Docente {

    private TITULOS titulo;
    private double sueldo;

    public Docente(TITULOS titulo, double sueldo) {
        this.titulo = titulo;
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }
}

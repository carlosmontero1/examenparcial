package ec.edu.utpl.poo.semana13.prueba;

public class Presencial extends Curso {

    private String aula;

    public Presencial(double nombre, int numHoras, double costoBase, String horario, String aula) {
        super(nombre, numHoras, costoBase, horario);
        this.aula = aula;
    }



}

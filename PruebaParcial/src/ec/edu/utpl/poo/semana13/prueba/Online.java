package ec.edu.utpl.poo.semana13.prueba;

public class Online extends Curso {

    private String salaID;

    public Online(double nombre, int numHoras, double costoBase, String horario, String salaID) {
        super(nombre, numHoras, costoBase, horario);
        this.salaID = salaID;
    }

}

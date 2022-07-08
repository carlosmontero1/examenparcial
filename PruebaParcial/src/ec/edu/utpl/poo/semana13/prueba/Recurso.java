package ec.edu.utpl.poo.semana13.prueba;

public abstract class Recurso {

    private double costo;

    public Recurso(double costo) {
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

}

package ec.edu.utpl.poo.semana13.prueba;

public class Matricula implements ICalcularCosto {

    private int numero;
    private double descuento;
    private Curso curso;
    public Matricula(int numero, double descuento, Curso curso) {
        this.numero = numero;
        this.descuento = descuento;
        this.curso = curso;
    }

    public double calcularCosto() {

        double total = curso.getCostoBase() + curso.getDocente().getSueldo();

        for (var recurso: curso.getRecursos()) {
            total += recurso.getCosto();
        }

        total -= descuento;

        return total;

    }

}

/*
double total = curso.getCostoBase();

        for (var recurso: curso.getRecursos()) {
                if (recurso instanceof Fisico)
                }

                double total = 0;
                double costoBase = curso.getCostoBase();

                if (curso instanceof Presencial) {
                costoBase = costoBase + (costoBase * 0.05);
                } else if (curso instanceof Online) {
                costoBase = costoBase - (costoBase * 0.05);
                }

                for (var recurso: curso.getRecursos()) {
                if (recurso instanceof Fisico)
                }
 */
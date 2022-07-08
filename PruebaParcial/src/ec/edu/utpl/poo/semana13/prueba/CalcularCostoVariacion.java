package ec.edu.utpl.poo.semana13.prueba;

public class CalcularCostoVariacion implements ICalcularCosto {


    @Override
    public double calcularCosto(Curso curso) {
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
    }
}

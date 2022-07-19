package p1;

import p2.Matricula;

public class MatriculaMaternal extends Matricula {

    private double tarifa;

    @Override
    public void establecerMatricula() {
        // tarifa = costo desayunos + costo almuerzo + costo medico
        tarifa = 50.2 + 40.2 + 80.2;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

    @Override
    public String toString() {
        String cadena = String.format("Matricula Maternal - %.2f\n", tarifa);
        return cadena;
    }
}

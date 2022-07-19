package p1;

import p2.Matricula;

public class MatriculaJardin extends Matricula {

    private double tarifa;

    @Override

    public void establecerTarifa() {
        // tarifa = costo desayunos + costo libros + costo paseos
        tarifa = 50.2 + 140.2 + 40;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

    @Override
    public String toString() {
        String cadena = String.format("Matricula Colegio- %.2f\n", tarifa);
        return cadena;
    }
}

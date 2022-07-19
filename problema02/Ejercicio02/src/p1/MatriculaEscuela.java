package p1;

import p2.Matricula;

public class MatriculaEscuela extends Matricula {

    private double tarifa;

    @Override
    public void establecerTarifa() {
        // tarifa = costo libros + costo deportes + costo folletos + 
        //          costo uniformes
        tarifa = 50.2 + 40.2 + 140.2 + 200.4;
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

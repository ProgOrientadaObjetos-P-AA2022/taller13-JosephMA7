package p1;

import p2.Matricula;

public class MatriculaColegio extends Matricula{
    private double tarifa;
    
    
    @Override
    public void establecerMatricula(){
        // tarifa = costo deportes + costo folletos + 
        //          costo uniformes + costo laboratorios
        tarifa = 150.2 + 140.2 + 240.2 + 300.4;
    }
        
    public double obtenerTarifa(){
        return tarifa;
    }
    
    @Override
        public String toString() {
            String cadena = String.format("Matricula Colegio- %.2f\n", tarifa);
             return cadena;
}
}

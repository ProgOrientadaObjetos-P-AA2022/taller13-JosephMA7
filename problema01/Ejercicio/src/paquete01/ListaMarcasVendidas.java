package paquete01;
import java.util.ArrayList;
public class ListaMarcasVendidas {

    double precioTotal;
    ArrayList<Televisor> televisores;
    String marcasVendidas;
    double masCaro;

    public void establecerTelevisores(ArrayList<Televisor> t) {
        televisores = t;
    }

    public ArrayList<Televisor> obtenerTelevisores() {
        return televisores;
    }

    public void establecertotalPrecioTvs() {
        double s = 0;
        for (int i = 0; i < televisores.size(); i++) {
            s = s + televisores.get(i).obtenerPrecio();
            System.out.println(s);
        }
        precioTotal = s;
    }

    public double obtenerPrecioTotal() {
        return precioTotal;
    }

    public void establecerMarcasVendidas() {
        String s = "";
        for (int i = 0; i < televisores.size(); i++) {
            s = String.format("%s%s\n", s, televisores.get(i).obtenerMarca());
        }
        marcasVendidas = s;
    }

    public String obtenerMarcasVendidas() {
        return marcasVendidas;
    }

    public void establecerTelevisorMasCaro(ArrayList<Televisor> televisores) {
        masCaro = 0;
        // pass
        for (int i = 0; i < televisores.size(); i++) {
            if (televisores.get(i).obtenerPrecio() > masCaro) {
                masCaro = televisores.get(i).obtenerPrecio();
            }
        }
    }

    @Override
    public String toString() {
        String cadena = String.format("TotalPrecio: %.2f\n"+
                "TV mas Caro: %.2f\n"+
                "Lista Marcas Vendidas: \n",
                precioTotal,
                masCaro);
        for(int i = 0; i< televisores.size(); i++){
            cadena = String.format("%s%s\n",
                    cadena,
                    televisores.get(i).obtenerMarca());
        }
        return cadena;
                
    }
}

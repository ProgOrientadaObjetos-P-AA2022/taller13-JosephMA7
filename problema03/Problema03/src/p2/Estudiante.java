package p2;

import java.util.ArrayList;
import p3.Correo;

public class Estudiante {

    private String nombres;
    private String username;
    private ArrayList<Correo> correos;

    public void establecerNombres(String g) {
        nombres = g;
    }

    public void establecerUserName(String g) {
        username = g;
    }

    public void establecerCorreos(ArrayList<Correo> c) {
        correos = c;
    }

    public ArrayList<Correo> obtenerCorreos() {
        return correos;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerUserName() {
        return username;
    }

    @Override
    public String toString() {
        String data = String.format("Información: %s\n", obtenerNombres());

        for (int i = 0; i < correos.size(); i++) {

            data = String.format("%s%s\n", data,
                    correos.get(i).obtenerCorreo());
        }
        return data;
    }

}

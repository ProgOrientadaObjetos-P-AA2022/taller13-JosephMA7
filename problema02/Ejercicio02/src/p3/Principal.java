package p3;

import java.util.ArrayList;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.Matricula;
import p2.TipoMatricula;

public class Principal {

    public static void main(String[] args) {

        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerMatricula();

        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerMatricula();

        MatriculaEscuela mesc = new MatriculaEscuela();
        mesc.establecerMatricula();

        MatriculaJardin mjar = new MatriculaJardin();
        mjar.establecerMatricula();

        MatriculaMaternal mmat = new MatriculaMaternal();
        mmat.establecerMatricula();

        ArrayList<Matricula> lista = new ArrayList();

        lista.add(mcamp);
        lista.add(mcolegio);
        lista.add(mesc);
        lista.add(mjar);
        lista.add(mmat);

        TipoMatricula tipos = new TipoMatricula();

        tipos.establecerMatriculas(lista);
        tipos.establecerPromedioMatricular();

        System.out.println(tipos);

    }
}

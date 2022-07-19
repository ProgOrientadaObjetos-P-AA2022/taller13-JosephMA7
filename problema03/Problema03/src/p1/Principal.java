package p1;

import java.util.ArrayList;
import p2.Estudiante;
import p3.Correo;
import p3.*;

public class Principal {

    public static void main(String[] args) {
        /*
        El mini-sistema debe permitir que se genere
        diversos correos para un estudiante.
        Para Gmail
        Para Outlook
        Para Yahoo
        Para utpl.edu.ec
        Para gobiernoec.gob
        
         */

        Estudiante est = new Estudiante();
        est.establecerNombres("Joseph Martinez");
        est.establecerUserName("jjmartinez10");

        DominioGmail domGmail = new DominioGmail();
        domGmail.establecerDominio();
        
        Gobierno domGob = new Gobierno();
        domGob.establecerDominio();
        
        Outlook domOut = new Outlook();
        domOut.establecerDominio();
        
        Utpl domUtpl = new Utpl();
        domUtpl.establecerDominio();
        
        Yahoo domYahoo = new Yahoo();
        domYahoo.establecerDominio();
        
        Correo correo = new Correo();
        correo.establecerDominio(domGmail);
        correo.establecerUserName(est.obtenerUserName());

        Correo correoGob = new Correo();
        correoGob.establecerDominio(domGob);
        correoGob.establecerUserName(est.obtenerUserName());

        Correo correoOut = new Correo();
        correoOut.establecerDominio(domOut);
        correoOut.establecerUserName(est.obtenerUserName());

        Correo correoUtpl = new Correo();
        correoUtpl.establecerDominio(domUtpl);
        correoUtpl.establecerUserName(est.obtenerUserName());

        Correo correoYahoo = new Correo();
        correoYahoo.establecerDominio(domYahoo);
        correoYahoo.establecerUserName(est.obtenerUserName());

        ArrayList<Correo> lista = new ArrayList<>();
        lista.add(correo);
        lista.add(correoGob);
        lista.add(correoOut);
        lista.add(correoUtpl);
        lista.add(correoYahoo);

        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).establecerCorreo();
        }

        est.establecerCorreos(lista);

        System.out.printf("%s\n", est);

    }

}

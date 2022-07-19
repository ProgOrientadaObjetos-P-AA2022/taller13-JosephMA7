package p3;

public class Correo {

    private Dominio dominio;
    private String correo;
    private String username;

    public void establecerDominio(Dominio g) {
        dominio = g;
    }

    public void establecerUserName(String u) {
        username = u;
    }

    public void establecerCorreo() {
        correo = String.format("%s@%s", obtenerUserName(),
                obtenerDominio().obtenerDominio());
    }

    public Dominio obtenerDominio() {
        return dominio;
    }

    public String obtenerUserName() {
        return username;
    }

    public String obtenerCorreo() {
        return correo;
    }

}

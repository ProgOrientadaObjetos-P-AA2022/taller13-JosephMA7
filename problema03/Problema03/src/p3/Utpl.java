package p3;

public class Utpl implements Dominio {

    private String dominio;

    @Override
    public void establecerDominio() {
        dominio = String.format("@utpl.edu.ec");
    }

    @Override
    public String obtenerDominio() {
        return dominio;
    }
}

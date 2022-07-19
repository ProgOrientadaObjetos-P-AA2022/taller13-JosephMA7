package p3;

public class Yahoo implements Dominio {

    private String dominio;

    @Override
    public void establecerDominio() {
        dominio = String.format("@yahoo.es");
    }

    @Override
    public String obtenerDominio() {
        return dominio;
    }
}

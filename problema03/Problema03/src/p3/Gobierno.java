package p3;

public class Gobierno implements Dominio {

    private String dominio;

    @Override
    public void establecerDominio() {
        dominio = String.format("@gobiernoec.gob");
    }

    @Override
    public String obtenerDominio() {
        return dominio;
    }
}

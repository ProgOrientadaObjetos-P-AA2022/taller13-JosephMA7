package p3;

public class Outlook implements Dominio {

    private String dominio;

    @Override
    public void establecerDominio() {
        dominio = String.format("@outlook.com");
    }

    @Override
    public String obtenerDominio() {
        return dominio;
    }
}

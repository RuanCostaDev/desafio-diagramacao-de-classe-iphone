package models.multimidia;

public class Ipod implements ReprodutorDeVideo, ReprodutorMusical{

    public void acessarLojasApple() {
        System.out.println("Acessando loja virtual da Apple!");
    }

    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo musicas...");
    }

    @Override
    public void reproduzirVideo() {
        System.out.println("Reproduzindo video...");

    }

}

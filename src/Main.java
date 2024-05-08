import models.Iphone;
import models.telefonia.Contato;
import models.telefonia.Telefone;

public class Main {
    public static void main(String[] args) throws Exception {

        Telefone meuTelefone = new Telefone("987124565", "81", "Vivo");
        Iphone iphone = new Iphone("vermelho", "1", meuTelefone);

        iphone.ligar();
        Contato gleyson = new Contato("Gleyson Sampaio", "988774455");

        iphone.usarTelefone().salvarContato(gleyson);
        iphone.usarTelefone().verListaDeContatos();
        iphone.usarTelefone().fazerLigacao();

        iphone.usarTelefone().receberSMS();
        iphone.usarTelefone().enviarMensagemSms("Olá mundo!");

        iphone.acessarIpod().acessarLojasApple();
        iphone.acessarIpod().reproduzirMusica();
        iphone.acessarIpod().reproduzirVideo();

        iphone.acessNavegador().acessarInternet();

        iphone.desligar();
    }
}

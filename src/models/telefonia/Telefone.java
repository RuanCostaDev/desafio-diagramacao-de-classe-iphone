package models.telefonia;

import java.util.ArrayList;
import java.util.List;

public class Telefone implements AparelhoTelefonico, AgendaTelefonica, Sms {

    String numero;
    String ddd;
    String operadora;
    List<Contato> contatos = new ArrayList<Contato>();

    
    public Telefone(String numero, String ddd, String operadora) {
        this.numero = numero;
        this.ddd = ddd;
        this.operadora = operadora;
        
    }

    @Override
    public void salvarContato(Contato contato) {
        this.contatos.add(contato);
        System.out.println("Contato " + contato.getNome() + " salvo");
    }

    @Override
    public void verListaDeContatos() {
        for (Contato contato : contatos) {
         System.out.printf("[%s]\n[%s]\n", contato.getNome(), contato.getNumero());   
        };
    }

    @Override
    public void fazerLigacao() {
        System.out.println("Chamando número...");;
    }

    @Override
    public void receberLigacao() {
        System.out.println("Telefone tocando!!!\n[Receber ligação] - [Recusar]");
    }
    
    @Override
    public void receberSMS() {
        System.out.println("Novo Sms recebido.");
    }

    @Override
    public void lerMensagensSms() {
        receberSMS();
        System.out.println("Abrindo Mensagens recebidas...");
    }

    @Override
    public void enviarMensagemSms(String msg) {
        System.out.println(msg + "\nEnviando...\nMensagem enviada.");
    }

    
}

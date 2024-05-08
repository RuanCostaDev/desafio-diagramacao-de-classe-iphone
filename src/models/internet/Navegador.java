package models.internet;

public class Navegador {

    private String nome;

    public Navegador(String nome) {
        this.nome = nome;
    }
    

    private void verificarConexão() {
        System.out.println("Verificando conexão com a internet...");
        System.out.println("Dispositivo Conectado.");
    }

    public void acessarInternet() {
        verificarConexão();
        System.out.println("Abrindo Navegador " + nome);
    }


    public String getNome() {
        return nome;
    }


    public void setNovoNavegador(String nome) {
        this.nome = nome;
    }
}

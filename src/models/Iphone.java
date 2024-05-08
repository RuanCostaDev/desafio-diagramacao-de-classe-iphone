package models;

import models.internet.Navegador;
import models.multimidia.Ipod;
import models.telefonia.Telefone;
import models.utilitarios.Calendario;
import models.utilitarios.CameraDigital;
import models.utilitarios.Mapa;

public class Iphone {

    private String cor;
    private String modelo;
    private Telefone telefone;
    private Ipod ipod = new Ipod();
    private Navegador navegador = new Navegador("Chrome");
    private CameraDigital cameraDigital = new CameraDigital();
    private Mapa mapa = new Mapa();
    private Calendario calendario = new Calendario(); 



    public Iphone(String cor, String modelo, Telefone telefone) {
        this.cor = cor;
        this.modelo = modelo;
        this.telefone = telefone;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void ligar() {
        System.out.println("Iphone Ligado!");
    }

    public void desligar() {
        System.out.println("Iphone Desligado!");
    }

    public Telefone usarTelefone() {
        return this.telefone;
    } 

    public Ipod acessarIpod() {
        return this.ipod;
    }
    
    public Navegador acessNavegador() {
        return this.navegador;
    }

    public CameraDigital abrirCameraDigital() {
        return this.cameraDigital;
    }

    public Mapa abrirMapa() {
        return this.mapa;
    }

    public Calendario abrirCalendario() {
        return this.calendario;
    }
}

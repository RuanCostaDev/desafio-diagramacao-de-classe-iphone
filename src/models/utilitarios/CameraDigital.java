package models.utilitarios;

public class CameraDigital implements GaleriaDeImagens{

    public void abrirCamera() {
        System.out.println("Abrindo Câmera Digital.");
    }

    public void tirarFoto() {        
        System.out.println("Nova foto capturada.");
        armazenar("Foto");
    }
    public void gravarVideo() {
        System.out.println("Novo vídeo adicionado a galeria.");
        armazenar("Vídeo");
    }
    @Override
    public void armazenar(String tipo) {
        System.out.println("Novo(a) " + tipo + " armazenado na galeria." );
    }

    @Override
    public void visualizarGaleria() {
        System.out.println("Abrindo Galeria...");
    }

}

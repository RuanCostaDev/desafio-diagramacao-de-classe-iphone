package models.telefonia;

public interface Sms {

    public void receberSMS();
    
    public void lerMensagensSms();

    public void enviarMensagemSms(String msg);
}

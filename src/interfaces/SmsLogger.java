package interfaces;

public class SmsLogger implements  Logger{
    @Override
    public void Add(String message) {
        System.out.println("Sms gönderildi : " + message);
    }
}

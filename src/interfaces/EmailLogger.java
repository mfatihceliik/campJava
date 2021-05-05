package interfaces;

public class EmailLogger implements Logger {
    @Override
    public void Add(String message) {
        System.out.println("Email gönderildi: " + message);
    }
}

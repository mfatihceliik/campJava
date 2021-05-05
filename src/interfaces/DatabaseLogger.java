package interfaces;

public class DatabaseLogger implements Logger{
    @Override
    public void Add(String message) {
        System.out.println("Database loglandı : " + message);
    }
}

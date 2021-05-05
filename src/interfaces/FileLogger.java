package interfaces;

public class FileLogger implements Logger{
    @Override
    public void Add(String message) {
        System.out.println("Dosyaya loglandı : " + message);
    }
}

package interfaces;

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer(1, "Muhammed Fatih", "Çelik");
        Logger databaseLogger = new DatabaseLogger();
        Logger EmailLogger = new EmailLogger();
        Logger FileLogger = new FileLogger();
        Logger SmsLogger = new SmsLogger();

        Logger[] loggers = {
          databaseLogger,
          EmailLogger,
          FileLogger,
          SmsLogger
        };

        CustomerManager customerManager = new CustomerManager(loggers);
        customerManager.Add(customer);
    }
}

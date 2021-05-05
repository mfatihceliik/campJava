package interfaces;

public class CustomerManager {
    private Logger[] loggers;
    public CustomerManager(Logger[] loggers){
        this.loggers = loggers;
    }
    public void Add(Customer customer){
        System.out.println(customer.getFirtsName() + ", adlı müşteri eklendi");
        Utils.runLoggers(loggers, customer.getFirtsName());
    }
    public void Update(Customer customer){
        System.out.println(customer.getFirtsName() + ", adlı müşteri güncellendi");
        Utils.runLoggers(loggers, customer.getFirtsName());
    }
    public void Delete(Customer customer){
        System.out.println(customer.getFirtsName() + ", adlı müşteri silindi");
        Utils.runLoggers(loggers, customer.getFirtsName());
    }
}

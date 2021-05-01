package inheratance;

public class Main {

    public static void main(String[] args) {
        IndividualCustomer mami = new IndividualCustomer();
        mami.customerNumber = "12345";

        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.companyName = "Hepsi Burada";
        hepsiBurada.customerNumber = "13579";

        SendikaCustomer sendikaCustomer = new SendikaCustomer();
        sendikaCustomer.customerNumber = "9999";

        Customer[] customers = new Customer[]{
          mami,
          hepsiBurada,
          sendikaCustomer
        };

        CustomerManager customerManager = new CustomerManager();
        customerManager.addMultiple(customers);

    }
}

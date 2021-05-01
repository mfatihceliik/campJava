package inheratance;

public class CustomerManager {
    public void add(Customer customer){
        System.out.println(customer.customerNumber + ", kaydedildi.");
    }

    public void addMultiple(Customer[] customers){

        for(int i = 0; i < customers.length; i++){
            add(customers[i]);
        }
    }

}

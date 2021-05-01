package oopIntro;

public class Main {
    //Darkest Dark theme

    public static void main(String[] args){
        Product product1 = new Product(1,"Lenovo V14", 15000, "16 GB Ram",10, 13500);

        Product product2 = new Product();
        product2.set_id(2);
        product2.set_name("Lenovo V15");
        product2.set_details("8 GB Ram");
        product2.set_discount(10);
        product2.set_unitPrice(16000);
        product2.get_unitPriceAfterDiscount();

        //Product product3 = new Product(3, "Hp V15", 13000, "16 GB Ram",);

        Product[] products = {
                product1,
                product2,
                //product3
        };

        Category category1 = new Category(1,"İçecek");
        Category category2 = new Category(2,"Yiyecek");

        Category[] categories = new Category[]{
                category1,
                category2
        };

        for(int i = 0; i < categories.length; i++){
            System.out.println(categories[i].get_id());
            System.out.println(categories[i].get_name());
        }



        for(Product product : products){
            System.out.println(product.get_id());
            System.out.println(product.get_name());
            System.out.println(product.get_unitPrice());
            System.out.println(product.get_details());
            System.out.println(product.get_discount());
            System.out.println(product.get_unitPriceAfterDiscount());
        }
    }
}

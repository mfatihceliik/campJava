package oopIntro;

public class Product {

    private int _id;
    private String _name;
    private double _unitPrice;
    private String _details;
    private double _discount;
    private double _unitPriceAfterDiscount;

    public Product(){

    }

    public Product(int id, String name, double unitPrice, String details, double discount, double unitPriceAfterDiscount){
        this._id = id;
        this._name = name;
        this._unitPrice = unitPrice;
        this._details = details;
        this._discount = discount;
        this._unitPriceAfterDiscount = unitPriceAfterDiscount;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public double get_unitPrice() {
        return _unitPrice;
    }

    public void set_unitPrice(double _unitPrice) {
        this._unitPrice = _unitPrice;
    }

    public String get_details() {
        return _details;
    }

    public void set_details(String _details) {
        this._details = _details;
    }

    public double get_discount() {
        return _discount;
    }

    public void set_discount(double _discount) {
        this._discount = _discount;
    }

    public double get_unitPriceAfterDiscount() {
        return this._unitPrice - (this._unitPrice * this._discount / 100);
    }
}

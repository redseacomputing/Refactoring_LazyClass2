package lazyclass;

public class ShippingAddress extends Address {

    public ShippingAddress(String house, String street, String city, String country, String postcode) {
        super(house, street, city, country, postcode);
    }

    public double calculatePostage() {
        return super.country.equals("United Kingdom") ? 3 : 6;
    }
}
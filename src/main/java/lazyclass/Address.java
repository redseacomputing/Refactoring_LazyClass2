package lazyclass;

public class Address {

    private final String house;
    private final String street;
    private final String city;
    private final String postcode;
    protected final String country;

    public Address(String house, String street, String city,
                   String country, String postcode) {
        this.house = house;
        this.street = street;
        this.city = city;
        this.postcode = postcode;
        this.country = country;
    }

    public String getAddressSummary() {
        return house + ", " + street + ", " + city + ", " + postcode +
                ", " + country;
    }

}
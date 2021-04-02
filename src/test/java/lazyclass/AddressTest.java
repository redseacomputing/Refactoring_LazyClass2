package lazyclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddressTest {

    ShippingAddress address;
    ShippingAddress addressUK;

    @BeforeEach
    void setUpAddress() {
        address = new ShippingAddress("1", "United Street", "United City", "United Country", "0000");
    }

    @BeforeEach
    void setUpAddressInUnitedKingdom() {
        addressUK = new ShippingAddress("1", "United Street", "United City", "United Kingdom", "1111");
    }

    @Test
    void calculatePostage() {
        assertEquals(6d, address.calculatePostage());
    }

    @Test
    void calculatePostageInUK() {
        assertEquals(3d, addressUK.calculatePostage());
    }

    @Test
    void shouldReturnCorrectAddressSummary() {
        String result = "1, United Street, United City, 0000, United Country";
        assertEquals(result, address.getAddressSummary());
    }
}
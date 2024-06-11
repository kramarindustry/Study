import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class carTest {
    Car car;

    @BeforeEach
    public void createcar() {
        car = new Car("Skoda", "ABC1234", 2019, "Vlad");
    }

    @org.junit.jupiter.api.Test
    void getManufactuer() {
        assertEquals("Skoda", car.getManufactuer());
    }

    @org.junit.jupiter.api.Test
    void getNumber() {
        assertEquals("ABC1234", car.getNumber());
    }

    @org.junit.jupiter.api.Test
    void setNumber() {
        car.setNumber("ABC1234");
        assertEquals("ABC1234", car.getNumber());
    }

    @org.junit.jupiter.api.Test
    void getYear() {
        assertEquals(2019, car.getYear());
    }

    @org.junit.jupiter.api.Test
    void getOwner() {
        assertEquals("Vlad", car.getOwner());
    }

    @org.junit.jupiter.api.Test
    void setOwner() {
        assertEquals("Vlad", car.getOwner());

    }

    @org.junit.jupiter.api.Test
    void getListOfAllOwners() {
        assertArrayEquals(new String[]{"Vlad"}, car.getOwners().toArray());
    }

    @org.junit.jupiter.api.Test
    void getListOfTwoOwners() {
        assertEquals("Vlad", "Vlad", car.getOwner());
    }


}
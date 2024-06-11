package lesson2;

import org.example.lesson2.Car;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    Car car;

    @BeforeEach
    public void createcar() {
        car = new Car("Skoda", "ABC1234", 2019, "Vlad");
    }

    @Test
    public void getManufactuer() {
        assertEquals("Skoda", car.getManufactuer());
    }

    @Test
    public void getNumber() {
        assertEquals("ABC1234", car.getNumber());
    }

    @Test
    public void setNumber() {
        car.setNumber("ABC1234");
        assertEquals("ABC1234", car.getNumber());
    }

    @Test
    public void getYear() {
        assertEquals(2019, car.getYear());
    }

    @Test
    public void getOwner() {
        assertEquals("Vlad", car.getOwner());
    }

    @Test
    public void setOwner() {
        assertEquals("Vlad", car.getOwner());

    }

    @Test
    public void getListOfAllOwners() {
        assertArrayEquals(new String[]{"Vlad"}, car.getOwners().toArray());
    }

    @org.junit.jupiter.api.Test
    void getListOfTwoOwners() {
        assertEquals("Vlad", "Vlad", car.getOwner());
    }


}
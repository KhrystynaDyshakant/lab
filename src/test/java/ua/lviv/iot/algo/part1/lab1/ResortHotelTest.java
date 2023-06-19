package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResortHotelTest {
    private ResortHotel resortHotel;

    @BeforeEach
    public void setUp() {
        resortHotel = new ResortHotel("Grand", 4, 2, 3);
    }

    @Test
    void testGetLocation() {
        String expected = "Grand";
        String actual = resortHotel.getLocation();
        assertEquals(expected, actual);
    }
    @Test
    void testNumberPoolsForAdults(){
        int expected=3;
        int actual=resortHotel.getNumberPoolsForAdults();
        assertEquals(3,resortHotel.getNumberPoolsForAdults());
    }
    @Test
    void testNumberPoolsForChildren(){
        int expected=2;
        int actual=resortHotel.getNumberPoolsForChildren();
        assertEquals(2,resortHotel.getNumberPoolsForChildren());
    }
    @Test
    void testNumberOfRestaurants(){
        int expected=4;
        int actual=resortHotel.getNumberOfRestaurants();
        assertEquals(4,resortHotel.getNumberOfRestaurants());
    }
    @Test
    void testGetName() {
        assertEquals("Grand", resortHotel.getName());
    }

    @Test
    void testToString() {
        String expected = "ResortHotel{" +
                "  numberPoolsForChildren=2" +
                "  numberPoolsForAdults=3," +
                " numberOfRestaurants=4," +
                " Name='Grand'" +
                "} ";

        String actual = resortHotel.toString();

        assertEquals(expected, actual);
    }
}


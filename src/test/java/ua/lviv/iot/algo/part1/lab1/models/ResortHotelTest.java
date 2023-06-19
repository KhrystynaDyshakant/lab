package ua.lviv.iot.algo.part1.lab1.models;

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
    void testGetHeaders() {
        ResortHotel resortHotel = new ResortHotel("Zirka", 4, 5, 4);
        String expectedHeaders = "name, totalRooms, availableRooms, rating,, numberOfRestaurants, numberPoolsForAdults, numberPoolsForChildren";
        assertEquals(expectedHeaders, resortHotel.getHeaders());
    }

    @Test
    void testToCsv() {
        ResortHotel resortHotel = new ResortHotel("Zirka", 4, 5, 4);
        String expectedCsv = "Zirka, 0, 0, 0 , 4, 4, 5";
        assertEquals(expectedCsv, resortHotel.toCSV());
    }
}

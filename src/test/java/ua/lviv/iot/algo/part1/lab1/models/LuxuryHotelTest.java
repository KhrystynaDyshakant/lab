package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class LuxuryHotelTest {
    private LuxuryHotel luxuryHotel;

    @BeforeEach
    public void setUp() {
        luxuryHotel = new LuxuryHotel("Lion", 5, 4, 1, 4, 1);

    }

    @Test
    void testAddNumberOfService() {
        int expected = 0;
        int actual = luxuryHotel.addNumberOfService();
        assertEquals(expected, actual);
    }


    @Test
    void testIncreaseNumberOfSpaRooms() {
        int expected = 1;
        int actual = luxuryHotel.increaseNumberOfSpaRooms();
        assertEquals(expected, actual);
    }


    @Test
    void testGetHeaders() {
        LuxuryHotel luxuryHotel1 = new LuxuryHotel("Lion", 5, 14, 1, 4, 1);
        String expectedHeaders = "name, totalRooms, availableRooms, rating,, name, numberOfSpaRooms, numberOfService";
        assertEquals(expectedHeaders, luxuryHotel.getHeaders());
    }

    @Test
    void testToCsv() {
        LuxuryHotel luxuryHotel1 = new LuxuryHotel("Lion", 5, 1, 1, 4, 1);
        String expectedCsv = "Lion, 1, 4, 1 , Lion, 5, 4";
        assertEquals(expectedCsv, luxuryHotel.toCSV());
    }
}

package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EcoHotelTest {
    private EcoHotel ecoHotel;

    @BeforeEach
    public void setUp() {
        ecoHotel = new EcoHotel("Flower", 1, true, 1, 1, 1);
    }

    @Test
    void testNumberOfCountGyms() {
        int expected = 1;
        int actual = ecoHotel.numberOfCountGyms();
        assertEquals(expected, actual);
    }

    @Test
    void testGetName() {
        assertEquals("Flower", ecoHotel.getName());
    }

    @Test
    void testHasGarden() {
        boolean expected = true;
        boolean actual = ecoHotel.hasGarden();
        assertTrue(ecoHotel.hasGarden());
    }

    @Test
    void hasGarden() {
        EcoHotel ecoHotel = new EcoHotel("Flower", 100, true, 5, 5, 5);
        assertTrue(ecoHotel.hasGarden());
    }

    @Test
    void numberOfCountGyms() {
        EcoHotel ecohotel = new EcoHotel("Flower", 100, true, 5, 5, 5);
        assertEquals(1, ecohotel.numberOfCountGyms());
    }


    @Test
    void testGetHeaders() {
        EcoHotel ecoHotel = new EcoHotel("Flower", 1, true, 4, 8, 1);
        String expectedHeaders = "name, totalRooms, availableRooms, rating,, gym, garden ";
        assertEquals(expectedHeaders, ecoHotel.getHeaders());
    }

    @Test
    void testToCsv() {
        EcoHotel ecoHotel = new EcoHotel("Flower", 1, true, 4, 8, 1);
        String expectedCsv = "Flower, 4, 8, 1 ,1, true";
        assertEquals(expectedCsv, ecoHotel.toCSV());
    }
}

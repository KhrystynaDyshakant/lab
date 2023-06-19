package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {
    private EcoHotel hotel;

    @BeforeEach
    public void setUp() {
        hotel = new EcoHotel("Flower", 2, true, 0, 1, 2);
    }


    @Test
    void getInstance() {
        Hotel expected = hotel.getInstance();
        assertNull(expected);
    }

    @Test
    void bookRoom() {
        hotel.bookRoom();
        assertEquals(0, hotel.getAvailableRooms());
    }


    @Test
    void testBookRoom() {
        int initialAvailableRooms = hotel.getAvailableRooms();
        hotel.bookRoom();
        assertEquals(0, hotel.getAvailableRooms());
    }

    @Test
    void testReleaseRoom() {
        int initialAvailableRooms = hotel.getAvailableRooms();
        hotel.releaseRoom();
        assertEquals(2, hotel.getAvailableRooms());
    }

    @Test
    void testGetInstance() {
        Hotel defaultHotel = Hotel.getInstance();
        assertNull(defaultHotel);
    }


    @Test
    void testGetHeaders() {
        Hotel hotel = new EcoHotel("Hight", 2, false, 7, 4, 10);
        String expectedHeaders = "name, totalRooms, availableRooms, rating,, gym, garden ";
        assertEquals(expectedHeaders, hotel.getHeaders());
    }

    @Test
    void testToCsv() {
        Hotel hotel = new EcoHotel("Hight", 2, false, 7, 4, 10);
        String expectedCsv = "Hight, 7, 4, 10 ,2, false";
        assertEquals(expectedCsv, hotel.toCSV());
    }
}

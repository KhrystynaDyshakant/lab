package ua.lviv.iot.algo.part1.lab1;

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
    void testGetRating() {
        int expected = 2;
        int actual = hotel.getRating();
        assertEquals(expected, actual);
    }
    @Test
    void testGetName(){
        hotel.getName();
        assertEquals("Flower", hotel.getName());

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
    void testGetTotalRooms() {
        assertEquals(0, hotel.getTotalRooms());
    }
    @Test
    void getBookedRoomsCount() {
        assertEquals(-1, hotel.getBookedRoomsCount());
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
    void testGetAvailableRooms() {
        int expected = 1;
        int actual = hotel.getAvailableRooms();
        assertEquals(expected, actual);
    }
    @Test
    void testGetLocation() {
        assertNull(hotel.getLocation());
    }
    @Test
    void testGetInstance() {
        Hotel defaultHotel = Hotel.getInstance();
        assertNull(defaultHotel);
    }

    @Test
    void getName() {
        String name = hotel.getName();
        assertEquals("Flower", name);
    }
}


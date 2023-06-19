package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.algo.part1.lab1.LuxuryHotel;

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
    void testGetName() {
        luxuryHotel.getName();
        assertEquals("Lion", luxuryHotel.getName());
    }

    @Test
    void testGetTotalRooms() {
        luxuryHotel.getTotalRooms();
        assertEquals(1, luxuryHotel.getTotalRooms());
    }

    /* @Test
     void testGetAvailableRoom(){
         luxuryHotel.getAvailableRoom();
         assertEquals(1,luxuryHotel.getAvailableRoom());
     }*/
    @Test
    void tesGetNumberOfService() {
        luxuryHotel.getNumberOfService();
        assertEquals(4, luxuryHotel.getNumberOfService());
    }

    @Test
    void getAvailableRooms() {
        luxuryHotel.getAvailableRooms();
        assertEquals(4, luxuryHotel.getAvailableRooms());
    }

    @Test
    void testIncreaseNumberOfSpaRooms() {
        int expected = 1;
        int actual = luxuryHotel.increaseNumberOfSpaRooms();
        assertEquals(expected, actual);
    }

    @Test
    void testGetNumberOfSpaRooms() {
        int expected = 0;
        int actual = luxuryHotel.getNumberOfSpaRooms();
        assertEquals(expected, actual);
    }

    @Test
    void testGetAvailableRooms() {
        assertEquals(4, luxuryHotel.getAvailableRooms());
    }

    @Test
    void testGetRating() {
        assertEquals(1, luxuryHotel.getRating());
    }

    @Test
    void testGetLocation() {
        assertNull(luxuryHotel.getLocation());
    }
}
   /* @Test
    void testToString() {
        String expected = "LuxuryHotel {" +
                " name=Lion" +
                " availableRoom=1" +
                " rating=4" +
                " numberOfSpaRooms=5" +
                " numberOfService=4'" +
                "} ";

        String actual = luxuryHotel.toString();

        assertEquals(expected, actual);
    }

}*/
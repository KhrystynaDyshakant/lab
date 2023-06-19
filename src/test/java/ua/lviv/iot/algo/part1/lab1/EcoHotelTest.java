package ua.lviv.iot.algo.part1.lab1;

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
    void testGetAvailableRooms() {
        assertEquals(1, ecoHotel.getAvailableRooms());
    }
    @Test
    void testCheckInWithZeroAvailableRooms() {
        ecoHotel.setAvailableRooms(0);
        assertEquals(0, ecoHotel.getAvailableRooms());

    }
    @Test
    void testGetRating() {
        assertEquals(1, ecoHotel.getRating());
    }
    @Test
    void hasGarden() {
        EcoHotel ecoHotel = new EcoHotel("Flower", 100, true,5,5,5);
        assertTrue(ecoHotel.hasGarden());
    }

    @Test
    void numberOfCountGyms() {
        EcoHotel ecohotel = new EcoHotel("Flower", 100, true,5,5,5);
        assertEquals(1, ecohotel.numberOfCountGyms());
    }

    @Test
    void testGetLocation() {
        assertNull(ecoHotel.getLocation());
    }
    @Test
    void testGetGarden() {
        EcoHotel ecoHotel = new EcoHotel("Eco Hotel", 2, true, 50, 4,5);
        assertFalse(ecoHotel.getGarden());
    }
    @Test
    void testGetGymCount() {
        EcoHotel ecoHotel = new EcoHotel("Eco Hotel", 2, true, 50, 4,5);
        assertEquals(0, ecoHotel.getGymCount());
    }
}

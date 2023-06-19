package ua.lviv.iot.algo.part1.lab1.models;

import net.sf.saxon.expr.Component;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MotelTest {
    private Motel motel;

    @BeforeEach
    public void setUp() {
        motel = new Motel(17, 90, "Lviv", "Sokal", "Lviv-Sokal");
    }

    @Test
    void testGetLocation() {
        String expected = "Lviv-Sokal,90км";
        String actual = motel.getLocation();
        assertEquals(expected, actual);
    }


    @Test
    void testGetStartCity() {
        String expected = "Lviv";
        String actual = motel.getStartCity();
        assertEquals("Lviv", motel.getStartCity());
    }

    @Test
    void testGetName() {
        String expected = "Lviv-Sokal";
        String actual = motel.getNameOfTrack();
        assertEquals(expected, actual);
    }

    @Test
    void testKilometerOfTrack() {
        assertEquals(90, motel.getKilometerOfTrack());
    }

    @Test
    void testGetHeaders() {
        Motel motel = new Motel(4, 12, "Sokal", "Chervonograd", "Sokal-Chervonograd");
        String expectedHeaders = "name, totalRooms, availableRooms, rating,, numberOfTrack, kilometerOfTrack, startCity, endCity, nameOfTrack";
        assertEquals(expectedHeaders, motel.getHeaders());
    }

    @Test
    void testToCsv() {
        Motel motel = new Motel(4, 12, "Sokal", "Chervonograd", "Sokal-Chervonograd");
        String expectedCsv = "null, 0, 0, 0 , 4, 12, Sokal, Chervonograd, Sokal-Chervonograd";
        assertEquals(expectedCsv, motel.toCSV());
    }
}
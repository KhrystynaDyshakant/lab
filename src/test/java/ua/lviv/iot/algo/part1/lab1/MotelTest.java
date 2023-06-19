package ua.lviv.iot.algo.part1.lab1;

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
    void getAvailableRooms(){
        int expected=0;
        int actual=motel.getAvailableRooms();
        assertEquals(0,motel.getAvailableRooms());
    }
    @Test
    void getNumberOfTrack(){
        int expected=17;
        int actual=motel.getNumberOfTrack();
        assertEquals(17,motel.getNumberOfTrack());
    }
    @Test
    void testKilometerOfTrack(){
        int expected=90;
        int actual=motel.getKilometerOfTrack();
        assertEquals(90,motel.getKilometerOfTrack());
    }
    @Test
    void getInstance() {
        Hotel expected = motel.getInstance();
        assertNull(expected);
    }
    @Test
    void testGetEndCity(){
        String expected="Sokal";
        String actual=motel.getEndCity();
        assertEquals("Sokal",motel.getEndCity());
    }
    @Test
    void testGetStartCity(){
        String expected="Lviv";
        String actual=motel.getStartCity();
        assertEquals("Lviv",motel.getStartCity());
    }
    @Test
    void testGetName(){
        String expected="Lviv-Sokal";
        String actual=motel.getNameOfTrack();
        assertEquals(expected,actual);
    }
    @Test
    void testGetNameOfTrack() {
        assertEquals("Lviv-Sokal", motel.getNameOfTrack());
    }
    @Test
    void testGetKilometerOfTrack() {
        assertEquals(90, motel.getKilometerOfTrack());
    }
    @Test
    void testToString() {
        String expected = "Motel{" +
                " nameOfTrack=Lviv-Sokal" +
                " numberOfTrack=17" +
                " kilometerOfTrack=90" +
                " startCity=Lviv" +
                " endCity='Sokal'" +
                "} ";

        String actual = motel.toString();

        assertEquals(expected, actual);
    }
}
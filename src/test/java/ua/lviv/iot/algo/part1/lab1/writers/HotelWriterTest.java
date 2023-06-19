package ua.lviv.iot.algo.part1.lab1.writers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.models.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

class HotelWriterTest {
    private final File actualFile = new File("hotels.csv");
    private final File expectedFile = new File("hotels.csv");
    private static List<Hotel> hotels;
    private HotelWriter hotelWriter;
    private String fileName;

    @BeforeEach
    public void setUp() throws IOException {
        hotelWriter = new HotelWriter();
        fileName = "test_hotels.csv";
        HotelWriter hotelWriter = new HotelWriter();
        hotelWriter.writeToFile(hotels, fileName);
    }

    @Test
    public void writeToFileSuccess() throws IOException {
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(new ResortHotel("Grand", 4, 2, 1));
        hotels.add(new Motel(17, 90, "Lviv", "Sokal", "Lviv-Sokal"));
        hotels.add(new LuxuryHotel("Lion", 5, 14, 1, 4, 1));
        hotels.add(new EcoHotel("Flower", 2, true, 1, 1, 1));
        hotels.add(new ResortHotel("Zirka", 4, 5, 4));
        hotels.add(new Motel(4, 12, "Sokal", "Chervonograd", "Sokal-Chervonograd"));
        hotels.add(new LuxuryHotel("Astra", 4, 11, 1, 2, 1));
        hotels.add(new EcoHotel("Tree", 5, false, 1, 5, 1));
        assertTrue(Files.exists(actualFile.toPath()));
        assertEquals(new List[]{Files.readAllLines(expectedFile.toPath())});
        Files.readAllLines(actualFile.toPath());
    }

    private void assertEquals(List[] lists) {
    }

    @Test
    public void testWriteToFileEmptyList() throws IOException {
        HotelWriter hotelWriter = new HotelWriter();
        List<Hotel> hotels = new ArrayList<>();
        hotelWriter.writeToFile(hotels, fileName);
        File file = new File("hotels.csv");
        assertTrue(file.exists());
    }



    @Test
    public void writeToFileExistingFile() throws IOException {
        FileWriter fileWriter = new FileWriter("hotels.csv");
        fileWriter.write("hotels");
        fileWriter.close();
    }
}
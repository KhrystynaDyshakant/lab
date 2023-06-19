package ua.lviv.iot.algo.part1.lab1.writers;

import ua.lviv.iot.algo.part1.lab1.models.Hotel;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HotelWriter {

    public HotelWriter() {

    }


    public void writeToFile(List<Hotel> hotels, String fileName) throws IOException {


        try (FileWriter writer = new FileWriter(fileName)) {
            if (hotels == null) {
                System.out.println("Список готелей є null");
                return;
            }
            if (hotels.isEmpty()) {
                System.out.println("Список готелей порожній");
                return;
            }
            String headers = hotels.get(0).getHeaders();
            writer.write(headers);

            for (Hotel hotel : hotels) {
                String csvRow = hotel.toCSV();
                writer.write(csvRow);
            }

            System.out.println(" Дані успішно записані у файл " + fileName);
        } catch (IOException e) {
            System.out.println(" Помилка при записі у файл " + fileName + " : " + e.getMessage());
        }
    }


}

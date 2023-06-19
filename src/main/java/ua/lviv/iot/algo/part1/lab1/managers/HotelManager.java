package ua.lviv.iot.algo.part1.lab1.managers;

import ua.lviv.iot.algo.part1.lab1.models.*;
import ua.lviv.iot.algo.part1.lab1.writers.HotelWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HotelManager {
    private static final List<Hotel> hotels = new ArrayList<>();

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void addHotel(Hotel hotel) {
        this.hotels.add(hotel);
    }

    public int getHotel() {
        return getHotel();
    }

    public List<Hotel> findHotelWithAvailableRooms(int availableRooms) {
        return hotels.stream().
                filter(hotel -> hotel.getAvailableRooms() == availableRooms).
                collect(Collectors.toList());
    }

    public List<Hotel> findHotelWithRatingMoreThan(int rating) {
        return hotels.stream().
                filter(hotel -> hotel.getRating() > rating).
                collect(Collectors.toList());
    }


    public static void main(String[] args) throws IOException {
        HotelManager hotelManager = new HotelManager();
        hotelManager.addHotel(new ResortHotel("Grand", 4, 2, 1));
        hotelManager.addHotel(new Motel(17, 90, "Lviv", "Sokal", "Lviv-Sokal"));
        hotelManager.addHotel(new LuxuryHotel("Lion", 5, 14, 1, 4, 1));
        hotelManager.addHotel(new EcoHotel("Flower", 2, true, 1, 1, 1));
        hotelManager.addHotel(new ResortHotel("Zirka", 4, 5, 4));
        hotelManager.addHotel(new Motel(4, 12, "Sokal", "Chervonograd", "Sokal-Chervonograd"));
        hotelManager.addHotel(new LuxuryHotel("Astra", 4, 11, 1, 2, 1));
        hotelManager.addHotel(new EcoHotel("Tree", 5, false, 1, 5, 1));

        List<Hotel> hotels = HotelManager.hotels;
        HotelWriter hotelWriter = new HotelWriter();
        hotelWriter.writeToFile(hotels, "hotels.csv");
    }
}
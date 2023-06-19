package ua.lviv.iot.algo.part1.lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HotelManager {
    private final List<Hotel> hotels = new ArrayList<>();

    public void addHotel(Hotel hotel) {
        this.hotels.add(hotel);
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


    public static void main(String[] args) {
        HotelManager hotelManager = new HotelManager();
        hotelManager.addHotel(new ResortHotel("Grand", 4, 2, 3));
        hotelManager.addHotel(new Motel(17, 210, "Lviv", "Sokal", "Lviv-Sokal"));
        hotelManager.addHotel(new LuxuryHotel("Lion", 5, 14,1,4));
        hotelManager.addHotel(new EcoHotel("Flower", 2, true,0,1));
        hotelManager.addHotel(new ResortHotel("Zirka", 4, 5, 4));
        hotelManager.addHotel(new Motel(4, 142, "Sokal", "Chervonograd", "Sokal-Chervonograd"));
        hotelManager.addHotel(new LuxuryHotel("Astra", 4, 11,4,2));
        hotelManager.addHotel(new EcoHotel("Tree", 5, false,1,5));

        for (Hotel hotel : hotelManager.hotels) {
            System.out.println(hotel);
            System.out.println("Location:" + hotel.getLocation());
        }
        System.out.println("\n");
        var hotelWithAvailableRooms = hotelManager.findHotelWithAvailableRooms(1);
        System.out.println("Hotel with available rooms:");

        for (Hotel hotel : hotelWithAvailableRooms) {
            System.out.println((hotel));
        }
        System.out.println("\n");
        var hotelWithRating = hotelManager.findHotelWithRatingMoreThan(4);
        System.out.println("Hotel with rating:");
        for (Hotel hotel : hotelWithRating) {
            System.out.println(hotel);
        }
    }
}
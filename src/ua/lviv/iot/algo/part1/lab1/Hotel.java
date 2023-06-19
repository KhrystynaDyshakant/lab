package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hotel {
    private String name;
    private int totalRooms;
    private int availableRooms;
    private int rating;
    private static Hotel instance;

    public Hotel() {
    }

    public Hotel(String name, int totalRooms, int availableRooms, int rating) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.availableRooms = availableRooms;
        this.rating = rating;
    }

    public static Hotel getInstance() {
        if (instance == null) {
            instance = new Hotel();
        }
        return instance;
    }

    public void bookRoom() {
        if (availableRooms > 0) {
            availableRooms--;
        }
    }

    public void releaseRoom() {
        availableRooms++;
    }

    public int getAvailableRooms() {
        return availableRooms;
    }

    public int getBookedRoomsCount() {
        return totalRooms - availableRooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", totalRooms=" + totalRooms +
                ", availableRooms=" + availableRooms +
                ", rating=" + rating +
                '}';
    }

    public static void main(String[] args) {
        Hotel hotel1 = new Hotel();
        Hotel hotel2 = new Hotel("Grand ", 100, 80, 4);
        Hotel hotel3 = Hotel.getInstance();
        Hotel hotel4 = Hotel.getInstance();
        Hotel[] hotels = {hotel1, hotel2, hotel3, hotel4};
        for (Hotel hotel : hotels) {
            System.out.println(hotel.toString());
        }
    }
}

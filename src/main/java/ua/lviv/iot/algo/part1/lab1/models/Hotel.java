package ua.lviv.iot.algo.part1.lab1.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Hotel {
    private String name;
    private int totalRooms;
    private int availableRooms;
    private int rating;
    private static Hotel defaultHotel;

    public static Hotel getInstance() {
        return defaultHotel;
    }

    public Hotel() {
    }

    public Hotel(String name, int totalRooms, int availableRooms, int rating) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.availableRooms = availableRooms;
        this.rating = rating;
    }

    public final void bookRoom() {
        if (availableRooms > 0) {
            availableRooms--;
        } else {
            System.out.println("Зменшує кількість вільних кімнат на 1");
        }
    }

    public final void releaseRoom() {
        availableRooms++;
    }

    public final int getAvailableRooms() {
        return availableRooms;
    }

    public final int getBookedRoomsCount() {
        return totalRooms - availableRooms;
    }

    public String toString() {
        return "Hotel " + "name='" + name + '\'' + ", totalRooms=" + totalRooms + ", availableRooms=" +
                availableRooms +
                ", rating=" + rating;
    }

    public abstract String getLocation();

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getHeaders() {
        return "name, totalRooms, availableRooms, rating,";
    }

    public String toCSV() {
        return getName() + ", " + getTotalRooms() + ", " + getAvailableRooms() + ", " + getRating() + " ";
    }
}


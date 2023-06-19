package ua.lviv.iot.algo.part1.lab1.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class LuxuryHotel extends Hotel {
    private String name;
    private int numberOfSpaRooms;
    private int numberOfService;


    public LuxuryHotel() {
        super();
    }


    public LuxuryHotel(String name, int numberOfSpaRooms, int numberOfService, int availableRoom, int rating, int totalRooms) {
        super(name, availableRoom, rating, totalRooms);
        this.name = name;
        this.numberOfSpaRooms = numberOfSpaRooms;
        this.numberOfService = numberOfService;

    }

    public int getNumberOfSpaRooms() {
        this.numberOfSpaRooms = numberOfSpaRooms;
        return 0;
    }


    public int increaseNumberOfSpaRooms() {
        this.numberOfSpaRooms += 1;
        return 1;
    }

    public int addNumberOfService() {
        this.numberOfService++;
        return 0;
    }


    public String getLocation() {
        return null;
    }

    public String getHeaders() {
        return super.getHeaders() + ", name, numberOfSpaRooms, numberOfService";
    }

    public String toCSV() {
        return super.toCSV() + ", " + name + ", " + numberOfSpaRooms + ", " + numberOfService;
    }
}





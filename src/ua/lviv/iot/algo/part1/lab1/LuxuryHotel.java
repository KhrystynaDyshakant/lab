package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
public class LuxuryHotel extends Hotel {
    private String name;
    private int numberOfSpaRooms;
    private int numberOfService;
    private int availableRoom;
    private int rating;

    public LuxuryHotel() {
    }


    public LuxuryHotel(String name, int numberOfSpaRooms, int numberOfService, int availableRoom, int rating) {
        this.name = name;
        this.numberOfSpaRooms = numberOfSpaRooms;
        this.numberOfService = numberOfService;
        this.availableRoom=availableRoom;
        this.rating=rating;
    }

    public void getNumberOfSpaRooms() {
        this.numberOfSpaRooms = numberOfSpaRooms;
    }
    public int getAvailableRooms(){
        return availableRoom;
    }
    public int getRating(){
        return rating;
    }
    public void increaseNumberOfSpaRooms(int amount) {
        this.numberOfSpaRooms += amount;
    }

    public void addNumberOfService() {
        this.numberOfService++;
    }

    @Override
    public String toString() {
        return "LuxuryHotel {" +
                " name=" + name +
                " availableRoom="  + availableRoom +
                " rating=" +  rating  +
                " numberOfSpaRooms=" + numberOfSpaRooms +
                " kilometerOfService=" + numberOfService + '\'' +
                "} " + super.toString();
    }

    @Override
    public String getLocation() {
        return null;
    }
}
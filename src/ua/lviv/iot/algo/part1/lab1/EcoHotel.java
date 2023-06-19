package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
public class EcoHotel extends Hotel {
    private String name;
    private int gym;
    private boolean garden;
    private int availableRooms;
    private int rating;

    public EcoHotel() {
    }



    public EcoHotel(String name, int gym, boolean garden,int availableRooms, int rating) {
        this.name = name;
        this.gym = gym;
        this.garden = garden;
        this.availableRooms=availableRooms;
        this.rating=rating;


    }
    public int getAvailableRooms(){
        return availableRooms;
    }
    public int getRating() {
        return rating;
    }

    public void setGarden(boolean hasGarden) {
        this.garden = hasGarden;
    }

    public void getCountGyms(int countGyms) {

        int gymCount = 0;

        return;
    }

    @Override
    public String toString() {
        return "EcoHotel {" +
                " name=" + name +
                " gym=" + gym +
                " garden=" + garden + '\'' +
                "} " + super.toString();
    }

    @Override
    public String getLocation() {
        return null;
    }
}
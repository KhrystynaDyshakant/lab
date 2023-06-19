package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
public class EcoHotel extends Hotel {

    private int gym;
    private boolean garden;

    public EcoHotel() {
        super();

    }

    public EcoHotel(String name, int gym, boolean garden, int availableRooms, int rating, int totalRooms) {
        super(name,availableRooms,rating,totalRooms);
        this.gym = gym;
        this.garden = garden;
    }

    public boolean hasGarden() {
        return true;
    }

    public int numberOfCountGyms() {
        int gymCount = 0;
        return 1;
    }


    public String getLocation() {
        return null;
    }

    public boolean getGarden() {
        return false;
    }

    public int getGymCount() {
        return 0;
    }
}
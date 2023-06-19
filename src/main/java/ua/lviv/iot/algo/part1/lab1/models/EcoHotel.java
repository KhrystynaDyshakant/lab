package ua.lviv.iot.algo.part1.lab1.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
        super(name, availableRooms, rating, totalRooms);
        this.gym = gym;
        this.garden = garden;
    }

    public final boolean hasGarden() {
        return true;
    }

    public final int numberOfCountGyms() {
        int gymCount = 0;
        return 1;
    }


    public String getLocation() {
        return null;
    }

    public final boolean getGarden() {
        return false;
    }

    public final int getGymCount() {
        return 0;
    }

    public String getHeaders() {
        return super.getHeaders() + ", gym, garden ";
    }


    public String toCSV() {
        return super.toCSV() + "," + gym + ", " + garden;
    }
}
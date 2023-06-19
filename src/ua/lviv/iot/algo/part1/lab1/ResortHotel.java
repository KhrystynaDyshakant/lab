package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)

public class ResortHotel extends Hotel {
    private String name;
    private int numberOfRestaurants;
    private int numberPoolsForAdults;
    private int numberPoolsForChildren;

    private static ResortHotel defaultResortHotel = new ResortHotel();

    public ResortHotel() {
    }


    public ResortHotel(String name, int numberOfRestaurants, int numberPoolsForChildren, int numberPoolsForAdults) {
        this.name = name;
        this.numberOfRestaurants = numberOfRestaurants;
        this.numberPoolsForAdults = numberPoolsForAdults;
        this.numberPoolsForChildren = numberPoolsForChildren;
    }

    public String getName() {
        return name;
    }


    public String getLocation() {
        return this.getName();
    }

    @Override
    public String toString() {
        return "ResortHotel{" +
                "  numberPoolsForChildren=" + numberPoolsForChildren +
                "  numberPoolsForAdults=" + numberPoolsForAdults +
                ", numberOfRestaurants=" + numberOfRestaurants +
                ", Name='" + name + '\'' +
                "} " + super.toString();
    }
}

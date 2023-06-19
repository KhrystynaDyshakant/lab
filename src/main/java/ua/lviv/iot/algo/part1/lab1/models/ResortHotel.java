package ua.lviv.iot.algo.part1.lab1.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

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

    public final String getName() {
        return name;
    }


    public String getLocation() {
        return this.getName();
    }

    public String toString() {
        return "ResortHotel{" +
                "  numberPoolsForChildren=" + numberPoolsForChildren +
                "  numberPoolsForAdults=" + numberPoolsForAdults +
                ", numberOfRestaurants=" + numberOfRestaurants +
                ", Name='" + name + '\'' +
                "} ";
    }

    public String getHeaders() {
        return super.getHeaders() + ", numberOfRestaurants, numberPoolsForAdults, numberPoolsForChildren";
    }

    public String toCSV() {
        return super.toCSV() + ", " + numberOfRestaurants + ", " + numberPoolsForAdults + ", " + numberPoolsForChildren;
    }
}


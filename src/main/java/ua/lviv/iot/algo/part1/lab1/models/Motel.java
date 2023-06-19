package ua.lviv.iot.algo.part1.lab1.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Motel extends Hotel {
    private int numberOfTrack;
    private int kilometerOfTrack;
    private String startCity;
    private String endCity;
    private  String nameOfTrack;
    private static Motel defaultMotel = new Motel();


    public String getLocation() {
        return this.getNameOfTrack() + "," + this.getKilometerOfTrack() + "км";
    }

    public String getNameOfTrack() {
        return nameOfTrack;
    }

    public final int getKilometerOfTrack() {
        return kilometerOfTrack;
    }

    public Motel() {
    }

    ;

    public Motel(int numberOfTrack, int kilometerOfTrack, String startCity, String endCity, String nameOfTrack) {
        this.numberOfTrack = numberOfTrack;
        this.kilometerOfTrack = kilometerOfTrack;
        this.startCity = startCity;
        this.endCity = endCity;
        this.nameOfTrack = nameOfTrack;
    }
    ;
    public String toString() {
        return "Motel{" +
                " nameOfTrack=" + nameOfTrack + " numberOfTrack=" + numberOfTrack + " kilometerOfTrack=" +
                kilometerOfTrack + " startCity=" + startCity + " endCity='" + endCity + '\'' + "} ";
    }

    public String getHeaders() {
        return super.getHeaders() + ", numberOfTrack, kilometerOfTrack, startCity, endCity, nameOfTrack";
    }

    public String toCSV() {
        return super.toCSV() + ", " + numberOfTrack + ", " + kilometerOfTrack + ", " + startCity + ", " + endCity
                + ", " + nameOfTrack;

    }
}

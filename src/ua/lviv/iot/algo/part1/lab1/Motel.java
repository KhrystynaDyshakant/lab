package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
public class Motel extends Hotel {
    private int numberOfTrack;
    private int kilometerOfTrack;
    private String startCity;
    private String endCity;
    private String nameOfTrack;
    private static Motel defaultMotel = new Motel();

    @Override
    public String getLocation() {
        return this.getNameOfTrack() + "," + this.getKilometerOfTrack() + "км";
    }

    public String getNameOfTrack() {
        return nameOfTrack;
    }

    public int getKilometerOfTrack() {
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

    @Override
    public String toString() {
        return "Motel{" +
                " nameOfTrack=" + nameOfTrack +
                " numberOfTrack=" + numberOfTrack +
                " kilometerOfTrack=" + kilometerOfTrack +
                ",startCity=" + startCity +
                ",endCity='" + endCity + '\'' +
                "} " + super.toString();
    }
}
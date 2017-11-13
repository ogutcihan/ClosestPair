package com.deloitte.ogutcihan;


import java.util.ArrayList;

/**
 * Created by cihanogut on 13.11.2017.
 */
public class Point {

    ArrayList<Double> coordinates;

    public Point() {
    }

    public Point(int number, ArrayList<Double> coordinates) {
        this.coordinates = coordinates;
    }

    public ArrayList<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<Double> coordinates) {
        this.coordinates = coordinates;
    }
}

package com.deloitte.ogutcihan;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        String filePath = "";
        ArrayList<Point> points;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter File Path to Calculate:");
        filePath = scanner.nextLine();
        points = readInputFile(filePath);
        findClosest(points);
    }

    public static void findClosest(ArrayList<Point> points) {
        Point point1 = null;
        Point point2 = null;
        double distance = Double.MAX_VALUE;
        if (points.size() < 2) {
            System.out.println("At least 2 points needed.");
        }
        else if (points.size() == 2) {
            point1 = points.get(0);
            point2 = points.get(1);
            distance = distance(point1, point2);
        }
        else {
            for (int i = 0; i < points.size() - 1; i++) {
                for (int j = i + 1; j < points.size(); j++) {
                    if (points.get(i).coordinates.size() == points.get(j).coordinates.size()) {
                        double tempDistance = distance(points.get(i), points.get(j));
                        if (tempDistance < distance) {
                            point1 = points.get(i);
                            point2 = points.get(j);
                            distance = tempDistance;
                        }
                    }
                }
            }
        }
        System.out.println("Point 1: " + point1.coordinates + "\n"
                + "Point 2: " + point2.coordinates + "\n"
                + "Distance : " + distance + "\n");
    }

    private static double distance(Point p1, Point p2) {
        double distance;
        double difference;
        distance = 0;
        difference = 0;
        for (int i = 0; i < p1.coordinates.size(); i++) {
            difference = p1.coordinates.get(i) - p2.coordinates.get(i);
            distance = distance + Math.pow(difference, 2);
        }
        return Math.sqrt(distance);
    }

    public static ArrayList<Point> readInputFile(String path) throws Exception{
        FileReader fileReader;
        BufferedReader buff;
        try{
            String textFromFile;
            String line;
            int index = 0;

            ArrayList<Double> coordinates;
            ArrayList<Point> points;
            Point p;
            points = new ArrayList<Point>();

            fileReader = new FileReader(path);
            buff = new BufferedReader(fileReader);

            while ((line = buff.readLine()) != null) {
                coordinates = new ArrayList<>();
                p = new Point();
                String[] lines = line.split("\t");

                for (int i = 0; i < lines.length; i++) {
                    coordinates.add(Double.parseDouble(lines[i]));
                }

                p.setCoordinates(coordinates);
                points.add(p);
            }
            buff.close();
            return points;
        }
        catch (Exception ex)
        {
            throw ex;
        }

    }


}

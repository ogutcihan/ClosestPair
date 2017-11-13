package com.deloitte.ogutcihan;

/**
 * Created by cihanogut on 13.11.2017.
 */
public class FileOps {


    public static ArrayList<Point> prepareInputFile(String path) {
        FileReader fr;
        BufferedReader br;

        String textFromFile;
        String line;
        int index = 0;

        ArrayList<Double> coordinates;
        ArrayList<Point> pointList;

        Point p;

        pointList = new ArrayList<Point>();


        try {

            fr = new FileReader(path);
            br = new BufferedReader(fr);

            while ((line = br.readLine()) != null) {
                coordinates = new ArrayList<>();
                p = new Point();
                String[] lines = line.split("\t");

                for (int i = 0; i < lines.length; i++) {
                    coordinates.add(Double.parseDouble(lines[i]));
                }

                p.setLineNumber(++index);
                p.setCoordinates(coordinates);
                pointList.add(p);
            }
            br.close();

        } catch (Exception ex) {
            //throw ex;
        }


        return pointList;
    }
}

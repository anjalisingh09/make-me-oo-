package org.oop;

public class DistanceAndDirectionCalculator {
    public static double distance(Point from, Point to) {
         Calculator cal = new Calculator();
         double result = cal.distance(from, to);
         return result;
    }

    public static double direction(Point from, Point to) {
        Calculator cal = new Calculator();
        double result = cal.direction(from, to);
        return result;
    }
}

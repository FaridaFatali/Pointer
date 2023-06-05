package com.mycompany.pointer;

/**
 *
 * @author Farida Fatali
 */
public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(6, 8);
        
        System.out.println("Point 1 coordinates: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point 2 coordinates: (" + point2.getX() + ", " + point2.getY() + ")");
        System.out.println();
        
        double distanceToOrigin1 = point1.calculateDistanceToOrigin();
        double distanceToOrigin2 = point2.calculateDistanceToOrigin();
        
        System.out.println("Distance from Point 1 to origin: " + distanceToOrigin1);
        System.out.println("Distance from Point 2 to origin: " + distanceToOrigin2);
        System.out.println();
        
        double distanceBetweenPoints = point1.calculateDistanceTo(point2);
        System.out.println("Distance between Point 1 and Point 2: " + distanceBetweenPoints);
        System.out.println();
        
        try{
            Point point1Clone = point1.clone();
            System.out.println("Cloned Point 1 coordinates: (" + point1Clone.getX() + ", " + point1Clone.getY() + ")");
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        System.out.println();
        
        point1.move('x', 2.5);
        point2.move('y', -3);
        
        System.out.println("Updated Point 1 coordinates: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Updated Point 2 coordinates: (" + point2.getX() + ", " + point2.getY() + ")");
        System.out.println();
    }
}

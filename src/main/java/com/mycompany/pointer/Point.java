package com.mycompany.pointer;

/**
 *
 * @author Farida Fatali
 */
public class Point implements Cloneable{
    private double x;
    private double y;
    
    public Point(){
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calculateDistanceToOrigin(){
        return Math.sqrt(x * x + y * y);
    }
    
    public double calculateDistanceTo(Point otherPoint){
        double deltaX = x - otherPoint.getX();
        double deltaY = y - otherPoint.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    
    @Override
    protected Point clone() throws CloneNotSupportedException{
        return (Point) super.clone();
    }
    
    public void move(char direction, double amount){
        switch(direction){
            case 'x':
                x += amount;
                break;
            case 'y':
                y += amount;
                break;
            default:
                System.out.println("Invalid direction specified!");
        }
    }
}


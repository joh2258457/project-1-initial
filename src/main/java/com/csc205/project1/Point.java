package com.csc205.project1;

public class Point {
    private double x;
    private double y;
    public Point() {
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
//  Setter method for x coordinate
    public void setX(double x) {
        this.x = x;
    }
//  Setter method for y coordinate
    public void setY(double y) {
        this.y = y;
    }
//    Getter method for x coordinate
    public double getX() {
        return x;
    }
    //  Getter method for y coordinate
    public double getY() {
        return y;
    }

//    Sets the point at the given x and y coordinates using the two methods setX and setY
    public void setPoint(double x, double y) {
        setX(x);
        setY(y);
    }

//    Calculates the distance between the two points
    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
    }
//  Shifts x value
    public void shiftX(double n) {
        this.x += n;
    }
//  Shifts y value
    public void shiftY(double n) {
        this.y += n;
    }

//    Using math class to calculate the rotation
    public void rotate(double angle) {
        double x = this.x; // assign x to stay the same and not become the new x position
        this.x = this.x * Math.cos(angle) - this.y * Math.sin(angle);
        this.y = (x * Math.sin(angle)) + (this.y * Math.cos(angle));
    }
//    Overrides the toString method, so that I can show the point coordinates from the Point class
    @Override
    public String toString() {
        return "{x=" + this.x + ", y=" + this.y + "}";
    }
}

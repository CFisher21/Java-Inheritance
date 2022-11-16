package org.example.question2;

public class Circle extends Shape {
    double radius;

    // Constructor
    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getters
    public double getRadius() {
        return this.radius;
    }
    // Return the area of the circle
    public double getArea() {
        double area = Math.PI*radius*radius;
        return area;
    }
    // Return perimeter of the circle
    public double getPerimeter() {
        double perimeter = (Math.PI * 2) * this.radius;
        return perimeter;
    }

    // Setters
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // toString()
    public String toString() {
        return super.toString() + " It is a circle with an area of " + this.getArea() + " and a perimeter of: " + this.getRadius();
    }
}

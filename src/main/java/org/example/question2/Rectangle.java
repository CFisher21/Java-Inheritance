// Imports
package org.example.question2;

public class Rectangle extends Shape {
    double width;
    double length;

    // Constructors
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getters
    public double getWidth() {
        return this.width;
    }
    public double getLength() {
        return this.length;
    }
    public double getArea() {
        return this.width * this.length;
    }
    public double getPerimeter() {
        return this.width + this.length * 2;
    }

    // Setters
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }

    // toString()
    public String toString() {
        return super.toString() + " It is a rectangle with an area of " + this.getArea() + " and a perimeter of " + this.getPerimeter();
    }

}

// Imports
package org.example.question2;

public class Square extends Rectangle {

    // Constructors
    public Square() {
        super();
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getters
    public double getSide() {
        return super.length;
    }

    // Setters
    public void setSide(double side) {
        super.length = side;
        super.width = side;
    }

    public void setLength(double side){
        this.length = side;
        this.width = side;
    }
    public void setWidth(double side){
        this.length = side;
        this.width = side;
    }

    // toString()
    public String toString() {
        return super.toString() + "A square with sides of " + this.getSide();
    }

}

// Imports
package org.example.question2;

public class Shape {
    // Instance Variables
    protected String color;
    protected boolean filled;

    // Constructor
    public Shape() {
        this.color = "green";
        this.filled = true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getters
    public String getColor() {return this.color;}
    public boolean isFilled() {return this.filled;}

    // Setters
    public void setColor(String color) {this.color = color;}
    public void setFilled(boolean filled) {this.filled = filled;}

    // toString()
    public String toString() {
        if(this.filled) {
            return "This shape has a color of " + this.color + " and is filled.";
        } else {
            return "This shape has a color of " + this.color + " and is not filled.";
        }

    }
}


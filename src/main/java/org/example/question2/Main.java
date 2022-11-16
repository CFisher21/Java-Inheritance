// Imports
package org.example.question2;

public class Main {
    public static void main(String[] args) {
        // Instantiating
        Shape S = new Shape("red", true);
        Circle C = new Circle(5.0);
        Circle C1 = new Circle(5.0, "blue", true);
        Rectangle R = new Rectangle(2.0, 3.0);
        Rectangle R1 = new Rectangle(2.0, 3.0, "green", false);
        Square Sq = new Square(40);
        Square Sq1 = new Square(4.0, "yellow", true);

        // Printing to console
        System.out.println(S.toString());

        System.out.println(C.toString());
        System.out.println(C.getArea());
        System.out.println(C.getPerimeter());

        System.out.println(C1.toString());
        System.out.println(C1.getArea());
        System.out.println(C1.getPerimeter());

        System.out.println(R.toString());
        System.out.println(R.getArea());
        System.out.println(R.getPerimeter());

        System.out.println(R1.toString());
        System.out.println(R1.getArea());
        System.out.println(R1.getPerimeter());

        System.out.println(Sq.toString());
        System.out.println(Sq.getArea());
        System.out.println(Sq.getPerimeter());

        System.out.println(Sq1.toString());
        System.out.println(Sq1.getArea());
        System.out.println(Sq1.getPerimeter());

    }
}

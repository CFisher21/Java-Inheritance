// Imports
package org.example.question1;

public class Main {
    public static void main(String[] args) {
        // Instantiating
        Person bob = new Person("Coach Bob", 27, "M");
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, "English", 1);

        // System.out
        System.out.println("**Person**");
        System.out.println(bob.toString());
        System.out.println();
        System.out.println("**Student**");
        System.out.println(lynne.toString());
        System.out.println();
        System.out.println("**Teacher**");
        System.out.println(mrJava.toString());
        System.out.println();
        System.out.println("**CollegeStudent**");
        System.out.println(ima.toString());
        System.out.println();
    }
}

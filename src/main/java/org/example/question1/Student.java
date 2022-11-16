// Imports
package org.example.question1;

public class Student extends Person {
    protected String myIdNum; // Student ID number
    protected double myGPA; // grade point average

    // Constructor
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);

        this.myIdNum = idNum;
        this.myGPA = gpa;
    }

    // *Getters*
    public String getIdNum(){
        return this.myIdNum;
    }
    public double getGPA(){
        return this.myGPA;
    }

    // *Setters*
    public void setIdNum(String idNum) {this.myIdNum = idNum;}
    public void setGPA(double gpa){this.myGPA = gpa;}

}

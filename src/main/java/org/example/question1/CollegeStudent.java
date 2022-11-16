// Imports
package org.example.question1;

import org.example.question1.Student;

public class CollegeStudent extends Student {
    protected String major; // What the student is majoring in
    protected int year; // the year the student graduates

    // Class Constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year) {
        super(name, age, gender, idNum, gpa);
        this.major = major;
        this.year = year;
    }

    // *Getters*
    public String getMajor() {return this.major;}
    public int getYear() {return this.year;}

    // *Setters*
    public void setMajor(String major) {this.major = major;}
    public void setYear(int year) {this.year = year;}

    // *toString()*
    public String toString() {return "Name: " + super.myName + "\nAge: " + super.myAge + "\nGender: " + super.myGender + "\nMajor: " + this.major + "\nYear: " + this.year;}
}


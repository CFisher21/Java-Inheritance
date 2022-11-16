// Imports
package org.example.question1;

public class Teacher extends Person {

    protected String subject; // Subject the teacher teaches
    protected double salary; // Salary of the teacher

    // Constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // *Getters*
    public String getSubject() {return this.subject;}
    public double getSalary() {return this.salary;}

    // *Setters*
    public void setSubject(String subject) {this.subject = subject;}
    public void setSalary(double salary) {this.salary = salary;}

    // *toString*
    public String toString() {return "Name: " + super.myName + "\nAge: " + super.myAge + "\nGender: " + super.myGender + "\nSubject: " + this.subject + "\nSalary: " + this.salary;}
}

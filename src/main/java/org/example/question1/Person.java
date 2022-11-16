// Imports
package org.example.question1;

public class Person {
    protected String myName; // name of the person
    protected int myAge; // age of person
    protected String myGender; // gender of person M = male F = female

    // Constructor
    public Person(String name, int age, String gender) {
        this.myName = name;
        this.myAge = age;
        this.myGender = gender;
    }
    // *Getters*
    public String getName() {return this.myName;}
    public int getAge() {return this.myAge;}
    public String getGender() {return this.myGender;}

    // *Setters*
    public void setName(String name){this.myName = name;}
    public void setAge(int age) {this.myAge = age;}
    public void setGender(String gender) {this.myGender = gender;}

    public String toString() {return "Name: " + myName + "\nAge: " + myAge + "\nGender: " + myGender;}
}
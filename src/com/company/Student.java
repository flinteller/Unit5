package com.company;// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student’s info.
// ****************************************************************
import java.util.Scanner;

public class Student
{
    //declare instance data
    private String studentName;
    private double test1;
    private double test2;

    Scanner scan = new Scanner(System.in);


    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        this.studentName = studentName;
        test1 = 0.0;
        test2 = 0.0;

        //add body of constructor
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        System.out.println("Enter " + studentName + " score for test 1: ");
        test1 = scan.nextDouble();
        System.out.println("Enter " + studentName + " score for test 2: ");
        test2 = scan.nextDouble();
        //add body of inputGrades
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    public double getAverage()
    {
    //add header for getAverage
        double average = (test1 + test2) / 2;
        //add body of getAverage
        return average;
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------
    public String getName()
    {
        return studentName;
        //add header for printName

        //add body of printName
    }

    // toString method:  Output in the following format
    // Name: Joe  Test1: 85  Test2: 91

    public String toString(){
        return "Name: " + studentName + " test 1: " + test1 + " test 2: " + test2;
    }

}

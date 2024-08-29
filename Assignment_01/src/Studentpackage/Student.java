package Studentpackage;

import java.util.Scanner;

// Student class
public class Student {
    // Data members
    protected String name;
    protected int roll;

    // Method to input student details
    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter student roll number: ");
        roll = sc.nextInt();
    }

    // Method to display student details
    public void showDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + roll);
    }
}


package Studentpackage;

import java.util.Scanner;

// Test class that extends Student
public class Test extends Student {
    // Data members for Test marks
    protected int mark1;
    protected int mark2;

    // Method to input test details
    public void inputDetails() {
        // Input student details first
        super.inputDetails();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter mark2: ");
        mark2 = sc.nextInt();
    }

    // Method to display test details
    public void showDetails() {
        // Display student details first
        super.showDetails();
        
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }
}
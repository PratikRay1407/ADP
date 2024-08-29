package sportspackage;
import Studentpackage.Test;
import sportspackage.Sports;

// Result class that calculates total marks and score
public class Result extends Test implements Sports {
    // Method to calculate and display the grand total
    public void displayGrandTotal() {
        // Calculate total marks
        int totalMarks = mark1 + mark2;

        // Calculate total score
        int totalScore = score1 + score2;

        // Calculate grand total
        int grandTotal = totalMarks + totalScore;

        // Display the results
        showDetails();
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Grand Total (Marks + Score): " + grandTotal);
    }

    public static void main(String[] args) {
        // Create Result object and input details
        Result result = new Result();
        result.inputDetails();
        
        // Display the grand total
        result.displayGrandTotal();
    }
}
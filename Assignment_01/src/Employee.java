import java.util.Scanner;

class Employee {
    // Instance variables
    String name;
    double salary;
    int age;

    // Method to set data
    void setData(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    // Method to display data
    void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }

    // Method to check who is older
    static void checkOlder(Employee e1, Employee e2) {
        if (e1.age > e2.age) {
            System.out.println(e1.name + " is older than " + e2.name);
        } else if (e1.age < e2.age) {
            System.out.println(e2.name + " is older than " + e1.name);
        } else {
            System.out.println(e1.name + " and " + e2.name + " are of the same age.");
        }
    }

    public static void main(String[] args) {
        // Create the first Employee object and set data directly
        Employee emp1 = new Employee();
        emp1.name = "Joseph";
        emp1.salary = 65784.50;
        emp1.age = 25;

        // Create the second Employee object and set data using setData() method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        Employee emp2 = new Employee();
        emp2.setData(name, salary, age);

        // Display data for both employees
        System.out.println("\nEmployee 1 Details:");
        emp1.displayData();

        System.out.println("\nEmployee 2 Details:");
        emp2.displayData();

        // Check who is older
        checkOlder(emp1, emp2);
        
        scanner.close();
    }
}
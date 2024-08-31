package Q03;

public class ArrayIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {

        try {

            int[] arr = {1, 2, 3};

            System.out.println(arr[5]); // This will throw ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());

        }

    }
    
    

}
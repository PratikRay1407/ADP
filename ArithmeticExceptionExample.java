package Q03;

public class ArithmeticExceptionExample {

    public static void main(String[] args) {

        try {

            int result = 10 / 0; // This will throw ArithmeticException

        } catch (ArithmeticException e) {

            System.out.println("Caught ArithmeticException: " + e.getMessage());

        }

    }

}
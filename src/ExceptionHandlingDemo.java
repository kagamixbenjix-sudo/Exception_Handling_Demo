
public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        try {
            int result = calculator.divide(10, 0);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Program execution completed.");
        }

    }
}


public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        // Test 1: Normal division
        performDivision(calculator, 10, 2);

        // Test 2: Division by zero
        performDivision(calculator, 10, 0);

        // Test 3: Another normal division
        performDivision(calculator, 20, 4);

    }

    public static void performDivision(
            Calculator calculator, int a, int b) {

        try {
            int result = calculator.divide(a, b);

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("Operation completed.");
            System.out.println("------------------------");
        }
    }
}

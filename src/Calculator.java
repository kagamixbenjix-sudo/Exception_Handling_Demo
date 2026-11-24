public class Calculator {

    public int divide(int a, int b) {

        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }

    }

}

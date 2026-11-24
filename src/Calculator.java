public class Calculator {

    public int divide(int a, int b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException(
                    "Division by zero is not allowed!"
            );
        }

        return a / b;
    }

}

public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int result = calculator.divide(10, 0);

        System.out.println("Result: " + result);

    }

}

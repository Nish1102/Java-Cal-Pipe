public class Calculator {

    // Addition method
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction method
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication method
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Division method
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN; // NaN (Not a Number) represents an undefined or unrepresentable value
        }
    }

    public static void main(String[] args) {
        // Example usage
        double operand1 = 10.5;
        double operand2 = 5.2;

        System.out.println("Addition: " + add(operand1, operand2));
        System.out.println("Subtraction: " + subtract(operand1, operand2));
        System.out.println("Multiplication: " + multiply(operand1, operand2));
        System.out.println("Division: " + divide(operand1, operand2));
    }
}

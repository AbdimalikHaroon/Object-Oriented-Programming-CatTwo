public class MathOperations {
    // First method
    static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    // Second method
    static int multiplication(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public static void main(String[] args) {
        int value1 = multiplication(2, 3);
        int value2 = multiplication(2, 3, 4);

        // Print the result of the operation
        System.out.println("Value of the first multiplication: " + value1);
        System.out.println("Value of the second multiplication: " + value2);
    }
}

public class MultiplyWithoutOperator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int product = multiply(num1, num2);
        System.out.println("Product: " + product);
    }

    public static int multiply(int a, int b) {
        int result = 0;
        while (b > 0) {
            if ((b & 1) != 0) {
                result += a;
            }
            a <<= 1;
            b >>= 1;
        }
        return result;
    }
}

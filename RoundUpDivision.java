public class RoundUpDivision {
    public static void main(String[] args) {
        int dividend = 13;
        int divisor = 5;

        // Perform integer division
        int result = dividend / divisor;

        // Round up the result
        if (dividend % divisor != 0) {
            result++;
        }

        // Output the result
        System.out.println("Result of integer division: " + result);
    }
}

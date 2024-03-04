import java.util.Scanner;
import java.lang.Integer;
public class BinaryConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        String binary = Integer.toBinaryString(num);
        int countZeros = 0;
        for (char c : binary.toCharArray()) {
            if (c == '0') {
                countZeros++;
            }
        }
        System.out.println("Number of zeros in binary representation: " + countZeros);
        scanner.close();
    }
}

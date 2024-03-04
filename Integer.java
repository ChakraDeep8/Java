import java.util.Scanner;
public class Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");
        int num = scanner.nextInt();
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("The sum of all digits is " + sum);
        scanner.close();
    }
    
}


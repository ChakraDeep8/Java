import java.util.*;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input distance in meters: ");
        double distance = scanner.nextDouble();
        System.out.print("Input hour: ");
        int hour = scanner.nextInt();
        System.out.print("Input minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Input seconds: ");
        int seconds = scanner.nextInt();

        double totalSeconds = (hour * 3600) + (minutes * 60) + seconds;
        double mps = distance / totalSeconds;
        double kph = (distance / 1000.0) / (totalSeconds / 3600.0);
        double mph = kph / 1.609;

        System.out.println("Your speed in meters/second is " + Math.round(mps));
        System.out.println("Your speed in km/h is " + Math.round(kph));
        System.out.println("Your speed in miles/h is " + Math.round(mph));

        scanner.close();
    }
}



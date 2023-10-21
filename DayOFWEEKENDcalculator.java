import java.util.Scanner;

public class DayOFWEEKENDcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");
        int dayNumber = scanner.nextInt();

        String dayOfWeek;

        switch (dayNumber) {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Invalid input. Please enter a number between 1 and 7.";
        }

        System.out.println("Day of the week: " + dayOfWeek);

        scanner.close();
    }
}


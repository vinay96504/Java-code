import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        if (number < 0) {
            System.out.println("Please enter a non-negative number.");
            
        }

        long originalNumber = number;
        long sum = 0;

        while (number > 0) {
            long digit = number % 10; 
            sum += digit;             
            number /= 10;             
        }

        System.out.println("The sum of digits in " + originalNumber + " is: " + sum);

        scanner.close();
    }
}


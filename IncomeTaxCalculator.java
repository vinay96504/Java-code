import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your income: $");
        double income = scanner.nextDouble();

        double tax = 0.0;

        if (income < 10000) {
            tax = 0.0;
        } else if (income >= 10000 && income <= 20000) {
            tax = 0.10 * (income - 10000);
        } else if (income > 20000 && income <= 30000) {
            tax = 0.10 * 10000 + 0.15 * (income - 20000);
        } else if (income > 30000) {
            tax = 0.10 * 10000 + 0.15 * 10000 + 0.25 * (income - 30000);
        }

        System.out.println("Income Tax: $" + tax);

        scanner.close();
    }
}

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total bill amount: $");
        double billAmount = scanner.nextDouble();

        double discount = 0.0;
        double discountedAmount = 0.0;

        if (billAmount >= 1000 && billAmount < 5000) {
            discount = 0.05; // 5% discount
        } else if (billAmount >= 5000 && billAmount < 10000) {
            discount = 0.10; // 10% discount
        } else if (billAmount >= 10000 && billAmount < 20000) {
            discount = 0.15; // 15% discount
        } else if (billAmount >= 20000) {
            discount = 0.25; // 25% discount
        }

        discountedAmount = billAmount - (billAmount * discount);

        // Print the bill receipt
        System.out.println("\n===== Bill Receipt =====");
        System.out.println("Total Bill Amount: $" + billAmount);
        System.out.println("Discount Applied: " + (discount * 100) + "%");
        System.out.println("Discounted Amount: $" + discountedAmount);
        System.out.println("========================");

        scanner.close();
    }
}


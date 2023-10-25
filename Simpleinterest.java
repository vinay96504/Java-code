import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the rate of interest (in percentage): ");
        double rate = scanner.nextDouble();

        
        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

    
        double interest = calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest: " + interest);

        scanner.close();
    }

    
    public static double calculateSimpleInterest(double principal, double rate, double time) {
    
        

    
        double interest = (principal * rate * time)/100;

        return interest;
    }
}

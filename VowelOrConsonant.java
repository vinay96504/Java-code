import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().toLowerCase().charAt(0);

        if ((inputChar >= 'a' && inputChar <= 'z')) {
            if (inputChar == 'a' || inputChar == 'e' || inputChar == 'i' || inputChar == 'o' || inputChar == 'u') {
                System.out.println(inputChar + " is a vowel.");
            } else {
                System.out.println(inputChar + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid alphabet character.");
        }

        scanner.close();
    }
}


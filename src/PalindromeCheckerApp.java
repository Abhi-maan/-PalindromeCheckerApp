import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        //UC1
        System.out.println("Welcome to the palindrome checker management system");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");

        //UC2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text: ");
        String input = scanner.nextLine();
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? : " + isPalindrome);
        scanner.close();
    }
}

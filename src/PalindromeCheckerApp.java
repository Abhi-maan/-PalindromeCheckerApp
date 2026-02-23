import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //UC1
        System.out.println("Welcome to the palindrome checker management system");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");

        /*UC2: Print a Hardcoded Palindrome Result

        System.out.print("Input text: ");
        String input = scanner.nextLine();
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? : " + isPalindrome);*/

        /*UC3: Palindrome Check Using String Reverse

        System.out.print("Input text: ");
        String input = scanner.nextLine();
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        boolean isPalindrome = input.equals(reverse);
        System.out.println("Is it a Palindrome? : " + isPalindrome); */


        /*UC4: Character Array Based Palindrome Check

        System.out.print("Input text: ");
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);*/

        //UC5

        System.out.print("Input text: ");
        String input = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        boolean isPalindrome = true;
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

    }
}

import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //UC9
        System.out.print("Input : ");
        String input = scanner.nextLine();
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        boolean isPalindrome = true;
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is Palindrome? : " + isPalindrome);
        scanner.close();

    }
}

import java.util.Scanner;
import java.util.Stack;
<<<<<<< HEAD
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
=======

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String input = sc.nextLine();
        PalindromeStrategy strategy = new StackStrategy();
        boolean result = strategy.check(input);
        System.out.println("Is Palindrome? : " + result);
        sc.close();
    }
}
>>>>>>> feature/UC12

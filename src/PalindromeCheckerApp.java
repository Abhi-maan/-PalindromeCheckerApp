import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {
    public static boolean isPalindrome(String input, int start, int end) {
        if (start >= end) return true;
        if (input.charAt(start) != input.charAt(end)) return false;
        return isPalindrome(input, start + 1, end - 1);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //UC9
        System.out.print("Input : ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Is Palindrome? : " + result);

        scanner.close();


    }
}

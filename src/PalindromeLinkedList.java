import java.util.*;

public class PalindromePerformance {

    // Method 1: Reverse String
    public static boolean reverseMethod(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return str.equals(reversed);
    }

    // Method 2: Stack Method
    public static boolean stackMethod(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Reverse method timing
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long end1 = System.nanoTime();

        // Stack method timing
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(input);
        long end2 = System.nanoTime();

        System.out.println("\n--- Results ---");

        System.out.println("Reverse Method: " + result1);
        System.out.println("Time Taken: " + (end1 - start1) + " ns");

        System.out.println("\nStack Method: " + result2);
        System.out.println("Time Taken: " + (end2 - start2) + " ns");

        sc.close();
    }
}
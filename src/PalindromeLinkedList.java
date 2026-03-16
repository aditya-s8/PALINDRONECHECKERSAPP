import java.util.Scanner;

public class PalindromeIgnoreCaseSpace {

    public static boolean isPalindrome(String str) {

        // Normalize string: remove spaces and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome (ignoring spaces and case).");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}
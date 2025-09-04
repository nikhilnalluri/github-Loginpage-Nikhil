import java.util.Scanner;

public class PalindromeDemo {

    // Check if string is palindrome
    public static boolean isPalindromeString(String s) {
        String cleaned = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int i = 0, j = cleaned.length() - 1;
        while (i < j) {
            if (cleaned.charAt(i++) != cleaned.charAt(j--)) return false;
        }
        return true;
    }

    // Check if number is palindrome
    public static boolean isPalindromeNumber(int n) {
        int original = n, rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String palindrome check
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        System.out.println(isPalindromeString(input) ? "Palindrome String ✅" : "Not a Palindrome String ❌");
        System.out.println(isPalindromeString(input) ? "Palindrome String ✅" : "Not a Palindrome String ❌");

        // Number palindrome check
        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        System.out.println("Palindromic numbers from " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPalindromeNumber(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
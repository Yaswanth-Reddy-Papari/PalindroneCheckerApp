public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";
        String reversed = "";

        // Reverse string using loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed string
        if (input.equals(reversed)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
        System.out.println("=================================");
        System.out.println(" Welcome to Palindrome Checker App ");
        System.out.println(" Version : 1.0 ");
        System.out.println("=================================");

    }
}
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int reverse = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        if (number == reverse)
            System.out.println(number + " is a Palindrome.");
        else
            System.out.println(number + " is NOT a Palindrome.");
    }
}

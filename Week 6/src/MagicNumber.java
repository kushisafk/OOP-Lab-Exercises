import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        int sum = input;

        // keep reducing until single digit
        while (sum > 9) {
            int temp = sum;
            sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }

        if (sum == 1)
            System.out.println(input + " is a Magic Number.");
        else
            System.out.println(input + " is not a Magic Number.");
    }
}

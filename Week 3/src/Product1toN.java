import java.util.Scanner;

public class Product1toN {
    public static void main(String[] args) {

        int num1 = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            num1 *= i;
        }

        System.out.println("The factorial of " + num2 + " is " + num1);
    }
}

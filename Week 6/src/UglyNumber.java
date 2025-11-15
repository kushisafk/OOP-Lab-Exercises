import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        int temp = input;

        while (temp%2 == 0) temp/=2;
        while (temp%3 == 0) temp/=3;
        while (temp%5 == 0) temp/=5;

        if (temp == 1)
            System.out.println(input + " is an Ugly Number");
        else
            System.out.println(input + " is not an Ugly Number");
    }
}

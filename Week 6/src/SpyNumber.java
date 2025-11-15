import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        int sum=0;
        int prod=1;

        int temp1 = input;
        while(temp1>0){
            sum += temp1%10;
            temp1 /= 10;
        }

        int temp2 = input;
        while (temp2>0){
            prod *= temp2%10;
            temp2 /= 10;
        }

        if (sum==prod) System.out.println(input + " is a Spy Number");
        else System.out.println(input + " is a Spy Number");
    }
}

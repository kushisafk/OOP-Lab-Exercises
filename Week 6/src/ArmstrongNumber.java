import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int result = 0, n=0;

        int temp = num;
        while (temp!=0){
            temp /= 10;
            n++;
        }

        temp = num;
        while(temp!=0){
            int digit = temp%10;
            result += Math.pow(digit, n);
            temp /= 10;
        }

        if(result == originalNum)
            System.out.println(originalNum+" is an Armstrong Number");
        else
            System.out.println(originalNum+" is not an Armstrong Number");

    }
}

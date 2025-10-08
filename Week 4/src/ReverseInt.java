import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        System.out.print("The reverse is: ");
        while(num>0){
            int temp = num%10;
            System.out.print(temp);
            num /= 10;
        }
    }
}

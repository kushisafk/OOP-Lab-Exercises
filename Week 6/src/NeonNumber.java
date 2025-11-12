import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        int sum = 0;
        int sq = input*input;

        while(sq>0){
            sum += sq%10;
            sq /= 10;
        }
        if(input==sum)
            System.out.println(input+" is a Neon number");
        else
            System.out.println(input+ " is not a Neon number");
    }
}
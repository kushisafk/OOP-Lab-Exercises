import java.util.Scanner;

public class CapricornNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        String sq = Integer.toString(input*input);
        int left = Integer.parseInt(sq.substring(0, sq.length()/2));
        int right = Integer.parseInt(sq.substring(sq.length()/2));

        if(left+right == input){
            System.out.println(input+" is a Capricorn/Kaprekar number");
        }
        else {
            System.out.println(input + " is not a Capricorn/Kaprekar number");
        }
    }
}

import java.util.Scanner;

public class CheckPassFail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        System.out.println("DONE");
    }
}

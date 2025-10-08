import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning){
            System.out.print("Enter a number between 0-10 or 90-100: ");
            int input = sc.nextInt();
            if (input>=0 && input<=10){
                System.out.println("You have entered: "+input);
                isRunning = false;
            } else if (input>=90 && input<=100) {
                System.out.println("You have entered: "+input);
                isRunning = false;
            } else {
                System.out.println("Invalid input, try again...");
            }
        }
    }
}

import java.util.Scanner;

public class NumberPatternB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int input = sc.nextInt();

        for(int i=input; i>=1; i--){
            for (int j=input; j>i; j--){
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

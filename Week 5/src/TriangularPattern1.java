import java.util.Scanner;

public class TriangularPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int input = sc.nextInt();

        for(int i=1; i<=input; i++){
            for (int j=1; j<=i; j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}

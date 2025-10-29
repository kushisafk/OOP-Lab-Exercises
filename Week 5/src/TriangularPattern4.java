import java.util.Scanner;

public class TriangularPattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int input = sc.nextInt();
        int count = input-1;

        for(int i=1; i<=input; i++){
            for (int k=count; k>=1; k--){
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("# ");
            }
            count--;
            System.out.println();
        }
    }
}

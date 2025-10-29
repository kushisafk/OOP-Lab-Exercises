import java.util.Scanner;

public class TriangularPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int input = sc.nextInt();

        for(int i=1; i<=input; i++){
            for (int k=0; k<i-1; k++){
                System.out.print("  ");
            }
            for (int j=input; j>=i; j--){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}

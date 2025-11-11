import java.util.Scanner;
public class HillPatternD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int size = 2*n-1;
        for (int i=1; i<=size; i++){
            for (int j=1; j<=size; j++){
                if(Math.abs(i-n)+Math.abs(j-n) < n-1){
                    System.out.print("  ");
                }else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;
public class HillPatternD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int input = sc.nextInt();
        for(int i=1; i<=input; i++){
//            for
            for (int j=1; j<=(2*i-3); j++){
                System.out.print("# ");
            }
            System.out.println();
        }

    }
}

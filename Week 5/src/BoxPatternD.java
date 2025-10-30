import java.util.Scanner;

public class BoxPatternD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int input = sc.nextInt();

        //first ROW
        for (int i=1; i<=input; i++){
            System.out.print("# ");
        }
        System.out.println();

        //X shape
        for(int row=2; row<input; row++){
            for (int col=1; col<input; col++){
                if(row==col || row + col == input + 1){
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //last ROW
        for (int i=1; i<=input; i++){
            System.out.print("# ");
        }
    }
}

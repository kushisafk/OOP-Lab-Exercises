import java.util.Scanner;

public class IncomeTaxCalculatorWithSentinel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double income, tax;
        System.out.print("Enter the taxable income(-1 to end): $");
        income = sc.nextDouble();

        while(income != -1){
            if(income<= 20000){
                tax = 0;
            } else if (income<=40000) {
                tax = 0 + (income-20000)*0.1;
            } else if (income<=60000) {
                tax = 0 + (20000*0.1) + ((income-40000)*0.2);
            } else {
                tax = 0 + (20000*0.1) + (20000*0.2) + ((income-60000)*0.3);
            }
            System.out.printf("The income tax payable is: $%.2f%n", tax);

            System.out.print("Enter the taxable income(-1 to end): $");
            income = sc.nextDouble();
        }
        System.out.println("bye!");
    }
}

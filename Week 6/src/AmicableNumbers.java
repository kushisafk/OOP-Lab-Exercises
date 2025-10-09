import java.util.Scanner;

public class AmicableNumbers {
    static int sumOfDivisors(int n){
        int sum = 0;
        for(int i=1; i<=n/2; i++){
            if(n%i == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum1 = sumOfDivisors(num1);
        int sum2 = sumOfDivisors(num2);

        if(num1==sum2 && num2==sum1){
            System.out.println(num1+" and "+num2+" are Amicable Numbers");
        }else {
            System.out.println(num1+" and "+num2+" are not Amicable Numbers");
        }
    }
}

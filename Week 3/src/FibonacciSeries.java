public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 20;
        long a=1, b=1, temp;
        System.out.println("The first "+num+" Fibonacci numbers are: ");

        for (int i=1; i<=num; i++){
            System.out.print(a + " ");
            temp = a+b;
            a = b;
            b = temp;
        }
    }
}

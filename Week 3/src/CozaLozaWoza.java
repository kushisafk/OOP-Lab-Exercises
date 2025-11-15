public class CozaLozaWoza {
    public static void main(String[] args) {

        int lower = 1;
        int upper = 110;
        int nums_per_line = 11;

        for (int num = lower; num <= upper; num++) {

            if (num % 3 == 0) {
                System.out.print("Coza");
            }

            if (num % 5 == 0) {
                System.out.print("Loza");
            }

            if (num % 7 == 0) {
                System.out.print("Woza");
            }

            if ((num % 3 != 0) && (num % 5 != 0) && (num % 7 != 0)) {
                System.out.print(num);
            }

            if (num % nums_per_line == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}

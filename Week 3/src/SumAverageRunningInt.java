public class SumAverageRunningInt {
    public static void main(String[] args) {

        int sum = 0;
        int lowerbound = 1;
        int upperbound = 100;

        for (int num = lowerbound; num <= upperbound; num++) {
            sum += num;
        }

        double average = (double) sum / (upperbound - lowerbound + 1);
        System.out.println("The sum of " + lowerbound + " to " + upperbound + " is " + sum);
        System.out.println("The average is " + average);
    }
}

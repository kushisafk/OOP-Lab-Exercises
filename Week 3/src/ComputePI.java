public class ComputePI {
    public static void main(String[] args) {

        int[] denoms = {1000, 10000, 100000};

        for (int max_denominator : denoms) {

            double sum = 0.0;

            for (int denominators = 1; denominators <= max_denominator; denominators += 2) {
                if (denominators % 4 == 1) {
                    sum += 1.0 / denominators;
                } else if (denominators % 4 == 3) {
                    sum -= 1.0 / denominators;
                } else {
                    System.out.println("Impossible!");
                }

            }

            double pi = 4 * sum;

            System.out.println("MAX_DENOMINATOR = " + max_denominator + " Approx PI = " + pi);
        }
    }
}

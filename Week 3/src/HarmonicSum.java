public class HarmonicSum {
    public static void main(String[] args) {

        int n = 50000;

        double sumL2R = 0.0;
        for (int i = 1; i <= n; i++) {
            sumL2R += 1.0 / i;
        }

        double sumR2L = 0.0;
        for (int i = n; i >= 1; i--) {
            sumR2L += 1.0 / i;
        }

        double difference = Math.abs(sumL2R - sumR2L);

        System.out.println("Sum from left-to-right: " + sumL2R);
        System.out.println("Sum from right-to-left: " + sumR2L);
        System.out.println("Absolute difference: " + difference);
    }
}

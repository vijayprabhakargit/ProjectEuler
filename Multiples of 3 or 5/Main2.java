public class Main2 {
    public static long sumDivisibleBy(long N, long n) {
        long sum = 0;
        long p = (N - 1) / n;

        sum = (p * (p + 1L)) / 2L * n;

        return sum;
    }
    public static void main(String[] args) {
        long N = 1000000000;
        long ans = 0;

        ans = sumDivisibleBy(N, 3) + sumDivisibleBy(N, 5) - sumDivisibleBy(N, 15);

        System.out.println("Result: " + ans);
    }
}

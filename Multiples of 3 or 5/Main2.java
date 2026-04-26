/*
*	This solution is the scaled version, if N is > 10^8 O(N) Solution is not scalable
*	So we make use of sum of all natural numbers formula to compute the solution
*	But make sure to use long, to avoid overflow issues
*/

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

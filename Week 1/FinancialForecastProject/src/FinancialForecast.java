public class FinancialForecast {

    // Recursive method to calculate future value
    public static double futureValueRecursive(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return futureValueRecursive(principal, rate, years - 1) * (1 + rate);
    }

    // Memoized version to optimize
    public static double futureValueMemo(double principal, double rate, int years, double[] memo) {
        if (years == 0) return principal;
        if (memo[years] != 0) return memo[years];
        memo[years] = futureValueMemo(principal, rate, years - 1, memo) * (1 + rate);
        return memo[years];
    }

    public static void main(String[] args) {
        double principal = 10000; // Initial amount
        double rate = 0.07;       // Annual growth rate (7%)
        int years = 10;           // Number of years to forecast

        // Using simple recursion
        double result = futureValueRecursive(principal, rate, years);
        System.out.printf("Future Value (Recursive) after %d years: ₹%.2f\n", years, result);

        // Using memoization
        double[] memo = new double[years + 1];
        double optimizedResult = futureValueMemo(principal, rate, years, memo);
        System.out.printf("Future Value (Memoized) after %d years: ₹%.2f\n", years, optimizedResult);
    }
}

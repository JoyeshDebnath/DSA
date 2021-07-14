package Dynamic_Programming;

public class Staircase_Tab {
    static int countWays(int n, int[] dp) {
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        int dp[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = 0;
        }
        System.out.println(countWays(n, dp));
    }

}

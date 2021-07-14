package Dynamic_Programming;

public class Staircase_memo {
    public static int countWays(int n, int memo[]) {
        // base case
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (memo[n] != 0) {
            memo[n] = countWays(n - 1, memo) + countWays(n - 2, memo);
        }
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 4;
        int memo[] = new int[n + 1];
        System.out.println(countWays(n, memo));

    }
}

package Dynamic_Programming;

import java.util.*;

public class KnapSack {
    static int Knapsack(int[] val, int[] wt, int W, int n) {
        // base case
        if (W == 0 || n == 0) {
            return 0;
        }

        if (wt[n - 1] <= W) {
            // max include or exclude
            return Math.max(val[n - 1] + Knapsack(val, wt, W - wt[n - 1], n - 1), Knapsack(val, wt, W, n - 1));
        }
        // } else if (wt[n - 1] > W) {
        // exclude
        return Knapsack(val, wt, W, n - 1);

    }

    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int wt[] = { 10, 20, 30 };
        int W = 50;
        int res = Knapsack(val, wt, W, 3);
        System.out.println("The result is=" + res);
    }
}
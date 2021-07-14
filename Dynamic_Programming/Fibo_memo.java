package Dynamic_Programming;

public class Fibo_memo {
    static int memo[];
    static int N;

    Fibo_memo() {
        N = 5;
        memo = new int[N + 1];
        for (int i = 0; i < N; i++) {
            memo[i] = -1;
        }
    }

    public static int Fibo(int n) {

        if (memo[n] == -1) {
            int res;
            if (n == 0 || n == 1) {
                res = n;
            } else {
                res = Fibo(n - 1) + Fibo(n - 2);
            }
            memo[n] = res;
        }
        return memo[n];
    }// memorization

    public static void main(String[] args) {

        System.out.println(Fibo(N));
    }
}

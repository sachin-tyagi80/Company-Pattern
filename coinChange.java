import java.util.*;

public class coinChange {

    // Function to count number of ways
    static int countWays(int N, int[] coins) {

        int[] dp = new int[N + 1];

        dp[0] = 1;   // Base case: 1 way to make amount 0

        for (int coin : coins) {
            for (int i = coin; i <= N; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[N];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();        // total amount
        int M = sc.nextInt();        // number of coins

        int[] coins = new int[M];

        for (int i = 0; i < M; i++) {
            coins[i] = sc.nextInt();
        }

        System.out.println(countWays(N, coins));

        sc.close();
    }
}
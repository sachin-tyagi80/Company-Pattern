import java.util.*;

public class CountWays {

    static int countWays(int N, int[] arr) {

        long total = 0;

        // Step 1: calculate total sum
        for(int i = 0; i < N; i++) {
            total += arr[i];
        }

        // Step 2: if total not divisible by 3 → no ways
        if(total % 3 != 0) {
            return 0;
        }

        long target = total / 3;

        long prefix = 0;
        int countTarget = 0;
        int ways = 0;

        // Step 3: traverse array
        for(int i = 0; i < N - 1; i++) {

            prefix += arr[i];

            // if prefix = 2 * target → found second partition
            if(prefix == 2 * target) {
                ways += countTarget;
            }

            // if prefix = target → found first partition
            if(prefix == target) {
                countTarget++;
            }
        }

        return ways;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int result = countWays(N, arr);

        System.out.println(result);

        sc.close();
    }
}
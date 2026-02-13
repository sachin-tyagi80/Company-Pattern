import java.util.*;

class movementArray {

    // Logic for finding unique prime factors
    public static Set<Integer> getPrimeFactors(int n) {
        n = Math.abs(n);
        Set<Integer> factors = new HashSet<>();
        if (n < 2) return factors;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                factors.add(i); // Add the prime factor
                while (n % i == 0) n /= i; // Divide out all occurrences
            }
        }
        if (n > 1) factors.add(n); // Add the remaining prime factor
        return factors;
    }

    static void processTestCase(int n, int[] a, int m) {
        boolean[] reachable = new boolean[n];
        reachable[0] = true;

        for (int s = 0; s < m; s++) {
            boolean[] nextReachable = new boolean[n];
            boolean possibleToMove = false;

            for (int i = 0; i < n; i++) {
                if (reachable[i]) {
                    Set<Integer> factors = getPrimeFactors(a[i]);
                    for (int p : factors) {
                        // Move Forward
                        if (i + p < n) {
                            nextReachable[i + p] = true;
                            possibleToMove = true;
                        }
                        // Move Backward
                        if (i - p >= 0) {
                            nextReachable[i - p] = true;
                            possibleToMove = true;
                        }
                    }
                }
            }
            reachable = nextReachable;
            if (!possibleToMove) break;
        }

        if (reachable[n - 1]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int m = sc.nextInt(); // This must be inside the while loop
            processTestCase(n, a, m); // This must also be inside the loop
        }
        sc.close();
    }
}
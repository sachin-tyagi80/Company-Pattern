import java.util.Scanner;

class calthePower {

    static final int MOD = 1000000007;

    static int power(int A, int B) {
        long result = 1;
        long base = A;

        while (B > 0) {
            // agar B odd hai
            if (B % 2 == 1) {
                result = (result * base) % MOD;
            }

            // base square karo
            base = (base * base) % MOD;

            // B ko half karo
            B = B / 2;
        }

        return (int) result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(power(A, B));
    }
}
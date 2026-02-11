import java.util.*;

class pairSum{

    static void checkSum(int n, int k, int[] a) {

        Arrays.sort(a);   // sort array
        int left = 0;
        int right = n - 1;
        while(left < right) {

            int sum = a[left] + a[right];

            if(sum == k) {
                System.out.println("Yes");
                return;
            }
            else if(sum < k) {
                left++;
            }
            else {
                right--;
            }
        }

        System.out.println("No");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();   // size of array
        int k = scanner.nextInt();   // target sum

        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        checkSum(n, k, a);

        scanner.close();
    }
}
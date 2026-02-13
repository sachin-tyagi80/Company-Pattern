import java.util.*;

class reversedLinkedlist {

    static void reconstructOriginalList(int n, int[] arr) {

        int i = 0;

        while(i < n) {

            if(arr[i] % 2 == 0) {

                int start = i;

                while(i < n && arr[i] % 2 == 0) {
                    i++;
                }

                int end = i - 1;

                while(start < end) {
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }

            } else {
                i++;
            }
        }

        for(int j = 0; j < n; j++) {
            if(j > 0) System.out.print(" ");
            System.out.print(arr[j]);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        reconstructOriginalList(n, arr);
    }
}
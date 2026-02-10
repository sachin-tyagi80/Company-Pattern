import java.util.*;

public class nextGrater {

    public static void nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // remove smaller elements
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // if stack empty, no greater element
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            // push current element
            stack.push(arr[i]);
        }

        // print result
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        nextGreaterElement(arr);
    }
}
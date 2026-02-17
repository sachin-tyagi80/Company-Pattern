import java.util.*;

public class heightofBST {

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }

    static Node insert(Node root, int val) {
        if (root == null)
            return new Node(val);

        if (val <= root.data)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);

        return root;
    }

    // Height in terms of NUMBER OF NODES
    static int findHeight(Node root) {
        if (root == null)
            return 0;

        return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
    }

    static int heightOfBST(int[] arr) {

        Node root = null;

        for (int val : arr)
            root = insert(root, val);

        return findHeight(root);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();

        System.out.println(heightOfBST(arr));

        sc.close();
    }
}
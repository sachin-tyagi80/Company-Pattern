import java.util.*;

class reachQueen {

    static ArrayList<ArrayList<Integer>> graph;
    static int count = 0;

    static void dfs(int node, int dest) {

        if (node == dest) {
            count++;
            return;
        }

        for (int neighbor : graph.get(node)) {
            dfs(neighbor, dest);
        }
    }

    public static void findWays(int N, int M, Scanner sc) {

        graph = new ArrayList<>();

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // read edges
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
        }

        count = 0;
        dfs(1, N);

        System.out.println(count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        findWays(N, M, sc);
    }
}
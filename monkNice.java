import java.util.*;

class monkNice {

    static void calculateNiceness(int n, String[] strings) {

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < i; j++) {

                if (strings[j].compareTo(strings[i]) < 0) {
                    count++;
                }

            }

            System.out.println(count);
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }

        calculateNiceness(n, strings);

    }
}
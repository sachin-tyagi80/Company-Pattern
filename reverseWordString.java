import java.util.*;

class reverseWordString {

    static void reverseWords(String s) {

        // remove extra spaces and split words
        String[] str = s.trim().split("\\s+");

        StringBuilder ans = new StringBuilder();

        // reverse loop
        for (int i = str.length - 1; i >= 0; i--) {
            ans.append(str[i]);

            if (i != 0) {
                ans.append(" ");
            }
        }

        // print result
        System.out.println(ans.toString());
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        reverseWords(s);
    }
}
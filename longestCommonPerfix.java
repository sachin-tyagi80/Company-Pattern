import java.util.*;

class longestCommonPerfix {

    public static String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0)
            return "";

        // Step 1: sort the array
        Arrays.sort(strs);

        // Step 2: compare first and last string
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];

        int idx = 0;

        while(idx < str1.length() && idx < str2.length()) {

            if(str1.charAt(idx) == str2.charAt(idx))
                idx++;
            else
                break;
        }

        // Step 3: return prefix
        return str1.substring(0, idx);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] strs = new String[N];

        for(int i = 0; i < N; i++) {
            strs[i] = scanner.nextLine();
        }

        String result = longestCommonPrefix(strs);

        System.out.println(result);

        scanner.close();
    }
}
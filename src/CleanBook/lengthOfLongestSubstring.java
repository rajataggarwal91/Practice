package CleanBook;

/**
 * Created by uaggara on 10/3/16.
 */
public class lengthOfLongestSubstring {
    static boolean[] charset = new boolean[256];
    public static void main(String args[]){
        System.out.println(lengthOfLongestSubstring("abcadsvsda"));

    }

    public static String lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1)
            return s;

        int maxlength = 0;
        int i = 0;

        for (int j = 0; j < s.length(); j++) {
            while (contains(s.charAt(j))) {
                maxlength = Math.max(maxlength, j - i + 1);
                i++;
            }
            charset[s.charAt(j)] = true;

        }
    return null;
    }

    public static boolean contains(char c){
        return charset[c]==true;

    }


}

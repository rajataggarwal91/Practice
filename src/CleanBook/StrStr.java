package CleanBook;

/**
 * Created by uaggara on 10/2/16.
 */
public class StrStr {
    public static void main(String args[]) {
        System.out.print(strstr("abcd", "cde"));
    }

    public static int strstr(String haystack, String needle) {
        int j = 0;
        if (haystack.length() == 0)
            return -1;
        for (int i = 0; i < haystack.length(); i++) {
            while (i<haystack.length() && needle.charAt(j) == haystack.charAt(i)) {
                 j++;
                 i++;
            }
            if (j == needle.length())
                return i - needle.length();
            else
                j=0;
        }
        return -1;
   }
}

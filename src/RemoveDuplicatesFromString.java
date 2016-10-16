/**
 * Created by uaggara on 10/1/16.
 */
public class RemoveDuplicatesFromString {

    public static void main(String args[]){
        System.out.println(removeAll("affssa"));
    }

    public static String removeAll(String input){
        StringBuilder sb;
        for(int k = 0; k < input.length(); k++ ) {
            sb = new StringBuilder("");
            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i-1) != input.charAt(i)) {
                    sb.append(input.charAt(i-1));
                }
                else {
                    while (i < input.length() && input.charAt(i-1) == input.charAt(i))
                        i = i + 1;
                }

            }
            if(sb.length()!=0 && input.length()!=0 && sb.charAt(sb.length()-1)==input.charAt(input.length()-1))
                sb.deleteCharAt(sb.length()-1);
            else
                sb.append(input.charAt(input.length()-1));
            input = sb.toString();
            System.out.println(input);
        }
    return input;
        }
    }

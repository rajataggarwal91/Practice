package CrackingTheCodingInterview.ArraysAndStrings;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by uaggara on 9/28/16.
 */
public class StringCompression {
    public static void main(String args[]) {
        System.out.println("Hello");
        System.out.println("Answer : " + compressString2("aaabbcccaa"));
        System.out.println("Answer2 : " + compressString2("a"));
        System.out.println("Answer3 : " + compressString2("ab"));
        System.out.println("Answer4 : " + compressString2(""));


    }

    public static String compressString2(String input){
        String answer="";
        int count = 1;
        for(int i = 0;i <input.length();){
            answer+=Character.toString(input.charAt(i));
            if(i==input.length()-1){
                answer+=Character.forDigit(count,10);
                return answer;
            }

            while(i<input.length()-1 && input.charAt(i+1) == input.charAt(i)) {
                count++;
                i++;
            }
            i++;
            answer+=Character.forDigit(count,10);
            count = 1;

        }
        return answer;
    }







    public static String compressString(String input) {
        //Logic
        //1. Read every character in charArray.
        //2. When there is a change in next character, overwrite the present character with count.
        //3. If count = 1 perform shifting


        ArrayList<Character> inputArray  = new ArrayList<>();

        for(char c : input.toCharArray()){
            inputArray.add(c);
        }

        int count = 1;
        int i = 0;

        if(inputArray.size()==1)
            return inputArray.stream().map(j -> j+"").collect(Collectors.joining()) + "1";


        while(i < inputArray.size()) {

           //Example : bba   b2a1
            if(i==inputArray.size()-1) {
                inputArray.set(i,Character.forDigit(count, 10));
                return inputArray.toString() + "";
            }

           //Example : bbaa b2a2
            if (inputArray.get(i+1) == inputArray.get(i)) {
                count++;
                i++;
            } else {
                if (count == 1) {
                    int j= inputArray.size();
                    //perform shifting
                    for (; j > i; j++) {
                        if(j==inputArray.size()) {
                            inputArray.add(Character.forDigit(count, 10));
                            break;
                        }
                        else
                            inputArray.set(j, inputArray.get(j-1));

                    }
                inputArray.set(j,Character.forDigit(count, 10));
                }
                else {
                    inputArray.set(i,Character.forDigit(count,10));
                    i++;
                }
            count = 1;
            }
        }
        return inputArray.stream().map(k -> k+"").collect(Collectors.joining()) + "";
    }
}



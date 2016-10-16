package YahooQuestions;

/**
 * Created by uaggara on 10/15/16.
 */
public class Fibonacci {
    public static void main(String args[]){
        System.out.println(fibonacci(19));
    }

    public static int fibonacci(int count){
        if(count==1 || count==2)
            return 1;
        int cur = 1, prev = 1, prevp = 1 ;
        for(int i = 2 ; i < count ; i ++) {
            cur  = prev + prevp;
            prevp = prev;
            prev = cur;
        }
        return cur;
    }


}

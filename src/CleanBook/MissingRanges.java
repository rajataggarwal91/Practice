package CleanBook;

/**
 * Created by uaggara on 10/3/16.
 */
public class MissingRanges {
    public static void main(String args[]){
        int[] arr = {1,2,3,8,35};
        String[] mr = missingRanges(arr);
        for(int i = 0 ; i < mr.length && mr[i]!=null ; i++)
            System.out.println(mr[i]);
    }

    public static String[] missingRanges(int[] arr){
        String[] mr = new String[arr.length];
        int s;
        String e;
        int k=0;
        for(int i = 0 ; i < arr.length; i++){
            while(i<arr.length-1 && arr[i] == arr[i+1] - 1) {
                i++;
            }
            s = arr[i]+1;
            i++;

            if(i==arr.length && arr[arr.length-1]!=99)
                e = "99";
            else if(arr[i]!=s+1)
                e = arr[i]-1+"";
            else
                e = "";
            mr[k++] = s + "->" + e;
        }

    return mr;
    }


}

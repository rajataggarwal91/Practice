package CleanBook;

import java.util.HashMap;

/**
 * Created by uaggara on 10/1/16.
 */

/*Given an array of integers, find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution.*/

public class TwoSum {

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        int[] res;
        res = twoSum(arr,3);
        System.out.println(res[0] + " " + res[1]);
    }

    public static int[] twoSum(int[] arr, int sum){
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int[] indices = {-1,-1};
        for(int i = 0 ; i < arr.length ; i++){
            hmap.put(sum-arr[i],i);
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(hmap.containsKey(arr[i]) && hmap.get(arr[i])!=i){
                indices[0] = i+1;
                indices[1] = hmap.get(arr[i])+1;
                return indices;
            }
        }
        return indices;
    }


}

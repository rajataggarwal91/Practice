package Algorithms;


import java.util.Arrays;
import java.util.Collections;

/**
 * Created by uaggara on 10/2/16.
 */
public class InsertionSort {
    public static void main(String args[]) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        Arrays.sort(arr, Collections.reverseOrder());
        insertionSort(arr);
        for (Integer i : arr)
            System.out.println(i);
    }

    public static void insertionSort(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while(j>0 && temp<=arr[j]){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }
}



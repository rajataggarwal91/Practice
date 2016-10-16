package Algorithms;


import java.util.Arrays;
import java.util.Collections;

/**
 * Created by uaggara on 10/2/16.
 */
public class SelectionSort {
    public static void main(String args[]) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        Arrays.sort(arr, Collections.reverseOrder());
        selectionSort(arr);
        for(Integer i : arr)
            System.out.println(i);

    }

    public static Integer[] selectionSort(Integer[] arr) {
        for(int i = 0; i < arr.length ; i++){
            int min = i;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[j]<arr[min]){
                   min = j;
                }
            }
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;

    }
return arr;
    }

}

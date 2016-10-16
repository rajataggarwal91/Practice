package Algorithms;


import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

/**
 * Created by uaggara on 10/2/16.
 */
public class QuickSort {
    public static void main(String args[]) {
        Integer[] arr = {15,12,13,11,20,18,22,14};
        Arrays.sort(arr, Collections.reverseOrder());
        int[] array = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
        long before = (new Date()).getTime();
        quickSort(array,0,array.length-1);
        long after = (new Date()).getTime();
        System.out.println("Time taken " + (after-before));
        for (Integer i : array)
            System.out.println(i);
    }
    public static void quickSort(int[] arr, int from, int to) {

        if(to<=from)
            return;

        int pivot = arr[from];
        int i = from -1, j = to + 1;

        while(i<j){

            while(++i<arr.length-1 && arr[i]< pivot);
            while(--j>=0 && arr[j]>pivot);
            if(i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        quickSort(arr,from,j);
        quickSort(arr,j+1,to);

    }

}



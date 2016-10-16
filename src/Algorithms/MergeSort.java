package Algorithms;


import java.util.Arrays;
import java.util.Collections;

/**
 * Created by uaggara on 10/2/16.
 */
public class MergeSort {
    public static void main(String args[]) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        Arrays.sort(arr, Collections.reverseOrder());
        int[] array = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
        mergeSort(array);
        for (Integer i : array)
            System.out.println(i);
    }
    public static void mergeSort(int[] arr) {

        if(arr.length<=1)
            return;

        int[] left = new int[(arr.length)/2];
        int[] right = new int[arr.length - left.length];

        System.arraycopy(arr,0,left,0,left.length);
        System.arraycopy(arr,left.length,right,0,right.length);


        mergeSort(left);
        mergeSort(right);
        merge(left,right,arr);

    }

    public static void merge(int[] left, int[] right, int[] arr){

        int i = 0, j = 0, k = 0;

        while(i<left.length && j<right.length) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

            while(i<left.length) {
                arr[k++] = left[i++];
            }

            while(j<right.length) {
                arr[k++] = right[j++];
            }




    }
}


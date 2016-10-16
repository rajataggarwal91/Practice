    package Algorithms;


    import java.util.Arrays;
    import java.util.Collections;

    /**
     * Created by uaggara on 10/2/16.
     */
    public class HeapSort {
        public static void main(String args[]) {
            Integer[] arr = {1, 2, 3, 4, 5, 67,8,5,4,3,5,7,2};
            Arrays.sort(arr, Collections.reverseOrder());
            int[] array = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
            heapSort(array);
            for (Integer i : array)
                System.out.println(i);
        }
        public static void heapSort(int[] arr) {

        }


    }



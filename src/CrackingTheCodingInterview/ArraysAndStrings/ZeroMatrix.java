package CrackingTheCodingInterview.ArraysAndStrings;

import java.util.ArrayList;

/**
 * Created by uaggara on 9/28/16.
 */
public class ZeroMatrix {
    public static void main(String args[]) {
        int m = 3;
        int n = 3;
        int[][] mat = {{0, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("\nOriginal: ");
        print(mat, m, n);
        System.out.println("Zero Matrix : ");
        print(zeroMatrix(mat,m,n),m,n);

    }

    public static void print(int[][] mat, int m, int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

   public static int[][] zeroMatrix(int mat[][], int m, int n){

       //Keep record of all 0s.
       ArrayList<Integer> rows = new ArrayList<>();
       ArrayList<Integer> cols = new ArrayList<>();

       for(int i =0; i <m ; i++){
           for (int j = 0;j<n;j++)
               if(mat[i][j]==0){
                   rows.add(i);
                   cols.add(j);
               }
       }

       for(Integer r : rows){
           for(int j = 0; j<n;j++){
               mat[r][j] = 0;
            }
       }


       for(Integer c : cols){
           for(int i = 0; i<m;i++){
               mat[i][c] = 0;
           }
       }

       return mat;
   }

}



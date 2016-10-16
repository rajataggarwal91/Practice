package Leetcode;

/**
 * Created by uaggara on 10/14/16.
 */
public class KthSmallestMatrix {

    public static void main(String args[]){
        int[][] matrix = {{1,10,100},{2,11,101},{3,12,102}};
        System.out.println(kthsmallest(matrix, 7));

    }

    public static int kthsmallest(int[][] matrix, int k){

        int m = matrix.length;
        int n = matrix[0].length;

        if(k>m*n)
            return 0;

        if(m==1 && n==1)
            return matrix[0][0];

        int i1 = 1, j1 = 0, i2 = 0, j2 = 1 ;

        while(k>0){
            if(matrix[i1][j1] < matrix[i2][j2]){
                i1++;

            }
            else{
                j2++;
            }
            if(j2==n)
                j2=j1+1;
            if(i2==m)
                i2=i1+1;
            k--;
        }


        return 0;
    }

}

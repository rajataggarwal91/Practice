package CrackingTheCodingInterview.ArraysAndStrings;

/**
 * Created by uaggara on 9/28/16.
 */
public class RotateMatrix {
    public static void main(String args[]) {
        int m = 3;
        int n = 3;
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("\nOriginal: ");
        print(mat, m, n);
        int[][] mat2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("\n90: ");
        print(rotate(mat2, m, n, 90), m, n);
        int[][] mat3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("\n180: ");
        print(rotate(mat3, m, n, 180), m, n);
        int[][] mat4 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("\n270: ");
        print(rotate(mat4, m, n, 270), m, n);

    }

    public static void print(int[][] mat, int m, int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotate(int[][] mat, int m, int n, int degree) {

        switch(degree){
            case 90:
                return colswitch(transpose(mat,m,n),m,n);
            case 180:
                return colswitch(rowswitch(mat,m,m),m,n);
            case 270:
                return rowswitch(transpose(mat,m,n),m,n);
            default:
                System.out.println("Incorrect degree");
                return mat;

        }

    }

    public static int[][] transpose(int[][] mat, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = i; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    return mat;
    }

    public static int[][] colswitch(int[][] mat, int m , int n){
        for(int i = 0 ; i < m; i++){
            for(int j=0;j<n/2;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-1-j];
                mat[i][n-1-j] = temp;
            }
        }
    return mat;
    }

    public static int[][] rowswitch(int[][] mat, int m , int n){
        for(int i = 0 ; i < m/2; i++){
            for(int j=0;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[m-i-1][j];
                mat[m-i-1][j] = temp;
            }
        }
        return mat;
    }


}



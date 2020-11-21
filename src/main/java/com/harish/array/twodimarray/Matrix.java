package com.harish.array.twodimarray;

public class Matrix {

    public static void main(String[] args) {

        int[][] a = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] b = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] c = multiplyMatrix(a,b);

        for(int i=0;i<c.length;i++) {
            for(int j=0;j<c[0].length;j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] multiplyMatrix(int[][] a, int[][] b) {
        int c[][] = new int[b.length][a[0].length];
        if(a[0].length != b.length) {
            System.out.println("Multiplication not possible");
        }
        int n = c.length; // C will be square matrix of dimension n

        for (int i=0; i<n;i++) {
            for(int j =0;j<n;j++) {
                c[i][j] = 0;
                for(int k= 0; k<n;k++) {
                    c[i][j] = c[i][j] + (a[i][k]*b[k][j]);
                }
            }
        }
        return c;
    }
}

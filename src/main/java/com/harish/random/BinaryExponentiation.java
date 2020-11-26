package com.harish.random;

public class BinaryExponentiation {

    public static void main(String[] args) {
        System.out.println(pow(2,5));
    }

    private static long pow(int x, int y) {
        int result = 1;
        if(y==0) {
            return 1;
        }
        pow(x,y/2);

        x = x*x;
        if(y%2 == 1){
            result = result * x;
        }
        return result;
    }
}

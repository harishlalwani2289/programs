package com.harish.random;

import java.util.Scanner;

public class AshleyMathProdigy {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        MyClass solver = new MyClass();
        while (t-- > 0) {
            int m = in.nextInt();
            int n = in.nextInt();
            System.out.println(solver.solve(m, n));
        }
    }
}

class MyClass {

    int solve(int m, int n) {
        // Return sum of f[m] + f[m+1] + … f[n]
        // Should use classes whichever are required
        return 0;
    }


}

interface X<T> {
    T add(T a, T b);

    T subtract(T a, T b);

    T multiply(T a, T b);
}

class Z implements X<Integer>{
    @Override
    public Integer add(Integer a, Integer b) {
        return a+b;
    }

    @Override
    public Integer subtract(Integer a, Integer b) {
        return a-b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a*b;
    }
    // Implement interface X for integer operations
}

class M {
    // Implement interface X for matrix operations
    // Must use Z for all modulo operations, if applicable
}

class Matrix {
    // Declare a 2D ( r * c ) integer matrix
    // Use proper data structure
}

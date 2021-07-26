package com.harish.array;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;

// Class name should be "Source",
// otherwise solution won't be accepted
public class PushAllZeros {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Declare the variable
        String a;

        // Read the variable from STDIN
        a = in.nextLine();
        String[] numberList = a.split(",");
        int[] arr = new int[numberList.length];
        for (int i=0; i<numberList.length;i++) {
            arr[i] = Integer.parseInt(numberList[i]);
        }
        System.out.println(new PushAllZeros().getSecondSmallest(arr));
    }

    public int getSecondSmallest(int []arr) {

        if (arr.length < 2) {
            System.out.println("Invalid Input");
            return 0;
        }

        int first = Integer.MAX_VALUE;
        int second  = Integer.MAX_VALUE;
        for (int i=0; i < arr.length ;i ++) {
            if (arr[i]  < first) {
                first =second;
                second = arr[i];
            }
            else if (arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
        }
        return second;
    }
}

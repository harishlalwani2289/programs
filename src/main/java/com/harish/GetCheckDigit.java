package com.harish;

public class GetCheckDigit {
    public static void main(String[] args) {
        long odd_total = 0;
        long even_total = 0;
        long overall_total = 0;
        int i;
        long len;

        String input = "012001111123456";
        len = input.length();

        for (i = 0; i < len; i++)
        {
            /* use i+1 since starting at 0 instead of 1 */
            if ( ((i+1) % 2) == 0)
                even_total += input.charAt(i) - '0';
            else
                odd_total += input.charAt(i) - '0';
        }

        overall_total = ((odd_total * 3) + even_total);

        overall_total = (10 - (overall_total % 10)) % 10;

        System.out.println(overall_total);

    }
}

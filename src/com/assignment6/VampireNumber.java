package com.assignment6;

import java.util.*;

class VampireNumber {

    private static long[] b;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int v = 0;
        long number, i, c = 0;
        b = new long[100];
        number = 1000;
        int count = 0;
        while (count < 100) {
            if (getVampire(v, number, c, b)) {
                count += 1;
                System.out.println(number);
            }
            number += 1;
        }
    }

    private static boolean getVampire(int v, long number, long noOfDigits, long[] b) {
        long i, j;
        long new_number;
        long flag;
        for (i = number; i > 0; i /= 10)
            noOfDigits++;
        if (noOfDigits % 2 != 0)
            return false;

        for (i = (int) Math.pow(10, (noOfDigits / 2) - 1); i < (int) Math.pow(10, noOfDigits / 2); i++) {
            if (number % i == 0) {
                j = number / i;
                if (!(j >= Math.pow(10, (noOfDigits / 2) - 1) && j < Math.pow(10, noOfDigits / 2)))
                    continue;


                new_number = i * (int) Math.pow(10, noOfDigits / 2) + j;

                if (i % 10 == 0 && j % 10 == 0) {
                    flag = 1;
                    break;
                } else {
                    flag = CheckVampireConditions(number, new_number);
                    if (flag == 0)
                        v = getFactors(v, b, i, j);
                }
            }
        }


        if (v == 0)
            return false;
        else {
            System.out.print("The factors of vampire " + number + " are: ");
            for (int ii = 0; ii < v; ii++)
                System.out.println(b[ii] + "\t" + (number / b[ii]));
            return true;
        }
    }

    private static long CheckVampireConditions(long number, long new_number) {
        long k;
        long c1, c2;
        long flag;
        long p;

        flag = 0;
        for (k = number; k > 0; k /= 10) {
            c1 = c2 = 0;
            for (p = number; p > 0; p /= 10) {
                if (k % 10 == p % 10)
                    c1++;
            }
            for (p = new_number; p > 0; p /= 10) {
                if (k % 10 == p % 10)
                    c2++;
            }
            if (c1 != c2) {
                flag = 1;
                break;
            }
        }
        return flag;
    }

    private static int getFactors(int v, long[] b, long i, long j) {
        int flag = 0;
        for (int index = 0; index < v; index++)
            if (b[index] == i || b[index] == j)
                flag = 1;
        if (flag == 0)
            b[v++] = i;
        return v;
    }
}
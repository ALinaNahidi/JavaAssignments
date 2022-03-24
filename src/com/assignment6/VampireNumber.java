package com.assignment6;

class VampireNumber {

    public static void main(String[] args) {

        int vampireNumberCount = 0;
        long number, noOfDigits = 0;
        long[] output = new long[100];
        number = 1000;
        int count = 0;
        while (count < 100) {
            if (getVampire(vampireNumberCount, number, noOfDigits, output)) {
                count += 1;
                System.out.println(number);
            }
            number += 1;
        }
    }

    private static boolean getVampire(int vampireNumberCount, long number, long noOfDigits, long[] output) {
        long temp1, temp2;
        long new_number;
        long flag;
        for (temp1 = number; temp1 > 0; temp1 /= 10)
            noOfDigits++;
        if (noOfDigits % 2 != 0)
            return false;

        for (temp1 = (int) Math.pow(10, (noOfDigits / 2) - 1); temp1 < (int) Math.pow(10, noOfDigits / 2); temp1++) {
            if (number % temp1 == 0) {
                temp2 = number / temp1;
                if (!(temp2 >= Math.pow(10, (noOfDigits / 2) - 1) && temp2 < Math.pow(10, noOfDigits / 2)))
                    continue;


                new_number = temp1 * (int) Math.pow(10, noOfDigits / 2) + temp2;

                if (temp1 % 10 == 0 && temp2 % 10 == 0) {
                    flag = 1;
                    break;
                } else {
                    flag = CheckVampireConditions(number, new_number);
                    if (flag == 0)
                        vampireNumberCount = getFactors(vampireNumberCount, output, temp1, temp2);
                }
            }
        }


        if (vampireNumberCount == 0)
            return false;
        else {
            System.out.print("The factors of vampire " + number + " are: ");
            for (int index = 0; index < vampireNumberCount; index++)
                System.out.println(output[index] + "\t" + (number / output[index]));
            return true;
        }
    }

    private static long CheckVampireConditions(long number, long new_number) {
        long temp1,temp2;
        long count1, count2;
        long flag;

        flag = 0;
        for (temp1 = number; temp1 > 0; temp1 /= 10) {
            count1 = count2 = 0;
            for (temp2 = number; temp2 > 0; temp2 /= 10) {
                if (temp1 % 10 == temp2 % 10)
                    count1++;
            }
            for (temp2 = new_number; temp2 > 0; temp2 /= 10) {
                if (temp1 % 10 == temp2 % 10)
                    count2++;
            }
            if (count1 != count2) {
                flag = 1;
                break;
            }
        }
        return flag;
    }

    private static int getFactors(int vampireIndex, long[] output, long i, long j) {
        int flag = 0;
        for (int index = 0; index < vampireIndex; index++)
            if (output[index] == i || output[index] == j) {
                flag = 1;
                break;
            }
        if (flag == 0)
            output[vampireIndex++] = i;
        return vampireIndex;
    }
}
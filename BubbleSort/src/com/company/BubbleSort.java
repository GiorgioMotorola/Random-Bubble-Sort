package com.company;

import java.util.Arrays;

public class BubbleSort {

    static int[] sort(int[] number) {
        for (int i = 0; i < number.length; i++)
            for (int j = 0; j < number.length - 1; j++)

                if (number[j] > number[j + 1]) {
                    number[j] = number[j] + number[j + 1];
                    number[j + 1] = number[j] - number[j + 1];
                    number[j] = number[j] - number[j + 1];
                }
        return number;
    }

    static void printNumber(int[] sortedNumber) {
        for (int i = 0; i < sortedNumber.length; i++)
            System.out.print(sortedNumber[i] + " ");
    }

}

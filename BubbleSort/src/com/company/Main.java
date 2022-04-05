package com.company;

import java.util.Random;

import static com.company.BubbleSort.printNumber;
import static com.company.BubbleSort.sort;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sorting Randomly Generated Numbers: ");
        System.out.println(" ");
        Random random = new Random();
        int n = 20;
        int[] number = new int[n];

        for (int i = 0; i < n;i++)
            number[i] = Math.abs(random.nextInt(1000));

        System.out.println("----------Original Sequence----------");
        printNumber(number);
        System.out.println("");
        System.out.println(" ");
        System.out.println("----------Sorted Sequence----------");
        printNumber(sort(number));
        System.out.println(" ");
    }

}

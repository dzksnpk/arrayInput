package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int j = sc.nextInt();
        int counter = 0;
        for (int k : array) {
            if (k == j) {
                counter++;
            }
        }
        System.out.println(counter);

    }
}


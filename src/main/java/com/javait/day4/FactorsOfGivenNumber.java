package com.javait.day4;

import java.util.Scanner;

public class FactorsOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number Value : ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                System.out.println(i + " ");
            }
        }
        if (count == 2) {
            System.out.println("\n" + n + " is Prime");
        } else {
            System.out.println("\n" + n + " is not prime");
        }
    }
}

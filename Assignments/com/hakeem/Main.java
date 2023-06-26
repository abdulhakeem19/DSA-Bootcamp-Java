package com.hakeem;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the No's :");
        int sum1 = input.nextInt();
        int sum2 = input.nextInt();

        int sum = sum1+sum2;
        System.out.println(sum);


    }
}
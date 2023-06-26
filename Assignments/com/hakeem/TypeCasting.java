package com.hakeem;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Year:");
        int num = input.nextInt();
        if(num % 4 == 0){
            System.out.println(num + " is Leap Year");
        } else {
            System.out.println(num + " is not a Leap Year");
        }

    }
}

package first_java;

import java.util.Scanner;

public class Odd_or_Even {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = Input.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is Even Number");
        } else {
            System.out.println(num + " is Odd Number");
        }
    }
}

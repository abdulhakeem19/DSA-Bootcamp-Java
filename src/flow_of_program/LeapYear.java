package flow_of_program;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int num = Input.nextInt();
        if(num % 4 == 0){
            System.out.println(num + " is a Leap Year");
        } else {
            System.out.println(num + " is not a Leap Year");
        }
    }
}

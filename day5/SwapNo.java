package day5;

import java.util.Scanner;

public class SwapNo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = input.nextInt();
        System.out.print("Enter second number (b): ");
        int b = input.nextInt();

        System.out.println("Before swap: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);
        input.close();
    }
}


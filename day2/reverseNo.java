package day2;

import java.util.Scanner;

public class reverseNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer to reverse: ");
        int num = input.nextInt();
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed number: " + reversed);
        input.close();
    }
}


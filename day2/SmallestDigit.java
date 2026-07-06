package day2;

import java.util.Scanner;

public class SmallestDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = input.nextLong();

        num = Math.abs(num);

        long smallest = 9;

        if (num == 0) {
            smallest = 0;
        } else {
            while (num > 0) {
                long digit = num % 10;

                if (digit < smallest) {
                    smallest = digit;
                }

                num /= 10;
            }
        }

        System.out.println("The smallest digit is: " + smallest);
        input.close();
    }
}


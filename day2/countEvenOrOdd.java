package day2;

import java.util.Scanner;

public class countEvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = input.nextLong();
        num = Math.abs(num);

        int evenCount = 0;
        int oddCount = 0;
        if (num == 0) {
            evenCount = 1;
        } else {
            while (num > 0) {
                long digit = num % 10;

                if (digit % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }

                num /= 10;
            }
        }

        System.out.println("Even digits count: " + evenCount);
        System.out.println("Odd digits count: " + oddCount);
        input.close();
    }
}


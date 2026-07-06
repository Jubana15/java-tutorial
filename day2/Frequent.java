package day2;

import java.util.Scanner;
public class Frequent {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number1:");
        int a = sc.nextInt();
        System.out.println("Enter a key:");
        int b = sc.nextInt();
        int count = 0;
        while (a != 0) {
            int pop = a % 10;
            if (pop == b) {
                count++;
            }
            a = a / 10;

        }
        System.out.println(count);
    }
}
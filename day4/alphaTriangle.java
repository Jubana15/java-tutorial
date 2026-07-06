package day4;

import java.util.Scanner;

public class alphaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows (1-26): ");
        int rows = input.nextInt();

        char letter = 'A';

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(letter + " ");
            }
            letter++;
            System.out.println(); // Move to the next line
        }
        input.close();
    }
}


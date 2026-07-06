package day4;

import java.util.Scanner;

public class alphaSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int size = input.nextInt();

        char letter = 'A';

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(letter + " ");
            }
            letter++;
            System.out.println();
        }
        input.close();
    }
}


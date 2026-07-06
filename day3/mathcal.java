package day3;



import java.util.Scanner;
public class mathcal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of ducks:");
        int a = sc.nextInt();
        System.out.println("Enter the Number of Minutes:");
        int b = sc.nextInt();
        int c = a * b / 5;
        System.out.println(c);


    }
}

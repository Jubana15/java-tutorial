package day2;

import java.util.Scanner;
public class sumdigit {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number1:");
        int a = sc.nextInt();
        int sum=0;
        while(a!=0)
        {
            int pop=a%10;
            sum+=pop;
            a/=10;
        }
        System.out.println(sum);

    }
}

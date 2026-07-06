package day3;


import java.util.Scanner;

public class demo {
    public static void main (String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a character :");
        char ch =sc.next().charAt(0);
        switch(ch)
        {
            case 'a','e','i','o','u':
                System.out.println("Given character is vowel");
                break;
            default:
                if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
                    System.out.println("Character is constsnt");
                else {
                    System.out.println("Invalid input");
                }

        }
    }


}

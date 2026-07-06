package day6;

import java.util.Scanner;
public class TypesOfTriangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []nums=new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = sc.nextInt();
        }
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];
        if(a+b<=c||b+c<=a||a+c<=b){
            System.out.println("none");
        }
        else if(a==b&&b==c){
            System.out.println("equilateral");
        }
        else if(a==b||b==c||a==c){
            System.out.println( "isosceles");
        }
        else{
            System.out.println( "scalene");
        }
    }
}
package day5;


import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int a=sc.nextInt();
        int[] arr=new int[a];
        System.out.println("enter numbers");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);


    }
}
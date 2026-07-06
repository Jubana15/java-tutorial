package day5;



import java.util.Scanner;

public class SumAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int num:arr)
        {

            sum+=num;
        }
        float avg=sum/5;
        System.out.println(sum);
        System.out.println(avg);


    }
}

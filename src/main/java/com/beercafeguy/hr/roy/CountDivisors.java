package com.beercafeguy.hr.roy;

import java.util.Scanner;

public class CountDivisors {

    public static void main(String arr[]){
        Scanner scanner=new Scanner(System.in);
        int l=scanner.nextInt();
        int r=scanner.nextInt();
        int k=scanner.nextInt();
        int count=0;
        for (int i=l;i<=r;i++){
            if(i%k==0)
                count++;
        }

        System.out.println(count);
    }
}

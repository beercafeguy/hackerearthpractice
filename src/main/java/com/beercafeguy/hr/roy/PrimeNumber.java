package com.beercafeguy.hr.roy;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String arr[]){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        for(int i=1;i<N;i++){
            if(isPrime(i))
                System.out.print(i+" ");
        }
        System.out.println();
    }

    private static boolean isPrime(int num){
        if(num<=1)
            return false;
        boolean flag=true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0) {
                flag=false;
                break;
            }
        }
        return flag;
    }
}

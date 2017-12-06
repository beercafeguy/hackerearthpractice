package com.beercafeguy.hr.roy;

import java.util.Arrays;
import java.util.Scanner;

public class ProfilePic {
    public static void main(String arr[]){
        Scanner scanner=new Scanner(System.in);
        int L=scanner.nextInt();
        int N=scanner.nextInt();
       // String size1=scanner.nextLine();
        int W;
        int H;
        for(int i=0;i<N;i++) {
            W=scanner.nextInt();
            H=scanner.nextInt();
            if(W<L||H<L){
                System.out.println("UPLOAD ANOTHER");
            }else if(W==H){
                System.out.println("ACCEPTED");
            }else{
                System.out.println("CROP IT");
            }
        }
    }
}

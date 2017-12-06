package com.beercafeguy.hr.roy;

import java.util.Scanner;

public class ASCIIValue {
    public static void main(String arr[]){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        System.out.println((int)s.charAt(0));
    }
}

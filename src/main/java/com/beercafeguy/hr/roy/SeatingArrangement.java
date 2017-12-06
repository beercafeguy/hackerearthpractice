package com.beercafeguy.hr.roy;

import java.util.Arrays;
import java.util.Scanner;

public class SeatingArrangement {
    public static void main(String arr[]){
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        for(int i=0;i<T;i++) {
            int oppositeSeat;
            String seatType;
            int num=scanner.nextInt();
            switch (num % 12) {
                case 1:
                    oppositeSeat = num + 11;
                    seatType = "WS";
                    break;
                case 2:
                    oppositeSeat = num + 9;
                    seatType = "MS";
                    break;
                case 3:
                    oppositeSeat = num + 7;
                    seatType = "AS";
                    break;
                case 4:
                    oppositeSeat = num + 5;
                    seatType = "AS";
                    break;
                case 5:
                    oppositeSeat = num + 3;
                    seatType = "MS";
                    break;
                case 6:
                    oppositeSeat = num + 1;
                    seatType = "WS";
                    break;
                case 7:
                    oppositeSeat = num - 1;
                    seatType = "WS";
                    break;
                case 8:
                    oppositeSeat = num - 3;
                    seatType = "MS";
                    break;
                case 9:
                    oppositeSeat = num - 5;
                    seatType = "AS";
                    break;
                case 10:
                    oppositeSeat = num - 7;
                    seatType = "AS";
                    break;
                case 11:
                    oppositeSeat = num - 9;
                    seatType = "MS";
                    break;
                case 0:
                    oppositeSeat = num - 11;
                    seatType = "WS";
                    break;
                default:
                    oppositeSeat = 0;
                    seatType = "";

            }
            System.out.println(oppositeSeat + " " + seatType);
        }
    }

}

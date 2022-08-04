package com.company;

import java.util.Scanner;

public class DigitFrequency {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        int count = 0;
        while(n > 0){
            int dig = n % 10;
            n = n/10;
            if(dig == f){
                count++;
            }
        }
        System.out.print(count);
    }
}

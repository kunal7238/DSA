package com.company;

import java.util.Scanner;

public class ArmStrong {
    public static void Strong(int n){
        int count =0, sum = 0;
        int t1 = n;
        int temp = n;
        while(t1!=0){
            t1 = t1 /10;
            count++;
        }
        while(temp != 0){
           int rem = temp % 10;
           int mul = 1;
            for(int i =1; i<=count ; i++){
                mul = mul * rem;
            }
            sum = sum + mul;
            temp = temp / 10;
        }
        if(n == sum)
        {
            System.out.println("Number is Armstrong");
        }
        else {
            System.out.println("No is not armstrong");
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArmStrong am = new ArmStrong();
        am.Strong(n);

    }
}

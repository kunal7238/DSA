package com.company;

import java.util.HashMap;

public class MaxSubArraySumZero {

    public static int MaxArray(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int mlen = 0;
        int i = -1;
        int sum = 0;
        map.put(sum, i);
        while(i < arr.length -1){
            i++;
            sum += arr[i];

            if(map.containsKey(sum) == false){
                map.put(sum, i);
            }
            else{
                int len = i - map.get(sum);
                if(len > mlen){
                    mlen = len;
                }
            }
        }

        return mlen;
    }

    public static void main(String args[]){
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(MaxArray(arr));

    }
}

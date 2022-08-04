package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class SubArraySumK {

    public static int solution(int arr[], int target){
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum =0;
        for(int i =0; i<arr.length ; i++){
            sum += arr[i];
            if(map.containsKey(sum-target)){
                ans += map.get(sum - target);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return  ans;
    }
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.print(solution(arr, target));
    }
}

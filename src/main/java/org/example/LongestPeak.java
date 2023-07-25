package org.example;
import java.util.*;

public class LongestPeak {
    public static int longestPeak(String[] arr){
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            // Parsed Array..
            array[i]=Integer.parseInt(arr[i]);
        }
        int n = arr.length;
        int longest = 0;
        int left[] = new int[n];
        int right[] = new int[n];
        int curr = 1;
        for(int i = 1; i < n; i++) {
            if(array[i] > array[i-1]) curr++;
            else curr = 1;
            left[i] = curr;
        }
        curr = 1;
        for(int i = n-2; i >= 0; i--) {
            if(array[i] > array[i+1]) curr++;
            else curr = 1;
            right[i] = curr;
        }
        for(int i = 0; i < n; i++) {
            if(left[i] >= 2 && right[i] >= 2) longest = Math.max(longest, left[i] + right[i] - 1);
        }
        return longest;
    }
}

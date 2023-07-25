package org.example;
import java.util.*;

public class LongestPeak {
    public static int longestPeak(String[] arr){
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i+=2) {
            array[i]=Integer.parseInt(arr[i]);
            //changes done 
            array[i]=array[i]+i;
            
        }
        return -1;
    }
}

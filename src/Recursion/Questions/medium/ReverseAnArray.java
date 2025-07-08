package Recursion.Questions.medium;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] ans=rev(arr,0,arr.length-1);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] rev(int[] arr,int s,int e) {
        if(s>e){
            return arr;
        }
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;

        return rev(arr,s+1,e-1);
    }
}

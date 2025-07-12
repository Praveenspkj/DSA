package TwoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        int[] arr={2,3,4,5};
        int[] ans=findTarget(arr,5);
        System.out.println(Arrays.toString(ans));

    }

    private static int[] findTarget(int[] arr, int Target) {
       Map<Integer,Integer> ans=new HashMap<>();

       for(int i=0; i<arr.length; i++){
           int num1=arr[i];
           int num2=Target-num1;

           if(ans.containsKey(num2)){
               return new int[]{i,ans.get(num2)};
           }
           else{
               ans.put(num1,i);
           }
       }
       return new int[]{};
    }
}

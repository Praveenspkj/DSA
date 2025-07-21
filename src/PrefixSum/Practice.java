package PrefixSum;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,7};
        int[] ans=prefixSum(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] prefixSum(int[] arr) {
        int[] ps=new int[arr.length];
        int prefix=0;
//        for(int i=0; i<arr.length-1; i++){
//            prefix+=arr[i];
//            ps[i+1]=prefix;
//        }
        for(int i=arr.length-1; i>0; i--){
            prefix+=arr[i];
            ps[i-1]=prefix;
        }


        return ps;
    }
}

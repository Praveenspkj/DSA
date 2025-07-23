package sorting.mergeSort;








//USING THE EXTRA ARRAY METHOD
//
//package sorting.mergeSort;
//
//
//import java.util.Arrays;
//
//public class Practice {
//    public static void main(String[] args) {
//        int[] arr={4,3,5,2,1};
//        int[] ans=sort(arr);
//        System.out.println(Arrays.toString(ans));
//    }
//
//    static int[] sort(int[] arr){
//        if(arr.length<=1){
//            System.out.println("base case hit -->" + Arrays.toString(arr));
//            return arr;
//        }
//        int mid=arr.length/2;
//        int n=arr.length;
//        System.out.println("we are in diving phase");
//        System.out.println("orginal array -->"+ Arrays.toString(arr));
//        System.out.println("left array -->"+ Arrays.toString(Arrays.copyOfRange(arr,0,mid)));
//        System.out.println("right array -->"+ Arrays.toString(Arrays.copyOfRange(arr,mid,n)));
//        int[] left=sort(Arrays.copyOfRange(arr,0,mid));
//        int[] right=sort(Arrays.copyOfRange(arr,mid,n));
//        return mergre(left,right);
//    }
//
//    private static int[] mergre(int[] left,int[] right) {
//        System.out.println("now we are merging phase "+ "left array -->"+ Arrays.toString(left)+"right array -->"+Arrays.toString(right));
//        int[] ans=new int[left.length+right.length];
//        int ptr3=0;
//        if(left.length<=0){
//            return right;
//        }
//        if(right.length<=0){
//            return left;
//        }
//        int ptr1=0;
//        int ptr2=0;
//        while(ptr1<left.length && ptr2<right.length){
//            if(left[ptr1]<right[ptr2]){
//                ans[ptr3++]=left[ptr1++];
//            }else{
//                ans[ptr3++]=right[ptr2++];
//            }
//        }
//
//        while(ptr2<right.length){
//            ans[ptr3++]=right[ptr2++];
//        }
//        while(ptr1<left.length){
//            ans[ptr3++]=left[ptr1++];
//        }
//        System.out.println("After merging --> "+Arrays.toString(ans));
//        return ans;
//    }
//
//}

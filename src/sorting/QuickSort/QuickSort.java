package sorting.QuickSort;


import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println("muruga");
        int ans1=compare("3","3");
        System.out.println(ans1);
        int ans2=compare("10","3");
        System.out.println(ans2);
        int ans3=compare("5","3");
        System.out.println(ans3);
        int ans4=compare("0","9");
        System.out.println(ans4);
    }

    public  static int[] quickSort(int[] arr){
        qs(arr,0,arr.length-1);
        return arr;
    }

    private static void qs(int[] arr, int low, int high) {
        if(low<high){
            int partitionIndex=partition(arr,low,high);
            qs(arr,low,partitionIndex-1);
            qs(arr,partitionIndex+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high - 1 && arr[i] <= pivot) {
                i++;
            }
            while (j >= low + 1 && arr[j] > pivot) {
                j--;
            }
            if (i < j) { // swap only when i < j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap pivot with j
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    private static int compare(String a, String b) {
        if (a.length() != b.length())
            return a.length() - b.length();
        return a.compareTo(b); // lexicographic if same length
    }

}

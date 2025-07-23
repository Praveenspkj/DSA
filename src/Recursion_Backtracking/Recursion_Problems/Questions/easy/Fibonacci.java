package Recursion_Backtracking.Recursion_Problems.Questions.easy;



public class Fibonacci {
    public static void main(String[] args) {
        int ans=fib(5);
        System.out.println(ans);
    }

    private static int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return fib(n-1)+fib(n-2);
    }
}

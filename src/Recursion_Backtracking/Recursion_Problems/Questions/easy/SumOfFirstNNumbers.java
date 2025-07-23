package Recursion_Backtracking.Recursion_Problems.Questions.easy;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        int ans=funcWithParameter(5,0,0);
        System.out.println(ans);
        
        int ans1=funcWithOutParameter(5,0);
        System.out.println(ans1);

        int ans2=moreRec(5);
        System.out.println(ans2);
    }

    private static int moreRec(int i) {
        if(i==1){
            return 1;
        }
        return moreRec(i-1) + i;
    }

    private static int funcWithOutParameter(int n,int x) {
        if(n==x){
            return x;
        }

        return funcWithOutParameter(n,x+1)+x;
    }

    private static int funcWithParameter(int n, int x,int ans) {
        if(n==x){
            ans+=x;
            return ans;
        }

        return funcWithParameter(n,x+1,ans+x);
    }
}

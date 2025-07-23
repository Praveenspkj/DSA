package Recursion_Backtracking.Recursion_Problems.Questions.medium;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        String str="abcfba";
        boolean ans=checkP(str,0,str.length()-1);
        System.out.println(ans);
    }

    private static boolean checkP(String str,int s,int e) {
        if(s>=e){
            return true;
        }
        if(str.charAt(s)!=str.charAt(e)){
            return false;
        }
        return checkP(str,s+1,e-1);
    }
}

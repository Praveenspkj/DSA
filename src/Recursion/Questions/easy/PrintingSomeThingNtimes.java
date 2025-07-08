package Recursion.Questions.easy;

public class PrintingSomeThingNtimes {
    public static void main(String[] args) {
        func(5,0);
    }

    private static void func(int n,int i) {
        if(i==n){
            return;
        }
        System.out.println(i);
        func(n,i+1);
        System.out.println(i);
    }
}

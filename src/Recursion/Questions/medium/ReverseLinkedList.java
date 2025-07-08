package Recursion.Questions.medium;



public class ReverseLinkedList {
    static class Node{
        Node next;
        int val;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }

    public static void main(String[] args) {
        //creating LinkedList
        Node ll=new Node(3);
        ll.next=new Node(4);
        ll.next.next=new Node(5);
        ll.next.next.next=new Node(6);

        //printing LinekedList
//        Node temp=ll;
//        while(temp!=null){
//            System.out.println(temp.val);
//            temp=temp.next;
//        }

        //reversing a LinkedList
        Node ans=revLL(ll);
        Node temp1=ans;
        while(temp1!=null){
            System.out.println(temp1.val);
            temp1=temp1.next;
        }
    }

    private static Node revLL(Node ll) {
        if(ll.next==null){
            return ll;
        }
        Node temp=revLL(ll.next);
        temp.next=ll;

        return temp;

    }
}

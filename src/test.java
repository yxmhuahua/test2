import org.junit.Test;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;



class ListNode
{
    int val;
    ListNode next;
    public  ListNode(int a)
    {
       this.val=a;
      //  ListNode next;
    }

    @Override
    public String toString() {
        return " val=" + val ;

    }
}
public class test {
    @Test

    public static void main(String[] args) {
//        Integer a=100,b=100,c=150,d=150;
//        String s="aaa";
//        System.out.println(a);
//        System.out.println(s);
//        System.out.println(c==d);
        //CopyOnWriteArrayList
//        System.out.println(new int[] {2,1}.toString());
//        String str="124";
//        System.out.println(str.equals(new Object()));
//        System.out.println((new Object().equals(str)));
        ListNode a=new ListNode(0);
        ListNode b=a;
        a.next=new ListNode(8);
        a=a.next;
        System.out.println(b.next);
       // Objec
//LinkedList
    }
}

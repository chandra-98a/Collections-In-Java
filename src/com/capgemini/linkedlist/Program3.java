package com.capgemini.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;


public class Program3 {
    public static void main(String[] args){
        LinkedList<Object> l1=new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);

       /* for (Object obj:l1){
            System.out.println(obj);
        }
        */

       /* for (int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }*/
        Iterator itr=l1.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}


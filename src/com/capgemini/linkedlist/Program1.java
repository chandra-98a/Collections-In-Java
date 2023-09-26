package com.capgemini.linkedlist;

import java.util.LinkedList;

public class Program1 {
    public static void main(String [] args){
        LinkedList l=new LinkedList<>();
        l.add(10);
        l.add(11);
        l.add(12);
        l.add(13);
        System.out.println(l);
        l.add(2,14);
        System.out.println(l);
        //adding 5 to first index
        l.addFirst(5);
        System.out.println(l);
        //adding 100 to last index
        l.addLast(100);
        System.out.println(l);
        //adding null to array
        l.add(null);
        System.out.println(l);
        //checks whether null present, if present return true
        System.out.println(l.contains(null));
        /*l.clear();
        System.out.println(l);*/
        //add 20 to array
        l.offer(20);
        System.out.println(l);
        //get first element
        System.out.println(l.getFirst());
        //peek() fetches element
        System.out.println(l.peek());
        //poll() fetches and deletes element
        System.out.println(l.poll());
        System.out.println(l);
    }
}

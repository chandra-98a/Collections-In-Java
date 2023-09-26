package com.capgemini.linkedlist;

import java.util.LinkedList;

public class Program2 {
    public static void main(String[] args){
        LinkedList l=new LinkedList<>();
        //push() pushes the element to stack first index FILO
        l.push("Capgemini");
        l.push("get the");
        l.push("future you want");
        System.out.println(l);
        //pop() retrieving the element from the stack LIFO
        l.pop();
        System.out.println(l);
        l.pop();
        System.out.println(l);
    }
}

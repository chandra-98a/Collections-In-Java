package com.capgemini.arrayDq;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Demo {
    public static void main(String [] args){
        ArrayDeque arrayDeque=new ArrayDeque<>();
        arrayDeque.add(10);
        arrayDeque.add(20);
        arrayDeque.add(30);
        arrayDeque.addFirst("java");
        arrayDeque.addLast("programs");
        System.out.println(arrayDeque);
        //to get first and last objects
        System.out.println(arrayDeque.getFirst()+" "+arrayDeque.getLast());
        //to print array objects vertically
        for (Object i:arrayDeque){
            System.out.println(i+" ");
        }
        //Using iterator
        Iterator iterator=arrayDeque.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

            //using while loop
        while (!arrayDeque.isEmpty()){
            arrayDeque.remove();
            System.out.println(arrayDeque);

        }

        }
}
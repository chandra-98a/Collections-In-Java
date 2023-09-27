package com.capgemini.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ProgramTreeTwo {
    public static void main(String[] args) {


        TreeSet<Object> t = new TreeSet<>();
        t.add(100);
        t.add(203);
        t.add(4);
        t.add(44);
        t.add(78);
        t.add(54);
        t.add(400);
        System.out.println(t);
        //to get the descending order
        System.out.println(t.descendingSet());
        //to get the first element ex: elements before 54
        System.out.println(t.headSet(54));
        // to get the last elements
        System.out.println(t.tailSet(54));
        //returns the element which is less than or equal to given element
        System.out.println(t.floor(80));
        //returns the element which is greater than or equal to given element
        System.out.println(t.ceiling(105));
        //using iterator
        Iterator itr=t.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        //get higher element
        System.out.println(t.higher(70));
        //get lower element
        System.out.println(t.lower(30));

        Object ele[]=t.toArray();
        for (int i=0;i<ele.length;i++){
            System.out.println(ele[i]);
        }

    }
}


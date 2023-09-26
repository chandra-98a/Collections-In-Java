package com.capgemini.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Program {
    public static void main(String [] args){
        ArrayList a1=new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        System.out.println(a1);
        ArrayList a2=new ArrayList<>();
        a2.add("world ");
        a2.add("space");
        System.out.println(a2);
        a1.add(1,35);
        a1.addAll(2,a1);
        System.out.println(a1);
        for (int i=0;i< a1.size();i++){
            System.out.println("Element"+(i+1)+"->"+a1.get(i));
        }
        int count=0;
        while (count< a1.size()){
            System.out.println("Element"+ count+"->"+a1.get(count));
            count++;

        }
        for (Object obj:a1){
            System.out.println(obj);
        }
        Iterator itr=a1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

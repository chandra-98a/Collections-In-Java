package com.capgemini.arrayList;

import java.util.ArrayList;

public class ArrayListExampleTwo {
    public static void main(String [] args){
       // ArrayList<Object> a=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
       // a.add("Capgemini");
        //a.add("Eco-space");

       a2.add(20);
        a2.add(12);
        //to print String elements
        //System.out.println(a);
        //to print integers
        //System.out.println(a2);
        a2.add(30);
        //to print integers to the string elements at frontend
        ArrayList<Object> a=new ArrayList<>(a2);
        a.add("capgemini");
        a.add("eco-space");

        System.out.println(a);
    }
}

package com.capgemini.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExampleThree {
    public static void main(String [] args){
        ArrayList<String> cars=new ArrayList<>();
        cars.add("volvo");
        cars.add("bmw");
        cars.add("ford");
        cars.add("toyota");
        cars.add("mazda");
//printing cars
        System.out.println(cars);

        //access an element
        System.out.println( cars.get(3));

        //modify an element
        cars.set(3,"odi");
        System.out.println( cars);

        //find the length of array
        System.out.println( cars.size());

        //to remove odi
        cars.remove(3);
        System.out.println( cars);

        //to clear all elements
       /* cars.clear();
        System.out.println( cars);*/

        //loop through array elements
        for (int i=0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }
        //sort an array
        Collections.sort(cars);
        for (String i:cars){
            System.out.println(i);
        }

    }
}

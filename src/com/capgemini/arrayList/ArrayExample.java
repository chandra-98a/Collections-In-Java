package com.capgemini.arrayList;

public class ArrayExample {
    public static void main(String [] args){
        int a[]={10,20,30,40,50};
        //a prints address of the array
        System.out.println(a);

        //a[i] prints the array elements
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
